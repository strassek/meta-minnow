# Setup recommended EMGD settings for the E6xx CPUs. Default to sDVOB, but setup
# the LVDS as secondary to enable daughter cards adding the second display.
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
PRINC := "${@int(PRINC) + 1}"
