package com.decathlon.vitamin.compose.switches

import androidx.compose.material.SwitchColors
import androidx.compose.material.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import com.decathlon.vitamin.compose.foundation.VitaminPalette
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.VtmnStatesDisabled

object VitaminSwitchesColors {
    @Composable
    fun primary(
        checkedThumbColor: Color = VitaminTheme.colors.vtmnContentActive,
        checkedTrackColor: Color = VitaminPalette.vtmnBlue200,
        checkedTrackAlpha: Float = 0.54f,
        uncheckedThumbColor: Color = VitaminPalette.vtmnWhite,
        uncheckedTrackColor: Color = VitaminTheme.colors.vtmnContentInactive,
        uncheckedTrackAlpha: Float = 1f,
        disabledCheckedThumbColor: Color = checkedThumbColor
            .copy(alpha = VtmnStatesDisabled)
            .compositeOver(VitaminTheme.colors.vtmnContentPrimaryReversed),
        disabledCheckedTrackColor: Color = checkedTrackColor
            .copy(alpha = VtmnStatesDisabled)
            .compositeOver(VitaminTheme.colors.vtmnContentPrimaryReversed),
        disabledUncheckedThumbColor: Color = uncheckedThumbColor
            .copy(alpha = VtmnStatesDisabled)
            .compositeOver(VitaminTheme.colors.vtmnContentPrimaryReversed),
        disabledUncheckedTrackColor: Color = uncheckedTrackColor
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
