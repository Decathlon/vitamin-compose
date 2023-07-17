package com.decathlon.vitamin.compose.tabs.utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.tabs.TabItem
import com.decathlon.vitamin.compose.tabs.VitaminTabs
import com.decathlon.vitamin.compose.vitaminicons.Line
import com.decathlon.vitamin.compose.vitaminicons.line.Heart

object TabsVariantsFactory {

    @Suppress("LongMethod")
    @Composable
    fun Tabs(
        variant: Variant,
        tabItems: List<TabItem>,
        modifier: Modifier = Modifier,
    ) {
        when (variant) {
            Variant.Fixed -> VitaminTabs.Fixed(
                modifier = modifier,
                tabItems = tabItems
            ) {}

            Variant.Scrollable -> VitaminTabs.Scrollable(
                modifier = modifier,
                tabItems = tabItems
            ) {}

        }
    }

    @Composable
    fun TabItems(variant: Variant): List<TabItem> {
        val list = remember { mutableStateListOf<TabItem>() }
        for (i in 0..getItemCountForVariant(variant)) {
            list.add(
                TabItem(
                    label = "Label $i",
                    selected = i == 0
                )
            )
        }
        return list
    }

    @Composable
    fun TabItemsWithIcons(variant: Variant): List<TabItem> {
        val list = remember { mutableStateListOf<TabItem>() }
        for (i in 0..getItemCountForVariant(variant)) {
            list.add(
                TabItem(
                    label = "Label $i",
                    icon = rememberVectorPainter(VitaminIcons.Line.Heart),
                    selected = i == 0
                )
            )
        }
        return list
    }

    @Composable
    fun TabItemsWithTopIcons(variant: Variant): List<TabItem> {
        val list = remember { mutableStateListOf<TabItem>() }
        for (i in 0..getItemCountForVariant(variant)) {
            list.add(
                TabItem(
                    label = "Label $i",
                    icon = rememberVectorPainter(VitaminIcons.Line.Heart),
                    topIcon = true,
                    selected = i == 0
                )
            )
        }
        return list
    }

    private fun getItemCountForVariant(variant: Variant): Int {
        return if (variant == Variant.Scrollable) {
            10
        } else {
            3
        }
    }
}

