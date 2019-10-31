DESCRIPTION = "FPGA Loader Kernel Module"
SECTION = "ntb"
DEPENDS = ""

LICENSE = "CLOSED"
#LICENSE = "MIT"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=96af5705d6f64a88e035781ef00e98a8"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "a1f5565fd989ca1de1b66f5f44b9a7a983567d9a"
SRC_URI = "gitsm://github.com/zechenturm/flinklinux.git"

S = "${WORKDIR}/git"

inherit module

export KERNELDIR="${KERNEL_SRC}"
