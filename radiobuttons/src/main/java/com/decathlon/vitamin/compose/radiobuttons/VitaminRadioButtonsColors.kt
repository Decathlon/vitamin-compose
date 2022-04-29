package com.decathlon.vitamin.compose.radiobuttons

import androidx.compose.material.RadioButtonColors
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.runtime.Composable
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.VtmnStatesDisabled

object VitaminRadioButtonsColors {
    @Composable
    fun primary(selected: Boolean): RadioButtonColors = RadioButtonDefaults.colors(
        selectedColor = VitaminTheme.colors.vtmnContentActive,
        unselectedColor = VitaminTheme.colors.vtmnContentInactive,
        disabledColor = if (selected) VitaminTheme.colors.vtmnContentActive.copy(alpha = VtmnStatesDisabled)
        else VitaminTheme.colors.vtmnContentInactive.copy(alpha = VtmnStatesDisabled)
    )
}
