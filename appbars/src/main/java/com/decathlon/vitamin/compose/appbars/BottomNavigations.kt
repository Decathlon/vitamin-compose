package com.decathlon.vitamin.compose.appbars

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.decathlon.vitamin.compose.appbars.dropdown.SelectedActionItem

object VitaminBottomNavigations {
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
