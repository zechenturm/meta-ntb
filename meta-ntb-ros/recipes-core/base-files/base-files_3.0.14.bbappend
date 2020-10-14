inherit utils

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# only change fstab for production image, since it uses read-only-rootfs
# and ros needs a writable ~/.ros
SRC_URI_append = "${@oe.utils.conditional('NTB_DEVBUILD', '1', '', ' file://0001-add-tmpfs-mount-for-ros.patch', d)}"

RDEPENDS_${PN}_append = " ost-user"
