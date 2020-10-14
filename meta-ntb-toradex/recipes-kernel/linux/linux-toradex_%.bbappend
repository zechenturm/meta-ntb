
python() {
  file_path = d.getVar('FILE', True)
  file_version_string = file_path.split('_')[-1][:-len('.bb')]
  d.setVar('TDX_LINUX_PV', file_version_string)
}

FILESEXTRAPATHS_prepend := "${TOPDIR}/../layers/meta-toradex-nxp/recipes-kernel/linux/${PN}-${STRIPPED_PV}/colibri-imx6/:\
${TOPDIR}/../layers/meta-toradex-nxp/recipes-kernel/linux/${PN}-${TDX_LINUX_PV}/colibri-imx6/:\
${TOPDIR}/../layers/meta-ntb/meta-ntb-toradex/recipes-kernel/linux/linux-toradex:\
"
SRC_URI_append = " file://git/arch/arm/boot/dts/imx6dl-colibri-cb20.dts"
