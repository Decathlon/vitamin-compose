package com.decathlon.vitamin.compose.radiobuttons

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
data class RadioButtonSizes(
    val minimumSize: Dp,
    val padding: Dp,
    val labelStartPadding: Dp,
    val textStyle: TextStyle
)

object VitaminRadioButtonSizes {
    @Composable
    fun medium(
        minimumSize: Dp = 48.dp,
        padding: Dp = 8.dp,
        labelStartPadding: Dp = 6.dp,
        textStyle: TextStyle = VitaminTheme.typography.text2
    ): RadioButtonSizes = remember(minimumSize, padding, labelStartPadding, textStyle) {
        RadioButtonSizes(
            minimumSize = minimumSize,
            padding = padding,
            labelStartPadding = labelStartPadding,
            textStyle = textStyle
        )
    }
}
