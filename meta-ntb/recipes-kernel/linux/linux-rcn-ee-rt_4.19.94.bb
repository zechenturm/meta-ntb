inherit kernel
require recipes-kernel/linux/linux-yocto.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

#SRC_URI = "git://github.com/RobertCNelson/linux-stable-rcn-ee file://defconfig"
SRC_URI = "git:///home/ubuntu/yakbuild/linux-stable-rcn-ee file://defconfig"

# SRCREV = "4.19.94-ti-r35"

SRCREV = "17a087468ac0dd0172a200b7699b6273026ef0ed"

S = "${WORKDIR}/git"

LINUX_VERSION ?= "4.19.94"
LINUX_VERSION_EXTENSION_append = "-rcn-ee"

PV = "${LINUX_VERSION}"

COMPATIBLE_MACHINE  = "bblue"
