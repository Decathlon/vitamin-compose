package com.decathlon.vitamin.compose.fabs

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
data class FabExtendedSizes(
    val textStyle: TextStyle,
    val height: Dp,
    val iconSize: Dp,
    val horizontalPadding: Dp,
    val iconStartPadding: Dp,
    val iconEndPadding: Dp
)

object VitaminFabExtendedSizes {
    @Composable
    fun default(
        textStyle: TextStyle = VitaminTheme.typography.button,
        height: Dp = 48.dp,
        iconSize: Dp = 24.dp,
        textHorizontalPadding: Dp = 20.dp,
        iconStartPadding: Dp = 16.dp,
        iconEndPadding: Dp = 8.dp
    ): FabExtendedSizes = remember(
        textStyle,
        height,
        iconSize,
        textHorizontalPadding,
        iconStartPadding,
        iconEndPadding
    ) {
        FabExtendedSizes(
            textStyle = textStyle,
            height = height,
            iconSize = iconSize,
            horizontalPadding = textHorizontalPadding,
            iconStartPadding = iconStartPadding,
            iconEndPadding = iconEndPadding
        )
    }
}
