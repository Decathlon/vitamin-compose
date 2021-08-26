package com.decathlon.compose.buttons

import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import com.decathlon.compose.theme.VitaminTheme

internal object VitaminButtonsRipples {
  val primary: RippleTheme
    @Composable
    get() = object : RippleTheme {
      @Composable
      override fun defaultColor() = VitaminTheme.colors.vtmnActiveBrand

      @Composable
      override fun rippleAlpha(): RippleAlpha = RippleAlpha(1f, 1f, 1f, 1f)
    }

  val primaryReversed: RippleTheme
    @Composable
    get() = object : RippleTheme {
      @Composable
      override fun defaultColor() = VitaminTheme.colors.vtmnActiveBrandReversedTransparent

      @Composable
      override fun rippleAlpha(): RippleAlpha = RippleAlpha(1f, 1f, 1f, 0.6f)
    }

  val secondary: RippleTheme
    @Composable
    get() = object : RippleTheme {
      @Composable
      override fun defaultColor() = VitaminTheme.colors.vtmnActivePrimary

      @Composable
      override fun rippleAlpha(): RippleAlpha = RippleAlpha(1f, 1f, 1f, 1f)
    }

  val tertiary: RippleTheme
    @Composable
    get() = object : RippleTheme {
      @Composable
      override fun defaultColor() = VitaminTheme.colors.vtmnActiveTertiary

      @Composable
      override fun rippleAlpha(): RippleAlpha = RippleAlpha(1f, 1f, 1f, 1f)
    }

  val ghost: RippleTheme
    @Composable
    get() = object : RippleTheme {
      @Composable
      override fun defaultColor() = VitaminTheme.colors.vtmnActivePrimary

      @Composable
      override fun rippleAlpha(): RippleAlpha = RippleAlpha(1f, 1f, 1f, 1f)
    }

  val ghostReversed: RippleTheme
    @Composable
    get() = object : RippleTheme {
      @Composable
      override fun defaultColor() = VitaminTheme.colors.vtmnActivePrimaryReversedTransparent

      @Composable
      override fun rippleAlpha(): RippleAlpha = RippleAlpha(1f, 1f, 1f, 0.25f)
    }

  val conversion: RippleTheme
    @Composable
    get() = object : RippleTheme {
      @Composable
      override fun defaultColor() = VitaminTheme.colors.vtmnActiveAccent

      @Composable
      override fun rippleAlpha(): RippleAlpha = RippleAlpha(1f, 1f, 1f, 1f)
    }
}

