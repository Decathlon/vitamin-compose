package com.decathlon.vitamin.compose.quantity.pickers

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.cash.paparazzi.Paparazzi
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.quantity.pickers.utils.Theme
import com.decathlon.vitamin.compose.quantity.pickers.utils.Variant
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(TestParameterInjector::class)
internal class VitaminQuantityPickersPrimaryTest(
    @TestParameter val variant: Variant
) {

    @get:Rule
    val paparazzi = Paparazzi()

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    @Test
    fun primary(
        @TestParameter theme: Theme
    ) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                Scaffold {
                    Column(
                        modifier = Modifier
                            .padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(text = variant.name, style = VitaminTheme.typography.subtitle1)

                        VitaminQuantityPickers.Primary(
                            value = "2",
                            addEnabled = true,
                            onAddClicked = { /* Nothing */ },
                            subtractEnabled = true,
                            onSubtractClicked = { /* Nothing */ },
                            onValueChange = { /* Nothing */ },
                        )

                        VitaminQuantityPickers.Primary(
                            value = "2",
                            addEnabled = false,
                            onAddClicked = { /* Nothing */ },
                            subtractEnabled = true,
                            onSubtractClicked = { /* Nothing */ },
                            onValueChange = { /* Nothing */ },
                        )

                        VitaminQuantityPickers.Primary(
                            value = "2",
                            addEnabled = true,
                            onAddClicked = { /* Nothing */ },
                            subtractEnabled = false,
                            onSubtractClicked = { /* Nothing */ },
                            onValueChange = { /* Nothing */ },
                        )

                        VitaminQuantityPickers.Primary(
                            value = "2",
                            addEnabled = true,
                            onAddClicked = { /* Nothing */ },
                            subtractEnabled = true,
                            onSubtractClicked = { /* Nothing */ },
                            onValueChange = { /* Nothing */ },
                            colors = VitaminQuantitiesColors.error(),
                            helperText = "An error has occurred"
                        )
                    }
                }
            }
        }
    }

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    @Test
    fun primaryExpended(
        @TestParameter theme: Theme
    ) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                Scaffold {
                    Column(
                        modifier = Modifier
                            .padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(text = variant.name, style = VitaminTheme.typography.subtitle1)

                        VitaminQuantityPickers.Primary(
                            value = "2",
                            isExpanded = true,
                            addEnabled = true,
                            onAddClicked = { /* Nothing */ },
                            subtractEnabled = true,
                            onSubtractClicked = { /* Nothing */ },
                            onValueChange = { /* Nothing */ },
                        )

                        VitaminQuantityPickers.Primary(
                            value = "2",
                            isExpanded = true,
                            addEnabled = false,
                            onAddClicked = { /* Nothing */ },
                            subtractEnabled = true,
                            onSubtractClicked = { /* Nothing */ },
                            onValueChange = { /* Nothing */ },
                        )

                        VitaminQuantityPickers.Primary(
                            value = "2",
                            isExpanded = true,
                            addEnabled = true,
                            onAddClicked = { /* Nothing */ },
                            subtractEnabled = false,
                            onSubtractClicked = { /* Nothing */ },
                            onValueChange = { /* Nothing */ },
                        )

                        VitaminQuantityPickers.Primary(
                            value = "2",
                            isExpanded = true,
                            addEnabled = true,
                            onAddClicked = { /* Nothing */ },
                            subtractEnabled = true,
                            onSubtractClicked = { /* Nothing */ },
                            onValueChange = { /* Nothing */ },
                            colors = VitaminQuantitiesColors.error(),
                            helperText = "An error has occurred"
                        )
                    }
                }
            }
        }
    }
}
