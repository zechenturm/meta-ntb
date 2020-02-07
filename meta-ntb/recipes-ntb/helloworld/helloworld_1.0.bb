DESCRIPTION = "Example Hello World"
SECTION = "ntb"
DEPENDS = ""
LICENSE = "MIT"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=9dac6785a3c334e42556037c8b864b7f"

LIC_FILES_CHKSUM = "file://LICENSE;md5=96af5705d6f64a88e035781ef00e98a8"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

#SRCREV = "b7367b19da6d027d1d5c3ed7d0d65b438ca615e9"

#SRC_URI = "git://github.com/zechenturm/yocto-test.git"

SRCREV = "b9fb7785e9e1f357f29bef63dce8f1d91adb6170"

SRC_URI = "git://github.com/DynamicDevices/bbexample.git"

S = "${WORKDIR}/git"

inherit autotools
