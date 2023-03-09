package com.decathlon.vitamin.compose.scaffolds

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import com.decathlon.vitamin.compose.appbars.topbars.ActionItem
import com.decathlon.vitamin.compose.appbars.topbars.VitaminTopBars
import com.decathlon.vitamin.compose.tabs.TabItem
import com.decathlon.vitamin.compose.tabs.VitaminTabs

@Composable
internal fun VitaminTopBar(
    title: String,
    topBarConfiguration: TopBarConfiguration,
    onSearchValueChanged: (String) -> Unit,
    topActionsUi: TopActionsUi,
    onTopActionClicked: (TopActionUi) -> Unit,
    expandedMenu: MutableState<Boolean>,
    tabActionsUi: TabActionsUi,
    tabSelectedIndex: Int?,
    onTabClicked: (TabActionUi) -> Unit
) {
    Column {
        when (topBarConfiguration) {
            is TopBarConfiguration.Primary -> VitaminTopBars.Primary(
                title = title,
                navigationIcon = topBarConfiguration.navigationIcon,
                maxActions = topActionsUi.maxActions,
                actions = topActionsUi.actions.map {
                    ActionItem(
                        icon = rememberVectorPainter(image = it.icon),
                        contentDescription = it.contentDescription,
                        onClick = { onTopActionClicked(it) },
                        content = { it.contentDescription?.let { Text(text = it) } }
                    )
                },
                expandedMenu = expandedMenu,
                overflowIcon = {
                    More(
                        onClick = { expandedMenu.value = !expandedMenu.value },
                        contentDescription = "More"
                    )
                }
            )
            is TopBarConfiguration.Search -> VitaminTopBars.Search(
                value = topBarConfiguration.value.value,
                placeholder = topBarConfiguration.placeholder,
                navigationIcon = topBarConfiguration.navigationIcon,
                onValueChange = onSearchValueChanged,
                keyboardActions = topBarConfiguration.keyboardActions,
                keyboardOptions = topBarConfiguration.keyboardOptions
            )
        }
        if (tabActionsUi.actions.size > 1) {
            val tabItems = tabActionsUi.actions.mapIndexed { index, item ->
                TabItem(
                    icon = item.icon?.let { rememberVectorPainter(image = it) },
                    label = item.label,
                    selected = index == tabSelectedIndex
                )
            }
            if (tabActionsUi.scrollable) {
                VitaminTabs.Scrollable(
                    tabItems = tabItems,
                    onTabClicked = { item ->
                        tabActionsUi.actions.find { item.label == it.label }?.let(onTabClicked)
                    }
                )
            } else {
                VitaminTabs.Fixed(
                    tabItems = tabItems,
                    onTabClicked = { item ->
                        tabActionsUi.actions.find { item.label == it.label }?.let(onTabClicked)
                    }
                )
            }
        }
    }
}
