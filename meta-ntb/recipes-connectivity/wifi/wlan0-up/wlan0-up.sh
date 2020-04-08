#!/bin/sh

# start wpa_supplicant in the background to initialize wifi
wpa_supplicant -i wlan0 -c /etc/wpa_supplicant.conf &

# give wpa_supplicant time to init wifi
sleep 10

# start dhcp client to get an IP address
# udhcpc is part of busybox
udhcpc -i wlan0
