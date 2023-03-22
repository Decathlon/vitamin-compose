package com.decathlon.compose.sample.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.decathlon.compose.sample.components.SampleRow
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.switches.VitaminSwitches

object Switches : Screen {
    override val name: String
        get() = "Switches"

    override val navigationKey: String
        get() = "switches"

    @Composable
    override fun Screen(navController: NavController?) {
        SampleScaffold(
            title = name,
            onBackClick = {
                navController?.popBackStack()
            }
        ) {
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                item {
                    SampleRow(firstItem = true) {
                        val state = remember { mutableStateOf(true) }
                        VitaminSwitches.Primary(
                            checked = state.value,
                            enabled = true,
                            onCheckedChange = {
                                state.value = it
                            }
                        )
                        VitaminSwitches.Primary(
                            checked = true,
                            enabled = false
                        )
                    }
                }
                item {
                    SampleRow(lastItem = true) {
                        val state = remember { mutableStateOf(false) }
                        VitaminSwitches.Primary(
                            checked = state.value,
                            enabled = true,
                            onCheckedChange = {
                                state.value = it
                            }
                        )
                        VitaminSwitches.Primary(
                            checked = false,
                            enabled = false
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun LightSwitchesDefaultPreview() {
    VitaminTheme {
        Switches.Screen(null)
    }
}

@Preview(showBackground = true)
@Composable
private fun DarkSwitchesDefaultPreview() {
    VitaminTheme(darkTheme = true) {
        Switches.Screen(null)
    }
}
