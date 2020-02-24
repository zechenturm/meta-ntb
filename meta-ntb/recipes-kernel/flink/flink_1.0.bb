DESCRIPTION = "FPGA Loader Kernel Module"
SECTION = "ntb"
DEPENDS = ""

LICENSE = "CLOSED"
#LICENSE = "MIT"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=96af5705d6f64a88e035781ef00e98a8"

#FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRCREV = "f6794756fb448ea38fe7ae575178b8729f512ec9"
SRC_URI = "gitsm://github.com/zechenturm/flinklinux.git file://cb20.rbf"

S = "${WORKDIR}/git"

inherit module

export KERNELDIR="${KERNEL_SRC}"

EXTRA_CFLAGS += "-D DBG"

FILES_${PN} += "/lib/firmware/cb20.rbf"

do_install_append () {
	install -d ${D}/lib/firmware
	pwd
	ls
	# working dir is ${WORKDIR}/git, but cb20.rbf is in ${WORKDIR}
	install -m 644 ../cb20.rbf ${D}/lib/firmware/
}
