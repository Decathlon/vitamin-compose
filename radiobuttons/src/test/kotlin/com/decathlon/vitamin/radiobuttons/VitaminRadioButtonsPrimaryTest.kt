package com.decathlon.vitamin.radiobuttons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.cash.paparazzi.Paparazzi
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.radiobuttons.VitaminRadioButtons
import com.decathlon.vitamin.radiobuttons.utils.Theme
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(TestParameterInjector::class)
class VitaminRadioButtonsPrimaryTest {
    @get:Rule
    val paparazzi = Paparazzi()

    @Test
    fun medium(@TestParameter theme: Theme) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                Scaffold { padding ->
                    Column(
                        modifier = Modifier.padding(padding),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(text = "Primary", style = VitaminTheme.typography.subtitle1)
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            VitaminRadioButtons.Primary(
                                selected = true,
                                enabled = true,
                                onClick = {})
                            VitaminRadioButtons.Primary(
                                selected = false,
                                enabled = true,
                                onClick = {})
                        }
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            VitaminRadioButtons.Primary(
                                selected = true,
                                enabled = false,
                                onClick = {})
                            VitaminRadioButtons.Primary(
                                selected = false,
                                enabled = false,
                                onClick = {})
                        }
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            VitaminRadioButtons.Primary(selected = true, enabled = false,
                                endContent = {
                                    Text(text = "RadioBox", style = VitaminTheme.typography.text1)
                                }, onClick = {})
                        }
                    }
                }
            }
        }
    }
}
