DESCRIPTION = "ROS Driver for DUO"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosconsole roscpp sensor-msgs image-transport cv-bridge tf dynamic-reconfigure pcl-conversions"

SRC_URI = "https://github.com/duo3d/${ROS_SPN}/archive/v${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8e17a7f9b5e4163b64e6d1672d2315c4"
SRC_URI[sha256sum] = "c2e6c7bc81f5cce8d615d490057e5a00807eabc18a17fd32006355a5cfffd810"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
