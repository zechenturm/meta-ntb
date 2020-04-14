FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"


do_install_append () {
	# replace empty SSID & PSK with those set in WIFI_SSID & WIFI_PSK
	sed -i -e s/ssid=\"\"/ssid=\"${WIFI_SSID}\"/ -e s/psk=\"\"/psk=\"${WIFI_PSK}\"/ ${D}/etc/wpa_supplicant.conf
}
