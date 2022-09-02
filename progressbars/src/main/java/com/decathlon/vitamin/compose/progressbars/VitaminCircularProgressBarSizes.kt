package com.decathlon.vitamin.compose.progressbars

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
data class CircularProgressBarSizes(
    val boxSize: Dp,
    val strokeSize: Dp,
    val contentPadding: Dp,
    val textStyle: TextStyle
)

object VitaminCircularProgressBarSizes {
    @Composable
    fun small(
        boxSize: Dp = 64.dp,
        strokeSize: Dp = 6.dp,
        contentPadding: Dp = 1.dp,
        textStyle: TextStyle = VitaminTheme.typography.text1
    ): CircularProgressBarSizes = remember(boxSize, strokeSize, contentPadding, textStyle) {
        CircularProgressBarSizes(
            boxSize = boxSize,
            strokeSize = strokeSize,
            contentPadding = contentPadding,
            textStyle = textStyle
        )
    }

    @Composable
    fun medium(
        boxSize: Dp = 128.dp,
        strokeSize: Dp = 12.dp,
        contentPadding: Dp = 2.dp,
        textStyle: TextStyle = VitaminTheme.typography.h4
    ): CircularProgressBarSizes = remember(boxSize, strokeSize, contentPadding, textStyle) {
        CircularProgressBarSizes(
            boxSize = boxSize,
            strokeSize = strokeSize,
            contentPadding = contentPadding,
            textStyle = textStyle
        )
    }
}
