# Setup lo as loopback and eth0 as dhcp
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
PRINC := "${@int(PRINC) + 1}"
