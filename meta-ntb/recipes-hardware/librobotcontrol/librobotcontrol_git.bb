DESCRPIPTION = "bblue robotics library"

RDEPENDS_${PN} = "bash"

LICENSE="MIT"

LIC_FILES_CHKSUM = "file://../git/LICENSE;md5=a65fcacc5a132253d0b59535e425a992"

SRC_URI = "git://github.com/StrawsonDesign/librobotcontrol;protocol=git \
  file://librc.patch"

SRCREV = "V1.0.4"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = 'DESTDIR="${D}" CC="${CC}" LINKER="${CC}" EXTRA_CFLAGS="${CFLAGS}" EXTRA_LDFLAGS="${LDFLAGS}"'

do_compile () {
	#cd ../git 
  echo $PWD
  oe_runmake
}

do_install () {
	oe_runmake install
}

FILES_${PN} = " \
  /usr/bin/ \
  /usr/include/ \
  /usr/lib/ \
  /usr/share/ \
  /var/ \
  /etc/ \
  /lib/ \
"

INSANE_SKIP_${PN} = "arch"
