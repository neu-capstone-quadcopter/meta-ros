SUMMARY = "Duo3D kernel module"
LICENSE = "CLDUO"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=11c820548a182a1e1302685043d7652e"

inherit module

SRC_URI = " \
    file://duo.c \
    file://duo_driver_api.h \
    file://duo.h \
    file://Makefile \
    file://LICENSE.txt \
"

S = "${WORKDIR}"

KERNEL_MODULE_AUTOLOAD += "duo"
