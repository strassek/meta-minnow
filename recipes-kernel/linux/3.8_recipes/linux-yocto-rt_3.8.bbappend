FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
PRINC := "${@int(PRINC) + 1}"

COMPATIBLE_MACHINE_minnow = "minnow"
KMACHINE_minnow = "minnow"
KBRANCH_minnow = "standard/preempt-rt/minnow"
SRCREV_machine_pn-linux-yocto-rt_minnow ?= "${AUTOREV}"
SRCREV_meta_pn-linux-yocto-rt_minnow ?= "${AUTOREV}"
