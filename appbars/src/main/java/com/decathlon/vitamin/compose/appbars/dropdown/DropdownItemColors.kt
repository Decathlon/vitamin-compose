package com.decathlon.vitamin.compose.appbars.dropdown

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
class DropdownItemColors(
    val background: Color,
    val contentColor: Color,
    val iconColor: Color
)

object VitaminDropdownItemColors {
    @Composable
    fun primary(
        background: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        iconColor: Color = VitaminTheme.colors.vtmnContentTertiary
    ): DropdownItemColors = DropdownItemColors(
        background = background,
        contentColor = contentColor,
        iconColor = iconColor
    )
}
