package com.decathlon.vitamin.compose.fabs

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.VtmnStatesDisabled

@Immutable
data class FabsColors(
    val contentColor: Color,
    val backgroundColor: Color,
    val disabledContentColor: Color,
    val disabledBackgroundColor: Color
)

object VitaminFabsColors {
    @Composable
    fun primary(
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimaryReversed,
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundBrandPrimary,
        disabledContentColor: Color = VitaminTheme.colors.vtmnContentAction.copy(alpha = VtmnStatesDisabled),
        disabledBackgroundColor: Color = VitaminTheme.colors.vtmnBackgroundBrandPrimary.copy(alpha = 0.12f),
    ): FabsColors = remember(
        contentColor,
        backgroundColor,
        disabledContentColor,
        disabledBackgroundColor
    ) {
        FabsColors(
            contentColor = contentColor,
            backgroundColor = backgroundColor,
            disabledContentColor = disabledContentColor,
            disabledBackgroundColor = disabledBackgroundColor
        )
    }
}
