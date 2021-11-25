package com.decathlon.vitamin.compose.foundation

import androidx.compose.material.Colors
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ExperimentalGraphicsApi
import androidx.core.graphics.ColorUtils

val vtmnPurple50 = Color(242, 237, 242)
val vtmnPurple100 = Color(220, 207, 221)
val vtmnPurple200 = Color(172, 141, 175)
val vtmnPurple300 = Color(150, 111, 154)
val vtmnPurple400 = Color(108, 78, 111)
val vtmnPurple500 = Color(91,65,93)
val vtmnPurple600 = Color(73, 53, 75)
val vtmnPurple700 = Color(44, 32, 45)

val vtmnBlue50 = Color(231, 243, 249)
val vtmnBlue100 = Color(190, 222, 239)
val vtmnBlue200 = Color(126, 190, 224)
val vtmnBlue300 = Color(61, 154, 204)
val vtmnBlue400 = Color(0, 125, 188)
val vtmnBlue500 = Color(0, 104, 157)
val vtmnBlue600 = Color(0, 83, 125)
val vtmnBlue700 = Color(1, 43, 73)

val vtmnGreen50 = Color(228, 249, 243)
val vtmnGreen100 = Color(190, 239, 226)
val vtmnGreen200 = Color(124, 223, 196)
val vtmnGreen300 = Color(33, 206, 156)
val vtmnGreen400 = Color(2, 190, 138)
val vtmnGreen500 = Color(2, 158, 115)
val vtmnGreen600 = Color(1, 127, 92)
val vtmnGreen700 = Color(0, 111, 67)

val vtmnConifer50 = Color(234, 251, 232)
val vtmnConifer100 = Color(203, 240, 199)
val vtmnConifer200 = Color(136, 215, 127)
val vtmnConifer300 = Color(116, 199, 106)
val vtmnConifer400 = Color(35, 169, 66)
val vtmnConifer500 = Color(65, 160, 54)
val vtmnConifer600 = Color(55, 141, 46)
val vtmnConifer700 = Color(37, 108, 29)

val vtmnYellow50 = Color(255, 254, 240)
val vtmnYellow100 = Color(255, 251, 199)
val vtmnYellow200 = Color(255, 245, 141)
val vtmnYellow300 = Color(255, 243, 112)
val vtmnYellow400 = Color(255, 234, 40)
val vtmnYellow500 = Color(188, 176, 44)
val vtmnYellow600 = Color(153, 144, 40)
val vtmnYellow700 = Color(103, 97, 27)

val vtmnOrange50 = Color(255, 243, 237)
val vtmnOrange100 = Color(255, 228, 214)
val vtmnOrange200 = Color(250, 195, 165)
val vtmnOrange300 = Color(250, 156, 105)
val vtmnOrange400 = Color(255, 96, 10)
val vtmnOrange500 = Color(193, 94, 41)
val vtmnOrange600 = Color(154, 75, 33)
val vtmnOrange700 = Color(103, 50, 22)

val vtmnRed50 = Color(254, 236, 237)
val vtmnRed100 = Color(254, 201, 203)
val vtmnRed200 = Color(253, 146, 151)
val vtmnRed300 = Color(253, 114, 120)
val vtmnRed400 = Color(227, 38, 47)
val vtmnRed500 = Color(171, 0, 9)
val vtmnRed600 = Color(135, 0, 7)
val vtmnRed700 = Color(90, 0, 5)

val vtmnWhite = Color(255, 255, 255)
val vtmnGrey50 = Color(247, 248, 249)
val vtmnGrey100 = Color(239, 241, 243)
val vtmnGrey200 = Color(217, 221, 225)
val vtmnGrey300 = Color(179, 186, 195)
val vtmnGrey400 = Color(140, 150, 162)
val vtmnGrey500 = Color(104, 119, 135)
val vtmnGrey600 = Color(78, 93, 107)
val vtmnGrey700 = Color(52, 68, 80)
val vtmnGrey800 = Color(26, 42, 52)
val vtmnGrey900 = Color(20, 33, 41)
val vtmnBlack = Color(0, 16, 24)

