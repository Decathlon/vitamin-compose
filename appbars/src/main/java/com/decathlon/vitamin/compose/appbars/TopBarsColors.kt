package com.decathlon.vitamin.compose.appbars

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
class TopBarsColors(
    val background: Color,
    val contentColor: Color
)

object VitaminTopBarsColors {
    @Composable
    fun primary(
        background: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimary,
    ): TopBarsColors = TopBarsColors(
        background = background,
        contentColor = contentColor
    )

    @Composable
    fun contextual(
        background: Color = VitaminTheme.colors.vtmnContentActive,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimaryReversed,
    ): TopBarsColors = TopBarsColors(
        background = background,
        contentColor = contentColor
    )
}