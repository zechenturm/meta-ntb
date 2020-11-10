python () {
    if d.getVar('NTB_DEVBUILD') == '1':
        d.appendVar('CORE_IMAGE_EXTRA_INSTALL', ' rt-tests file strace usbutils util-linux libstdc++ tree pciutils lshw')
        d.appendVar('EXTRA_IMAGE_FEATURES', ' tools-debug')
    else:
        image_features = d.getVar('EXTRA_IMAGE_FEATURES', True)
        feature_list = image_features.split(' ')
        feature_list = [feature for feature in feature_list if feature != 'debug-tweaks']
        image_features = ' '.join(feature_list)
        d.setVar('EXTRA_IMAGE_FEATURES', image_features)
        d.appendVar('EXTRA_IMAGE_FEATURES', ' read-only-rootfs')
}

require recipes-images/colibri/ntb-image-common.inc
