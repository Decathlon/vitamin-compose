package com.decathlon.vitamin.compose.appbars.topbars

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object VitaminTopBarColors {
    @Composable
    fun primary(
        background: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        iconColor: Color = VitaminTheme.colors.vtmnContentPrimary
    ): TopBarColors = remember(
        background,
        contentColor,
        iconColor
    ) {
        TopBarColors(
            background = background,
            contentColor = contentColor,
            iconColor = iconColor,
            disabledIconColor = null,
            inputColor = null,
            cursorColor = null
        )
    }

    @Composable
    fun contextual(
        background: Color = VitaminTheme.colors.vtmnContentActive,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimaryReversed,
        iconColor: Color = VitaminTheme.colors.vtmnContentPrimaryReversed
    ): TopBarColors = remember(
        background,
        contentColor,
        iconColor
    ) {
        TopBarColors(
            background = background,
            contentColor = contentColor,
            iconColor = iconColor,
            disabledIconColor = null,
            inputColor = null,
            cursorColor = null
        )
    }

    @Composable
    fun search(
        background: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        contentColor: Color = VitaminTheme.colors.vtmnContentTertiary,
        iconColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        disabledIconColor: Color = VitaminTheme.colors.vtmnContentSecondary,
        inputColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        cursorColor: Color = VitaminTheme.colors.vtmnContentAction
    ): TopBarColors = remember(
        background,
        contentColor,
        iconColor,
        disabledIconColor,
        inputColor,
        cursorColor
    ) {
        TopBarColors(
            background = background,
            contentColor = contentColor,
            iconColor = iconColor,
            disabledIconColor = disabledIconColor,
            inputColor = inputColor,
            cursorColor = cursorColor
        )
    }
}
