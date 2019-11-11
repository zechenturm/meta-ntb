require recipes-images/images/console-tdx-image.bb

DESRIPTION = "Toradex Console image with NTB specific software and libraries"

IMAGE_INSTALL += "helloworld fpga-loader flink ntb-user"

MACHINE_EXTRA_RRECOMMENDS += "kernel-modules"

PREFERRED_PROVIDER_virtual/kernel = "linux-toradex-rt"
