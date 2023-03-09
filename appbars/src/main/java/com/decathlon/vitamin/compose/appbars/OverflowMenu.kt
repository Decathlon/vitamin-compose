@file:Suppress("DEPRECATION")

package com.decathlon.vitamin.compose.appbars

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.decathlon.vitamin.compose.appbars.topbars.ActionItem
import com.decathlon.vitamin.compose.appbars.topbars.icons.VitaminMenuIconButtons
import com.decathlon.vitamin.compose.dropdown.VitaminMenus
import kotlinx.collections.immutable.ImmutableList

@Deprecated(
    message = "Use OverflowMenu variant with expanded parameter typed with State and no more MutableState."
)
@Composable
internal fun OverflowMenu(
    //noinspection ComposeUnstableCollections
    actions: List<ActionItem>,
    modifier: Modifier = Modifier,
    //noinspection ComposeMutableParameters
    expanded: MutableState<Boolean> = remember { mutableStateOf(false) },
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onDismissRequest: (() -> Unit)? = null,
    overflowIcon: @Composable VitaminMenuIconButtons.() -> Unit
) {
    VitaminMenus.Dropdown(
        expanded = expanded,
        modifier = modifier,
        interactionSource = interactionSource,
        onDismissRequest = {
            onDismissRequest?.let { it() }
        },
        anchor = {
            VitaminMenuIconButtons.overflowIcon()
        },
        children = {
            actions.forEach {
                PrimaryItem(
                    onClick = {
                        it.onClick()
                        expanded.value = false
                    },
                    content = it.content
                )
            }
        }
    )
}

@Composable
internal fun OverflowMenu(
    actions: ImmutableList<ActionItem>,
    modifier: Modifier = Modifier,
    expanded: State<Boolean> = remember { mutableStateOf(false) },
    onDismissRequest: (() -> Unit)? = null,
    overflowIcon: @Composable VitaminMenuIconButtons.() -> Unit
) {
    VitaminMenus.Dropdown(
        expanded = expanded,
        modifier = modifier,
        onDismissRequest = {
            onDismissRequest?.let { it() }
        },
        anchor = {
            VitaminMenuIconButtons.overflowIcon()
        },
        children = {
            actions.forEach {
                PrimaryItem(onClick = it.onClick, content = it.content)
            }
        }
    )
}
