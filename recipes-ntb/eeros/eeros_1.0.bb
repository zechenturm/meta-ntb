DESCRIPTION = "Example Hello World"
SECTION = "ntb"
DEPENDS = ""
LICENSE = "APACHE2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7802ae218faa7577460854b57028fbba"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "v1.0.0"

SRC_URI = "git://github.com/eeros-project/eeros-framework.git"

S = "${WORKDIR}/git"

FILES_${PN} += "${libdir}/*"
FILES_${PN}-dev = "${libdir}/* ${includedir}"

inherit cmake
OECMAKE_FIND_ROOT_PATH_MODE_PROGRAM = "BOTH"
