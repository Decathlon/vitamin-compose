package com.decathlon.vitamin.compose.prices.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.decathlon.vitamin.compose.prices.PriceSizes
import com.decathlon.vitamin.compose.prices.VitaminPrices

object PriceVariantsFactory {

    @Suppress("LongMethod")
    @Composable
    fun Price(
        variant: Variant,
        size: PriceSizes,
        modifier: Modifier = Modifier,
        text: String = "250,00 €"
    ) {
        when (variant) {
            Variant.Default -> VitaminPrices.Default(
                modifier = modifier,
                sizes = size,
                text = text
            )
            Variant.Alert -> VitaminPrices.Alert(
                modifier = modifier,
                sizes = size,
                text = text
            )
            Variant.Accent -> VitaminPrices.Accent(
                modifier = modifier,
                sizes = size,
                text = text
            )
            Variant.Strikethrough -> VitaminPrices.Strikethrough(
                modifier = modifier,
                sizes = size,
                text = text
            )
        }
    }
}
