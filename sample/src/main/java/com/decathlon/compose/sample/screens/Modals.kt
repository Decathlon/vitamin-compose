package com.decathlon.compose.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
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
import com.decathlon.vitamin.compose.radiobuttons.VitaminRadioButtons
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
    private val longAnnotatedMessage: AnnotatedString = buildAnnotatedString {
        append("$message\n\n")
        withStyle(
            style = SpanStyle(fontStyle = FontStyle.Italic)
        ) {
            append("$message\n\n")
        }
        withStyle(
            style = SpanStyle(fontWeight = FontWeight.Bold)
        ) {
            append("$message\n\n")
        }
        append("$message\n\n")
        withStyle(
            style = SpanStyle(fontStyle = FontStyle.Italic)
        ) {
            append(message)
        }
    }

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
                    DefaultModalIconTitleContent()
                }
                item {
                    DefaultModalContent()
                }
                item {
                    DefaultModalTitleContent()
                }
                item {
                    DefaultModalTitleContentButtons()
                }
                item {
                    DefaultModalTitleLongContentButtons()
                }
                item {
                    DefaultModalTitleContentLongButtons()
                }
                item {
                    DefaultModalTitleCustomContentButtons()
                }
            }
        }
    }

    @Composable
    private fun DefaultModalIconTitleContent() {
        val showDialog = remember { mutableStateOf(false) }

        VitaminButtons.Primary(
            text = "Icon, Title & Message",
            modifier = Modifier
                .fillMaxWidth(),
            onClick = { showDialog.value = true }
        )

        if (showDialog.value) {
            VitaminModals.Primary2(
                content = {
                    Text(
                        text = message
                    )
                },
                onDismissRequest = { showDialog.value = false },
                title = title,
                painter = rememberVectorPainter(VitaminIcons.Line.MapPin)
            )
        }
    }

    @Composable
    private fun DefaultModalContent() {
        val showDialog = remember { mutableStateOf(false) }

        VitaminButtons.Primary(
            text = "Message",
            modifier = Modifier
                .fillMaxWidth(),
            onClick = { showDialog.value = true }
        )

        if (showDialog.value) {
            VitaminModals.Primary2(
                onDismissRequest = { showDialog.value = false },
                content = {
                    Text(
                        text = message
                    )
                }
            )
        }
    }

    @Composable
    private fun DefaultModalTitleContent() {
        val showDialog = remember { mutableStateOf(false) }

        VitaminButtons.Primary(
            text = "Title & Message",
            modifier = Modifier
                .fillMaxWidth(),
            onClick = { showDialog.value = true }
        )

        if (showDialog.value) {
            VitaminModals.Primary2(
                onDismissRequest = { showDialog.value = false },
                title = title,
                content = {
                    Text(
                        text = message
                    )
                }
            )
        }
    }

    @Composable
    private fun DefaultModalTitleContentButtons() {
        val showDialog = remember { mutableStateOf(false) }

        VitaminButtons.Primary(
            text = "Title, Message & Buttons",
            modifier = Modifier
                .fillMaxWidth(),
            onClick = { showDialog.value = true }
        )

        if (showDialog.value) {
            VitaminModals.Primary2(
                onDismissRequest = { showDialog.value = false },
                title = title,
                content = {
                    Text(
                        text = message
                    )
                },
                positiveButton = {
                    VitaminModalButtons.Primary(
                        text = "Positive",
                        onClick = { showDialog.value = false }
                    )
                },
                negativeButton = {
                    VitaminModalButtons.Primary(
                        text = "Negative",
                        onClick = { showDialog.value = false }
                    )
                },
                neutralButton = {
                    VitaminModalButtons.Primary(
                        text = "Neutral",
                        onClick = { showDialog.value = false }
                    )
                }
            )
        }
    }

    @Composable
    private fun DefaultModalTitleLongContentButtons() {
        val showDialog = remember { mutableStateOf(false) }

        VitaminButtons.Primary(
            text = "Title, Long message & Buttons",
            modifier = Modifier
                .fillMaxWidth(),
            onClick = { showDialog.value = true }
        )

        if (showDialog.value) {
            VitaminModals.Primary2(
                onDismissRequest = { showDialog.value = false },
                title = title,
                content = {
                    Text(
                        text = longAnnotatedMessage
                    )
                },
                contentScrollState = rememberScrollState(),
                positiveButton = {
                    VitaminModalButtons.Primary(
                        text = "Positive",
                        onClick = { showDialog.value = false }
                    )
                },
                negativeButton = {
                    VitaminModalButtons.Primary(
                        text = "Negative",
                        onClick = { showDialog.value = false }
                    )
                },
                neutralButton = {
                    VitaminModalButtons.Primary(
                        text = "Neutral",
                        onClick = { showDialog.value = false }
                    )
                }
            )
        }
    }

    @Composable
    private fun DefaultModalTitleContentLongButtons() {
        val showDialog = remember { mutableStateOf(false) }

        VitaminButtons.Primary(
            text = "Title, Message & Long buttons",
            modifier = Modifier
                .fillMaxWidth(),
            onClick = { showDialog.value = true }
        )

        if (showDialog.value) {
            VitaminModals.Primary2(
                onDismissRequest = { showDialog.value = false },
                title = title,
                content = {
                    Text(
                        text = message
                    )
                },
                positiveButton = {
                    VitaminModalButtons.Primary(
                        text = "Extra extra long positive button",
                        onClick = { showDialog.value = false }
                    )
                },
                negativeButton = {
                    VitaminModalButtons.Primary(
                        text = "Extra extra long negative button",
                        onClick = { showDialog.value = false }
                    )
                },
                neutralButton = {
                    VitaminModalButtons.Primary(
                        text = "Extra extra long neutral button",
                        onClick = { showDialog.value = false }
                    )
                },
                buttonsOrientation = ModalButtonsOrientation.VERTICAL
            )
        }
    }

    @Composable
    private fun DefaultModalTitleCustomContentButtons() {
        val showDialog = remember { mutableStateOf(false) }

        VitaminButtons.Primary(
            text = "Title, Custom content & Buttons",
            modifier = Modifier
                .fillMaxWidth(),
            onClick = { showDialog.value = true }
        )

        if (showDialog.value) {
            VitaminModals.Primary2(
                onDismissRequest = { showDialog.value = false },
                title = title,
                content = {
                    Column {
                        Text(
                            text = message
                        )
                        Spacer(Modifier.height(8.dp))
                        val selectedObserver = remember { mutableStateOf(true) }
                        VitaminRadioButtons.Primary(
                            selected = selectedObserver.value,
                            onClick = {
                                if (!selectedObserver.value) selectedObserver.value =
                                    !selectedObserver.value
                            },
                            enabled = true,
                            endContent = {
                                Text(text = "RadioBox")
                            }
                        )
                        Spacer(Modifier.height(8.dp))
                        VitaminRadioButtons.Primary(
                            selected = !selectedObserver.value,
                            onClick = {
                                if (selectedObserver.value) selectedObserver.value =
                                    !selectedObserver.value
                            },
                            enabled = true,
                            endContent = {
                                Text(text = "RadioBox 2")
                            }
                        )
                    }
                },
                positiveButton = {
                    VitaminModalButtons.Primary(
                        text = "Positive",
                        onClick = { showDialog.value = false }
                    )
                },
                negativeButton = {
                    VitaminModalButtons.Primary(
                        text = "Negative",
                        onClick = { showDialog.value = false }
                    )
                },
                neutralButton = {
                    VitaminModalButtons.Primary(
                        text = "Neutral",
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
