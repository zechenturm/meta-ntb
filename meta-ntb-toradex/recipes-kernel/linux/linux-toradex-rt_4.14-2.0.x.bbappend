FILESEXTRAPATHS_prepend := "${TOPDIR}/../layers/meta-toradex-nxp/recipes-kernel/linux/${PN}-4.14-2.0.x/colibri-imx6/:\
${TOPDIR}/../layers/meta-ntb/meta-ntb-toradex/recipes-kernel/linux/linux-toradex:"

SRC_URI_append = " file://git/arch/arm/boot/dts/imx6dl-colibri-cb20.dts"
