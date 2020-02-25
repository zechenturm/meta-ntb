SUMMARY = "Add ntb user"
DESCRIPTION = "Add ntb user"
SECTION = "ntb"
PR = "r1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

RDEPENDS_${PN} = "sudo"

#prevent ' Error: Transaction check error: file /etc/sudoers.d conflicts between attempted installs of ntb-user-1.0-r1.core2_64 and sudo-1.8.27-r0.core2_64'
# apparently this just needs to be a non empty string?
DIRFILES = "whatever"

# We need a file to make bitbake actually build this recipe and add the user
SRC_URI = "file://hello.txt"

S = "${WORKDIR}"

EXCLUDE_FROM_WORLD = "1"

inherit useradd

# You must set USERADD_PACKAGES when you inherit useradd. This
# lists which output packages will include the user/group
# creation code.
USERADD_PACKAGES = "${PN}"

# You must also set USERADD_PARAM and/or GROUPADD_PARAM when
# you inherit useradd.

# add user ntb with uid 1000 and password 'ntb'
USERADD_PARAM_${PN} = "-u 1000 -d /home/ntb -r -s /bin/sh -p 6WO85m3SZ4Cw6 ntb"

do_install () {
	install -d ${D}/home/ntb
	install -p -m 644 hello.txt ${D}/home/ntb
	chown -R ntb:ntb ${D}/home/ntb
	install -d -m 600 ${D}${sysconfdir}/sudoers.d
        echo "ntb ALL=(ALL) ALL" > ${D}${sysconfdir}/sudoers.d/ntb
}

FILES_${PN} = "/home/ntb/* /etc/sudoers.d/ntb"

# Prevents do_package failures with:
# debugsources.list: No such file or directory:
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
