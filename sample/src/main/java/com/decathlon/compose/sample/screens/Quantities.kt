package com.decathlon.compose.sample.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.quantities.QuantityColors
import com.decathlon.vitamin.compose.quantities.VitaminQuantities

object Quantities : Screen {
    override val name: String
        get() = "Quantities"

    override val navigationKey: String
        get() = "Quantities"

    @SuppressWarnings("LongMethod")
    @Composable
    override fun Screen() {
        SampleScaffold(title = name) {
            LazyColumn(
                modifier = Modifier
                    .background(Color(red = 234, green = 242, blue = 248))
                    .fillMaxSize()
                    .padding(8.dp)
            ) {
                item {
                    QuantityComponent()
                }
                item {
                    QuantityComponent()
                }
            }
        }
    }
}

@Composable
private fun QuantityComponent() {
    var quantity by remember { mutableStateOf("1") }
    Spacer(Modifier.height(20.dp))
    Row {

        VitaminQuantities.Primary(
            value = quantity,
            onAddClicked = {
                if (quantity.isNotEmpty()) {
                    quantity = quantity.toIntOrNull()?.let { it + 1 }.toString()
                }
            },
            onSubtractClicked = {
                if (quantity.isNotEmpty()) {
                    quantity = quantity.toIntOrNull()?.let { it - 1 }.toString()
                }
            },
            onValueChange = {
                it?.let {
                    if (it.isDigitsOnly()) {
                        quantity = it
                    }
                }
            },
            subtractEnabled = quantity.toIntOrNull()?.let { it > 0 } ?: true,
            addEnabled = quantity.toIntOrNull()?.let {
                @Suppress("MagicNumber")
                it < 10
            } ?: true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            colors = QuantityColors(
                textColor = VitaminTheme.colors.vtmnContentPrimary,
                backgroundColor = VitaminTheme.colors.vtmnBackgroundPrimary,
                borderColor = VitaminTheme.colors.vtmnBorderInactive,
                borderColorError = VitaminTheme.colors.vtmnBorderNegative,
                borderColorActive = VitaminTheme.colors.vtmnBorderActive,
            ),
            hasQuantityError = quantity.toIntOrNull()?.let {
                @Suppress("MagicNumber")
                it == 5
            } ?: true
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun QuantitiesScreenPreview() {
    VitaminTheme {
        Quantities.Screen()
    }
}
