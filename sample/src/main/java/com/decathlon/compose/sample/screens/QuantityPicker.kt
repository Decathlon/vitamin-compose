package com.decathlon.compose.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.quantity.pickers.QuantityColors
import com.decathlon.vitamin.compose.quantity.pickers.VitaminQuantitiesColors
import com.decathlon.vitamin.compose.quantity.pickers.VitaminQuantityPickers

object QuantityPicker : Screen {
    override val name: String
        get() = "Quantity Picker"

    override val navigationKey: String
        get() = "quantity-pickers"

    @Composable
    override fun Screen() {
        SampleScaffold(title = name) {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(8.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                item {
                    QuantityComponent()
                }
                item {
                    QuantityComponent(
                        colors = VitaminQuantitiesColors.error()
                    )
                }
                item {
                    VitaminQuantityPickers.Primary(
                        value = "1",
                        addEnabled = false,
                        subtractEnabled = false,
                        editTextEnabled = false,
                        onAddClicked = { /*TODO*/ },
                        onSubtractClicked = { /*TODO*/ },
                        onValueChange = {},
                    )
                }
            }
        }
    }
}

@Composable
private fun QuantityComponent(
    colors: QuantityColors = VitaminQuantitiesColors.normal()
) {
    var quantity by remember { mutableStateOf("1") }
    VitaminQuantityPickers.Primary(
        value = quantity,
        colors = colors,
        addEnabled = quantity.toIntOrNull()?.let {
            @Suppress("MagicNumber")
            it < 10
        } ?: true,
        subtractEnabled = quantity.toIntOrNull()?.let { it > 0 } ?: true,
        onAddClicked = {
            if (quantity.isNotEmpty()) {
                quantity = quantity.toIntOrNull()?.let { it + 1 }.toString()
            }
        },
        onSubtractClicked = {
            if (quantity.isNotEmpty()) {
                quantity = quantity.toIntOrNull()?.let { it - 1 }.toString()
            }
        }
    ) {
        it?.let {
            if (it.isDigitsOnly()) {
                quantity = it
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun QuantitiesScreenPreview() {
    VitaminTheme {
        QuantityPicker.Screen()
    }
}
