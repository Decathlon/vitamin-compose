package com.decathlon.compose.buttons

import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.decathlon.compose.theme.VitaminTheme

@OptIn(ExperimentalMaterialApi::class)
internal object VitaminButtonsColors {
  val primary: ButtonColors
    @Composable
    get() = ButtonDefaults.buttonColors(
      backgroundColor = VitaminTheme.colors.brand,
      contentColor = VitaminTheme.colors.textSecondary,
      disabledBackgroundColor = VitaminTheme.colors.brand.copy(alpha = .25f),
      disabledContentColor = VitaminTheme.colors.textSecondary.copy(alpha = .25f)
    )

  val primaryReversed: ButtonColors
    @Composable
    get() = ButtonDefaults.outlinedButtonColors(
      backgroundColor = VitaminTheme.colors.uiBackground,
      contentColor = VitaminTheme.colors.textPrimary,
      disabledContentColor = VitaminTheme.colors.textPrimary.copy(alpha = .25f)
    )

  val secondary: ButtonColors
    @Composable
    get() = ButtonDefaults.outlinedButtonColors(
      backgroundColor = VitaminTheme.colors.uiBackground,
      contentColor = VitaminTheme.colors.textPrimary,
      disabledContentColor = VitaminTheme.colors.textPrimary.copy(alpha = .25f)
    )

  val secondaryReversed: ButtonColors
    @Composable
    get() = ButtonDefaults.outlinedButtonColors(
      backgroundColor = Color.Transparent,
      contentColor = VitaminTheme.colors.textSecondary,
      disabledContentColor = VitaminTheme.colors.textSecondary.copy(alpha = .25f)
    )

  val ghost: ButtonColors
    @Composable
    get() = ButtonDefaults.textButtonColors(
      backgroundColor = Color.Transparent,
      contentColor = VitaminTheme.colors.brandDark,
      disabledContentColor = VitaminTheme.colors.brandDark.copy(alpha = .25f)
    )

  val ghostReversed: ButtonColors
    @Composable
    get() = ButtonDefaults.textButtonColors(
      backgroundColor = Color.Transparent,
      contentColor = VitaminTheme.colors.textSecondary,
      disabledContentColor = VitaminTheme.colors.textSecondary.copy(alpha = .25f)
    )

  val conversion: ButtonColors
    @Composable
    get() = ButtonDefaults.buttonColors(
      backgroundColor = VitaminTheme.colors.ecommerceSecondary,
      contentColor = VitaminTheme.colors.textPrimary,
      disabledBackgroundColor = VitaminTheme.colors.ecommerceSecondary.copy(alpha = .25f),
      disabledContentColor = VitaminTheme.colors.textPrimary.copy(alpha = .25f)
    )
}