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
class VitaminModalsConfirmationTest {

    @get:Rule
    val paparazzi = Paparazzi()

    @Test
    fun horizontal(
        @TestParameter theme: Theme
    ) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                VitaminModals.Confirmation(
                    onDismissRequest = {},
                    painter = rememberVectorPainter(image = VitaminIcons.Line.MapPin),
                    title = DataFactory.title,
                    content = {
                        Text(
                            text = DataFactory.message
                        )
                    },
                    rightButton = {
                        VitaminModalButtons.Primary(
                            text = "Confirm",
                            onClick = {},
                            enabled = true,
                        )
                    },
                    middleButton = {
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
    fun vertical(
        @TestParameter theme: Theme
    ) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                VitaminModals.Confirmation(
                    onDismissRequest = {},
                    painter = rememberVectorPainter(image = VitaminIcons.Line.MapPin),
                    title = DataFactory.title,
                    content = {
                        Text(
                            text = DataFactory.message
                        )
                    },
                    buttonsOrientation = ModalButtonsOrientation.VERTICAL,
                    rightButton = {
                        VitaminModalButtons.Primary(
                            text = "Confirm",
                            onClick = {},
                            enabled = true,
                        )
                    },
                    middleButton = {
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
    fun longMessage(
        @TestParameter theme: Theme
    ) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                VitaminModals.Confirmation(
                    onDismissRequest = {},
                    painter = rememberVectorPainter(image = VitaminIcons.Line.MapPin),
                    title = DataFactory.title,
                    content = {
                        Text(
                            text = DataFactory.longAnnotatedMessage
                        )
                    },
                    rightButton = {
                        VitaminModalButtons.Primary(
                            text = "Confirm",
                            onClick = {},
                            enabled = true,
                        )
                    },
                    middleButton = {
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
    fun thirdHorizontal(
        @TestParameter theme: Theme
    ) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                VitaminModals.Confirmation(
                    onDismissRequest = {},
                    painter = rememberVectorPainter(image = VitaminIcons.Line.MapPin),
                    title = DataFactory.title,
                    content = {
                        Text(
                            text = DataFactory.message
                        )
                    },
                    rightButton = {
                        VitaminModalButtons.Primary(
                            text = "Confirm",
                            onClick = {},
                            enabled = true,
                        )
                    },
                    middleButton = {
                        VitaminModalButtons.Primary(
                            text = "Dismiss",
                            onClick = {},
                            enabled = true,
                        )
                    },
                    leftButton = {
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
    fun thirdVertical(
        @TestParameter theme: Theme
    ) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                VitaminModals.Confirmation(
                    onDismissRequest = {},
                    painter = rememberVectorPainter(image = VitaminIcons.Line.MapPin),
                    title = DataFactory.title,
                    content = {
                        Text(
                            text = DataFactory.message
                        )
                    },
                    buttonsOrientation = ModalButtonsOrientation.VERTICAL,
                    rightButton = {
                        VitaminModalButtons.Primary(
                            text = "Confirm",
                            onClick = {},
                            enabled = true,
                        )
                    },
                    middleButton = {
                        VitaminModalButtons.Primary(
                            text = "Dismiss",
                            onClick = {},
                            enabled = true,
                        )
                    },
                    leftButton = {
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
    fun withDisableButton(
        @TestParameter theme: Theme
    ) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                VitaminModals.Confirmation(
                    onDismissRequest = {},
                    painter = rememberVectorPainter(image = VitaminIcons.Line.MapPin),
                    title = DataFactory.title,
                    content = {
                        Text(
                            text = DataFactory.message
                        )
                    },
                    rightButton = {
                        VitaminModalButtons.Primary(
                            text = "Confirm",
                            onClick = {},
                            enabled = false,
                        )
                    },
                    middleButton = {
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
}
