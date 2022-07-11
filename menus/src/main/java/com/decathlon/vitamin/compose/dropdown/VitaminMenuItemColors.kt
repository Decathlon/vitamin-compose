package com.decathlon.vitamin.compose.dropdown

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object VitaminMenuItemColors {
    @Composable
    fun primary(
        background: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        iconColor: Color = VitaminTheme.colors.vtmnContentTertiary
    ): MenuItemColors = remember(
        background,
        contentColor,
        iconColor
    ) {
        MenuItemColors(background = background, contentColor = contentColor, iconColor = iconColor)
    }
}
