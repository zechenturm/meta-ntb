FILESEXTRAPATHS_prepend := "${TOPDIR}/../meta-ntb/meta-ntb/recipes-kernel/linux/${PN}:"

# SRC_URI_append_bblue = " file://defconfig"

SRC_URI_append_bblue = " file://defconfig file://0001-add-pwm-to-dts.patch"
