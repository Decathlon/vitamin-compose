package com.decathlon.vitamin.compose.buttons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

class ButtonSizes(
    val fontSize: TextUnit,
    val minWidth: Dp,
    val height: Dp,
    val iconSize: Dp,
    val contentPadding: PaddingValues
)

object VitaminButtonSizes {
    @Composable
    fun largeSize(
        fontSize: TextUnit = VitaminTheme.typography.body1.fontSize,
        minWidth: Dp = 84.dp,
        height: Dp = 64.dp,
        iconSize: Dp = 24.dp,
        contentPadding: PaddingValues = PaddingValues(start = 40.dp, end = 40.dp)
    ) = ButtonSizes(
        fontSize = fontSize,
        minWidth = minWidth,
        height = height,
        iconSize = iconSize,
        contentPadding = contentPadding
    )

    @Composable
    fun mediumSize(
        fontSize: TextUnit = VitaminTheme.typography.body2.fontSize,
        minWidth: Dp = 120.dp,
        height: Dp = 48.dp,
        iconSize: Dp = 20.dp,
        contentPadding: PaddingValues = PaddingValues(start = 24.dp, end = 24.dp)
    ) = ButtonSizes(
        fontSize = fontSize,
        minWidth = minWidth,
        height = height,
        iconSize = iconSize,
        contentPadding = contentPadding
    )

    @Composable
    fun smallSize(
        fontSize: TextUnit = VitaminTheme.typography.body2.fontSize,
        minWidth: Dp = 84.dp,
        height: Dp = 32.dp,
        iconSize: Dp = 16.dp,
        contentPadding: PaddingValues = PaddingValues(start = 16.dp, end = 16.dp)
    ) = ButtonSizes(
        fontSize = fontSize,
        minWidth = minWidth,
        height = height,
        iconSize = iconSize,
        contentPadding = contentPadding
    )
}
