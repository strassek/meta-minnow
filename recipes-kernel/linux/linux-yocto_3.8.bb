require recipes-kernel/linux/linux-yocto.inc

KBRANCH_DEFAULT = "standard/base"
KBRANCH = "${KBRANCH_DEFAULT}"
KMETA = "meta-danny"

SRC_URI_minnow = "git://git.infradead.org/users/dvhart/linux-yocto-minnow-3.8;protocol=git;nocheckout=1;branch=${KBRANCH},${KMETA},emgd-1.16;name=machine,meta,emgd"
SRC_URI_minnow += "file://user.cfg"

LINUX_VERSION ?= "3.8.0"

PR = "${INC_PR}.3"
PV = "${LINUX_VERSION}+git${SRCPV}"

COMPATIBLE_MACHINE = "minnow"
KMACHINE_minnow  = "minnow"
KBRANCH_minnow = "standard/minnow"

SRCREV_machine_pn-linux-yocto_minnow ?= "0c56f27905d805aad351cfbc26a98e4171b8626a"
SRCREV_meta_pn-linux-yocto_minnow ?= "e57037f49c03547f05236c32aa024767dfce7d7f"
SRCREV_emgd_pn-linux-yocto_minnow ?= "caea08c988e0f41103bbe18eafca20348f95da02"

# Functionality flags
KERNEL_FEATURES_append = " features/netfilter/netfilter.scc"
