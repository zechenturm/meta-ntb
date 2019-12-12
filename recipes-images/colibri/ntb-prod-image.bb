#require recipes-images/images/console-tdx-image.bb

require recipes-rt/images/core-image-rt.bb

DESRIPTION = "core image with NTB specific software and libraries"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

IMAGE_INSTALL += "helloworld fpga-loader flink ntb-user libeeros-dev"

MACHINE_EXTRA_RRECOMMENDS += "kernel-modules"
