package com.decathlon.vitamin.compose.tabs

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
class TabsColors(
    val tabBackgroundColor: Color,
    val tabIndicatorColor: Color,
    val activeColor: Color,
    val disabledColor: Color
)

object VitaminTabsColors {
    @Composable
    fun primary(
        tabBackgroundColor: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        tabIndicatorColor: Color = VitaminTheme.colors.vtmnContentActive,
        activeColor: Color = VitaminTheme.colors.vtmnContentActive,
        disabledColor: Color = VitaminTheme.colors.vtmnContentSecondary
    ): TabsColors = TabsColors(
        tabBackgroundColor = tabBackgroundColor,
        tabIndicatorColor = tabIndicatorColor,
        activeColor = activeColor,
        disabledColor = disabledColor
    )
}
