package com.decathlon.vitamin.compose.prices

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import com.decathlon.vitamin.compose.foundation.VitaminTheme

class VitaminPriceSize(val textStyle: TextStyle)

object VitaminPriceSizes {
    val small: VitaminPriceSize
        @Composable
        get() = VitaminPriceSize(VitaminTheme.typography.body3)

    val medium: VitaminPriceSize
        @Composable
        get() = VitaminPriceSize(VitaminTheme.typography.body2)

    val large: VitaminPriceSize
        @Composable
        get() = VitaminPriceSize(VitaminTheme.typography.body1)
}
