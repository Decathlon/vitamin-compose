package com.decathlon.vitamin.compose.textinputs

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import app.cash.paparazzi.Paparazzi
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.textinputs.utils.TextInputVariantsFactory
import com.decathlon.vitamin.compose.textinputs.utils.Theme
import com.decathlon.vitamin.compose.textinputs.utils.Variant
import com.decathlon.vitamin.compose.vitaminicons.Line
import com.decathlon.vitamin.compose.vitaminicons.line.Android
import com.decathlon.vitamin.compose.vitaminicons.line.Heart
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(TestParameterInjector::class)
class VitaminTextInputsPrimaryTest(
    @TestParameter val variant: Variant
) {
    @get:Rule
    val paparazzi = Paparazzi()

    @Suppress("LongMethod")
    @Test
    fun normal(@TestParameter theme: Theme) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                val painter = rememberVectorPainter(VitaminIcons.Line.Heart)
                Scaffold { padding ->
                    Column(
                        modifier = Modifier.padding(padding),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(text = variant.name, style = VitaminTheme.typography.subtitle1)
                        TextInputVariantsFactory.TextInput(
                            modifier = Modifier.fillMaxWidth(),
                            variant = variant,
                            colors = TextInputsState.normal(),
                        )
                        TextInputVariantsFactory.TextInput(
                            modifier = Modifier.fillMaxWidth(),
                            variant = variant,
                            colors = TextInputsState.normal(),
                            enabled = false
                        )
                        TextInputVariantsFactory.TextInput(
                            modifier = Modifier.fillMaxWidth(),
                            variant = variant,
                            colors = TextInputsState.normal(),
                            enabled = false,
                            value = "input"
                        )
                        TextInputVariantsFactory.TextInput(
                            modifier = Modifier.fillMaxWidth(),
                            variant = variant,
                            colors = TextInputsState.normal(),
                            icon = {
                                Icon(
                                    painter = painter,
                                    contentDescription = null
                                )

                            }
                        )
                        TextInputVariantsFactory.TextInput(
                            modifier = Modifier.fillMaxWidth(),
                            variant = variant,
                            colors = TextInputsState.normal(),
                            icon = {
                                Icon(
                                    painter = painter,
                                    contentDescription = null
                                )

                            },
                            enabled = false
                        )
                        TextInputVariantsFactory.TextInput(
                            modifier = Modifier.fillMaxWidth(),
                            variant = variant,
                            colors = TextInputsState.normal(),
                            icon = {
                                Icon(
                                    painter = painter,
                                    contentDescription = null
                                )

                            },
                            enabled = false,
                            value = "input"
                        )
                    }
                }
            }
        }
    }


    @Suppress("LongMethod")
    @Test
    fun success(@TestParameter theme: Theme) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                Scaffold { padding ->
                    Column(
                        modifier = Modifier.padding(padding),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(text = variant.name, style = VitaminTheme.typography.subtitle1)
                        TextInputVariantsFactory.TextInput(
                            modifier = Modifier.fillMaxWidth(),
                            variant = variant,
                            colors = TextInputsState.success(),
                        )
                        TextInputVariantsFactory.TextInput(
                            modifier = Modifier.fillMaxWidth(),
                            variant = variant,
                            colors = TextInputsState.success(),
                            enabled = false
                        )
                        TextInputVariantsFactory.TextInput(
                            modifier = Modifier.fillMaxWidth(),
                            variant = variant,
                            colors = TextInputsState.success(),
                            enabled = false,
                            value = "input"
                        )
                    }
                }
            }
        }
    }


    @Suppress("LongMethod")
    @Test
    fun error(@TestParameter theme: Theme) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                Scaffold { padding ->
                    Column(
                        modifier = Modifier.padding(padding),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(text = variant.name, style = VitaminTheme.typography.subtitle1)
                        TextInputVariantsFactory.TextInput(
                            modifier = Modifier.fillMaxWidth(),
                            variant = variant,
                            colors = TextInputsState.error(),
                        )
                        TextInputVariantsFactory.TextInput(
                            modifier = Modifier.fillMaxWidth(),
                            variant = variant,
                            colors = TextInputsState.error(),
                            enabled = false
                        )
                        TextInputVariantsFactory.TextInput(
                            modifier = Modifier.fillMaxWidth(),
                            variant = variant,
                            colors = TextInputsState.error(),
                            enabled = false,
                            value = "input"
                        )
                    }
                }
            }
        }
    }
}
