package com.decathlon.vitamin.compose.checkboxes

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.VtmnStatesDisabled

@Immutable
data class CheckboxColors(
    val checkedColor: Color,
    val uncheckedColor: Color,
    val checkmarkColor: Color,
    val contentColor: Color,
    val disabledColor: Color,
    val disabledCheckmarkColor: Color,
    val disabledIndeterminateColor: Color,
)

object VitaminCheckboxColors {
    @Composable
    fun primary(
        checkedColor: Color = VitaminTheme.colors.vtmnContentActive,
        uncheckedColor: Color = VitaminTheme.colors.vtmnContentInactive,
        checkmarkColor: Color = VitaminTheme.colors.vtmnBorderTertiary,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        disabledColor: Color = VitaminTheme.colors.vtmnContentActive.copy(alpha = VtmnStatesDisabled),
        disabledCheckmarkColor: Color = VitaminTheme.colors.vtmnBorderTertiary.copy(alpha = VtmnStatesDisabled),
        disabledIndeterminateColor: Color = VitaminTheme.colors.vtmnContentActive.copy(alpha = VtmnStatesDisabled)
    ): CheckboxColors = remember(
        checkedColor,
        uncheckedColor,
        checkmarkColor,
        contentColor,
        disabledColor,
        disabledCheckmarkColor,
        disabledIndeterminateColor
    ) {
        CheckboxColors(
            checkedColor = checkedColor,
            uncheckedColor = uncheckedColor,
            checkmarkColor = checkmarkColor,
            contentColor = contentColor,
            disabledColor = disabledColor,
            disabledCheckmarkColor = disabledCheckmarkColor,
            disabledIndeterminateColor = disabledIndeterminateColor
        )
    }
}
