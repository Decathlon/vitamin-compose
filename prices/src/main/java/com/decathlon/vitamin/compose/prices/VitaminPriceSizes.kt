package com.decathlon.vitamin.compose.prices

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
data class PriceSizes(val textStyle: TextStyle)

object VitaminPriceSizes {
    @Composable
    fun small(
        textStyle: TextStyle = VitaminTheme.typography.body3.copy(fontWeight = FontWeight.Bold)
    ): PriceSizes = remember(textStyle) {
        PriceSizes(textStyle)
    }

    @Composable
    fun medium(
        textStyle: TextStyle = VitaminTheme.typography.body2.copy(fontWeight = FontWeight.Bold)
    ): PriceSizes = remember(textStyle) {
        PriceSizes(textStyle)
    }

    @Composable
    fun large(
        textStyle: TextStyle = VitaminTheme.typography.body1.copy(fontWeight = FontWeight.Bold)
    ): PriceSizes = remember(textStyle) {
        PriceSizes(textStyle)
    }
}