val vtmnLightColorPalette = VitaminColors(
  vtmnBackgroundPrimary = vtmnWhite,
  vtmnBackgroundSecondary = vtmnGrey50,
  vtmnBackgroundTertiary = vtmnGrey100,
  vtmnBackgroundBrandPrimary = vtmnBlue400,
  vtmnBackgroundBrandSecondary = vtmnBlue50,
  vtmnBackgroundAccent = vtmnYellow400,
  vtmnBackgroundDiscount = vtmnRed400,
  vtmnBackgroundPrimaryReversed = vtmnBlack,
  vtmnBackgroundBrandPrimaryReversed = vtmnWhite,
  vtmnContentPrimary = vtmnBlack,
  vtmnContentSecondary = vtmnGrey600,
  vtmnContentTertiary = vtmnGrey500,
  vtmnContentAction = vtmnBlue500,
  vtmnContentActive = vtmnBlue400,
  vtmnContentInactive = vtmnGrey400,
  vtmnContentNegative = vtmnRed400,
  vtmnContentWarning = vtmnOrange400,
  vtmnContentPositive = vtmnConifer400,
  vtmnContentInformation = vtmnBlue400,
  vtmnContentAccent = vtmnBlack,
  vtmnContentVisited = vtmnPurple400,
  vtmnContentPrimaryReversed = vtmnWhite,
  vtmnContentActionReversed = vtmnWhite,
  vtmnContentVisitedReversed = vtmnPurple200,
  vtmnBorderPrimary = vtmnWhite,
  vtmnBorderSecondary = vtmnGrey200,
  vtmnBorderTertiary = vtmnGrey100,
  vtmnBorderActive = vtmnBlue400,
  vtmnBorderInactive = vtmnGrey400,
  vtmnBorderNegative = vtmnRed400,
  vtmnBorderWarning = vtmnOrange400,
  vtmnBorderPositive = vtmnConifer400,
  vtmnBorderInformation = vtmnBlue400,
  vtmnBorderPrimaryReversed = vtmnBlack,
  vtmnHoverPrimary = vtmnBlue50
)

val vtmnDarkColorPalette = VitaminColors(
  vtmnBackgroundPrimary = vtmnGrey800,
  vtmnBackgroundSecondary = vtmnGrey900,
  vtmnBackgroundTertiary = vtmnBlack,
  vtmnBackgroundBrandPrimary = vtmnBlue300,
  vtmnBackgroundBrandSecondary = vtmnBlue700,
  vtmnBackgroundAccent = vtmnYellow400,
  vtmnBackgroundDiscount = vtmnRed400,
  vtmnBackgroundPrimaryReversed = vtmnWhite,
  vtmnBackgroundBrandPrimaryReversed = vtmnBlack,
  vtmnContentPrimary = vtmnWhite,
  vtmnContentSecondary = vtmnGrey300,
  vtmnContentTertiary = vtmnGreen400,
  vtmnContentAction = vtmnBlue200,
  vtmnContentActive = vtmnBlue300,
  vtmnContentInactive = vtmnGrey500,
  vtmnContentNegative = vtmnRed300,
  vtmnContentWarning = vtmnOrange300,
  vtmnContentPositive = vtmnConifer300,
  vtmnContentInformation = vtmnBlue300,
  vtmnContentAccent = vtmnBlack,
  vtmnContentVisited = vtmnPurple300,
  vtmnContentPrimaryReversed = vtmnBlack,
  vtmnContentActionReversed = vtmnBlack,
  vtmnContentVisitedReversed = vtmnPurple300,
  vtmnBorderPrimary = vtmnGrey800,
  vtmnBorderSecondary = vtmnGrey700,
  vtmnBorderTertiary = vtmnBlack,
  vtmnBorderActive = vtmnBlue300,
  vtmnBorderInactive = vtmnGrey500,
  vtmnBorderNegative = vtmnRed300,
  vtmnBorderWarning = vtmnOrange300,
  vtmnBorderPositive = vtmnConifer300,
  vtmnBorderInformation = vtmnBlue300,
  vtmnBorderPrimaryReversed = vtmnWhite,
  vtmnHoverPrimary = vtmnBlue700
)


