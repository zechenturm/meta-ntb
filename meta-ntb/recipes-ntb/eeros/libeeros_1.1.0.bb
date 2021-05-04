DESCRIPTION = "Example Hello World"
SECTION = "ntb"
DEPENDS = "ncurses"
RDEPENDS_${PN} = "ncurses"
#RDEPENDS_${PN}-dev = "ncurses-dev"

LICENSE = "APACHE2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7802ae218faa7577460854b57028fbba"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "64f373be8deedb759b235c2a25f9013364e3262e"
#SRCREV = "${AUTOREV}"

SRC_URI = "git://github.com/eeros-project/eeros-framework.git \
           file://0001-fix-libucl-paths.patch \
           file://0001-fix-libucl-install-error.patch \
           "

S = "${WORKDIR}/git"

# FILES_${PN}-dev += "${libdir}/*.so \
#  ${includedir} \
#  /usr/lib/EEROS \
#  /usr/lib/pkgconfig \
#  /usr/lib/cmake \
#  /usr/lib/EEROS/cmake \
#  /usr/lib/EEROS/cmake/EEROSConfig.cmake \
#  /usr/lib/EEROS/cmake/EEROSConfigVersion.cmake \
#  /usr/lib/pkgconfig/gmock.pc \
#  /usr/lib/pkgconfig/gmock_main.pc \
#  /usr/lib/pkgconfig/gtest.pc \
#  /usr/lib/pkgconfig/gtest_main.pc \
#  /usr/lib/cmake/GTest \
#  /usr/lib/cmake/GTest/GTestTargets.cmake \
#  /usr/lib/cmake/GTest/GTestTargets-noconfig.cmake \
#  /usr/lib/cmake/GTest/GTestConfigVersion. \
#"
# FILES_${PN}-dbg =""

# PACKAGES = "${PN} ${PN}-dev ${PN}-dbg"

FILES_${PN} += "/usr/lib/EEROS/cmake/EEROSConfig.cmake \
                /usr/lib/EEROS/cmake/EEROSConfigVersion.cmake"

inherit cmake
OECMAKE_FIND_ROOT_PATH_MODE_PROGRAM = "BOTH"

#EXTRA_OACMAKE = "-DCMAKE_INSTALL_PREFIX=/usr/lib -DCMAKE_BUILD_TYPE=Release"

# EXTRA_OECMAKE = "-DLIBUCL_INCLUDE_DIR=/usr/inlcude/ -DLIBUCL_LINK_DIR=/usr/lib"

python () {
  if d.getVar('ETHERCAT') == '1':
    d.appendVar('EXTRA_OECMAKE', ' -DUSE_ETHERCAT=true')
    d.appendVar('DEPENDS', ' ecmasterlib')
    d.appendVar('RDEPENDS_libeeros', ' ecmasterlib')
}

TOOLCHAIN_TARGET_TASK_append = " ${PN}-staticdev"

# INHIBIT_PACKAGE_DEBUG_SPLIT = '1'
# INHIBIT_PACKAGE_STRIP = '1'


#do_install_append() {
#	rm ${D}${libdir}/*.a
#}
