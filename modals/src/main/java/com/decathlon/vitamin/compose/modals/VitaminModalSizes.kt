package com.decathlon.vitamin.compose.modals

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

class ModalSizes(
    val verticalPadding: Dp,
    val horizontalPadding: Dp,
    val spacerSize: Dp,
    val iconSize: Dp
)

object VitaminModalSizes {
    @Composable
    fun medium(
        verticalPadding: Dp = 20.dp,
        horizontalPadding: Dp = 24.dp,
        spacerSize: Dp = 12.dp,
        iconSize: Dp = 24.dp
    ): ModalSizes = remember(
        verticalPadding,
        horizontalPadding,
        spacerSize,
        iconSize
    ) {
        ModalSizes(
            verticalPadding = verticalPadding,
            horizontalPadding = horizontalPadding,
            spacerSize = spacerSize,
            iconSize = iconSize
        )
    }
}
