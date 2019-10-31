DESCRIPTION = "FPGA Loader Kernel Module"
SECTION = "ntb"
DEPENDS = ""

LICENSE = "CLOSED"
#LICENSE = "MIT"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=96af5705d6f64a88e035781ef00e98a8"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

#SRCREV = "d66507fc9b793db12ee96897eb45090ce4d9f438"
#SRC_URI = "git://github.com/ntb-ch/fpga_loader.git"

SRCREV = "df83789290cd8fe8b9d9af8dd7ad509ea25c6b46"
SRC_URI = "git://github.com/zechenturm/fpga_loader.git"

S = "${WORKDIR}/git"

inherit module

export KERNELDIR="${KERNEL_SRC}"