@OptIn(ExperimentalGraphicsApi::class)
@Stable
class VitaminColors constructor(
  // Background
  vtmnBackgroundPrimary: Color,
  vtmnBackgroundSecondary: Color,
  vtmnBackgroundTertiary: Color,
  vtmnBackgroundBrandPrimary: Color,
  vtmnBackgroundBrandSecondary: Color,
  vtmnBackgroundAccent: Color,
  vtmnBackgroundDiscount: Color,
  vtmnBackgroundPrimaryReversed: Color,
  vtmnBackgroundBrandPrimaryReversed: Color,

  // Content
  vtmnContentPrimary: Color,
  vtmnContentSecondary: Color,
  vtmnContentTertiary: Color,
  vtmnContentAction: Color,
  vtmnContentActive: Color,
  vtmnContentInactive: Color,
  vtmnContentNegative: Color,
  vtmnContentWarning: Color,
  vtmnContentPositive: Color,
  vtmnContentInformation: Color,
  vtmnContentAccent: Color,
  vtmnContentVisited: Color,
  vtmnContentPrimaryReversed: Color,
  vtmnContentActionReversed: Color,
  vtmnContentVisitedReversed: Color,

  // Border
  vtmnBorderPrimary: Color,
  vtmnBorderSecondary: Color,
  vtmnBorderTertiary: Color,
  vtmnBorderActive: Color,
  vtmnBorderInactive: Color,
  vtmnBorderNegative: Color,
  vtmnBorderWarning: Color,
  vtmnBorderPositive: Color,
  vtmnBorderInformation: Color,
  vtmnBorderPrimaryReversed: Color,

  // Hover
  vtmnHoverPrimary: Color,
  vtmnHoverPrimaryTransparent: Color = vtmnBackgroundBrandPrimary.convertByHSL(aTransform = { 0.05f }),
  vtmnHoverSecondaryTransparent: Color = vtmnContentPrimary.convertByHSL(aTransform = { 0.05f }),
  vtmnHoverTertiaryTransparent: Color = vtmnHoverPrimary.convertByHSL(
    lTransform = { it * 0.98f },
    aTransform = { 0.8f }),
  vtmnHoverTertiary: Color = vtmnBackgroundSecondary.convertByHSL(lTransform = { it * 0.95f }),
  vtmnHoverBrand: Color = vtmnBackgroundBrandPrimary.convertByHSL(lTransform = { it * 0.85f }),
  vtmnHoverAccent: Color = vtmnBackgroundAccent.convertByHSL(lTransform = { it + (1 - it) * 0.48f }),
  vtmnHoverPrimaryReversedTransparent: Color = vtmnContentPrimaryReversed.convertByHSL(aTransform = { 0.08f }),
  vtmnHoverSecondaryReversedTransparent: Color = vtmnContentPrimaryReversed.convertByHSL(aTransform = { 0.02f }),
  vtmnHoverBrandReversedTransparent: Color = vtmnContentPrimaryReversed.convertByHSL(aTransform = { 0.8f }),

  // Active
  vtmnActivePrimary: Color = vtmnHoverPrimary.convertByHSL(lTransform = { it + (1 - it) * 0.35f }),
  vtmnActivePrimaryTransparent: Color = vtmnContentActive.convertByHSL(aTransform = { 0.15f }),
  vtmnActiveSecondaryTransparent: Color = vtmnContentPrimary.convertByHSL(aTransform = { 0.15f }),
  vtmnActiveTertiary: Color = vtmnHoverPrimary.convertByHSL(lTransform = { it * 0.93f }),
  vtmnActiveTertiaryTransparent: Color = vtmnHoverPrimary.convertByHSL(
    lTransform = { it * 0.94f },
    aTransform = { 0.8f }),
  vtmnActiveBrand: Color = vtmnBackgroundBrandPrimary.convertByHSL(lTransform = { it * 0.7f }),
  vtmnActiveAccent: Color = vtmnBackgroundAccent.convertByHSL(lTransform = { it + (1 - it) * 0.5f }),
  vtmnActivePrimaryReversedTransparent: Color = vtmnContentPrimaryReversed.convertByHSL(aTransform = { 0.25f }),
  vtmnActiveSecondaryReversedTransparent: Color = vtmnContentPrimaryReversed.convertByHSL(aTransform = { 0.4f }),
  vtmnActiveBrandReversedTransparent: Color = vtmnContentPrimaryReversed.convertByHSL(aTransform = { 0.6f })
) {
  var vtmnBackgroundPrimary by mutableStateOf(vtmnBackgroundPrimary)
    private set
  var vtmnBackgroundSecondary by mutableStateOf(vtmnBackgroundSecondary)
    private set
  var vtmnBackgroundTertiary by mutableStateOf(vtmnBackgroundTertiary)
    private set
  var vtmnBackgroundBrandPrimary by mutableStateOf(vtmnBackgroundBrandPrimary)
    private set
  var vtmnBackgroundBrandSecondary by mutableStateOf(vtmnBackgroundBrandSecondary)
    private set
  var vtmnBackgroundAccent by mutableStateOf(vtmnBackgroundAccent)
    private set
  var vtmnBackgroundDiscount by mutableStateOf(vtmnBackgroundDiscount)
    private set
  var vtmnBackgroundPrimaryReversed by mutableStateOf(vtmnBackgroundPrimaryReversed)
    private set
  var vtmnBackgroundBrandPrimaryReversed by mutableStateOf(vtmnBackgroundBrandPrimaryReversed)
    private set
  var vtmnContentPrimary by mutableStateOf(vtmnContentPrimary)
    private set
  var vtmnContentSecondary by mutableStateOf(vtmnContentSecondary)
    private set
  var vtmnContentTertiary by mutableStateOf(vtmnContentTertiary)
    private set
  var vtmnContentAction by mutableStateOf(vtmnContentAction)
    private set
  var vtmnContentActive by mutableStateOf(vtmnContentActive)
    private set
  var vtmnContentInactive by mutableStateOf(vtmnContentInactive)
    private set
  var vtmnContentNegative by mutableStateOf(vtmnContentNegative)
    private set
  var vtmnContentWarning by mutableStateOf(vtmnContentWarning)
    private set
  var vtmnContentPositive by mutableStateOf(vtmnContentPositive)
    private set
  var vtmnContentInformation by mutableStateOf(vtmnContentInformation)
    private set
  var vtmnContentAccent by mutableStateOf(vtmnContentAccent)
    private set
  var vtmnContentVisited by mutableStateOf(vtmnContentVisited)
    private set
  var vtmnContentPrimaryReversed by mutableStateOf(vtmnContentPrimaryReversed)
    private set
  var vtmnContentActionReversed by mutableStateOf(vtmnContentActionReversed)
    private set
  var vtmnContentVisitedReversed by mutableStateOf(vtmnContentVisitedReversed)
    private set
  var vtmnBorderPrimary by mutableStateOf(vtmnBorderPrimary)
    private set
  var vtmnBorderSecondary by mutableStateOf(vtmnBorderSecondary)
    private set
  var vtmnBorderTertiary by mutableStateOf(vtmnBorderTertiary)
    private set
  var vtmnBorderActive by mutableStateOf(vtmnBorderActive)
    private set
  var vtmnBorderInactive by mutableStateOf(vtmnBorderInactive)
    private set
  var vtmnBorderNegative by mutableStateOf(vtmnBorderNegative)
    private set
  var vtmnBorderWarning by mutableStateOf(vtmnBorderWarning)
    private set
  var vtmnBorderPositive by mutableStateOf(vtmnBorderPositive)
    private set
  var vtmnBorderInformation by mutableStateOf(vtmnBorderInformation)
    private set
  var vtmnBorderPrimaryReversed by mutableStateOf(vtmnBorderPrimaryReversed)
    private set

  // Hover
  var vtmnHoverPrimary by mutableStateOf(vtmnHoverPrimary)
    private set
  var vtmnHoverPrimaryTransparent by mutableStateOf(vtmnHoverPrimaryTransparent)
    private set
  var vtmnHoverSecondaryTransparent by mutableStateOf(vtmnHoverSecondaryTransparent)
    private set
  var vtmnHoverTertiaryTransparent by mutableStateOf(vtmnHoverTertiaryTransparent)
    private set
  var vtmnHoverTertiary by mutableStateOf(vtmnHoverTertiary)
    private set
  var vtmnHoverBrand by mutableStateOf(vtmnHoverBrand)
    private set
  var vtmnHoverAccent by mutableStateOf(vtmnHoverAccent)
    private set
  var vtmnHoverPrimaryReversedTransparent by mutableStateOf(vtmnHoverPrimaryReversedTransparent)
    private set
  var vtmnHoverSecondaryReversedTransparent by mutableStateOf(vtmnHoverSecondaryReversedTransparent)
    private set
  var vtmnHoverBrandReversedTransparent by mutableStateOf(vtmnHoverBrandReversedTransparent)
    private set

  // Active
  var vtmnActivePrimary by mutableStateOf(vtmnActivePrimary)
    private set
  var vtmnActivePrimaryTransparent by mutableStateOf(vtmnActivePrimaryTransparent)
    private set
  var vtmnActiveSecondaryTransparent by mutableStateOf(vtmnActiveSecondaryTransparent)
    private set
  var vtmnActiveTertiary by mutableStateOf(vtmnActiveTertiary)
    private set
  var vtmnActiveTertiaryTransparent by mutableStateOf(vtmnActiveTertiaryTransparent)
    private set
  var vtmnActiveBrand by mutableStateOf(vtmnActiveBrand)
    private set
  var vtmnActiveAccent by mutableStateOf(vtmnActiveAccent)
    private set
  var vtmnActivePrimaryReversedTransparent by mutableStateOf(vtmnActivePrimaryReversedTransparent)
    private set
  var vtmnActiveSecondaryReversedTransparent by mutableStateOf(
    vtmnActiveSecondaryReversedTransparent
  )
    private set
  var vtmnActiveBrandReversedTransparent by mutableStateOf(vtmnActiveBrandReversedTransparent)
    private set

  fun update(other: VitaminColors) {
    vtmnBackgroundPrimary = other.vtmnBackgroundPrimary
    vtmnBackgroundSecondary = other.vtmnBackgroundSecondary
    vtmnBackgroundTertiary = other.vtmnBackgroundTertiary
    vtmnBackgroundBrandPrimary = other.vtmnBackgroundBrandPrimary
    vtmnBackgroundBrandSecondary = other.vtmnBackgroundBrandSecondary
    vtmnBackgroundAccent = other.vtmnBackgroundAccent
    vtmnBackgroundDiscount = other.vtmnBackgroundDiscount
    vtmnBackgroundPrimaryReversed = other.vtmnBackgroundPrimaryReversed
    vtmnBackgroundBrandPrimaryReversed = other.vtmnBackgroundBrandPrimaryReversed
    vtmnContentPrimary = other.vtmnContentPrimary
    vtmnContentSecondary = other.vtmnContentSecondary
    vtmnContentTertiary = other.vtmnContentTertiary
    vtmnContentAction = other.vtmnContentAction
    vtmnContentActive = other.vtmnContentActive
    vtmnContentInactive = other.vtmnContentInactive
    vtmnContentNegative = other.vtmnContentNegative
    vtmnContentWarning = other.vtmnContentWarning
    vtmnContentPositive = other.vtmnContentPositive
    vtmnContentInformation = other.vtmnContentInformation
    vtmnContentAccent = other.vtmnContentAccent
    vtmnContentVisited = other.vtmnContentVisited
    vtmnContentPrimaryReversed = other.vtmnContentPrimaryReversed
    vtmnContentActionReversed = other.vtmnContentActionReversed
    vtmnContentVisitedReversed = other.vtmnContentVisitedReversed
    vtmnBorderPrimary = other.vtmnBorderPrimary
    vtmnBorderSecondary = other.vtmnBorderSecondary
    vtmnBorderTertiary = other.vtmnBorderTertiary
    vtmnBorderActive = other.vtmnBorderActive
    vtmnBorderInactive = other.vtmnBorderInactive
    vtmnBorderNegative = other.vtmnBorderNegative
    vtmnBorderWarning = other.vtmnBorderWarning
    vtmnBorderPositive = other.vtmnBorderPositive
    vtmnBorderInformation = other.vtmnBorderInformation
    vtmnBorderPrimaryReversed = other.vtmnBorderPrimaryReversed

    // Hover
    vtmnHoverPrimary = other.vtmnHoverPrimary
    vtmnHoverPrimaryTransparent = other.vtmnHoverPrimaryTransparent
    vtmnHoverSecondaryTransparent = other.vtmnHoverSecondaryTransparent
    vtmnHoverTertiaryTransparent = other.vtmnHoverTertiaryTransparent
    vtmnHoverTertiary = other.vtmnHoverTertiary
    vtmnHoverBrand = other.vtmnHoverBrand
    vtmnHoverAccent = other.vtmnHoverAccent
    vtmnHoverPrimaryReversedTransparent = other.vtmnHoverPrimaryReversedTransparent
    vtmnHoverSecondaryReversedTransparent = other.vtmnHoverSecondaryReversedTransparent
    vtmnHoverBrandReversedTransparent = other.vtmnHoverBrandReversedTransparent

    // Active
    vtmnActivePrimary = other.vtmnActivePrimary
    vtmnActivePrimaryTransparent = other.vtmnActivePrimaryTransparent
    vtmnActiveSecondaryTransparent = other.vtmnActiveSecondaryTransparent
    vtmnActiveTertiary = other.vtmnActiveTertiary
    vtmnActiveTertiaryTransparent = other.vtmnActiveTertiaryTransparent
    vtmnActiveBrand = other.vtmnActiveBrand
    vtmnActiveAccent = other.vtmnActiveAccent
    vtmnActivePrimaryReversedTransparent = other.vtmnActivePrimaryReversedTransparent
    vtmnActiveSecondaryReversedTransparent = other.vtmnActiveSecondaryReversedTransparent
    vtmnActiveBrandReversedTransparent = other.vtmnActiveBrandReversedTransparent
  }
}

