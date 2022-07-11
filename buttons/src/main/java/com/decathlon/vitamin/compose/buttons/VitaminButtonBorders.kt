package com.decathlon.vitamin.compose.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.VtmnStatesDisabled

@Immutable
data class ButtonBorders(
    val stroke: BorderStroke? = null,
    val disabled: BorderStroke? = stroke
)

object VitaminButtonBorders {
    @Composable
    fun primary(
        width: Dp = 2.dp,
        strokeColor: Color = VitaminTheme.colors.vtmnBorderPrimary,
        disabledColor: Color = VitaminTheme.colors.vtmnBorderPrimary.copy(alpha = VtmnStatesDisabled)
    ): ButtonBorders = remember(
        width,
        strokeColor,
        disabledColor
    ) {
        ButtonBorders(
            stroke = BorderStroke(width = width, color = strokeColor),
            disabled = BorderStroke(width = width, color = disabledColor)
        )
    }

    @Composable
    fun none(): ButtonBorders = remember {
        ButtonBorders()
    }
}
