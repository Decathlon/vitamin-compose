package com.decathlon.vitamin.compose.prices

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

class VitaminPriceColor(val backgroundColor: Color, val textColor: Color)

object VitaminPriceColors {
    val default: VitaminPriceColor
        @Composable
        get() = VitaminPriceColor(
            backgroundColor = Color.Transparent,
            textColor = VitaminTheme.colors.vtmnContentPrimary
        )

    val accent: VitaminPriceColor
        @Composable
        get() = VitaminPriceColor(
            backgroundColor = VitaminTheme.colors.vtmnBackgroundAccent,
            textColor = VitaminTheme.colors.vtmnContentAccent
        )

    val alert: VitaminPriceColor
        @Composable
        get() = VitaminPriceColor(
            backgroundColor = VitaminTheme.colors.vtmnBackgroundDiscount,
            textColor = VitaminTheme.colors.vtmnContentPrimaryReversed
        )

    val strikethrough: VitaminPriceColor
        @Composable
        get() = VitaminPriceColor(
            backgroundColor = Color.Transparent, textColor = VitaminTheme.colors.vtmnContentTertiary
        )
}
