package com.decathlon.compose.sample.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.tabs.TabItem
import com.decathlon.vitamin.compose.tabs.VitaminTabs
import com.decathlon.vitamin.compose.vitaminicons.Line
import com.decathlon.vitamin.compose.vitaminicons.line.Heart

object Tabs : Screen {
    override val name: String
        get() = "Tabs"

    override val navigationKey: String
        get() = "tabs"

    @SuppressWarnings("MagicNumber", "LongMethod")
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
                    val list = remember { mutableStateListOf<TabItem>() }
                    for (i in 0..20) {
                        list.add(
                            TabItem(
                                label = "Label $i",
                                icon = rememberVectorPainter(VitaminIcons.Line.Heart),
                                selected = i == 0
                            )
                        )
                    }

                    VitaminTabs.Scrollable(
                        tabItems = list,
                        onTabClicked = {
                            selectNewTab(list, it)
                        }
                    )
                }

                item {
                    val list = remember { mutableStateListOf<TabItem>() }
                    for (i in 0..20) {
                        list.add(
                            TabItem(
                                label = "Label $i",
                                icon = rememberVectorPainter(VitaminIcons.Line.Heart),
                                topIcon = true,
                                selected = i == 0
                            )
                        )
                    }
                    VitaminTabs.Scrollable(
                        tabItems = list,
                        onTabClicked = {
                            selectNewTab(list, it)
                        }
                    )
                }

                item {
                    val list = remember { mutableStateListOf<TabItem>() }
                    for (i in 0..20) {
                        list.add(
                            TabItem(
                                label = "Label $i",
                                selected = i == 0
                            )
                        )
                    }

                    VitaminTabs.Scrollable(
                        tabItems = list,
                        onTabClicked = {
                            selectNewTab(list, it)
                        }
                    )
                }

                item {
                    val list = remember { mutableStateListOf<TabItem>() }

                    for (i in 0..2) {
                        list.add(
                            TabItem(
                                label = "Label $i",
                                icon = rememberVectorPainter(VitaminIcons.Line.Heart),
                                selected = i == 0
                            )
                        )
                    }

                    VitaminTabs.Fixed(
                        tabItems = list,
                        onTabClicked = {
                            selectNewTab(list, it)
                        }
                    )
                }

                item {
                    val list = remember { mutableStateListOf<TabItem>() }
                    for (i in 0..2) {
                        list.add(
                            TabItem(
                                label = "Label $i",
                                icon = rememberVectorPainter(VitaminIcons.Line.Heart),
                                topIcon = true,
                                selected = i == 0
                            )
                        )
                    }

                    VitaminTabs.Fixed(
                        tabItems = list,
                        onTabClicked = {
                            selectNewTab(list, it)
                        }
                    )
                }

                item {
                    val list = remember { mutableStateListOf<TabItem>() }
                    for (i in 0..2) {
                        list.add(
                            TabItem(
                                label = "Label $i",
                                selected = i == 0
                            )
                        )
                    }

                    VitaminTabs.Fixed(
                        tabItems = list,
                        onTabClicked = {
                            selectNewTab(list, it)
                        }
                    )
                }
            }
        }
    }

    private fun selectNewTab(list: MutableList<TabItem>, tabItemSelected: TabItem) {
        val indexOfLastSelected = list.indexOf(list.find { it.selected })
        val indexOfItem = list.indexOf(tabItemSelected)

        if (indexOfItem != indexOfLastSelected) {
            if (indexOfLastSelected != -1) {
                list[indexOfLastSelected] = list[indexOfLastSelected].copy(selected = false)
            }

            if (indexOfItem != -1) {
                list[indexOfItem] = list[indexOfItem].copy(selected = true)
            }
        }
    }
}
