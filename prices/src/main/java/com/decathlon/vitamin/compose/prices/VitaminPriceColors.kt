package com.decathlon.vitamin.compose.prices

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
data class PriceColors(val backgroundColor: Color, val contentColor: Color)

object VitaminPriceColors {
    @Composable
    fun default(
        backgroundColor: Color = Color.Transparent,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimary
    ): PriceColors = remember(backgroundColor, contentColor) {
        PriceColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }

    @Composable
    fun accent(
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundAccent,
        contentColor: Color = VitaminTheme.colors.vtmnContentAccent
    ): PriceColors = remember(backgroundColor, contentColor) {
        PriceColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }

    @Composable
    fun alert(
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundDiscount,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimaryReversed
    ): PriceColors = remember(backgroundColor, contentColor) {
        PriceColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }

    @Composable
    fun strikethrough(
        backgroundColor: Color = Color.Transparent,
        contentColor: Color = VitaminTheme.colors.vtmnContentTertiary
    ): PriceColors = remember(backgroundColor, contentColor) {
        PriceColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }
}
