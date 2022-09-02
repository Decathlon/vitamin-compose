package com.decathlon.vitamin.compose.appbars.bottomnavigations

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import com.decathlon.vitamin.compose.foundation.VitaminTheme

open class SelectedActionItem(
    val selected: Boolean = false,
    val icon: Painter,
    val contentDescription: String?,
    val text: String,
    val onClick: () -> Boolean
)

object VitaminBottomNavigations {
    /**
     * The bottom navigation allow the user to switch between destinations in an app.
     * @param actions The [SelectedActionItem] actions of your bottom navigation.
     * [SelectedActionItem] define the look and the event associated to an item in the bottom navigation
     * @param modifier The [Modifier] to be applied to this BottomNavigation
     * @param colors The colors of the background and the content elements in selected and unselected mode
     */
    @Composable
    fun Primary(
        actions: List<SelectedActionItem>,
        modifier: Modifier = Modifier,
        colors: BottomNavigationColors = VitaminBottomNavigationColors.primary()
    ) {
        BottomNavigation(
            modifier = modifier,
            backgroundColor = colors.backgroundColor
        ) {
            actions.forEach {
                val textColor = if (it.selected) colors.selectedTextColor else colors.unselectedColor
                val iconColor = if (it.selected) colors.selectedIconColor else colors.unselectedColor
                BottomNavigationItem(
                    selected = it.selected,
                    onClick = { it.onClick() },
                    icon = {
                        Icon(
                            painter = it.icon,
                            tint = iconColor,
                            contentDescription = it.contentDescription
                        )
                    },
                    label = { Text(text = it.text, color = textColor, style = VitaminTheme.typography.caption) }
                )
            }
        }
    }
}
