DESCRIPTION = "Package to parse NMEA strings and publish a very simple GPS message. Does not require the GPSD deamon."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslint rospy rosserial-python geometry-msgs nmea-msgs sensor-msgs"

SRC_URI = "https://github.com/ros-drivers/${ROS_SPN}/archive/nmea_navsat_driver-${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3098f61232e9ba2b0a84b54271aebbdb"
SRC_URI[sha256sum] = "85b96d39c1ec2453652b514935f4b85ba379aa7769071c901fc84514b0e7de3a"

SRC_URI += "file://0001-CMakeLists.txt-only-call-roslint-if-testing-is-enabl.patch"

S = "${WORKDIR}/nmea_navsat_driver-${ROS_SP}"

inherit catkin
