package com.decathlon.vitamin.compose.appbars

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
class TopBarsColors(
    val background: Color,
    val contentColor: Color,
    val iconColor: Color,
    val disabledIconColor: Color?,
    val inputColor: Color?,
    val cursorColor: Color?
)

object VitaminTopBarsColors {
    @Composable
    fun primary(
        background: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        iconColor: Color = VitaminTheme.colors.vtmnContentPrimary
    ): TopBarsColors = TopBarsColors(
        background = background,
        contentColor = contentColor,
        iconColor = iconColor,
        disabledIconColor = null,
        inputColor = null,
        cursorColor = null
    )

    @Composable
    fun contextual(
        background: Color = VitaminTheme.colors.vtmnContentActive,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimaryReversed,
        iconColor: Color = VitaminTheme.colors.vtmnContentPrimaryReversed
    ): TopBarsColors = TopBarsColors(
        background = background,
        contentColor = contentColor,
        iconColor = iconColor,
        disabledIconColor = null,
        inputColor = null,
        cursorColor = null
    )

    @Composable
    fun search(
        background: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        contentColor: Color = VitaminTheme.colors.vtmnContentTertiary,
        iconColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        disabledIconColor: Color = VitaminTheme.colors.vtmnContentSecondary,
        inputColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        cursorColor: Color = VitaminTheme.colors.vtmnContentAction
    ): TopBarsColors = TopBarsColors(
        background = background,
        contentColor = contentColor,
        iconColor = iconColor,
        disabledIconColor = disabledIconColor,
        inputColor = inputColor,
        cursorColor = cursorColor
    )
}
