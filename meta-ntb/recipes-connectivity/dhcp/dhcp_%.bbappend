FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"


# for some reason appending to FILES does not work
# INSANE_SKIP_${PN} += "installed-vs-shipped"

FILES_${PN}-server_append = " \
  /lib/systemd/system/network.target.wants/dhcpd.service \
  /etc/systemd/system/network.target.wants \
  /etc/systemd/system/network.target.wants/dhcpd.service \
  /lib/systemd/system/dhcpd.service \
"

do_install_append() {
  install -d ${D}/etc/systemd/system/network.target.wants
  install -m 644 ${D}/lib/systemd/system/dhcpd.service ${D}/etc/systemd/system/
	cd ${D}
	ln -s etc/systemd/system/dhcpd.service etc/systemd/system/network.target.wants/dhcpd.service 
}