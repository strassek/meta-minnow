require recipes-kernel/linux/linux-yocto.inc

KBRANCH_DEFAULT = "standard/base"
KBRANCH = "${KBRANCH_DEFAULT}"
KMETA = "meta-danny"

SRC_URI_minnow = "git://git.infradead.org/users/dvhart/linux-yocto-minnow-3.8;protocol=git;nocheckout=1;branch=${KBRANCH},${KMETA},emgd-1.16;name=machine,meta,emgd"
SRC_URI_minnow += "file://user.cfg"

LINUX_VERSION ?= "3.8.0"

PR = "${INC_PR}.3"
PV = "${LINUX_VERSION}+git${SRCPV}"

COMPATIBLE_MACHINE_minnow = "minnow"
KMACHINE_minnow  = "minnow"
KBRANCH_minnow = "standard/minnow"

SRCREV_machine_pn-linux-yocto_minnow ?= "${AUTOREV}"
SRCREV_meta_pn-linux-yocto_minnow ?= "${AUTOREV}"
SRCREV_emgd_pn-linux-yocto_minnow ?= "${AUTOREV}"

# Functionality flags
KERNEL_FEATURES_append = " features/netfilter/netfilter.scc"
