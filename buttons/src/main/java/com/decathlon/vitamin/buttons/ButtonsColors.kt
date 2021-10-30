package com.decathlon.vitamin.buttons

import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.foundation.VitaminTheme

const val vtmnStatesDisabled = .38f

@OptIn(ExperimentalMaterialApi::class)
internal object VitaminButtonsColors {
  val primary: ButtonColors
    @Composable
    get() = ButtonDefaults.buttonColors(
      backgroundColor = VitaminTheme.colors.vtmnBackgroundBrandPrimary,
      contentColor = VitaminTheme.colors.vtmnContentPrimaryReversed,
      disabledBackgroundColor = VitaminTheme.colors.vtmnBackgroundBrandPrimary.copy(alpha = vtmnStatesDisabled),
      disabledContentColor = VitaminTheme.colors.vtmnContentPrimaryReversed.copy(alpha = vtmnStatesDisabled)
    )

  val primaryReversed: ButtonColors
    @Composable
    get() = ButtonDefaults.buttonColors(
      backgroundColor = VitaminTheme.colors.vtmnBackgroundBrandPrimaryReversed,
      contentColor = VitaminTheme.colors.vtmnContentPrimary,
      disabledBackgroundColor = VitaminTheme.colors.vtmnBackgroundBrandPrimary.copy(alpha = vtmnStatesDisabled),
      disabledContentColor = VitaminTheme.colors.vtmnContentPrimary.copy(alpha = vtmnStatesDisabled)
    )

  val secondary: ButtonColors
    @Composable
    get() = ButtonDefaults.buttonColors(
      backgroundColor = VitaminTheme.colors.vtmnBackgroundPrimary,
      contentColor = VitaminTheme.colors.vtmnContentAction,
      disabledBackgroundColor = VitaminTheme.colors.vtmnBackgroundPrimary.copy(alpha = vtmnStatesDisabled),
      disabledContentColor = VitaminTheme.colors.vtmnContentAction.copy(alpha = vtmnStatesDisabled)
    )

  val tertiary: ButtonColors
    @Composable
    get() = ButtonDefaults.buttonColors(
      backgroundColor = VitaminTheme.colors.vtmnBackgroundBrandSecondary,
      contentColor = VitaminTheme.colors.vtmnContentAction,
      disabledBackgroundColor = VitaminTheme.colors.vtmnBackgroundBrandSecondary.copy(alpha = vtmnStatesDisabled),
      disabledContentColor = VitaminTheme.colors.vtmnContentAction.copy(alpha = vtmnStatesDisabled)
    )

  val ghost: ButtonColors
    @Composable
    get() = ButtonDefaults.textButtonColors(
      backgroundColor = Color.Transparent,
      contentColor = VitaminTheme.colors.vtmnContentAction,
      disabledContentColor = VitaminTheme.colors.vtmnContentAction.copy(alpha = vtmnStatesDisabled)
    )

  val ghostReversed: ButtonColors
    @Composable
    get() = ButtonDefaults.textButtonColors(
      backgroundColor = Color.Transparent,
      contentColor = VitaminTheme.colors.vtmnContentActionReversed,
      disabledContentColor = VitaminTheme.colors.vtmnContentActionReversed.copy(alpha = vtmnStatesDisabled)
    )

  val conversion: ButtonColors
    @Composable
    get() = ButtonDefaults.buttonColors(
      backgroundColor = VitaminTheme.colors.vtmnBackgroundAccent,
      contentColor = VitaminTheme.colors.vtmnContentPrimary,
      disabledBackgroundColor = VitaminTheme.colors.vtmnBackgroundAccent.copy(alpha = vtmnStatesDisabled),
      disabledContentColor = VitaminTheme.colors.vtmnContentPrimary.copy(alpha = vtmnStatesDisabled)
    )
}