package com.decathlon.compose.sample.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.radiobuttons.VitaminRadioButtons

object RadioButtons : Screen {
    override val name: String
        get() = "RadioButton"

    override val navigationKey: String
        get() = "radiobuttons"

    @Composable
    override fun Screen() {
        SampleScaffold(title = name) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            ) {
                item {
                    Text("Unselected")
                    Spacer(Modifier.height(8.dp))
                    VitaminRadioButtons.Primary(
                        selected = false,
                        onClick = null,
                        enabled = false
                    )
                    Spacer(Modifier.height(16.dp))
                    VitaminRadioButtons.Primary(
                        selected = false,
                        onClick = null,
                        enabled = true
                    )
                    CategorySpacer()
                }
                item {
                    Text("Selected")
                    Spacer(Modifier.height(8.dp))
                    VitaminRadioButtons.Primary(
                        selected = true,
                        onClick = null,
                        enabled = false
                    )
                    Spacer(Modifier.height(16.dp))
                    VitaminRadioButtons.Primary(
                        selected = true,
                        onClick = null,
                        enabled = true
                    )
                    CategorySpacer()
                }

                item {
                    Text("Unselected labeled")
                    Spacer(Modifier.height(8.dp))
                    VitaminRadioButtons.Primary(
                        selected = false,
                        onClick = null,
                        enabled = false,
                        endContent = {
                            Text(text = "RadioBox", style = VitaminTheme.typography.h6)
                        })
                    Spacer(Modifier.height(16.dp))
                    VitaminRadioButtons.Primary(
                        selected = false,
                        onClick = null,
                        enabled = true,
                        endContent = {
                            Text(text = "RadioBox", style = VitaminTheme.typography.h6)
                        })
                    CategorySpacer()
                }

                item {
                    Text("Selected labeled")
                    Spacer(Modifier.height(8.dp))
                    VitaminRadioButtons.Primary(
                        selected = true,
                        onClick = null,
                        enabled = false,
                        endContent = {
                            Text(text = "RadioBox", style = VitaminTheme.typography.h6)
                        })
                    Spacer(Modifier.height(16.dp))
                    VitaminRadioButtons.Primary(
                        selected = true,
                        onClick = null,
                        enabled = true,
                        endContent = {
                            Text(text = "RadioBox", style = VitaminTheme.typography.h6)
                        })
                    CategorySpacer()
                }

                item {
                    Text(text = "RadioGroup")
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
                        })
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
                        })

                    Spacer(Modifier.height(16.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RadiobuttonScreenPreview() {
    VitaminTheme {
        RadioButtons.Screen()
    }
}

@Composable
fun CategorySpacer() {
    Spacer(Modifier.height(16.dp))
    Divider(color = Color.LightGray, thickness = 1.dp)
    Spacer(Modifier.height(16.dp))
}
