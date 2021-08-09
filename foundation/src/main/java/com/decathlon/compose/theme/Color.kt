package com.decathlon.compose.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

val white = Color(255, 255, 255)
val greyLight4 = Color(247, 248, 249)
val greyLight3 = Color(239, 241, 243)
val greyLight2 = Color(217, 221, 225)
val greyLight1 = Color(179, 186, 195)
val grey = Color(115, 128, 134)
val greyDark1 = Color(78, 93, 107)
val greyDark2 = Color(52, 68, 80)
val greyDark3 = Color(26, 42, 52)
val black = Color(0, 16, 24)

val blueLight3 = Color(231, 243, 249)
val blueLight2 = Color(190, 222, 239)
val blueLight1 = Color(126, 190, 224)
val blue = Color(0, 125, 188)
val blueDark1 = Color(0, 104, 157)
val blueDark2 = Color(0, 83, 125)

val greenLight3 = Color(228, 249, 243)
val greenLight2 = Color(190, 239, 226)
val greenLight1 = Color(124, 223, 196)
val green = Color(2, 190, 138)
val greenDark1 = Color(2, 158, 115)
val greenDark2 = Color(1, 127, 92)

val yellowLight2 = Color(255, 251, 199)
val yellowLight1 = Color(255, 245, 141)
val yellow = Color(255, 234, 40)

val orangeLight2 = Color(254, 213, 189)
val orangeLight1 = Color(254, 171, 123)
val orange = Color(254, 88, 0)

val redLight2 = Color(245, 199, 201)
val redLight1 = Color(237, 139, 143)
val red = Color(238, 0, 12)

val functionalRed = Color(227, 44, 38)
val functionalBlue = Color(0, 125, 188)
val functionalGreen = Color(35, 169, 66)
val functionalOrange = Color(255, 96, 10)

val LightColorPalette = VitaminColors(
  brand = blue,
  brandDark = blueDark1,
  promo = red,
  secondary = green,
  ecommerceSecondary = yellow,
  textPrimary = black,
  textSecondary = white,
  success = functionalGreen,
  info = functionalBlue,
  warning = functionalOrange,
  danger = functionalRed,
  uiBackground = white
)

@Stable
class VitaminColors(
  brand: Color,
  brandDark: Color,
  promo: Color,
  secondary: Color,
  ecommerceSecondary: Color,
  textPrimary: Color,
  textSecondary: Color,
  success: Color,
  info: Color,
  warning: Color,
  danger: Color,
  uiBackground: Color
) {
  var brand by mutableStateOf(brand)
    private set
  var brandDark by mutableStateOf(brandDark)
    private set
  var promo by mutableStateOf(promo)
    private set
  var secondary by mutableStateOf(secondary)
    private set
  var ecommerceSecondary by mutableStateOf(ecommerceSecondary)
    private set
  var textPrimary by mutableStateOf(textPrimary)
    private set
  var textSecondary by mutableStateOf(textSecondary)
    private set
  var success by mutableStateOf(success)
    private set
  var info by mutableStateOf(info)
    private set
  var warning by mutableStateOf(warning)
    private set
  var danger by mutableStateOf(danger)
    private set
  var uiBackground by mutableStateOf(uiBackground)
    private set

  fun update(other: VitaminColors) {
    brand = other.brand
    brandDark = other.brandDark
    promo = other.promo
    secondary = other.secondary
    ecommerceSecondary = other.ecommerceSecondary
    textPrimary = other.textPrimary
    textSecondary = other.textSecondary
    success = other.success
    info = other.info
    warning = other.warning
    danger = other.danger
    uiBackground = other.uiBackground
  }
}

@Composable
fun ProvideVitaminColors(
  colors: VitaminColors,
  content: @Composable () -> Unit
) {
  val colorPalette = remember { colors }
  colorPalette.update(colors)
  CompositionLocalProvider(LocalVitaminColors provides colorPalette, content = content)
}

internal val LocalVitaminColors = compositionLocalOf<VitaminColors> {
  error("No VitaminColorPalette provided")
}

fun debugColors(
  darkTheme: Boolean,
  debugColor: Color = Color.Magenta
) = Colors(
  primary = debugColor,
  primaryVariant = debugColor,
  secondary = debugColor,
  secondaryVariant = debugColor,
  background = debugColor,
  surface = debugColor,
  error = debugColor,
  onPrimary = debugColor,
  onSecondary = debugColor,
  onBackground = debugColor,
  onSurface = debugColor,
  onError = debugColor,
  isLight = !darkTheme
)