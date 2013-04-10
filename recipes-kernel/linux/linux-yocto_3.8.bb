require recipes-kernel/linux/linux-yocto.inc

KBRANCH_DEFAULT = "standard/minnow"
KBRANCH = "${KBRANCH_DEFAULT}"
KMETA = "meta-danny"

SRC_URI_minnow = "git://git.infradead.org/users/dvhart/linux-yocto-minnow-3.8;protocol=git;nocheckout=1;branch=${KBRANCH},${KMETA},emgd-1.16;name=machine,meta,emgd"
SRC_URI_minnow += "file://user.cfg"

# SRCREVs for the default branches to avoid parse/fetch failures when
# MACHINE != minnow. This can be removed once we convert this to a bbappend.
SRCREV_machine_pn-linux-yocto ?= "2abdf3d45805014d62dc680539dcffdc9bca5b8e"
#SRCREV_machine_pn-linux-yocto ?= "eadda01d959f96ed3d15d193a6cd8600ea4f97c9" # standard/minnow-x3 (9/apr/2013 @ 9:36 AM)
SRCREV_meta_pn-linux-yocto ?= "e57037f49c03547f05236c32aa024767dfce7d7f"
SRCREV_emgd_pn-linux-yocto ?= "caea08c988e0f41103bbe18eafca20348f95da02"

LINUX_VERSION ?= "3.8.0"

PR = "${INC_PR}.3"
PV = "${LINUX_VERSION}+git${SRCPV}"

COMPATIBLE_MACHINE = "minnow"
KMACHINE_minnow  = "minnow"

# Functionality flags
KERNEL_FEATURES_minnow_append = " features/drm-emgd/drm-emgd-1.16 \
                                  features/netfilter/netfilter.scc"
