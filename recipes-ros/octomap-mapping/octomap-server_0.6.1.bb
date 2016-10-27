DESCRIPTION = "octomap_server loads a 3D map (as Octree-based OctoMap) and distributes it to other nodes in a compact binary format. It also allows to incrementally build 3D OctoMaps, and provides map saving in the node octomap_saver."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp visualization-msgs sensor-msgs pcl-ros pcl-conversions nav-msgs std-msgs std-srvs octomap octomap-msgs octomap-ros dynamic-reconfigure nodelet pcl pcl-ros pcl-conversions"

require octomap-mapping.inc

do_configure_append() {
    sed -i -e 's: /usr/lib/liboctomap.so: ${STAGING_LIBDIR}/liboctomap.so:g' \
        -e 's: /usr/lib/liboctomath.so: ${STAGING_LIBDIR}/liboctomath.so:g' \
        ${B}/CMakeFiles/octomap_*.dir/build.make
}
