DESCRIPTION = "Example Hello World"
SECTION = "ntb"
DEPENDS = "ncurses"
RDEPENDS_${PN} = "ncurses"
#RDEPENDS_${PN}-dev = "ncurses-dev"

LICENSE = "APACHE2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7802ae218faa7577460854b57028fbba"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "v1.2.0"
SRC_URI = "git://github.com/eeros-project/eeros-framework.git;protocol=https"

# SRCREV = "${AUTOREV}"

# SRC_URI = "git://github.com/eeros-project/eeros-framework.git \
#            file://0001-fix-libucl-paths.patch \
#            file://0001-fix-libucl-install-error.patch \
#            "

S = "${WORKDIR}/git"

FILES_${PN} += "/usr/lib/EEROS/cmake/EEROSConfig.cmake \
                /usr/lib/EEROS/cmake/EEROSConfigVersion.cmake"

inherit cmake
OECMAKE_FIND_ROOT_PATH_MODE_PROGRAM = "BOTH"

#EXTRA_OACMAKE = "-DCMAKE_INSTALL_PREFIX=/usr/lib -DCMAKE_BUILD_TYPE=Release"

python () {
  if d.getVar('ETHERCAT') == '1':
    d.appendVar('EXTRA_OECMAKE', ' -DUSE_ETHERCAT=TRUE')
    d.appendVar('DEPENDS', ' ecmasterlib')
    d.appendVar('RDEPENDS_libeeros', ' ecmasterlib')
}
