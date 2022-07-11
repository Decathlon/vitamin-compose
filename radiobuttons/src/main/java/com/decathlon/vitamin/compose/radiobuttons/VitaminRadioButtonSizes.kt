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
    val contentPadding: Dp,
    val labelStartPadding: Dp,
    val textStyle: TextStyle
)

object VitaminRadioButtonSizes {
    @Composable
    fun medium(
        contentPadding: Dp = 4.dp,
        labelStartPadding: Dp = 6.dp,
        textStyle: TextStyle = VitaminTheme.typography.body2
    ): RadioButtonSizes = remember(contentPadding, labelStartPadding, textStyle) {
        RadioButtonSizes(
            contentPadding = contentPadding,
            labelStartPadding = labelStartPadding,
            textStyle = textStyle
        )
    }
}
