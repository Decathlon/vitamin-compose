package com.decathlon.vitamin.compose.foundation

import androidx.compose.material.Typography
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

val VitaminTypography = Typography(
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
    )
)