package com.decathlon.vitamin.compose.tabs

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
class TabColors(
    val backgroundColor: Color,
    val indicatorColor: Color,
    val activeColor: Color,
    val disabledColor: Color
)

object VitaminTabColors {
    @Composable
    fun primary(
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        indicatorColor: Color = VitaminTheme.colors.vtmnContentActive,
        activeColor: Color = VitaminTheme.colors.vtmnContentActive,
        disabledColor: Color = VitaminTheme.colors.vtmnContentSecondary
    ): TabColors = remember(
        backgroundColor, indicatorColor, activeColor, disabledColor
    ) {
        TabColors(
            backgroundColor = backgroundColor,
            indicatorColor = indicatorColor,
            activeColor = activeColor,
            disabledColor = disabledColor
        )
    }
}
