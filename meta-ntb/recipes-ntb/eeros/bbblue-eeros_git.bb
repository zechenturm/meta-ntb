# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
LICENSE = "APACHE2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRC_URI = "git://github.com/eeros-project/bbblue-eeros.git;protocol=https"

# Modify these as desired
PV = "1.2.0+git${SRCPV}"
SRCREV = "53961d1e570aa233e555a2a48970e2fc01d02e77"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: EEROS
DEPENDS = "librobotcontrol libeeros"
RDEPENDS_${PN} = "librobotcontrol libeeros"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

do_install_append() {
  install -d ${D}/etc/EEROS/HwConfigs/bbblue-eeros
  install -m 644 ${S}/HwConfigBBBlue.json ${D}/etc/EEROS/HwConfigs/bbblue-eeros/
}
