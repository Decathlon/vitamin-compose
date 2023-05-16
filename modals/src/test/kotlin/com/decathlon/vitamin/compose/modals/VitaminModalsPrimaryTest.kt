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
class VitaminModalsPrimaryTest {

    @get:Rule
    val paparazzi = Paparazzi()

    @Test
    fun primaryWithoutButton(
        @TestParameter theme: Theme
    ) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                VitaminModals.Primary(
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
    fun primaryWithScroll(
        @TestParameter theme: Theme
    ) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                VitaminModals.Primary(
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
    fun primaryWithOneButton(
        @TestParameter theme: Theme
    ) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                VitaminModals.Primary(
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
    fun primaryWithDisabledButton(
        @TestParameter theme: Theme
    ) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                VitaminModals.Primary(
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

    @Test
    fun primaryWithTwoHorizontalButtons(
        @TestParameter theme: Theme
    ) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                VitaminModals.Primary(
                    onDismissRequest = {},
                    painter = rememberVectorPainter(image = VitaminIcons.Line.MapPin),
                    title = DataFactory.title,
                    content = {
                        Text(
                            text = DataFactory.message
                        )
                    },
                    confirmationButton = {
                        VitaminModalButtons.Primary(
                            text = "Confirm",
                            onClick = {},
                            enabled = true,
                        )
                    },
                    dismissButton = {
                        VitaminModalButtons.Primary(
                            text = "Dismiss",
                            onClick = {},
                            enabled = true,
                        )
                    }
                )
            }
        }
    }

    @Test
    fun primaryWithTwoVerticalButtons(
        @TestParameter theme: Theme
    ) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                VitaminModals.Primary(
                    onDismissRequest = {},
                    painter = rememberVectorPainter(image = VitaminIcons.Line.MapPin),
                    title = DataFactory.title,
                    content = {
                        Text(
                            text = DataFactory.message
                        )
                    },
                    buttonsOrientation = ModalButtonsOrientation.VERTICAL,
                    confirmationButton = {
                        VitaminModalButtons.Primary(
                            text = "Confirm",
                            onClick = {},
                            enabled = true,
                        )
                    },
                    dismissButton = {
                        VitaminModalButtons.Primary(
                            text = "Dismiss",
                            onClick = {},
                            enabled = true,
                        )
                    }
                )
            }
        }
    }

    @Test
    fun primaryWithThreeHorizontalButtons(
        @TestParameter theme: Theme
    ) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                VitaminModals.Primary(
                    onDismissRequest = {},
                    painter = rememberVectorPainter(image = VitaminIcons.Line.MapPin),
                    title = DataFactory.title,
                    content = {
                        Text(
                            text = DataFactory.message
                        )
                    },
                    confirmationButton = {
                        VitaminModalButtons.Primary(
                            text = "Confirm",
                            onClick = {},
                            enabled = true,
                        )
                    },
                    dismissButton = {
                        VitaminModalButtons.Primary(
                            text = "Dismiss",
                            onClick = {},
                            enabled = true,
                        )
                    },
                    thirdButton = {
                        VitaminModalButtons.Primary(
                            text = "Third",
                            onClick = {},
                            enabled = true,
                        )
                    }
                )
            }
        }
    }

    @Test
    fun primaryWithThreeVerticalButtons(
        @TestParameter theme: Theme
    ) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                VitaminModals.Primary(
                    onDismissRequest = {},
                    painter = rememberVectorPainter(image = VitaminIcons.Line.MapPin),
                    title = DataFactory.title,
                    content = {
                        Text(
                            text = DataFactory.message
                        )
                    },
                    buttonsOrientation = ModalButtonsOrientation.VERTICAL,
                    confirmationButton = {
                        VitaminModalButtons.Primary(
                            text = "Confirm",
                            onClick = {},
                            enabled = true,
                        )
                    },
                    dismissButton = {
                        VitaminModalButtons.Primary(
                            text = "Dismiss",
                            onClick = {},
                            enabled = true,
                        )
                    },
                    thirdButton = {
                        VitaminModalButtons.Primary(
                            text = "Third",
                            onClick = {},
                            enabled = true,
                        )
                    }
                )
            }
        }
    }
}
