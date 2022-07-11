package com.decathlon.vitamin.compose.appbars.bottomnavigations

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object VitaminBottomNavigationColors {
    @Composable
    fun primary(
        background: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        selected: Color = VitaminTheme.colors.vtmnContentActive,
        unSelected: Color = VitaminTheme.colors.vtmnContentTertiary,
    ): BottomNavigationColors = remember(
        background,
        selected,
        unSelected
    ) {
        BottomNavigationColors(
            background = background,
            selected = selected,
            unSelected = unSelected
        )
    }
}
