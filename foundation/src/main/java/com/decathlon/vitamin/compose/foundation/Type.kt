package com.decathlon.vitamin.compose.foundation

import androidx.compose.material.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

private val robotoCondensed = FontFamily(
    Font(R.font.roboto_condensed_regular, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.roboto_condensed_regularitalic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.roboto_condensed_bold, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.roboto_condensed_bolditalic, FontWeight.Bold, FontStyle.Italic),
    Font(R.font.roboto_condensed_light, FontWeight.Light, FontStyle.Normal),
    Font(R.font.roboto_condensed_lightitalic, FontWeight.Light, FontStyle.Italic),
)

private val roboto = FontFamily(
    Font(R.font.roboto_regular, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.roboto_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.roboto_bold, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.roboto_bolditalic, FontWeight.Bold, FontStyle.Italic),
    Font(R.font.roboto_light, FontWeight.Light, FontStyle.Normal),
    Font(R.font.roboto_lightitalic, FontWeight.Light, FontStyle.Italic),
)

val vtmnTypography = VitaminTypography(
    h1 = TextStyle(
        fontFamily = robotoCondensed,
        fontSize = 42.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 44.sp
    ),
    h2 = TextStyle(
        fontFamily = roboto,
        fontSize = 40.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 44.sp
    ),
    h3 = TextStyle(
        fontFamily = roboto,
        fontSize = 36.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 40.sp
    ),
    h4 = TextStyle(
        fontFamily = roboto,
        fontSize = 28.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 32.sp
    ),
    h5 = TextStyle(
        fontFamily = roboto,
        fontSize = 24.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 28.sp
    ),
    h6 = TextStyle(
        fontFamily = roboto,
        fontSize = 20.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 24.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = roboto,
        fontSize = 16.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 24.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = roboto,
        fontSize = 15.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 20.sp
    ),
    body1 = TextStyle(
        fontFamily = roboto,
        fontSize = 17.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 28.sp
    ),
    body2 = TextStyle(
        fontFamily = roboto,
        fontSize = 16.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 24.sp
    ),
    body3 = TextStyle(
        fontFamily = roboto,
        fontSize = 14.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 20.sp
    ),
    text1 = TextStyle(
        fontFamily = roboto,
        fontSize = 17.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 28.sp
    ),
    text2 = TextStyle(
        fontFamily = roboto,
        fontSize = 16.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 24.sp
    ),
    text3 = TextStyle(
        fontFamily = roboto,
        fontSize = 14.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 20.sp
    ),
    text1Bold = TextStyle(
        fontFamily = roboto,
        fontSize = 17.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 28.sp
    ),
    text2Bold = TextStyle(
        fontFamily = roboto,
        fontSize = 16.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 24.sp
    ),
    text3Bold = TextStyle(
        fontFamily = roboto,
        fontSize = 14.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 20.sp
    ),
    button = TextStyle(
        fontFamily = roboto,
        fontSize = 16.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 16.sp
    ),
    caption = TextStyle(
        fontFamily = roboto,
        fontSize = 12.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 16.sp
    ),
    overline = TextStyle(
        fontFamily = roboto,
        fontSize = 11.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 13.sp
    ),

)

@Immutable
data class VitaminTypography(
    val h1: TextStyle,
    val h2: TextStyle,
    val h3: TextStyle,
    val h4: TextStyle,
    val h5: TextStyle,
    val h6: TextStyle,
    val subtitle1: TextStyle,
    val subtitle2: TextStyle,
    @Deprecated(message = "body1 TextStyle is deprecated, use text1 instead", replaceWith = ReplaceWith("text1"))
    val body1: TextStyle,
    @Deprecated(message = "body2 TextStyle is deprecated, use text2 instead", replaceWith = ReplaceWith("text2"))
    val body2: TextStyle,
    @Deprecated(message = "body3 TextStyle is deprecated, use text3 instead", replaceWith = ReplaceWith("text3"))
    val body3: TextStyle,
    val text1: TextStyle,
    val text2: TextStyle,
    val text3: TextStyle,
    val text1Bold: TextStyle,
    val text2Bold: TextStyle,
    val text3Bold: TextStyle,
    val button: TextStyle,
    val caption: TextStyle,
    val overline: TextStyle
)

internal val LocalVitaminTypographies = compositionLocalOf<VitaminTypography> {
    error("No VitaminTypography provided")
}

val mdTypography = Typography(
    h1 = vtmnTypography.h1,
    h2 = vtmnTypography.h2,
    h3 = vtmnTypography.h3,
    h4 = vtmnTypography.h4,
    h5 = vtmnTypography.h5,
    h6 = vtmnTypography.h6,
    subtitle1 = vtmnTypography.subtitle1,
    subtitle2 = vtmnTypography.subtitle2,
    body1 = vtmnTypography.text1,
    body2 = vtmnTypography.text2,
    button = vtmnTypography.button,
    caption = vtmnTypography.caption,
    overline = vtmnTypography.overline
)
