package com.decathlon.vitamin.compose.dropdown

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
class MenuItemColors(
    val background: Color,
    val contentColor: Color,
    val iconColor: Color
)

object VitaminMenuItemColors {
    val primary: MenuItemColors
        @Composable
        get() = MenuItemColors(
            background = VitaminTheme.colors.vtmnBackgroundPrimary,
            contentColor = VitaminTheme.colors.vtmnContentPrimary,
            iconColor = VitaminTheme.colors.vtmnContentTertiary
        )
}
