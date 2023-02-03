package com.decathlon.vitamin.compose.modals

import androidx.compose.material.Text
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import app.cash.paparazzi.Paparazzi
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.modals.utils.DataFactory
import com.decathlon.vitamin.compose.modals.utils.Theme
import com.decathlon.vitamin.compose.vitaminicons.Line
import com.decathlon.vitamin.compose.vitaminicons.line.MapPin
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(TestParameterInjector::class)
class VitaminModalsAcknowledgeTest {

    @get:Rule
    val paparazzi = Paparazzi()

    @Test
    fun default(
        @TestParameter theme: Theme
    ) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                VitaminModals.Acknowledge(
                    onDismissRequest = {},
                    painter = rememberVectorPainter(image = VitaminIcons.Line.MapPin),
                    title = DataFactory.title,
                    content = {
                        Text(
                            text = DataFactory.message
                        )
                    },
                )
            }
        }
    }

    @Test
    fun longMessage(
        @TestParameter theme: Theme
    ) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                VitaminModals.Acknowledge(
                    onDismissRequest = {},
                    painter = rememberVectorPainter(image = VitaminIcons.Line.MapPin),
                    title = DataFactory.title,
                    content = {
                        Text(
                            text = DataFactory.longAnnotatedMessage
                        )
                    },
                )
            }
        }
    }

    @Test
    fun withButton(
        @TestParameter theme: Theme
    ) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                VitaminModals.Acknowledge(
                    onDismissRequest = {},
                    painter = rememberVectorPainter(image = VitaminIcons.Line.MapPin),
                    title = DataFactory.title,
                    content = {
                        Text(
                            text = DataFactory.message
                        )
                    },
                    button = {
                        VitaminModalButtons.Primary(
                            text = "Got it",
                            onClick = {},
                        )
                    },
                )
            }
        }
    }

    @Test
    fun withDisabledButton(
        @TestParameter theme: Theme
    ) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                VitaminModals.Acknowledge(
                    onDismissRequest = {},
                    painter = rememberVectorPainter(image = VitaminIcons.Line.MapPin),
                    title = DataFactory.title,
                    content = {
                        Text(
                            text = DataFactory.message
                        )
                    },
                    button = {
                        VitaminModalButtons.Primary(
                            text = "Got it",
                            onClick = {},
                            enabled = false,
                        )
                    },
                )
            }
        }
    }
}
