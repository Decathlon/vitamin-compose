package com.decathlon.vitamin.compose.modals

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

class ModalSizes(
    val verticalPadding: Dp,
    val horizontalPadding: Dp,
    val spacerSize: Dp,
    val iconSize: Dp,
    val buttonsSpacer: Dp,
    val cornerRadius: RoundedCornerShape
)

object VitaminModalSizes {
    @Composable
    fun medium(
        verticalPadding: Dp = 20.dp,
        horizontalPadding: Dp = 24.dp,
        spacerSize: Dp = 12.dp,
        iconSize: Dp = 24.dp,
        buttonsSpacer: Dp = 8.dp,
        cornerRadius: RoundedCornerShape = VitaminTheme.shapes.radius200
    ): ModalSizes = remember(
        verticalPadding,
        horizontalPadding,
        spacerSize,
        iconSize,
        buttonsSpacer,
        cornerRadius
    ) {
        ModalSizes(
            verticalPadding = verticalPadding,
            horizontalPadding = horizontalPadding,
            spacerSize = spacerSize,
            iconSize = iconSize,
            buttonsSpacer = buttonsSpacer,
            cornerRadius = cornerRadius
        )
    }
}
