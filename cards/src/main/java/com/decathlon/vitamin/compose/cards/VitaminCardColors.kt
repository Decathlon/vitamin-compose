package com.decathlon.vitamin.compose.cards

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
data class CardColors(
    val backgroundColor: Color,
    val contentColor: Color
)

object VitaminCardsColors {
    @Composable
    fun primary(
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimary
    ): CardColors = remember(
        backgroundColor,
        contentColor
    ) {
        CardColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }
}
