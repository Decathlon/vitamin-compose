package com.decathlon.compose.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.appbars.*
import com.decathlon.vitamin.compose.appbars.VitaminTopBarsColors
import com.decathlon.vitamin.compose.appbars.dropdown.ActionItem
import com.decathlon.vitamin.compose.appbars.dropdown.SelectedActionItem
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object AppBars : Screen {
    override val name: String
        get() = "App Bars"
    override val navigationKey: String
        get() = "appbars"

    @Composable
    override fun Screen() {
        SampleScaffold(title = name) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 4.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                item {
                    VitaminTopBars.Primary(title = "Vitamin")
                }
                item {
                    VitaminTopBars.Primary(
                        title = "Vitamin",
                        navigationIcon = {
                            Drawer(
                                onClick = {},
                                contentDescription = ""
                            )
                        }
                    )
                }
                item {
                    val expanded = remember { mutableStateOf(false) }
                    VitaminTopBars.Primary(
                        title = "Vitamin",
                        navigationIcon = {
                            Context(
                                onClick = {},
                                contentDescription = "Back"
                            )
                        },
                        actions = arrayListOf(
                            ActionItem(
                                icon = painterResource(R.drawable.ic_vtmn_android_line),
                                contentDescription = null,
                                content = { Text("Android") },
                                onClick = { return@ActionItem true }
                            ),
                            ActionItem(
                                icon = null,
                                contentDescription = null,
                                content = { Text("Windows") },
                                onClick = { return@ActionItem true }
                            ),
                            ActionItem(
                                icon = painterResource(R.drawable.ic_vtmn_apple_line),
                                contentDescription = null,
                                content = { Text("Apple") },
                                onClick = { return@ActionItem true }
                            )
                        ),
                        overflowIcon = {
                            More(
                                onClick = { expanded.value = true },
                                contentDescription = "More",
                            )
                        },
                        expanded = expanded
                    )
                }
                item {
                    val expanded = remember { mutableStateOf(false) }
                    VitaminTopBars.Primary(
                        title = "Vitamin",
                        colors = VitaminTopBarsColors.contextual(),
                        navigationIcon = {
                            Close(
                                onClick = {},
                                contentDescription = "Close"
                            )
                        },
                        actions = arrayListOf(
                            ActionItem(
                                icon = painterResource(R.drawable.ic_vtmn_android_line),
                                contentDescription = null,
                                content = { Text("Android") },
                                onClick = { return@ActionItem true }
                            ),
                            ActionItem(
                                icon = null,
                                contentDescription = null,
                                content = { Text("Windows") },
                                onClick = { return@ActionItem true }
                            ),
                            ActionItem(
                                icon = painterResource(R.drawable.ic_vtmn_apple_line),
                                contentDescription = null,
                                content = { Text("Apple") },
                                onClick = { return@ActionItem true }
                            )
                        ),
                        overflowIcon = {
                            More(
                                onClick = { expanded.value = true },
                                contentDescription = "More",
                            )
                        },
                        expanded = expanded
                    )
                }
                item {
                    VitaminBottomNavigations.Primary(
                        actions = arrayListOf(
                            SelectedActionItem(
                                selected = true,
                                icon = painterResource(R.drawable.ic_vtmn_android_line),
                                contentDescription = null,
                                content = { Text("Android") },
                                onClick = { return@SelectedActionItem true }
                            ),
                            SelectedActionItem(
                                selected = false,
                                icon = painterResource(R.drawable.ic_vtmn_apple_line),
                                contentDescription = null,
                                content = { Text("Apple") },
                                onClick = { return@SelectedActionItem true }
                            ),
                            SelectedActionItem(
                                selected = false,
                                icon = painterResource(R.drawable.ic_vtmn_amazon_line),
                                contentDescription = null,
                                content = { Text("Amazon") },
                                onClick = { return@SelectedActionItem true }
                            ),
                            SelectedActionItem(
                                selected = false,
                                icon = painterResource(R.drawable.ic_vtmn_facebook_line),
                                contentDescription = null,
                                content = { Text("Facebook") },
                                onClick = { return@SelectedActionItem true }
                            )
                        )
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTopAppBar() {
    VitaminTheme {
        AppBars.Screen()
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDarkTopAppBar() {
    VitaminTheme(darkTheme = true) {
        AppBars.Screen()
    }
}
