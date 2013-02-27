# Setup lo as loopback and eth0 as dhcp
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
# Temporary: generate a random MAC until the firmware manages this for us
RDEPENDS_${PN} += "genmac"
PRINC := "${@int(PRINC) + 1}"
