DESCRIPTION = "ROS Driver for DUO"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosconsole roscpp sensor-msgs image-transport cv-bridge tf dynamic-reconfigure pcl-conversions"

SRC_URI = "https://github.com/neu-capstone-quadcopter/${ROS_SPN}/archive/v${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c8b6f73f15fc4bcb7e945fee98914d20"
SRC_URI[sha256sum] = "c038d1f489f38c38ff7b54c689455c4f56f10cb2650c5757ad06eabb123180e2"

S = "${WORKDIR}/${ROS_SP}"

ARM_OBJECTS_DIR = "~/Documents/CL-DUO3D-ARM-1.0.80.20/DUOSDK/SDK/linux/arm/"

do_copyarmobjects() {
	cd ${S}
	rm -r lib
	cp -r ${ARM_OBJECTS_DIR} lib
}

addtask copyarmobjects    after do_unpack before do_compile

inherit catkin
