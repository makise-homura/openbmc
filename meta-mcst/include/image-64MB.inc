OBMC_IMAGE_EXTRA_INSTALL_append = " \
  active-gpio-on \
  flashrom \
  openssh \
  buttonscripts \
  glibc-localedata-en-us \
  glibc-localedata-ru-ru \
  glibc-binary-localedata-en-us \
  glibc-binary-localedata-ru-ru \
  pv \
  wget \
  firmware-updater \
  i2c-tools \
  rawi2ctool \
  dscan \
  net-initial \
  initsc-lt \
  glibc-utils \
  nginx \
  php-fpm \
  reimu \
  mc \
  ethtool \
  sqlite3 \
  overheatd \
  kernel-module-tinyspi \
  kernel-module-rtc-cy14b101p \
  "

IMAGE_FEATURES_remove = " \
  ssh-server-dropbear \
  "