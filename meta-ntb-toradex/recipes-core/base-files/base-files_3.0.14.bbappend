FILESEXTRAPATHS_prepend = "${TOPDIR}/../layers/meta-ntb/meta-ntb-toradex/recipes-core/base-files/base-files:"

inherit utils

# SRC_URI_append = "${@oe.utils.conditional('NTB_DEVBUILD', '1', '', ' file://read-only-rootfs.patch', d)}"
