package com.decathlon.vitamin.compose.appbars

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
class BottomNavigationsColors(
    val background: Color,
    val selected: Color,
    val unSelected: Color
)

object VitaminBottomNavigationsColors {
    @Composable
    fun primary(
        background: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        selected: Color = VitaminTheme.colors.vtmnContentActive,
        unSelected: Color = VitaminTheme.colors.vtmnContentTertiary,
    ): BottomNavigationsColors = BottomNavigationsColors(
        background = background,
        selected = selected,
        unSelected = unSelected
    )
}