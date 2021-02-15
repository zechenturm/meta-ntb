# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/eeros-project/simple-motor-control.git;protocol=https \
           file://0001-update-eeros-version-and-add-install-target.patch \
           "

# Modify these as desired
PV = "0.1.0+git${SRCPV}"
SRCREV = "d0fcb08ce52553ef60e0b3d689f1ded414550405"

S = "${WORKDIR}/git"

DEPENDS = "libeeros"
RDEPENDS_${PN} = "libeeros"

# NOTE: unable to map the following CMake package dependencies: EEROS ros-eeros bbblue-eeros comedi-eeros flink-eeros flink sim-eeros
inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

do_install_append() {
  install -d ${D}/etc/EEROS/HwConfigs/simplemotorcontrol
  install -m 644 ${S}/HwConfig*.json ${D}/etc/EEROS/HwConfigs/simplemotorcontrol/
}