package com.decathlon.vitamin.compose.tabs

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.TabRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

data class TabItem(
    val label: String,
    val icon: Painter? = null,
    val contentDescription: String? = null,
    val topIcon: Boolean = false,
    var selected: Boolean = false
)

data class TabItemStyle(
    val tabBackgroundColor: Color,
    val tabIndicatorColor: Color,
    val activeColor: Color,
    val disabledColor: Color,
    val textStyle: TextStyle,
    val textOverflow: TextOverflow,
)

object VitaminTabs {

    @Composable
    fun Fixed(
        tabItems: List<TabItem>,
        modifier: Modifier = Modifier,
        tabItemStyle: TabItemStyle = TabItemStyle(
            tabBackgroundColor = VitaminTheme.colors.vtmnBackgroundPrimary,
            tabIndicatorColor = VitaminTheme.colors.vtmnContentActive,
            activeColor = VitaminTheme.colors.vtmnContentActive,
            disabledColor = VitaminTheme.colors.vtmnContentSecondary,
            textStyle = VitaminTheme.typography.body2.copy(fontWeight = FontWeight.Bold),
            textOverflow = TextOverflow.Ellipsis
        ),
        onTabClicked: (tabItem: TabItem) -> Unit
    ) {
        val selectedTab = tabItems.firstOrNull { it.selected } ?: tabItems.first()
        val indexOfSelectedTab = tabItems.indexOf(selectedTab)

        TabRow(
            selectedTabIndex = indexOfSelectedTab,
            backgroundColor = tabItemStyle.tabBackgroundColor,
            indicator = {
                VitaminTabItemIndicator(
                    it, indexOfSelectedTab, tabItemStyle.tabIndicatorColor
                )
            },
            modifier = modifier.height(getTabHeight(tabItems))
        ) {
            VitaminTabs(
                tabItems = tabItems,
                selectedTabIndex = indexOfSelectedTab,
                activeColor = tabItemStyle.activeColor,
                disabledColor = tabItemStyle.disabledColor,
                textStyle = tabItemStyle.textStyle,
                textOverflow = tabItemStyle.textOverflow
            ) {
                onTabClicked(it)
            }
        }
    }

    @Composable
    fun Scrollable(
        tabItems: List<TabItem>,
        modifier: Modifier = Modifier,
        tabItemStyle: TabItemStyle = TabItemStyle(
            tabBackgroundColor = VitaminTheme.colors.vtmnBackgroundPrimary,
            tabIndicatorColor = VitaminTheme.colors.vtmnContentActive,
            activeColor = VitaminTheme.colors.vtmnContentActive,
            disabledColor = VitaminTheme.colors.vtmnContentSecondary,
            textStyle = VitaminTheme.typography.body2.copy(fontWeight = FontWeight.Bold),
            textOverflow = TextOverflow.Ellipsis
        ),
        onTabClicked: (tabItem: TabItem) -> Unit
    ) {
        val selectedTab = tabItems.firstOrNull { it.selected } ?: tabItems.first()
        val indexOfSelectedTab = tabItems.indexOf(selectedTab)

        Column(modifier = modifier) {
            ScrollableTabRow(
                selectedTabIndex = indexOfSelectedTab,
                backgroundColor = tabItemStyle.tabBackgroundColor,
                indicator = {
                    VitaminTabItemIndicator(
                        it,
                        indexOfSelectedTab,
                        tabItemStyle.tabIndicatorColor
                    )
                },
                modifier = Modifier.height(getTabHeight(tabItems))
            ) {
                VitaminTabs(
                    tabItems = tabItems,
                    selectedTabIndex = indexOfSelectedTab,
                    activeColor = tabItemStyle.activeColor,
                    disabledColor = tabItemStyle.disabledColor,
                    textStyle = tabItemStyle.textStyle,
                    textOverflow = tabItemStyle.textOverflow
                ) {
                    onTabClicked(it)
                }
            }
        }
    }

    private fun getTabHeight(list: List<TabItem>) =
        if (list.any { it.topIcon }) 72.dp else 48.dp
}
