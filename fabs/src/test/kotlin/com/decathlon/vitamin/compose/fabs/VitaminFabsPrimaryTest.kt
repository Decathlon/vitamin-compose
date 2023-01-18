package com.decathlon.vitamin.compose.fabs

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import app.cash.paparazzi.Paparazzi
import com.decathlon.vitamin.compose.fabs.utils.FabVariantsFactory
import com.decathlon.vitamin.compose.fabs.utils.Theme
import com.decathlon.vitamin.compose.fabs.utils.Variant
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(TestParameterInjector::class)
class VitaminFabsPrimaryTest(
    @TestParameter val variant: Variant
) {

    @get:Rule
    val paparazzi = Paparazzi()

    @Suppress("LongMethod")
    @Test
    fun default(@TestParameter theme: Theme) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                Scaffold { padding ->
                    Column(
                        modifier = Modifier.padding(padding),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(text = variant.name, style = VitaminTheme.typography.subtitle1)
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            FabVariantsFactory.Fab(
                                icon = rememberVectorPainter(image = Icons.Filled.Add),
                                contentDescription = "Add",
                                variant = variant,
                                size = VitaminFabSizes.default()
                            )
                            FabVariantsFactory.Fab(
                                icon = rememberVectorPainter(image = Icons.Filled.Add),
                                contentDescription = "Add",
                                variant = variant,
                                size = VitaminFabSizes.default(),
                                enabled = false
                            )
                        }
                    }
                }
            }
        }
    }

    @Suppress("LongMethod")
    @Test
    fun mini(@TestParameter theme: Theme) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                Scaffold { padding ->
                    Column(
                        modifier = Modifier.padding(padding),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(text = variant.name, style = VitaminTheme.typography.subtitle1)
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            FabVariantsFactory.Fab(
                                icon = rememberVectorPainter(image = Icons.Filled.Add),
                                contentDescription = "Add",
                                variant = variant,
                                size = VitaminFabSizes.mini()
                            )
                            FabVariantsFactory.Fab(
                                icon = rememberVectorPainter(image = Icons.Filled.Add),
                                contentDescription = "Add",
                                variant = variant,
                                size = VitaminFabSizes.mini(),
                                enabled = false
                            )
                        }
                    }
                }
            }
        }
    }
}
