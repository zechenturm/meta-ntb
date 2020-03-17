# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRC_URI = "git://github.com/eeros-project/flink-eeros;protocol=https"

DEPENDS = "libeeros flinklib"
RDEPENDS_${PN} += "libeeros flinklib"

# Modify these as desired
PV = "1.0+git${SRCPV}"
#SRCREV = "5482ee2eb883207d72d0ba90ef6dc4173520866d"
SRCREV = "v1.0.0"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: EEROS flink
inherit cmake

OECMAKE_FIND_ROOT_PATH_MODE_PROGRAM = "BOTH"

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

