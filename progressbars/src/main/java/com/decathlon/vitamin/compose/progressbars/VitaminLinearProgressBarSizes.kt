package com.decathlon.vitamin.compose.progressbars

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
data class LinearProgressBarSizes(
    val strokeSize: Dp,
    val labelBottomPadding: Dp,
    val textStyle: TextStyle
)

object VitaminLinearProgressBarSizes {
    @Composable
    fun small(
        strokeSize: Dp = 4.dp,
        labelBottomPadding: Dp = 4.dp,
        textStyle: TextStyle = VitaminTheme.typography.text3
    ): LinearProgressBarSizes = remember(strokeSize, labelBottomPadding, textStyle) {
        LinearProgressBarSizes(
            strokeSize = strokeSize,
            labelBottomPadding = labelBottomPadding,
            textStyle = textStyle
        )
    }

    @Composable
    fun medium(
        strokeSize: Dp = 8.dp,
        labelBottomPadding: Dp = 8.dp,
        textStyle: TextStyle = VitaminTheme.typography.text2
    ): LinearProgressBarSizes = remember(strokeSize, labelBottomPadding, textStyle) {
        LinearProgressBarSizes(
            strokeSize = strokeSize,
            labelBottomPadding = labelBottomPadding,
            textStyle = textStyle
        )
    }

    @Composable
    fun large(
        strokeSize: Dp = 16.dp,
        labelBottomPadding: Dp = 8.dp,
        textStyle: TextStyle = VitaminTheme.typography.text2
    ): LinearProgressBarSizes = remember(strokeSize, labelBottomPadding, textStyle) {
        LinearProgressBarSizes(
            strokeSize = strokeSize,
            labelBottomPadding = labelBottomPadding,
            textStyle = textStyle
        )
    }
}
