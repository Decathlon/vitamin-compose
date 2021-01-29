package com.decathlon.compose.buttons

import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.decathlon.compose.theme.VitaminTheme

@OptIn(ExperimentalMaterialApi::class)
internal object VitaminButtonsColors {
  @Composable
  val primary: ButtonColors
    get() = ButtonDefaults.buttonColors(
      backgroundColor = VitaminTheme.colors.brand,
      contentColor = VitaminTheme.colors.textSecondary,
      disabledBackgroundColor = VitaminTheme.colors.brand.copy(alpha = .25f),
      disabledContentColor = VitaminTheme.colors.textSecondary.copy(alpha = .25f)
    )

  @Composable
  val primaryReversed: ButtonColors
    get() = ButtonDefaults.outlinedButtonColors(
      backgroundColor = VitaminTheme.colors.uiBackground,
      contentColor = VitaminTheme.colors.textPrimary,
      disabledContentColor = VitaminTheme.colors.textPrimary.copy(alpha = .25f)
    )

  @Composable
  val secondary: ButtonColors
    get() = ButtonDefaults.outlinedButtonColors(
      backgroundColor = VitaminTheme.colors.uiBackground,
      contentColor = VitaminTheme.colors.textPrimary,
      disabledContentColor = VitaminTheme.colors.textPrimary.copy(alpha = .25f)
    )

  @Composable
  val secondaryReversed: ButtonColors
    get() = ButtonDefaults.outlinedButtonColors(
      backgroundColor = Color.Transparent,
      contentColor = VitaminTheme.colors.textSecondary,
      disabledContentColor = VitaminTheme.colors.textSecondary.copy(alpha = .25f)
    )

  @Composable
  val ghost: ButtonColors
    get() = ButtonDefaults.textButtonColors(
      backgroundColor = Color.Transparent,
      contentColor = VitaminTheme.colors.brandDark,
      disabledContentColor = VitaminTheme.colors.brandDark.copy(alpha = .25f)
    )

  @Composable
  val ghostReversed: ButtonColors
    get() = ButtonDefaults.textButtonColors(
      backgroundColor = Color.Transparent,
      contentColor = VitaminTheme.colors.textSecondary,
      disabledContentColor = VitaminTheme.colors.textSecondary.copy(alpha = .25f)
    )

  @Composable
  val conversion: ButtonColors
    get() = ButtonDefaults.buttonColors(
      backgroundColor = VitaminTheme.colors.ecommerceSecondary,
      contentColor = VitaminTheme.colors.textPrimary,
      disabledBackgroundColor = VitaminTheme.colors.ecommerceSecondary.copy(alpha = .25f),
      disabledContentColor = VitaminTheme.colors.textPrimary.copy(alpha = .25f)
    )
}