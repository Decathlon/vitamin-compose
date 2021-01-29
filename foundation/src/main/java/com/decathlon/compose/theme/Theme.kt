package com.decathlon.compose.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable

@Composable
fun VitaminTheme(
  darkTheme: Boolean = isSystemInDarkTheme(),
  content: @Composable () -> Unit
) {
  ProvideVitaminColors(LightColorPalette) {
    MaterialTheme(
      colors = debugColors(darkTheme),
      typography = VitaminTypography,
      shapes = shapes,
      content = content
    )
  }
}

object VitaminTheme {
  @Composable
  val colors: VitaminColors
    get() = AmbientVitaminColors.current

  val typography: Typography
    get() = VitaminTypography
}
