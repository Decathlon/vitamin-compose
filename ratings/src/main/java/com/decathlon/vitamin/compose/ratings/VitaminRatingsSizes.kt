package com.decathlon.vitamin.compose.ratings

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

class RatingsSizes(
    val starSize: Dp,
    val contentPadding: Dp,
    val spaceBetween: Dp,
    val textStyle: TextStyle
)

object VitaminRatingsSizes {
    @Composable
    fun smallSize(
        starSize: Dp = 16.dp,
        contentPadding: Dp = 0.dp,
        spaceBetween: Dp = 4.dp,
        textStyle: TextStyle = VitaminTheme.typography.body3
    ) = RatingsSizes(
        starSize = starSize,
        contentPadding = contentPadding,
        spaceBetween = spaceBetween,
        textStyle = textStyle
    )

    @Composable
    fun mediumSize(
        starSize: Dp = 30.dp,
        contentPadding: Dp = 8.dp,
        spaceBetween: Dp = 16.dp,
        textStyle: TextStyle = VitaminTheme.typography.body3
    ) = RatingsSizes(
        starSize = starSize,
        contentPadding = contentPadding,
        spaceBetween = spaceBetween,
        textStyle = textStyle
    )
}
