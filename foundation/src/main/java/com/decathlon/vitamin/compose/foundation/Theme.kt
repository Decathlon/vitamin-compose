package com.decathlon.vitamin.compose.foundation

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember

@Composable
fun VitaminTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val palette = if (darkTheme) vtmnDarkColorPalette else vtmnLightColorPalette
    ProvideVitaminResources(palette, vtmnTypography, vtmnRipples) {
        MaterialTheme(
            colors = debugColors(darkTheme, palette),
            typography = mdTypography,
            shapes = shapes,
            content = content
        )
    }
}

@Composable
fun ProvideVitaminResources(
    colors: VitaminColors,
    typography: VitaminTypography,
    ripples: VitaminRipples,
    content: @Composable () -> Unit
) {
    val colorPalette = remember { colors }
    colorPalette.update(colors)
    CompositionLocalProvider(
        LocalVitaminColors provides colorPalette,
        LocalVitaminTypographies provides typography,
        LocalVitaminRipples provides ripples
    ) {
        ProvideTextStyle(value = typography.body1, content = content)
    }
}

object VitaminTheme {
    val colors: VitaminColors
        @Composable
        get() = LocalVitaminColors.current

    val typography: VitaminTypography
        @Composable
        get() = LocalVitaminTypographies.current

    val ripples: VitaminRipples
        @Composable
        get() = LocalVitaminRipples.current
}
