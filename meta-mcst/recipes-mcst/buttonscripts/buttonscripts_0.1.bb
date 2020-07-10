SUMMARY = "Button scripts for MCST management system"
DESCRIPTION = "Button scripts for MCST management system"
SECTION = "base"
PR = "r1"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = " \
            file://LICENSE \
            file://server_pwrbut_h \
            file://server_pwrbut_s \
            file://server_reset \
          "

S = "${WORKDIR}"

do_install() {
  dst="${D}/usr/bin"
  install -d $dst
  install -m 755 server_pwrbut_h ${dst}
  install -m 755 server_pwrbut_s ${dst}
  install -m 755 server_reset ${dst}
}

FILES_${PN} = "/usr/bin"

RDEPENDS_${PN} += "gpio-funcs"