package com.decathlon.vitamin.compose.tabs

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.material.Tab
import androidx.compose.material.TabPosition
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
internal fun VitaminTabItemIndicator(
    tabPositions: List<TabPosition>,
    selectedTabIndex: Int,
    tabIndicatorColor: Color
) {
    TabRowDefaults.Indicator(
        modifier = Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
        color = tabIndicatorColor
    )
}

@Composable
internal fun VitaminTabs(
    tabItems: List<TabItem>,
    selectedTabIndex: Int,
    activeColor: Color,
    disabledColor: Color,
    textStyle: TextStyle,
    textOverflow: TextOverflow,
    onTabClicked: (tabItem: TabItem) -> Unit
) {
    tabItems.forEachIndexed { index, tabItem ->
        VitaminTab(
            selectedTabIndex = selectedTabIndex,
            index = index,
            tabItem = tabItem,
            activeColor = activeColor,
            disabledColor = disabledColor,
            onTabClicked = onTabClicked,
            textStyle = textStyle,
            textOverflow = textOverflow
        )
    }
}

@Composable
private fun VitaminTab(
    selectedTabIndex: Int,
    index: Int,
    tabItem: TabItem,
    activeColor: Color,
    disabledColor: Color,
    textStyle: TextStyle,
    textOverflow: TextOverflow,
    onTabClicked: (tabItem: TabItem) -> Unit
) {
    val color =
        if (selectedTabIndex == index) activeColor else disabledColor

    val modifier = Modifier
    tabItem.testTags?.tabTag?.let { tag ->
        modifier.testTag(tag)
    }

    Tab(
        modifier = modifier
            .fillMaxHeight()
            .semantics(mergeDescendants = true) {},
        selected = selectedTabIndex == index,
        onClick = {
            onTabClicked(tabItem)
        },
        text = {
            when {
                tabItem.topIcon && tabItem.icon != null -> VitaminTopIconTab(
                    tabItem = tabItem,
                    color = color,
                    textStyle = textStyle,
                    textOverflow = textOverflow
                )

                tabItem.topIcon.not() && tabItem.icon != null -> VitaminRightIconTab(
                    tabItem = tabItem,
                    color = color,
                    textStyle = textStyle,
                    textOverflow = textOverflow
                )

                else -> VitaminLabelTab(
                    tabItem = tabItem,
                    color = color,
                    textStyle = textStyle,
                    textOverflow = textOverflow
                )
            }
        }
    )
}

@Composable
private fun VitaminLabelTab(
    tabItem: TabItem,
    color: Color,
    textStyle: TextStyle,
    textOverflow: TextOverflow
) {
    val modifier = Modifier
    tabItem.testTags?.labelTag?.let { tag ->
        modifier.testTag(tag)
    }

    Text(
        modifier = modifier,
        text = tabItem.label,
        style = textStyle,
        color = color,
        overflow = textOverflow,
        maxLines = 1,
    )
}

@Composable
private fun VitaminRightIconTab(
    tabItem: TabItem,
    color: Color,
    textStyle: TextStyle,
    textOverflow: TextOverflow
) {
    Row {
        VitaminTabIcon(tabItem = tabItem, color = color)
        Spacer(modifier = Modifier.width(10.dp))
        VitaminLabelTab(
            tabItem = tabItem,
            color = color,
            textStyle = textStyle,
            textOverflow = textOverflow
        )
    }
}

@Composable
private fun VitaminTopIconTab(
    tabItem: TabItem,
    color: Color,
    textStyle: TextStyle,
    textOverflow: TextOverflow
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        VitaminTabIcon(tabItem = tabItem, color = color)
        VitaminLabelTab(
            tabItem = tabItem,
            color = color,
            textStyle = textStyle,
            textOverflow = textOverflow
        )
    }
}

@Composable
private fun VitaminTabIcon(tabItem: TabItem, color: Color) {
    tabItem.icon?.let { icon ->

        val modifier = Modifier
        tabItem.testTags?.iconTag?.let { tag ->
            modifier.testTag(tag)
        }

        Image(
            modifier = modifier,
            painter = icon,
            contentDescription = null,
            colorFilter = ColorFilter.tint(color = color)
        )
    }
}
