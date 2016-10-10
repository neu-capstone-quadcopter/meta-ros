DESCRIPTION = "Serial is a cross-platform, simple to use library for using serial ports on computers.  This library provides a C++, object oriented interface for interacting with RS-232 like devices on Linux and Windows."
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=58e54c03ca7f821dd3967e2a2cd1596e"

SRC_URI = "https://github.com/wjwwood/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b6d9ebdf821654715656577652b61b64"
SRC_URI[sha256sum] = "0c2a789ce485a83ed640c777a7d1cd1256976890ece4c126f93751a08643917a"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
