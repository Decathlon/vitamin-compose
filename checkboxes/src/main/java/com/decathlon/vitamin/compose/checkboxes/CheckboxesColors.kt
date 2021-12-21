package com.decathlon.vitamin.compose.checkboxes

import androidx.compose.material.CheckboxColors
import androidx.compose.material.CheckboxDefaults
import androidx.compose.runtime.Composable
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.vtmnStatesDisabled

internal object VitaminCheckboxesColors {
    @Composable
    fun primary(enabled: Boolean): CheckboxColors = CheckboxDefaults.colors(
        checkedColor = VitaminTheme.colors.vtmnContentActive,
        uncheckedColor = VitaminTheme.colors.vtmnContentInactive,
        checkmarkColor = VitaminTheme.colors.vtmnBorderTertiary.copy(alpha = if (enabled) 1f else vtmnStatesDisabled),
        disabledColor = VitaminTheme.colors.vtmnContentActive.copy(alpha = vtmnStatesDisabled),
        disabledIndeterminateColor = VitaminTheme.colors.vtmnContentActive.copy(alpha = vtmnStatesDisabled)
    )
}