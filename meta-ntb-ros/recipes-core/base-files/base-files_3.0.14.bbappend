FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0001-add-tmpfs-mount-for-ros.patch"

RDEPENDS_${PN}_append = " ost-user"

do_install_append() {
  install -d ${D}/home/ost/.ros
}
