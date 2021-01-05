
python() {
  file_path = d.getVar('FILE', True)
  folder_path = file_path.replace('_', '-')[:-len('.bb')]
  d.setVar('TDX_LINUX_PV', folder_path)
}

FILESEXTRAPATHS_prepend := "${TOPDIR}/../layers/meta-ntb/meta-ntb-toradex/recipes-kernel/linux/linux-toradex/:${TDX_LINUX_PV}/colibri-imx6/:"
SRC_URI_append = " file://git/arch/arm/boot/dts/imx6dl-colibri-cb20.dts"
