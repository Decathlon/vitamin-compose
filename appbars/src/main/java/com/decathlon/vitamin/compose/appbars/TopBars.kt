package com.decathlon.vitamin.compose.appbars

import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.decathlon.vitamin.compose.appbars.dropdown.ActionItem
import com.decathlon.vitamin.compose.appbars.dropdown.OverflowMenu
import com.decathlon.vitamin.compose.foundation.VitaminNoColorComputeElevationOverlay
import kotlin.math.min

object VitaminTopBars {
    @Composable
    fun Primary(
        title: String,
        modifier: Modifier = Modifier,
        maxActions: Int = 2,
        actions: List<ActionItem> = emptyList(),
        expanded: MutableState<Boolean> = remember { mutableStateOf(false) },
        overflowIcon: (@Composable VitaminMenuIconButtons.() -> Unit)? = null,
        navigationIcon: (@Composable VitaminNavigationIconButtons.() -> Unit)? = null,
        colors: TopBarsColors = VitaminTopBarsColors.primary()
    ) {
        CompositionLocalProvider(
            LocalVitaminTopBarColors provides colors,
            LocalElevationOverlay provides VitaminNoColorComputeElevationOverlay
        ) {
            TopAppBar(
                title = { Text(text = title) },
                modifier = modifier,
                navigationIcon = navigationIcon.takeOrNull(),
                actions = {
                    val showAsActionItems = actions.take(min(3, maxActions))
                    val overflowItems = actions.subtract(showAsActionItems.toSet())
                    showAsActionItems.forEach { action ->
                        if (action.icon != null) {
                            IconButtons(onClick = { action.onClick() }) {
                                Icon(
                                    painter = action.icon,
                                    contentDescription = action.contentDescription
                                )
                            }
                        } else {
                            TextButton(
                                onClick = { action.onClick() },
                                content = { action.content() },
                                colors = ButtonDefaults.textButtonColors(contentColor = colors.contentColor)
                            )
                        }
                    }
                    if (overflowItems.isNotEmpty() && overflowIcon != null) {
                        OverflowMenu(
                            actions = overflowItems.toList(),
                            expanded = expanded,
                            overflowIcon = overflowIcon
                        )
                    }
                },
                backgroundColor = colors.background,
                contentColor = colors.contentColor
            )
        }
    }
}

internal val LocalVitaminTopBarColors = compositionLocalOf<TopBarsColors> {
    error("No TopBarsColors provided")
}

internal fun (@Composable VitaminNavigationIconButtons.() -> Unit)?.takeOrNull(): (@Composable () -> Unit)? {
    if (this == null) return null
    return {
        VitaminNavigationIconButtons.this()
    }
}
