package com.decathlon.compose.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.buttons.VitaminButtons
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.modals.ModalButtonsOrientation
import com.decathlon.vitamin.compose.modals.VitaminModalButtons
import com.decathlon.vitamin.compose.modals.VitaminModals
import com.decathlon.vitamin.compose.vitaminicons.Line
import com.decathlon.vitamin.compose.vitaminicons.line.MapPin

object Modals : Screen {

    override val name: String
        get() = "Modals"

    override val navigationKey: String
        get() = "Modals"

    private const val title: String = "Lorem ipsmun"
    private const val message: String = "Lorem ipsum dolor sit amet, consectetur adipiscing " +
        "elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut " +
        "enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip " +
        "ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate " +
        "velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat " +
        "cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id " +
        "est laborum."

    @Composable
    override fun Screen(navController: NavController?) {
        SampleScaffold(
            title = name,
            onBackClick = {
                navController?.popBackStack()
            }
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp, vertical = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                item {
                    Acknowledge()
                }
                item {
                    AcknowledgeWithButton()
                }
                item {
                    Confirmation()
                }
                item {
                    ConfirmationWithThird()
                }
                item {
                    ConfirmationWithThirdVertical()
                }
            }
        }
    }

    @Composable
    private fun Acknowledge() {
        val showDialog = remember { mutableStateOf(false) }

        VitaminButtons.Primary(
            text = "Acknowledge",
            modifier = Modifier
                .fillMaxWidth(),
            onClick = { showDialog.value = true }
        )

        if (showDialog.value) {
            VitaminModals.Primary(
                content = {
                    Text(text = message)
                },
                onDismissRequest = { showDialog.value = false },
                painter = rememberVectorPainter(image = VitaminIcons.Line.MapPin),
                title = title,
            )
        }
    }

    @Composable
    private fun AcknowledgeWithButton() {
        val showDialog = remember { mutableStateOf(false) }

        VitaminButtons.Primary(
            text = "Acknowledge with button",
            modifier = Modifier
                .fillMaxWidth(),
            onClick = { showDialog.value = true }
        )

        if (showDialog.value) {
            VitaminModals.Primary(
                content = {
                    Text(text = message)
                },
                onDismissRequest = { showDialog.value = false },
                painter = rememberVectorPainter(image = VitaminIcons.Line.MapPin),
                title = title,
                button = {
                    VitaminModalButtons.Primary(
                        text = "Got it",
                        onClick = { showDialog.value = false }
                    )
                }
            )
        }
    }

    @Composable
    fun Confirmation() {
        val showDialog = remember { mutableStateOf(false) }

        VitaminButtons.Primary(
            text = "Confirmation",
            modifier = Modifier
                .fillMaxWidth(),
            onClick = { showDialog.value = true }
        )

        if (showDialog.value) {
            VitaminModals.Primary(
                content = {
                    Text(text = message)
                },
                onDismissRequest = { showDialog.value = false },
                painter = rememberVectorPainter(image = VitaminIcons.Line.MapPin),
                title = title,
                confirmationButton = {
                    VitaminModalButtons.Primary(
                        text = "Confirm",
                        onClick = { showDialog.value = false }
                    )
                },
                dismissButton = {
                    VitaminModalButtons.Primary(
                        text = "Dismiss",
                        onClick = { showDialog.value = false }
                    )
                }
            )
        }
    }

    @Composable
    fun ConfirmationWithThird() {
        val showDialog = remember { mutableStateOf(false) }

        VitaminButtons.Primary(
            text = "Confirmation with third action",
            modifier = Modifier
                .fillMaxWidth(),
            onClick = { showDialog.value = true }
        )

        if (showDialog.value) {
            VitaminModals.Primary(
                content = {
                    Text(text = message)
                },
                onDismissRequest = { showDialog.value = false },
                painter = rememberVectorPainter(image = VitaminIcons.Line.MapPin),
                title = title,
                confirmationButton = {
                    VitaminModalButtons.Primary(
                        text = "Confirm",
                        onClick = { showDialog.value = false }
                    )
                },
                dismissButton = {
                    VitaminModalButtons.Primary(
                        text = "Dismiss",
                        onClick = { showDialog.value = false }
                    )
                },
                thirdButton = {
                    VitaminModalButtons.Primary(
                        text = "Third action",
                        onClick = { showDialog.value = false }
                    )
                }
            )
        }
    }

    @Composable
    fun ConfirmationWithThirdVertical() {
        val showDialog = remember { mutableStateOf(false) }

        VitaminButtons.Primary(
            text = "Confirmation vertical",
            modifier = Modifier
                .fillMaxWidth(),
            onClick = { showDialog.value = true }
        )

        if (showDialog.value) {
            VitaminModals.Primary(
                content = {
                    Text(text = message)
                },
                onDismissRequest = { showDialog.value = false },
                painter = rememberVectorPainter(image = VitaminIcons.Line.MapPin),
                title = title,
                buttonsOrientation = ModalButtonsOrientation.VERTICAL,
                confirmationButton = {
                    VitaminModalButtons.Primary(
                        text = "Confirm",
                        onClick = { showDialog.value = false }
                    )
                },
                dismissButton = {
                    VitaminModalButtons.Primary(
                        text = "Dismiss",
                        onClick = { showDialog.value = false }
                    )
                },
                thirdButton = {
                    VitaminModalButtons.Primary(
                        text = "Third action",
                        onClick = { showDialog.value = false }
                    )
                }
            )
        }
    }
}

@Preview
@Composable
private fun PreviewModals() {
    VitaminTheme {
        Modals.Screen(null)
    }
}

@Preview
@Composable
private fun PreviewDarkModals() {
    VitaminTheme(darkTheme = true) {
        Modals.Screen(null)
    }
}
