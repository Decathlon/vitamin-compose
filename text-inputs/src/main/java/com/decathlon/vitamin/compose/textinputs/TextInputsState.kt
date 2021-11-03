package com.decathlon.vitamin.compose.textinputs

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme


enum class State { NORMAL, ERROR, SUCCESS }

@Immutable
class TextInputStateColors(
  val textColor: Color,
  val focusTextColor: Color,
  val borderColor: Color,
  val focusBorderColor: Color,
  val helperColor: Color,
  val iconColor: Color,
  @DrawableRes val icon: Int?,
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
  ): TextInputStateColors = TextInputStateColors(
    textColor = textColor,
    focusTextColor = focusTextColor,
    borderColor = borderColor,
    focusBorderColor = focusBorderColor,
    helperColor = helperColor,
    iconColor = iconColor,
    icon = null,
    state = State.NORMAL
  )

  @Composable
  fun error(
    textColor: Color = VitaminTheme.colors.vtmnContentNegative,
    focusTextColor: Color = VitaminTheme.colors.vtmnContentNegative,
    borderColor: Color = VitaminTheme.colors.vtmnBorderNegative,
    focusBorderColor: Color = VitaminTheme.colors.vtmnBorderNegative,
    helperColor: Color = VitaminTheme.colors.vtmnContentTertiary,
    iconColor: Color = VitaminTheme.colors.vtmnBorderNegative,
    @DrawableRes icon: Int = R.drawable.ic_vtmn_error_warning_line
  ): TextInputStateColors = TextInputStateColors(
    textColor = textColor,
    focusTextColor = focusTextColor,
    borderColor = borderColor,
    focusBorderColor = focusBorderColor,
    helperColor = helperColor,
    iconColor = iconColor,
    icon = icon,
    state = State.ERROR
  )

  @Composable
  fun success(
    textColor: Color = VitaminTheme.colors.vtmnContentPrimary,
    focusTextColor: Color = VitaminTheme.colors.vtmnContentPrimary,
    borderColor: Color = VitaminTheme.colors.vtmnBorderPositive,
    focusBorderColor: Color = VitaminTheme.colors.vtmnBorderPositive,
    helperColor: Color = VitaminTheme.colors.vtmnContentTertiary,
    iconColor: Color = VitaminTheme.colors.vtmnBorderPositive,
    @DrawableRes icon: Int = R.drawable.ic_vtmn_check_line
  ): TextInputStateColors = TextInputStateColors(
    textColor = textColor,
    focusTextColor = focusTextColor,
    borderColor = borderColor,
    focusBorderColor = focusBorderColor,
    helperColor = helperColor,
    iconColor = iconColor,
    icon = icon,
    state = State.SUCCESS
  )
}
