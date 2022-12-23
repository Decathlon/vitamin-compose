package com.decathlon.vitamin.compose.fabs

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
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
class VitaminFabsExtendedPrimaryTest(
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
                            FabVariantsFactory.FabExtended(
                                variant = variant,
                                size = VitaminFabExtendedSizes.default()
                            )
                            FabVariantsFactory.FabExtended(
                                variant = variant,
                                size = VitaminFabExtendedSizes.default(),
                                enabled = false
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            FabVariantsFactory.FabExtended(
                                icon = rememberVectorPainter(image = Icons.Filled.Add),
                                variant = variant,
                                size = VitaminFabExtendedSizes.default()
                            )
                            FabVariantsFactory.FabExtended(
                                icon = rememberVectorPainter(image = Icons.Filled.Add),
                                variant = variant,
                                size = VitaminFabExtendedSizes.default(),
                                enabled = false
                            )
                        }
                        FabVariantsFactory.FabExtended(
                            modifier = Modifier.fillMaxWidth(),
                            icon = rememberVectorPainter(image = Icons.Filled.Add),
                            variant = variant,
                            size = VitaminFabExtendedSizes.default()
                        )
                        FabVariantsFactory.FabExtended(
                            modifier = Modifier.fillMaxWidth(),
                            icon = rememberVectorPainter(image = Icons.Filled.Add),
                            variant = variant,
                            size = VitaminFabExtendedSizes.default(),
                            enabled = false
                        )
                    }
                }
            }
        }
    }
}
