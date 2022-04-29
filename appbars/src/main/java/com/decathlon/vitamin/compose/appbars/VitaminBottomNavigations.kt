package com.decathlon.vitamin.compose.appbars

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter

open class SelectedActionItem(
    val selected: Boolean = false,
    val icon: Painter,
    val contentDescription: String?,
    val content: @Composable () -> Unit = {},
    val onClick: () -> Boolean
)

object VitaminBottomNavigations {
    /**
     * The bottom navigation allow the user to switch between destinations in an app.
     * @param actions The [SelectedActionItem] actions of your bottom navigation.
     * [SelectedActionItem] define the look and the event associated to an item in the bottom navigation
     * @param modifier The [Modifier] to be applied to this BottomNavigation
     */
    @Composable
    fun Primary(
        actions: List<SelectedActionItem>,
        modifier: Modifier = Modifier,
    ) {
        val colors = VitaminBottomNavigationsColors.primary()
        BottomNavigation(
            modifier = modifier,
            backgroundColor = colors.background,
            contentColor = colors.unSelected
        ) {
            actions.forEach {
                BottomNavigationItem(
                    selected = it.selected,
                    onClick = { it.onClick() },
                    icon = { Icon(painter = it.icon, contentDescription = it.contentDescription) },
                    label = it.content,
                    selectedContentColor = colors.selected,
                    unselectedContentColor = colors.unSelected
                )
            }
        }
    }
}
