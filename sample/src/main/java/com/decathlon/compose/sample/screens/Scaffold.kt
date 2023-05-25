package com.decathlon.compose.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.buttons.VitaminButtons
import com.decathlon.vitamin.compose.scaffolds.BottomActionUi
import com.decathlon.vitamin.compose.scaffolds.BottomActionsUi
import com.decathlon.vitamin.compose.scaffolds.FabActionUi
import com.decathlon.vitamin.compose.scaffolds.TabActionUi
import com.decathlon.vitamin.compose.scaffolds.TabActionsUi
import com.decathlon.vitamin.compose.scaffolds.TopActionUi
import com.decathlon.vitamin.compose.scaffolds.TopActionsUi
import com.decathlon.vitamin.compose.scaffolds.TopBarConfiguration
import com.decathlon.vitamin.compose.scaffolds.VitaminScaffolds
import com.decathlon.vitamin.compose.vitaminicons.Fill
import com.decathlon.vitamin.compose.vitaminicons.Line
import com.decathlon.vitamin.compose.vitaminicons.fill.Calendar
import com.decathlon.vitamin.compose.vitaminicons.line.Add
import com.decathlon.vitamin.compose.vitaminicons.line.Android
import com.decathlon.vitamin.compose.vitaminicons.line.Calendar
import com.decathlon.vitamin.compose.vitaminicons.line.Search

object Scaffold : Screen {
    override val name: String
        get() = "Scaffold"
    override val navigationKey: String
        get() = "scaffolds"

    @SuppressWarnings("LongMethod")
    @Composable
    override fun Screen(navController: NavController?) {
        val searchValue = remember { mutableStateOf(value = "") }
        val topBarConfiguration: MutableState<TopBarConfiguration> =
            remember { mutableStateOf(TopBarConfiguration.Primary()) }
        val tabActionsUi = remember { mutableStateOf(TabActionsUi(scrollable = true)) }
        val tabSelected = remember { mutableStateOf<Int?>(null) }
        val topActionsUi = remember {
            mutableStateOf(
                TopActionsUi(
                    actions = listOf(
                        TopActionUi(
                            id = 0,
                            icon = VitaminIcons.Line.Search,
                            contentDescription = "Search"
                        )
                    )
                )
            )
        }
        val bottomActionUi = remember { mutableStateOf(BottomActionsUi()) }
        val bottomSelected = remember { mutableStateOf<String?>(null) }
        VitaminScaffolds.Primary(
            title = name,
            topBarConfiguration = topBarConfiguration.value,
            topActionsUi = topActionsUi.value,
            onTopActionClicked = { action ->
                if (action.id == 0) {
                    topBarConfiguration.value = TopBarConfiguration.Search(
                        value = searchValue,
                        placeholder = "Search",
                        keyboardActions = KeyboardActions(onDone = {
                            topBarConfiguration.value = TopBarConfiguration.Primary()
                        }),
                        navigationIcon = {
                            Search(contentDescription = null)
                        }
                    )
                }
            },
            tabActionsUi = tabActionsUi.value,
            onTabClicked = { action ->
                tabSelected.value = tabActionsUi.value.actions
                    .indexOfFirst { it.route == action.route }
            },
            tabSelectedIndex = tabSelected.value,
            onSearchValueChanged = { newValue ->
                searchValue.value = newValue
            },
            fabAction = FabActionUi(
                id = 0,
                icon = VitaminIcons.Line.Add,
                contentDescription = "Add"
            ),
            bottomActionsUi = bottomActionUi.value,
            bottomRouteSelected = bottomSelected.value,
            onBottomActionClicked = { action ->
                bottomSelected.value = action.route
            }
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(16.dp)
            ) {
                item {
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        VitaminButtons.Primary(text = "Add top action") {
                            topActionsUi.value = topActionsUi.value.copy(
                                actions = topActionsUi.value.actions + TopActionUi(
                                    id = topActionsUi.value.actions.size + 1,
                                    icon = VitaminIcons.Line.Android,
                                    contentDescription = "Android ${topActionsUi.value.actions.size + 1}"
                                )
                            )
                        }
                        VitaminButtons.Primary(
                            text = "Remove top action",
                            enabled = topActionsUi.value.actions.size > 1
                        ) {
                            topActionsUi.value = topActionsUi.value.copy(
                                actions = topActionsUi.value.actions.dropLast(1)
                            )
                        }
                    }
                }
                item {
                    val hasAtLeast2Tabs = tabActionsUi.value.actions.size >= 2
                    val hasLessThan3Tabs = tabActionsUi.value.actions.size <= 2
                    val additionText = if (hasAtLeast2Tabs) "Add tab" else "Add 2 tabs"
                    val removeText = if (hasLessThan3Tabs) "Clear tabs" else "Remove tab"
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        VitaminButtons.Primary(text = additionText) {
                            if (hasAtLeast2Tabs) {
                                tabActionsUi.value = tabActionsUi.value.copy(
                                    actions = tabActionsUi.value.actions + TabActionUi(
                                        route = "tab-${tabActionsUi.value.actions.size + 1}",
                                        label = "Tab ${tabActionsUi.value.actions.size + 1}"
                                    )
                                )
                            } else {
                                tabActionsUi.value = tabActionsUi.value.copy(
                                    actions = arrayListOf(
                                        TabActionUi(
                                            route = "tab-1",
                                            label = "Tab 1"
                                        ),
                                        TabActionUi(
                                            route = "tab-2",
                                            label = "Tab 2"
                                        )
                                    )
                                )
                            }
                        }
                        VitaminButtons.Primary(
                            text = removeText,
                            enabled = tabActionsUi.value.actions.size > 1
                        ) {
                            if (hasLessThan3Tabs) {
                                tabActionsUi.value = tabActionsUi.value.copy(actions = emptyList())
                            } else {
                                tabActionsUi.value = tabActionsUi.value.copy(
                                    actions = tabActionsUi.value.actions.dropLast(1)
                                )
                            }
                        }
                    }
                }
                item {
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        VitaminButtons.Primary(text = "Add bottom action") {
                            bottomActionUi.value = bottomActionUi.value.copy(
                                actions = bottomActionUi.value.actions + BottomActionUi(
                                    route = "tab-${bottomActionUi.value.actions.size + 1}",
                                    icon = VitaminIcons.Line.Calendar,
                                    iconSelected = VitaminIcons.Fill.Calendar,
                                    label = "Bottom ${bottomActionUi.value.actions.size + 1}",
                                    contentDescription = null
                                )
                            )
                        }
                        VitaminButtons.Primary(
                            text = "Remove bottom action",
                            enabled = bottomActionUi.value.actions.isNotEmpty()
                        ) {
                            bottomActionUi.value = bottomActionUi.value.copy(
                                actions = bottomActionUi.value.actions.dropLast(1)
                            )
                        }
                    }
                }
            }
        }
    }
}
