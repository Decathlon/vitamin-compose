package com.decathlon.vitamin.compose.checkboxes.utils

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.cash.paparazzi.Paparazzi
import com.decathlon.vitamin.compose.checkboxes.VitaminCheckboxes
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(TestParameterInjector::class)
class VitaminCheckboxesPrimaryTest {
    @get:Rule
    val paparazzi = Paparazzi()

    @Test
    fun primary(@TestParameter theme: Theme) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                Scaffold { padding ->
                    Column(
                        modifier = Modifier.padding(padding),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(text = "Primary", style = VitaminTheme.typography.subtitle1)
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                        ) {
                            VitaminCheckboxes.Primary(checked = true, onCheckedChange = {})
                            VitaminCheckboxes.Primary(
                                checked = true,
                                enabled = false,
                                onCheckedChange = {})
                        }
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                        ) {
                            VitaminCheckboxes.Primary(checked = false, onCheckedChange = {})
                            VitaminCheckboxes.Primary(
                                checked = false,
                                enabled = false,
                                onCheckedChange = {})
                        }
                        Column(
                            verticalArrangement = Arrangement.spacedBy(4.dp),
                        ) {
                            VitaminCheckboxes.Primary(checked = true, onCheckedChange = {}){
                                Text(text = "Enabled and checked")
                            }
                            VitaminCheckboxes.Primary(
                                checked = true,
                                enabled = false,
                                onCheckedChange = {}) {
                                Text(text = "Disabled and checked")
                            }
                        }
                    }
                }
            }
        }

    }

}
