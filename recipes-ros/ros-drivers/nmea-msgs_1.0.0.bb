DESCRIPTION = "The nmea_msgs package contains messages related to data in the NMEA format."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs"

SRC_URI = "https://github.com/ros-drivers/${ROS_SPN}/archive/nmea_msgs-${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b2f72051cb1a86a3f27c913563c99447"
SRC_URI[sha256sum] = "122bc299f339d84b782bbd17c6de12f0ca4d1efda90811e6525cce06c82f60bf"

S = "${WORKDIR}/nmea_msgs-${ROS_SP}"

inherit catkin
