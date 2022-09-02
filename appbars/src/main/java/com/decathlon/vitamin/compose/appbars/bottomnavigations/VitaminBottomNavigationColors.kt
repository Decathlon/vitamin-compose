package com.decathlon.vitamin.compose.appbars.bottomnavigations

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object VitaminBottomNavigationColors {
    @Composable
    fun primary(
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        selectedIconColor: Color = VitaminTheme.colors.vtmnContentActive,
        selectedTextColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        unSelectedColor: Color = VitaminTheme.colors.vtmnContentTertiary
    ): BottomNavigationColors = remember(
        backgroundColor,
        selectedIconColor,
        selectedTextColor,
        unSelectedColor
    ) {
        BottomNavigationColors(
            backgroundColor = backgroundColor,
            selectedIconColor = selectedIconColor,
            selectedTextColor = selectedTextColor,
            unselectedColor = unSelectedColor,
        )
    }
}
