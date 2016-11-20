DESCRIPTION = "The monarc_path_finder package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp std-srvs octomap octomap-msgs actionlib actionlib-msgs monarc-uart-driver monarc-tf"

SRCREV = "f143325e191af45bb008c075bd0d0bf33a507648"
SRC_URI = "gitsm://github.com/neu-capstone-quadcopter/monarc_path_finder.git;branch=master"
SRC_URI[md5sum] = "36ebb4b571a4f42f618d0eeaf0b38f60"
SRC_URI[sha256sum] = "14bbe1ba3ed40889578079f6b0b5d9fa204ee2435777348e377e98e69cf1e9c3"

S = "${WORKDIR}/git"

inherit catkin

do_configure_append() {
    sed -i -e 's: /usr/lib/liboctomap.so: ${STAGING_LIBDIR}/liboctomap.so:g' \
        -e 's: /usr/lib/liboctomath.so: ${STAGING_LIBDIR}/liboctomath.so:g' \
        ${B}/CMakeFiles/monarc_path_finder_node.dir/build.make
}
