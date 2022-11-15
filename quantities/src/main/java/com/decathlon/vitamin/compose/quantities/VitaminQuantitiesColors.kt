package com.decathlon.vitamin.compose.quantities

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
data class QuantityColors(
    val textColor: Color,
    val borderColor: Color,
    val backgroundColor: Color,
    val borderColorError: Color,
    val borderColorActive: Color
)
object VitaminQuantitiesColors {
    @Composable
    fun primary(
        textColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        borderColor: Color = VitaminTheme.colors.vtmnBorderInactive,
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        borderColorError: Color = VitaminTheme.colors.vtmnBorderNegative,
        borderColorActive: Color = VitaminTheme.colors.vtmnBorderActive
    ): QuantityColors = remember(textColor, borderColor, backgroundColor) {
        QuantityColors(
            borderColor = borderColor,
            backgroundColor = backgroundColor,
            textColor = textColor,
            borderColorError = borderColorError,
            borderColorActive = borderColorActive
        )
    }
}
