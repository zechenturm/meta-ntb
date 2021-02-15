SUMMARY = "core image with NTB specific software and libraries"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

CORE_IMAGE_EXTRA_INSTALL_append = " ost-user nano bash libeeros"

CORE_IMAGE_EXTRA_INSTALL_append_cb20 = " fpga-loader flink-dev flinklib-dev udhcpc-service"

CORE_IMAGE_EXTRA_INSTALL_append_cx2020 = " atemsys ecmasterlib ecmaster acontis-demos libemllccat"
CORE_IMAGE_EXTRA_INSTALL_append_c6930 = " atemsys ecmasterlib ecmaster acontis-demos libemlli8254x"

CORE_IMAGE_EXTRA_INSTALL_append_x86-rt = " wpa-supplicant linux-firmware wpa-supplicant-service udhcpc-service"
CORE_IMAGE_EXTRA_INSTALL_append_bblue = " wpa-supplicant linux-firmware wpa-supplicant-service udhcpc-service librobotcontrol dhcp-server usb-net bbblue-eeros-dev simplemotorcontrol"

DISTRO_FEATURES_append_bblue = " wifi virtualization systemd"

IMAGE_FEATURES += "ssh-server-dropbear"

MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS += "kernel-modules"

TOOLCHAIN_TARGET_TASK_append = " kernel-devsrc"
