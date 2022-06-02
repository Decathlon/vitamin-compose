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
data class VitaminButtonBorders(
    val stroke: BorderStroke? = null,
    val disabled: BorderStroke? = stroke
)

object VitaminButtonsBorders {
    @Composable
    fun primaryReversed(
        width: Dp = 2.dp,
        strokeColor: Color = VitaminTheme.colors.vtmnBackgroundBrandPrimaryReversed,
        disabledColor: Color = VitaminTheme.colors.vtmnBackgroundBrandPrimaryReversed.copy(alpha = VtmnStatesDisabled)
    ): VitaminButtonBorders = remember {
        VitaminButtonBorders(
            stroke = BorderStroke(width = width, color = strokeColor),
            disabled = BorderStroke(width = width, color = disabledColor)
        )
    }

    @Composable
    fun secondary(
        width: Dp = 2.dp,
        strokeColor: Color = VitaminTheme.colors.vtmnBorderSecondary,
        disabledColor: Color = VitaminTheme.colors.vtmnBorderSecondary.copy(alpha = VtmnStatesDisabled)
    ): VitaminButtonBorders = remember {
        VitaminButtonBorders(
            stroke = BorderStroke(width = width, color = strokeColor),
            disabled = BorderStroke(width = width, color = disabledColor)
        )
    }

    @Composable
    fun none(): VitaminButtonBorders = remember {
        VitaminButtonBorders()
    }
}
