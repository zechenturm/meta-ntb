FILESEXTRAPATHS_prepend := "${TOPDIR}/../meta-ntb/meta-ntb/recipes-kernel/linux/${PN}:"


SRC_URI_append_bblue = " file://defconfig"
