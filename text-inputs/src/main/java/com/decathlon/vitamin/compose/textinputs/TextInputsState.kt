package com.decathlon.vitamin.compose.textinputs

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.vitaminicons.Line
import com.decathlon.vitamin.compose.vitaminicons.line.Check
import com.decathlon.vitamin.compose.vitaminicons.line.ErrorWarning

enum class State { NORMAL, ERROR, SUCCESS }

@Immutable
class TextInputStateColors(
    val textColor: Color,
    val focusTextColor: Color,
    val borderColor: Color,
    val focusBorderColor: Color,
    val helperColor: Color,
    val iconColor: Color,
    val imageVector: ImageVector?,
    val state: State
)

object TextInputsState {
    @Composable
    fun normal(
        textColor: Color = VitaminTheme.colors.vtmnContentTertiary,
        focusTextColor: Color = VitaminTheme.colors.vtmnBorderActive,
        borderColor: Color = VitaminTheme.colors.vtmnContentTertiary,
        focusBorderColor: Color = VitaminTheme.colors.vtmnBorderActive,
        helperColor: Color = VitaminTheme.colors.vtmnContentTertiary,
        iconColor: Color = VitaminTheme.colors.vtmnContentPrimary,
    ): TextInputStateColors = remember(
        textColor, focusTextColor, borderColor, focusBorderColor, helperColor, iconColor
    ) {
        TextInputStateColors(
            textColor = textColor,
            focusTextColor = focusTextColor,
            borderColor = borderColor,
            focusBorderColor = focusBorderColor,
            helperColor = helperColor,
            iconColor = iconColor,
            imageVector = null,
            state = State.NORMAL
        )
    }

    @Composable
    fun error(
        textColor: Color = VitaminTheme.colors.vtmnContentNegative,
        focusTextColor: Color = VitaminTheme.colors.vtmnContentNegative,
        borderColor: Color = VitaminTheme.colors.vtmnBorderNegative,
        focusBorderColor: Color = VitaminTheme.colors.vtmnBorderNegative,
        helperColor: Color = VitaminTheme.colors.vtmnContentTertiary,
        iconColor: Color = VitaminTheme.colors.vtmnBorderNegative,
        imageVector: ImageVector = VitaminIcons.Line.ErrorWarning
    ): TextInputStateColors = remember(
        textColor, focusTextColor, borderColor, focusBorderColor, helperColor, iconColor
    ) {
        TextInputStateColors(
            textColor = textColor,
            focusTextColor = focusTextColor,
            borderColor = borderColor,
            focusBorderColor = focusBorderColor,
            helperColor = helperColor,
            iconColor = iconColor,
            imageVector = imageVector,
            state = State.ERROR
        )
    }

    @Composable
    fun success(
        textColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        focusTextColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        borderColor: Color = VitaminTheme.colors.vtmnBorderPositive,
        focusBorderColor: Color = VitaminTheme.colors.vtmnBorderPositive,
        helperColor: Color = VitaminTheme.colors.vtmnContentTertiary,
        iconColor: Color = VitaminTheme.colors.vtmnBorderPositive,
        imageVector: ImageVector = VitaminIcons.Line.Check
    ): TextInputStateColors = remember(
        textColor, focusTextColor, borderColor, focusBorderColor, helperColor, iconColor
    ) {
        TextInputStateColors(
            textColor = textColor,
            focusTextColor = focusTextColor,
            borderColor = borderColor,
            focusBorderColor = focusBorderColor,
            helperColor = helperColor,
            iconColor = iconColor,
            imageVector = imageVector,
            state = State.SUCCESS
        )
    }
}
