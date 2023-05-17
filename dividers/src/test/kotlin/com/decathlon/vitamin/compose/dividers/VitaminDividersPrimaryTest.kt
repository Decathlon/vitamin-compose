package com.decathlon.vitamin.compose.dividers

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.cash.paparazzi.Paparazzi
import com.decathlon.vitamin.compose.dividers.utils.DividerVariantsFactory
import com.decathlon.vitamin.compose.dividers.utils.Theme
import com.decathlon.vitamin.compose.dividers.utils.Variant
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(TestParameterInjector::class)
class VitaminDividersPrimaryTest(
    @TestParameter val variant: Variant
) {
    @get:Rule
    val paparazzi = Paparazzi()

    @Suppress("LongMethod")
    @Test
    fun medium(@TestParameter theme: Theme) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                Scaffold { padding ->
                    Column(
                        modifier = Modifier.padding(padding),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(text = variant.name, style = VitaminTheme.typography.subtitle1)
                        DividerVariantsFactory.Divider(
                            modifier = Modifier.fillMaxWidth(), variant = variant
                        )
                    }
                }
            }
        }
    }
}
