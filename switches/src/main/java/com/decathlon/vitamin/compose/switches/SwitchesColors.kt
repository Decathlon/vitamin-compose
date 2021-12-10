package com.decathlon.vitamin.compose.switches

import androidx.compose.material.SwitchColors
import androidx.compose.material.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.compositeOver
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.vtmnStatesDisabled

internal object VitaminSwitchesColors {

    val primary: SwitchColors
        @Composable
        get() = SwitchDefaults.colors(
            checkedThumbColor = VitaminTheme.colors.vtmnContentActive,
            checkedTrackColor = VitaminTheme.colors.vtmnContentActive,
            checkedTrackAlpha = 0.54f,
            uncheckedThumbColor = VitaminTheme.colors.vtmnContentPrimaryReversed,
            uncheckedTrackColor = VitaminTheme.colors.vtmnContentInactive,
            uncheckedTrackAlpha = 1f,
            disabledCheckedThumbColor = VitaminTheme.colors.vtmnContentActive
                .copy(alpha = vtmnStatesDisabled)
                .compositeOver(VitaminTheme.colors.vtmnContentPrimaryReversed),
            disabledCheckedTrackColor = VitaminTheme.colors.vtmnContentActive
                .copy(alpha = vtmnStatesDisabled)
                .compositeOver(VitaminTheme.colors.vtmnContentPrimaryReversed),
            disabledUncheckedThumbColor = VitaminTheme.colors.vtmnContentPrimaryReversed
                .copy(alpha = vtmnStatesDisabled)
                .compositeOver(VitaminTheme.colors.vtmnContentPrimaryReversed),
            disabledUncheckedTrackColor = VitaminTheme.colors.vtmnContentInactive
                .copy(alpha = vtmnStatesDisabled)
                .compositeOver(VitaminTheme.colors.vtmnContentPrimaryReversed)
        )
}