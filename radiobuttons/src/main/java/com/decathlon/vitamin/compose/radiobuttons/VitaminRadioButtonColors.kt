package com.decathlon.vitamin.compose.radiobuttons

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.VtmnStatesDisabled

@Immutable
data class RadioButtonColors(
    val selectedColor: Color,
    val unselectedColor: Color,
    val disabledSelectedColor: Color,
    val disabledUnselectedColor: Color,
    val labelColor: Color
)

object VitaminRadioButtonColors {
    @Composable
    fun primary(
        selectedColor: Color = VitaminTheme.colors.vtmnContentActive,
        unselectedColor: Color = VitaminTheme.colors.vtmnContentInactive,
        disabledSelectedColor: Color = VitaminTheme.colors.vtmnContentActive.copy(alpha = VtmnStatesDisabled),
        disabledUnselectedColor: Color = VitaminTheme.colors.vtmnContentInactive.copy(alpha = VtmnStatesDisabled),
        labelColor: Color = VitaminTheme.colors.vtmnContentPrimary
    ): RadioButtonColors = remember(
        selectedColor,
        unselectedColor,
        disabledSelectedColor,
        disabledUnselectedColor,
        labelColor
    ) {
        RadioButtonColors(
            selectedColor = selectedColor,
            unselectedColor = unselectedColor,
            disabledSelectedColor = disabledSelectedColor,
            disabledUnselectedColor = disabledUnselectedColor,
            labelColor = labelColor
        )
    }
}
