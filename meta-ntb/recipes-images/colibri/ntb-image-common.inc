require recipes-core/images/core-image-minimal.bb

SUMMARY = "core image with NTB specific software and libraries"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

CORE_IMAGE_EXTRA_INSTALL_append = " ost-user"

CORE_IMAGE_EXTRA_INSTALL_append_cb20 = " fpga-loader flink-dev flinklib-dev udhcpc-service"

CORE_IMAGE_EXTRA_INSTALL_append_cx2020 = " atemsys ecmasterlib ecmaster acontis-demos"

CORE_IMAGE_EXTRA_INSTALL_append_bblue = " wpa-supplicant linux-firmware wpa-supplicant-service udhcpc-service librobotcontrol"

DISTRO_FEATURES_append_bblue = " wifi virtualization systemd"

IMAGE_FEATURES += "ssh-server-dropbear"

MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS += "kernel-modules"

TOOLCHAIN_TARGET_TASK_append = " kernel-devsrc"
