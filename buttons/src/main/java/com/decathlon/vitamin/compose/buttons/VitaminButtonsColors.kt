package com.decathlon.vitamin.compose.buttons

import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.VtmnStatesDisabled

internal object VitaminButtonsColors {
    val primary: ButtonColors
        @Composable
        get() = ButtonDefaults.buttonColors(
            backgroundColor = VitaminTheme.colors.vtmnBackgroundBrandPrimary,
            contentColor = VitaminTheme.colors.vtmnContentPrimaryReversed,
            disabledBackgroundColor = VitaminTheme.colors.vtmnBackgroundBrandPrimary.copy(alpha = VtmnStatesDisabled),
            disabledContentColor = VitaminTheme.colors.vtmnContentPrimaryReversed.copy(alpha = VtmnStatesDisabled)
        )

    val primaryReversed: ButtonColors
        @Composable
        get() = ButtonDefaults.buttonColors(
            backgroundColor = VitaminTheme.colors.vtmnBackgroundBrandPrimaryReversed,
            contentColor = VitaminTheme.colors.vtmnContentPrimary,
            disabledBackgroundColor = VitaminTheme.colors.vtmnBackgroundBrandPrimary.copy(alpha = VtmnStatesDisabled),
            disabledContentColor = VitaminTheme.colors.vtmnContentPrimary.copy(alpha = VtmnStatesDisabled)
        )

    val secondary: ButtonColors
        @Composable
        get() = ButtonDefaults.buttonColors(
            backgroundColor = VitaminTheme.colors.vtmnBackgroundPrimary,
            contentColor = VitaminTheme.colors.vtmnContentAction,
            disabledBackgroundColor = VitaminTheme.colors.vtmnBackgroundPrimary.copy(alpha = VtmnStatesDisabled),
            disabledContentColor = VitaminTheme.colors.vtmnContentAction.copy(alpha = VtmnStatesDisabled)
        )

    val tertiary: ButtonColors
        @Composable
        get() = ButtonDefaults.buttonColors(
            backgroundColor = VitaminTheme.colors.vtmnBackgroundBrandSecondary,
            contentColor = VitaminTheme.colors.vtmnContentAction,
            disabledBackgroundColor = VitaminTheme.colors.vtmnBackgroundBrandSecondary.copy(alpha = VtmnStatesDisabled),
            disabledContentColor = VitaminTheme.colors.vtmnContentAction.copy(alpha = VtmnStatesDisabled)
        )

    val ghost: ButtonColors
        @Composable
        get() = ButtonDefaults.textButtonColors(
            backgroundColor = Color.Transparent,
            contentColor = VitaminTheme.colors.vtmnContentAction,
            disabledContentColor = VitaminTheme.colors.vtmnContentAction.copy(alpha = VtmnStatesDisabled)
        )

    val ghostReversed: ButtonColors
        @Composable
        get() = ButtonDefaults.textButtonColors(
            backgroundColor = Color.Transparent,
            contentColor = VitaminTheme.colors.vtmnContentActionReversed,
            disabledContentColor = VitaminTheme.colors.vtmnContentActionReversed.copy(alpha = VtmnStatesDisabled)
        )

    val conversion: ButtonColors
        @Composable
        get() = ButtonDefaults.buttonColors(
            backgroundColor = VitaminTheme.colors.vtmnBackgroundAccent,
            contentColor = VitaminTheme.colors.vtmnContentPrimary,
            disabledBackgroundColor = VitaminTheme.colors.vtmnBackgroundAccent.copy(alpha = VtmnStatesDisabled),
            disabledContentColor = VitaminTheme.colors.vtmnContentPrimary.copy(alpha = VtmnStatesDisabled)
        )
}
