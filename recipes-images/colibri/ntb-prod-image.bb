require recipes-core/images/core-image-minimal.bb

DESRIPTION = "core image with NTB specific software and libraries"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

IMAGE_INSTALL += "helloworld fpga-loader flink ntb-user"

MACHINE_EXTRA_RRECOMMENDS += "kernel-modules"
