
# ntb-base-image needs to be first, so that the python code actually affects the image
require recipes-images/colibri/ntb-image-base.bb
require recipes-core/images/core-image-minimal.bb