inherit kernel
require recipes-kernel/linux/linux-yocto.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

# SRC_URI = "git://github.com/RobertCNelson/linux-stable-rcn-ee;protocol=https file://defconfig"
# SRC_URI = "git:///home/ubuntu/yakbuild/linux-stable-rcn-ee
SRC_URI = "https://github.com/RobertCNelson/linux-stable-rcn-ee/archive/4.19.94-ti-rt-r59.tar.gz \
           https://github.com/beagleboard/linux/raw/f2015285e55e70f32a9464d7ae95695cd831e4fb/firmware/am335x-pm-firmware.elf;name=am335x-pm-firmware.elf \
           https://github.com/beagleboard/linux/raw/f2015285e55e70f32a9464d7ae95695cd831e4fb/firmware/am335x-bone-scale-data.bin;name=am335x-bone-scale-data.bin \
           https://github.com/beagleboard/linux/raw/f2015285e55e70f32a9464d7ae95695cd831e4fb/firmware/am335x-evm-scale-data.bin;name=am335x-evm-scale-data.bin \
           https://github.com/beagleboard/linux/raw/f2015285e55e70f32a9464d7ae95695cd831e4fb/firmware/am43x-evm-scale-data.bin;name=am43x-evm-scale-data.bin \
           file://defconfig \
           file://0001-enable-ADC.patch \
           file://0002-enable-PRU.patch \
           "
SRC_URI[sha256sum] = "f46286b09f3ec9636973816255a53fd1e865a975b188944d2c936f560c378483"
SRC_URI[am335x-pm-firmware.elf.md5sum] = "bf399da2ac3e91bbf2d279fb0487774e"
SRC_URI[am335x-bone-scale-data.bin.md5sum] = "0516d72d4c1ffdf5a175368d9d9f8cb2"
SRC_URI[am335x-evm-scale-data.bin.md5sum] = "b45a5a64f2c67b7eb6508c639a3f2944"
SRC_URI[am43x-evm-scale-data.bin.md5sum] = "8edf24ea17333b0a123f4fbcdd053760"

S = "${WORKDIR}/linux-stable-rcn-ee-4.19.94-ti-rt-r59"

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

do_kernel_checkout_prepend() {
  pwd
  ls
}
