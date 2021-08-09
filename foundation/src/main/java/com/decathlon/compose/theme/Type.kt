package com.decathlon.compose.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val VitaminTypography = Typography(
    h1 = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_condensed_bolditalic)),
        fontSize = 60.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 56.sp
    ),
    h2 = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontSize = 48.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 50.sp
    ),
    h3 = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontSize = 36.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 40.sp
    ),
    h4 = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontSize = 28.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 27.sp
    ),
    h5 = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontSize = 24.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 28.sp
    ),
    h6 = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontSize = 20.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 24.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontSize = 16.sp,
        lineHeight = 24.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontSize = 14.sp,
        lineHeight = 24.sp
    ),
    body1 = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontSize = 16.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 24.sp
    ),
    body2 = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontSize = 14.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 20.sp
    ),
    button = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontWeight = FontWeight.W700,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontSize = 12.sp
    ),
    overline = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontSize = 10.sp,
        fontWeight = FontWeight.W700
    )
)