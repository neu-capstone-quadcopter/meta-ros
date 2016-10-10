DESCRIPTION = "The monarc_uart_driver package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "protobuf boost roscpp sensor-msgs geometry-msgs std-msgs serial"

SRC_URI = "gitsm://github.com/neu-capstone-quadcopter/monarc_uart_driver.git;rev=master"
SRC_URI[md5sum] = "36ebb4b571a4f42f618d0eeaf0b38f60"
SRC_URI[sha256sum] = "14bbe1ba3ed40889578079f6b0b5d9fa204ee2435777348e377e98e69cf1e9c3"

S = "${WORKDIR}/git"

inherit catkin
