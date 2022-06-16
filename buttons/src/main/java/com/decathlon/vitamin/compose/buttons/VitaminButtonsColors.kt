package com.decathlon.vitamin.compose.buttons

import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.VtmnStatesDisabled

object VitaminButtonsColors {
    @Composable
    fun primary(
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundBrandPrimary,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimaryReversed,
        disabledBackgroundColor: Color = VitaminTheme.colors.vtmnBackgroundBrandPrimary
            .copy(alpha = VtmnStatesDisabled),
        disabledContentColor: Color = VitaminTheme.colors.vtmnContentPrimaryReversed
            .copy(alpha = VtmnStatesDisabled)
    ): ButtonColors = ButtonDefaults.buttonColors(
        backgroundColor = backgroundColor,
        contentColor = contentColor,
        disabledBackgroundColor = disabledBackgroundColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun primaryReversed(
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundBrandPrimaryReversed,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        disabledBackgroundColor: Color = VitaminTheme.colors.vtmnBackgroundBrandPrimaryReversed
            .copy(alpha = VtmnStatesDisabled),
        disabledContentColor: Color = VitaminTheme.colors.vtmnContentPrimary
            .copy(alpha = VtmnStatesDisabled)
    ): ButtonColors = ButtonDefaults.buttonColors(
        backgroundColor = backgroundColor,
        contentColor = contentColor,
        disabledBackgroundColor = disabledBackgroundColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun secondary(
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        contentColor: Color = VitaminTheme.colors.vtmnContentAction,
        disabledBackgroundColor: Color = VitaminTheme.colors.vtmnBackgroundPrimary
            .copy(alpha = VtmnStatesDisabled),
        disabledContentColor: Color = VitaminTheme.colors.vtmnContentAction
            .copy(alpha = VtmnStatesDisabled)
    ): ButtonColors = ButtonDefaults.buttonColors(
        backgroundColor = backgroundColor,
        contentColor = contentColor,
        disabledBackgroundColor = disabledBackgroundColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun tertiary(
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundBrandSecondary,
        contentColor: Color = VitaminTheme.colors.vtmnContentAction,
        disabledBackgroundColor: Color = VitaminTheme.colors.vtmnBackgroundBrandSecondary
            .copy(alpha = VtmnStatesDisabled),
        disabledContentColor: Color = VitaminTheme.colors.vtmnContentAction
            .copy(alpha = VtmnStatesDisabled)
    ): ButtonColors = ButtonDefaults.buttonColors(
        backgroundColor = backgroundColor,
        contentColor = contentColor,
        disabledBackgroundColor = disabledBackgroundColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun conversion(
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundAccent,
        contentColor: Color = VitaminTheme.colors.vtmnContentAccent,
        disabledBackgroundColor: Color = VitaminTheme.colors.vtmnBackgroundAccent
            .copy(alpha = VtmnStatesDisabled),
        disabledContentColor: Color = VitaminTheme.colors.vtmnContentAccent
            .copy(alpha = VtmnStatesDisabled)
    ): ButtonColors = ButtonDefaults.buttonColors(
        backgroundColor = backgroundColor,
        contentColor = contentColor,
        disabledBackgroundColor = disabledBackgroundColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun ghost(
        backgroundColor: Color = Color.Transparent,
        contentColor: Color = VitaminTheme.colors.vtmnContentAction,
        disabledContentColor: Color = VitaminTheme.colors.vtmnContentAction
            .copy(alpha = VtmnStatesDisabled)
    ): ButtonColors = ButtonDefaults.textButtonColors(
        backgroundColor = backgroundColor,
        contentColor = contentColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun ghostReversed(
        backgroundColor: Color = Color.Transparent,
        contentColor: Color = VitaminTheme.colors.vtmnContentActionReversed,
        disabledContentColor: Color = VitaminTheme.colors.vtmnContentActionReversed
            .copy(alpha = VtmnStatesDisabled)
    ): ButtonColors = ButtonDefaults.textButtonColors(
        backgroundColor = backgroundColor,
        contentColor = contentColor,
        disabledContentColor = disabledContentColor
    )
}
