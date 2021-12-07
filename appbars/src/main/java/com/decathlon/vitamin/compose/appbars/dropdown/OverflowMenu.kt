package com.decathlon.vitamin.compose.appbars.dropdown

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.DropdownMenu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import com.decathlon.vitamin.compose.appbars.VitaminMenuIconButtons

@Composable
internal fun OverflowMenu(
    actions: List<ActionItem>,
    expanded: MutableState<Boolean> = remember { mutableStateOf(false) },
    overflowIcon: @Composable VitaminMenuIconButtons.() -> Unit
) {
    Box {
        DropdownMenu(
            modifier = Modifier.wrapContentWidth(),
            expanded = expanded.value,
            onDismissRequest = { expanded.value = false }
        ) {
            actions.forEach { action ->
                VitaminDropdownItem(
                    onClick = {
                        val consumed = action.onClick()
                        if (consumed) {
                            expanded.value = false
                        }
                    },
                    content = {
                        action.content()
                    }
                )
            }
        }
        VitaminMenuIconButtons.overflowIcon()
    }
}

open class ActionItem(
    val icon: Painter? = null,
    val contentDescription: String?,
    val content: @Composable () -> Unit = {},
    val onClick: () -> Boolean,
)

open class SelectedActionItem(
    val selected: Boolean = false,
    val icon: Painter? = null,
    val contentDescription: String?,
    val content: @Composable () -> Unit = {},
    val onClick: () -> Boolean
)
