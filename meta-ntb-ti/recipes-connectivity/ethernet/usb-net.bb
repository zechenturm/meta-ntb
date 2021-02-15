SRC_URI = "file://20-usb.network"

LICENSE = "CLOSED"

S = "${WORKDIR}"

do_install() {
  install -d ${D}/etc/systemd/network/
  install -m 644 20-usb.network ${D}/etc/systemd/network/
}