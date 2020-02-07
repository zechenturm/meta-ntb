# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://COPYING;md5=cc68f946f0525423bffbbe3432f948af"

SRC_URI = "git://github.com/vstakhov/libucl;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "42c4d05ca2c00e087376ff73a2dae906be7cad6d"

S = "${WORKDIR}/git"

#inherit cmake
inherit autotools

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

