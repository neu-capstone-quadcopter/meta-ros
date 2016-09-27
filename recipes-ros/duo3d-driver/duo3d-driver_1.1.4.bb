DESCRIPTION = "ROS Driver for DUO"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosconsole roscpp sensor-msgs image-transport cv-bridge tf dynamic-reconfigure pcl-conversions"

RDEPENDS_${PN} += "kernel-module-duo3d"

SRC_URI = "https://github.com/neu-capstone-quadcopter/${ROS_SPN}/archive/v${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "36ebb4b571a4f42f618d0eeaf0b38f60"
SRC_URI[sha256sum] = "14bbe1ba3ed40889578079f6b0b5d9fa204ee2435777348e377e98e69cf1e9c3"

S = "${WORKDIR}/${ROS_SP}"

ARM_OBJECTS_DIR = "~/Documents/CL-DUO3D-ARM-1.0.80.20/DUOSDK/SDK/linux/arm/"

do_copyarmobjects() {
	cd ${S}
	rm -r lib
	cp -r ${ARM_OBJECTS_DIR} lib
}

addtask copyarmobjects    after do_unpack before do_compile

inherit catkin
