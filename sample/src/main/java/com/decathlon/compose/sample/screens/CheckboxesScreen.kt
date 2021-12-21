package com.decathlon.compose.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.checkboxes.VitaminCheckboxes
import com.decathlon.vitamin.compose.foundation.VitaminTheme


object Checkboxes : Screen {
    override val name: String
        get() = "Checkboxes"
    override val navigationKey: String
        get() = "checkboxes"

    @Composable
    override fun Screen() {
        SampleScaffold(title = name) {
            LazyColumn(
                modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                item {
                    var checked by remember { mutableStateOf(true) }
                    VitaminCheckboxes.Primary(
                        checked = checked,
                        onCheckedChange = {
                            checked = !checked
                        },
                        enabled = true,
                        endContent = {
                            Text(text = "Checkbox by default")
                        },
                        modifier = Modifier.padding(top = 16.dp)
                    )
                }
                item {
                    var checked by remember { mutableStateOf(false) }
                    VitaminCheckboxes.Primary(
                        checked = checked,
                        onCheckedChange = {
                            checked = !checked
                        },
                        endContent = {
                            Text(text = "Unchecked by default")
                        }
                    )
                }
                item {
                    VitaminCheckboxes.Primary(
                        checked = true,
                        onCheckedChange = {},
                        enabled = false,
                        endContent = {
                            Text(text = "Disabled checked")
                        }
                    )
                }
                item {
                    VitaminCheckboxes.Primary(
                        checked = false,
                        onCheckedChange = {},
                        enabled = false,
                        endContent = {
                            Text(text = "Disabled unchecked")
                        }
                    )
                }
            }
        }
    }

}

@Preview
@Composable
fun PreviewCheckboxes() {
    VitaminTheme {
        Checkboxes.Screen()
    }
}

@Preview
@Composable
fun PreviewDarkCheckboxes() {
    VitaminTheme(darkTheme = false) {
        Checkboxes.Screen()
    }
}
