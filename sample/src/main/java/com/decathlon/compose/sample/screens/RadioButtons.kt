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
import androidx.navigation.NavController
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.radiobuttons.VitaminRadioButtons

object RadioButtons : Screen {
    override val name: String
        get() = "RadioButton"

    override val navigationKey: String
        get() = "radiobuttons"

    @SuppressWarnings("LongMethod")
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
                    .padding(8.dp)
            ) {
                item {
                    val state = remember { mutableStateOf(false) }
                    Text("Unselected")
                    VitaminRadioButtons.Primary(
                        selected = false,
                        onClick = null,
                        enabled = false
                    )
                    VitaminRadioButtons.Primary(
                        selected = state.value,
                        onClick = {
                            state.value = true
                        },
                        enabled = true
                    )
                    CategorySpacer()
                }

                item {
                    Text("Selected")
                    VitaminRadioButtons.Primary(
                        selected = true,
                        onClick = null,
                        enabled = false
                    )
                    val state = remember { mutableStateOf(true) }
                    VitaminRadioButtons.Primary(
                        selected = state.value,
                        onClick = {
                            state.value = true
                        },
                        enabled = true
                    )
                    CategorySpacer()
                }

                item {
                    val state = remember { mutableStateOf(false) }
                    Text("Unselected labeled")
                    VitaminRadioButtons.Primary(
                        selected = false,
                        onClick = null,
                        enabled = false,
                        endContent = {
                            Text(text = "RadioBox", style = VitaminTheme.typography.h6)
                        }
                    )
                    VitaminRadioButtons.Primary(
                        selected = state.value,
                        onClick = {
                            state.value = true
                        },
                        enabled = true,
                        endContent = {
                            Text(text = "RadioBox", style = VitaminTheme.typography.h6)
                        }
                    )
                    CategorySpacer()
                }

                item {
                    Text("Selected labeled")
                    VitaminRadioButtons.Primary(
                        selected = true,
                        onClick = null,
                        enabled = false,
                        endContent = {
                            Text(text = "RadioBox", style = VitaminTheme.typography.h6)
                        }
                    )
                    VitaminRadioButtons.Primary(
                        selected = true,
                        onClick = null,
                        enabled = true,
                        endContent = {
                            Text(text = "RadioBox", style = VitaminTheme.typography.h6)
                        }
                    )
                    CategorySpacer()
                }

                item {
                    Text(text = "RadioGroup")
                    val states = remember {
                        listOf(
                            mutableStateOf(true),
                            mutableStateOf(false),
                            mutableStateOf(false)
                        )
                    }
                    VitaminRadioButtons.Primary(
                        selected = states[0].value,
                        onClick = {
                            states.forEachIndexed { index, mutableState ->
                                mutableState.value = index == 0
                            }
                        },
                        enabled = true,
                        endContent = {
                            Text(text = "RadioBox")
                        }
                    )
                    VitaminRadioButtons.Primary(
                        selected = states[1].value,
                        onClick = {
                            states.forEachIndexed { index, mutableState ->
                                mutableState.value = index == 1
                            }
                        },
                        enabled = true,
                        endContent = {
                            Text(text = "RadioBox 2")
                        }
                    )
                    VitaminRadioButtons.Primary(
                        selected = states[2].value,
                        onClick = {
                            states.forEachIndexed { index, mutableState ->
                                mutableState.value = index == 2
                            }
                        },
                        enabled = true,
                        endContent = {
                            Text(text = "RadioBox 3")
                        }
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun RadiobuttonScreenPreview() {
    VitaminTheme {
        RadioButtons.Screen(null)
    }
}

@Composable
fun CategorySpacer() {
    Spacer(Modifier.height(16.dp))
    Divider(color = Color.LightGray, thickness = 1.dp)
    Spacer(Modifier.height(16.dp))
}
