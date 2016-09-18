DESCRIPTION = "ROS Driver for DUO"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosconsole roscpp sensor-msgs image-transport cv-bridge tf dynamic-reconfigure pcl-conversions"

SRC_URI = "https://github.com/duo3d/${ROS_SPN}/archive/v${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8e17a7f9b5e4163b64e6d1672d2315c4"
SRC_URI[sha256sum] = "c2e6c7bc81f5cce8d615d490057e5a00807eabc18a17fd32006355a5cfffd810"

S = "${WORKDIR}/${ROS_SP}"

do_fixcfgpermissions() {
	cd ${S}
	chmod 777 cfg/Duo3D.cfg
}

ARM_OBJECTS_DIR = "~/Documents/CL-DUO3D-ARM-1.0.80.20/DUOSDK/SDK/linux/arm/"

do_copyarmobjects() {
	cd ${S}
	rm -r lib
	cp -r ${ARM_OBJECTS_DIR} lib
}

addtask fixcfgpermissions after do_unpack before do_compile
addtask copyarmobjects    after do_unpack before do_compile

inherit catkin
