FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
PRINC := "${@int(PRINC) + 1}"

COMPATIBLE_MACHINE_minnow = "minnow"
KMACHINE_minnow = "minnow"
KBRANCH_minnow = "standard/tiny/base"
SRCREV_machine_pn-linux-yocto-tiny_minnow ?= "${AUTOREV}"
SRCREV_meta_pn-linux-yocto-tiny_minnow ?= "${AUTOREV}"
