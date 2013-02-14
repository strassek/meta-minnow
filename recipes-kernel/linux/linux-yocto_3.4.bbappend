FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
PRINC := "${@int(PRINC) + 1}"


COMPATIBLE_MACHINE_minnow = "minnow"
KMACHINE_minnow  = "minnow"
KBRANCH_minnow = "standard/minnow"

SRC_URI_minnow = "git://git.infradead.org/users/dvhart/linux-yocto-minnow-3.4;protocol=git;nocheckout=1;branch=${KBRANCH},${KMETA},emgd-1.14;name=machine,meta,emgd"

LINUX_VERSION = "3.4.26"

SRCREV_machine_pn-linux-yocto_minnow ?= "${AUTOREV}"
SRCREV_meta_pn-linux-yocto_minnow ?= "${AUTOREV}"
SRCREV_emgd_pn-linux-yocto_minnow ?= "${AUTOREV}"

# Add temporary support for the SYS945x DB9 serial port
KERNEL_FEATURES_append_minnow="cfg/8250"
