package com.decathlon.vitamin.compose.tabs

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.TabRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object VitaminTabs {
    /**
     * The fixed tabs displays all tabs in a set simultaneously.
     * @param tabItems The [TabItem] actions of your tabs. [TabItem] define the look to the items
     * @param modifier The [Modifier] to be applied to the component
     * @param colors The colors of the icon, label, background and indicator
     * @param textStyle The text style of the label inside tabs
     * @param textOverflow How visual overflow should be handled
     * @param onTabClicked The callback to be called when the user click on a tab
     */
    @Composable
    fun Fixed(
        tabItems: List<TabItem>,
        modifier: Modifier = Modifier,
        colors: TabColors = VitaminTabColors.primary(),
        textStyle: TextStyle = VitaminTheme.typography.text2Bold,
        textOverflow: TextOverflow = TextOverflow.Ellipsis,
        onTabClicked: (tabItem: TabItem) -> Unit
    ) {
        val selectedTab = tabItems.firstOrNull { it.selected } ?: tabItems.first()
        val indexOfSelectedTab = tabItems.indexOf(selectedTab)
        TabRow(
            selectedTabIndex = indexOfSelectedTab,
            backgroundColor = colors.backgroundColor,
            indicator = {
                VitaminTabItemIndicator(
                    it, indexOfSelectedTab, colors.indicatorColor
                )
            },
            modifier = modifier.height(getTabHeight(tabItems))
        ) {
            VitaminTabs(
                tabItems = tabItems,
                selectedTabIndex = indexOfSelectedTab,
                activeColor = colors.activeColor,
                disabledColor = colors.disabledColor,
                textStyle = textStyle,
                textOverflow = textOverflow
            ) {
                onTabClicked(it)
            }
        }
    }

    /**
     * When a set of tabs cannot fit on screen, use scrollable tabs. Scrollable tabs can use longer
     * text labels and a larger number of tabs. They are best used for browsing on touch interfaces.
     * @param tabItems The [TabItem] actions of your tabs. [TabItem] define the look to the items
     * @param modifier The [Modifier] to be applied to the component
     * @param colors The colors of the icon, label, background and indicator
     * @param textStyle The text style of the label inside tabs
     * @param textOverflow How visual overflow should be handled
     * @param onTabClicked The callback to be called when the user click on a tab
     */
    @Composable
    fun Scrollable(
        tabItems: List<TabItem>,
        modifier: Modifier = Modifier,
        colors: TabColors = VitaminTabColors.primary(),
        textStyle: TextStyle = VitaminTheme.typography.text2Bold,
        textOverflow: TextOverflow = TextOverflow.Ellipsis,
        onTabClicked: (tabItem: TabItem) -> Unit
    ) {
        val selectedTab = tabItems.firstOrNull { it.selected } ?: tabItems.first()
        val indexOfSelectedTab = tabItems.indexOf(selectedTab)

        Column(modifier = modifier) {
            ScrollableTabRow(
                selectedTabIndex = indexOfSelectedTab,
                backgroundColor = colors.backgroundColor,
                indicator = {
                    VitaminTabItemIndicator(
                        it,
                        indexOfSelectedTab,
                        colors.indicatorColor
                    )
                },
                modifier = Modifier.height(getTabHeight(tabItems))
            ) {
                VitaminTabs(
                    tabItems = tabItems,
                    selectedTabIndex = indexOfSelectedTab,
                    activeColor = colors.activeColor,
                    disabledColor = colors.disabledColor,
                    textStyle = textStyle,
                    textOverflow = textOverflow
                ) {
                    onTabClicked(it)
                }
            }
        }
    }

    private fun getTabHeight(list: List<TabItem>) =
        if (list.any { it.topIcon }) 72.dp else 48.dp
}
