package com.decathlon.vitamin.compose.quantity.pickers

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.VtmnStatesDisabled

enum class State { NORMAL, ERROR }

@Immutable
data class QuantityColors(
    val textColor: Color,
    val disabledTextColor: Color,
    val focusTextColor: Color,
    val buttonsBorderColor: Color,
    val editTextBorderColor: Color,
    val focusBorderColor: Color,
    val backgroundColor: Color,
    val state: State
)

object VitaminQuantitiesColors {
    @Composable
    fun normal(
        textColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        disabledTextColor: Color = VitaminTheme.colors.vtmnContentTertiary.copy(alpha = VtmnStatesDisabled),
        focusTextColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        buttonsBorderColor: Color = VitaminTheme.colors.vtmnBorderInactive,
        editTextBorderColor: Color = VitaminTheme.colors.vtmnBorderInactive,
        focusBorderColor: Color = VitaminTheme.colors.vtmnBorderActive,
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundPrimary
    ): QuantityColors =
        remember(
            textColor,
            disabledTextColor,
            focusTextColor,
            buttonsBorderColor,
            editTextBorderColor,
            focusBorderColor,
            backgroundColor
        ) {
            QuantityColors(
                textColor = textColor,
                disabledTextColor = disabledTextColor,
                focusTextColor = focusTextColor,
                buttonsBorderColor = buttonsBorderColor,
                editTextBorderColor = editTextBorderColor,
                focusBorderColor = focusBorderColor,
                backgroundColor = backgroundColor,
                state = State.NORMAL
            )
        }

    @Composable
    fun error(
        textColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        disabledTextColor: Color = VitaminTheme.colors.vtmnContentTertiary.copy(alpha = VtmnStatesDisabled),
        focusTextColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        buttonsBorderColor: Color = VitaminTheme.colors.vtmnBorderInactive,
        editTextBorderColor: Color = VitaminTheme.colors.vtmnBorderNegative,
        focusBorderColor: Color = VitaminTheme.colors.vtmnBorderNegative,
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundPrimary
    ): QuantityColors =
        remember(
            textColor,
            disabledTextColor,
            focusTextColor,
            buttonsBorderColor,
            editTextBorderColor,
            focusBorderColor,
            backgroundColor
        ) {
            QuantityColors(
                textColor = textColor,
                disabledTextColor = disabledTextColor,
                focusTextColor = focusTextColor,
                buttonsBorderColor = buttonsBorderColor,
                editTextBorderColor = editTextBorderColor,
                focusBorderColor = focusBorderColor,
                backgroundColor = backgroundColor,
                state = State.ERROR
            )
        }
}
