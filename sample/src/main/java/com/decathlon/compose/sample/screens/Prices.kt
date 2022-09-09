package com.decathlon.compose.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.prices.VitaminPriceSizes
import com.decathlon.vitamin.compose.prices.VitaminPrices

object Prices : Screen {
    override val name: String
        get() = "Prices"

    override val navigationKey: String
        get() = "Prices"

    @SuppressWarnings("LongMethod")
    @Composable
    override fun Screen() {
        SampleScaffold(title = name) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 4.dp)
            ) {
                Text("Default")
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    VitaminPrices.Default(text = "250 €", sizes = VitaminPriceSizes.large())
                    VitaminPrices.Default(text = "250 €", sizes = VitaminPriceSizes.medium())
                    VitaminPrices.Default(text = "250 €", sizes = VitaminPriceSizes.small())
                }

                Text("Accent")
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    VitaminPrices.Accent(
                        text = "250 €",
                        sizes = VitaminPriceSizes.large()
                    )
                    VitaminPrices.Accent(
                        text = "250 €",
                        sizes = VitaminPriceSizes.medium()
                    )
                    VitaminPrices.Accent(
                        text = "250 €",
                        sizes = VitaminPriceSizes.small()
                    )
                }

                Text("Alert")
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    VitaminPrices.Alert(
                        text = "250 €",
                        sizes = VitaminPriceSizes.large()
                    )
                    VitaminPrices.Alert(
                        text = "250 €",
                        sizes = VitaminPriceSizes.medium()
                    )
                    VitaminPrices.Alert(
                        text = "250 €",
                        sizes = VitaminPriceSizes.small()
                    )
                }

                Text("Strikethrough")
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    VitaminPrices.Strikethrough(
                        text = "250 €",
                        sizes = VitaminPriceSizes.large()
                    )
                    VitaminPrices.Strikethrough(
                        text = "250 €",
                        sizes = VitaminPriceSizes.medium()
                    )
                    VitaminPrices.Strikethrough(
                        text = "250 €",
                        sizes = VitaminPriceSizes.small()
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun PreviewPricesScreen() {
    VitaminTheme(darkTheme = true) {
        Prices.Screen()
    }
}