internal val LocalVitaminColors = compositionLocalOf<VitaminColors> {
  error("No VitaminColorPalette provided")
}

fun debugColors(
  darkTheme: Boolean,
  vtmnColors: VitaminColors
) = Colors(
  primary = vtmnColors.vtmnBackgroundBrandPrimary,
  primaryVariant = vtmnColors.vtmnBackgroundBrandPrimary,
  onPrimary = vtmnColors.vtmnContentPrimaryReversed,
  secondary = vtmnColors.vtmnBackgroundAccent,
  secondaryVariant = vtmnColors.vtmnBackgroundAccent,
  onSecondary = vtmnColors.vtmnContentPrimaryReversed,
  background = vtmnColors.vtmnBackgroundPrimary,
  onBackground = vtmnColors.vtmnContentPrimary,
  surface = vtmnColors.vtmnBackgroundPrimary,
  onSurface = vtmnColors.vtmnContentPrimary,
  error = vtmnColors.vtmnContentNegative,
  onError = vtmnColors.vtmnContentPrimaryReversed,
  isLight = !darkTheme
)

@ExperimentalGraphicsApi
fun Color.convertByHSL(
  hTransform: (h: Float) -> Float = { it },
  sTransform: (s: Float) -> Float = { it },
  lTransform: (l: Float) -> Float = { it },
  aTransform: (a: Float) -> Float = { it }
): Color {
  val (h, s, l) = this.toHSL()
  return Color.hsl(hTransform(h), sTransform(s), lTransform(l), aTransform(1f))
}

fun Color.toHSL(): HSLColor {
  val hsl = floatArrayOf(0f, 0f, 0f)
  ColorUtils.RGBToHSL(
    (this.red * 255).toInt(),
    (this.green * 255).toInt(),
    (this.blue * 255).toInt(),
    hsl
  )
  return HSLColor(hsl[0], hsl[1], hsl[2])
}

@Immutable
data class HSLColor(
  val h: Float,
  val s: Float,
  val l: Float
)
