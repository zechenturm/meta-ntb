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
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c4db32a2fa8717faffa1d4f10136f47"

SRC_URI = "gitsm://github.com/zechenturm/flinklib;protocol=https"

SRC_URI = "gitsm://github.com/flink-project/flinklib;protocol=https"
# Modify these as desired
PV = "1.0+git${SRCPV}"
# SRCREV = "90956e4f68e937ae0e0843a7cb3f4b51f5edf3db"

SRCREV = "v1.0.1"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: Doxygen
inherit cmake

OECMAKE_FIND_ROOT_PATH_MODE_PROGRAM = "BOTH"

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
OECMAKE_C_FLAGS_append = " -std=gnu99"

FILES_${PN}-dev = ""

FILES_${PN} = " \
/usr/lib/flink \
/usr/lib/flink/cmake \
/usr/lib/flink/cmake/flinkConfig.cmake \
/usr/lib/flink/cmake/flinkConfigVersion.cmake \
/usr/include \
/usr/lib/libflink.so \
/usr/lib/libflink.so.1.0.1.0 \
/usr/include/flinklib.h \
/usr/include/flinkioctl.h \
/usr/include/flink_funcid.h \
/usr/bin/flinkinfo \
/usr/bin/lsflink \
/usr/bin/flinkanaloginput \
/usr/bin/flinkanalogoutput \
/usr/bin/flinkdio \
/usr/bin/flinkpwm \
/usr/bin/flinkcounter \
/usr/bin/flinkwd \
/usr/bin/flinkppwa \
"
