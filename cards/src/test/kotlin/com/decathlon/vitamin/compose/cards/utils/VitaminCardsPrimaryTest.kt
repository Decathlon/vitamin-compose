package com.decathlon.vitamin.compose.cards.utils

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.cash.paparazzi.Paparazzi
import com.decathlon.vitamin.compose.cards.VitaminCards
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(TestParameterInjector::class)
class VitaminCardsPrimaryTest {
    @get:Rule
    val paparazzi = Paparazzi()

    @Suppress("LongMethod")
    @Test
    fun medium(@TestParameter theme: Theme) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                Scaffold { padding ->
                    VitaminCards.Primary(
                        Modifier
                            .padding(padding)
                            .padding(32.dp)
                    ) {
                        Column(Modifier.padding(16.dp)) {
                            Text(
                                text = "Card title",
                                style = VitaminTheme.typography.h6
                            )
                            Text(
                                text = "A container for content representing a single " +
                                        "entity. e.g. a contact, article, or task.",
                                style = VitaminTheme.typography.text3
                            )
                        }
                    }
                }
            }
        }
    }
}
