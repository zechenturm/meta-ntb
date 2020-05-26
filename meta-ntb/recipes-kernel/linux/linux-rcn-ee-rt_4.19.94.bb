inherit kernel
require recipes-kernel/linux/linux-yocto.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

#SRC_URI = "git://github.com/RobertCNelson/linux-stable-rcn-ee file://defconfig"
SRC_URI = "git:///home/ubuntu/yakbuild/linux-stable-rcn-ee \
https://github.com/beagleboard/linux/raw/f2015285e55e70f32a9464d7ae95695cd831e4fb/firmware/am335x-pm-firmware.elf;name=am335x-pm-firmware.elf \
https://github.com/beagleboard/linux/raw/f2015285e55e70f32a9464d7ae95695cd831e4fb/firmware/am335x-bone-scale-data.bin;name=am335x-bone-scale-data.bin \
https://github.com/beagleboard/linux/raw/f2015285e55e70f32a9464d7ae95695cd831e4fb/firmware/am335x-evm-scale-data.bin;name=am335x-evm-scale-data.bin \
https://github.com/beagleboard/linux/raw/f2015285e55e70f32a9464d7ae95695cd831e4fb/firmware/am43x-evm-scale-data.bin;name=am43x-evm-scale-data.bin \
file://defconfig"

SRC_URI[am335x-pm-firmware.elf.md5sum] = "bf399da2ac3e91bbf2d279fb0487774e"
SRC_URI[am335x-bone-scale-data.bin.md5sum] = "0516d72d4c1ffdf5a175368d9d9f8cb2"
SRC_URI[am335x-evm-scale-data.bin.md5sum] = "b45a5a64f2c67b7eb6508c639a3f2944"
SRC_URI[am43x-evm-scale-data.bin.md5sum] = "8edf24ea17333b0a123f4fbcdd053760"

# SRCREV = "4.19.94-ti-r35"

SRCREV = "17a087468ac0dd0172a200b7699b6273026ef0ed"
SRC_URI[am335x-pm-firmware.elf.md5sum] = "bf399da2ac3e91bbf2d279fb0487774e"

S = "${WORKDIR}/git"

LINUX_VERSION ?= "4.19.94"
LINUX_VERSION_EXTENSION_append = "-rcn-ee"

PV = "${LINUX_VERSION}"

COMPATIBLE_MACHINE  = "bblue"

do_patch_append () {
  cp "${WORKDIR}"/am335x-bone-scale-data.bin firmware/
  cp "${WORKDIR}"/am335x-pm-firmware.elf firmware/
  cp "${WORKDIR}"/am335x-evm-scale-data.bin firmware/
  cp "${WORKDIR}"/am43x-evm-scale-data.bin firmware/
}