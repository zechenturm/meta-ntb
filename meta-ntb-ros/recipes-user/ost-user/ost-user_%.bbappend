do_install_append () {
  install -d ${D}/home/ost/.ros
  chown ost:ost ${D}/home/ost/.ros
}

FILES_${PN}_append = " /home/ost/.ros"
