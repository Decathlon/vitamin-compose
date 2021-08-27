package com.decathlon.vitamin.foundation

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import com.decathlon.vitamin.foundation.*
import com.decathlon.vitamin.foundation.LocalVitaminColors

@Composable
fun VitaminTheme(
  darkTheme: Boolean = isSystemInDarkTheme(),
  content: @Composable () -> Unit
) {
  val palette = if (darkTheme) DarkColorPalette else LightColorPalette
  ProvideVitaminColors(palette) {
    MaterialTheme(
      colors = debugColors(darkTheme),
      typography = VitaminTypography,
      shapes = shapes,
      content = content
    )
  }
}

object VitaminTheme {
  val colors: VitaminColors
    @Composable
    get() = LocalVitaminColors.current

  val typography: Typography
    get() = VitaminTypography
}
