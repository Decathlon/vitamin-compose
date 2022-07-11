package com.decathlon.vitamin.compose.switches

import androidx.compose.material.SwitchColors
import androidx.compose.material.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.VtmnStatesDisabled

object VitaminSwitchesColors {
    @Composable
    fun primary(
        checkedThumbColor: Color = VitaminTheme.colors.vtmnContentActive,
        checkedTrackColor: Color = VitaminTheme.colors.vtmnContentActive,
        checkedTrackAlpha: Float = 0.54f,
        uncheckedThumbColor: Color = VitaminTheme.colors.vtmnContentPrimaryReversed,
        uncheckedTrackColor: Color = VitaminTheme.colors.vtmnContentInactive,
        uncheckedTrackAlpha: Float = 1f,
        disabledCheckedThumbColor: Color = VitaminTheme.colors.vtmnContentActive
            .copy(alpha = VtmnStatesDisabled)
            .compositeOver(VitaminTheme.colors.vtmnContentPrimaryReversed),
        disabledCheckedTrackColor: Color = VitaminTheme.colors.vtmnContentActive
            .copy(alpha = VtmnStatesDisabled)
            .compositeOver(VitaminTheme.colors.vtmnContentPrimaryReversed),
        disabledUncheckedThumbColor: Color = VitaminTheme.colors.vtmnContentPrimaryReversed
            .copy(alpha = VtmnStatesDisabled)
            .compositeOver(VitaminTheme.colors.vtmnContentPrimaryReversed),
        disabledUncheckedTrackColor: Color = VitaminTheme.colors.vtmnContentInactive
            .copy(alpha = VtmnStatesDisabled)
            .compositeOver(VitaminTheme.colors.vtmnContentPrimaryReversed)
    ): SwitchColors = SwitchDefaults.colors(
        checkedThumbColor = checkedThumbColor,
        checkedTrackColor = checkedTrackColor,
        checkedTrackAlpha = checkedTrackAlpha,
        uncheckedThumbColor = uncheckedThumbColor,
        uncheckedTrackColor = uncheckedTrackColor,
        uncheckedTrackAlpha = uncheckedTrackAlpha,
        disabledCheckedThumbColor = disabledCheckedThumbColor,
        disabledCheckedTrackColor = disabledCheckedTrackColor,
        disabledUncheckedThumbColor = disabledUncheckedThumbColor,
        disabledUncheckedTrackColor = disabledUncheckedTrackColor
    )
}
