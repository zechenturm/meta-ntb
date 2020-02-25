require recipes-core/images/core-image-minimal.bb

DESRIPTION = "core image with NTB specific software and libraries"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

CORE_IMAGE_EXTRA_INSTALL_append = " ntb-user udhcpc-service nano"

CORE_IMAGE_EXTRA_INSTALL_append_cb20 = " fpga-loader flink flinklib"

CORE_IMAGE_EXTRA_INSTALL_append_cx2020 = " atemsys ecmasterlib ecmaster acontis-demos"

IMAGE_FEATURES += "ssh-server-dropbear"

MACHINE_EXTRA_RRECOMMENDS += "kernel-modules"

TOOLCHAIN_TARGET_TASK_append = " kernel-devsrc"
