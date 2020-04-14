LICENSE = "CLOSED"

SRC_URI = "file://wpa_supplicant.service"

S = "${WORKDIR}"

do_install() {

	# install service
  install -d ${D}/etc/systemd/system
	install -m 644 wpa_supplicant.service ${D}/etc/systemd/system/

	# enable service
	install -d ${D}/etc/systemd/system/network.target.wants
	cd ${D}
	ln -s etc/systemd/system/wpa_supplicant.service etc/systemd/system/network.target.wants/wpa_supplicant.service
}
