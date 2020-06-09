FILESEXTRAPATHS_prepend = "${TOPDIR}/../layers/meta-ntb/meta-ntb-toradex/recipes-core/base-files/base-files:"

SRC_URI_append = " file://read-only-rootfs.patch"
