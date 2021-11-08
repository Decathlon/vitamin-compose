# Emulators

## Overview

This project aims to be compatible with 3 types of devices, phone, tablet and kiosk.
Every contribution must be tested on these 3 devices and screenshots are mandatory in pull requests in case of UI impacting contribution.

If you do not own these types of devices, you can find below some tips to emulate them directly on your computer.

## Configurations

### Mobile

Create the latest Pixel emulator version with the smallest dpi format (around 440dpi).

### Tablet

Use the Android Virtual Device Manager of Android Studio to create a 8" tablet emulator with resolution of 1280x800.

Or you can follow [those guidelines](#kiosk) and apply directly this configuration in `config.ini` file:

For 8" tablet:

`hw.lcd.density=160`
`hw.lcd.height=800`
`hw.lcd.width=1280`
`skin.name=1280x800`

### Kiosk

1. Use the Android Virtual Device Manager of Android Studio to create a tablet emulator.
2. Open the Android Virtual Device Manager to see the emulator you have created and click on the `Show on Disk` option (available in the `Actions` tab).
2. Edit the following values in the `config.ini` file:

For 22" and 24" kiosk devices :
`hw.lcd.density=160`
`hw.lcd.height=1080`
`hw.lcd.width=1920`
`skin.name=1920x1080`

For 10" kiosk devices :
`hw.lcd.density=160`
`hw.lcd.height=800`
`hw.lcd.width=1280`
`skin.name=1280x800`