package com.decathlon.vitamin.foundation

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val VitaminTypography = Typography(
    h1 = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_condensed_bolditalic)),
        fontSize = 42.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 44.sp
    ),
    h2 = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontSize = 40.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 44.sp
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
        lineHeight = 32.sp
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
        fontWeight = FontWeight.W700,
        lineHeight = 24.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontSize = 15.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 20.sp
    ),
    body1 = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontSize = 17.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 28.sp
    ),
    body2 = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontSize = 16.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 24.sp
    ),
    button = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontSize = 16.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 16.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontSize = 12.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 16.sp
    ),
    overline = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontSize = 11.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 13.sp
    )
)