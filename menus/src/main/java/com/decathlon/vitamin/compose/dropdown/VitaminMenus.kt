package com.decathlon.vitamin.compose.dropdown

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Box
import androidx.compose.material.DropdownMenu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import kotlinx.coroutines.flow.filter

object VitaminMenus {
    /**
     * A dropdown contains a list of options that have an immediate effect like filter or sort content on a page.
     * @param anchor Component where the dropdown menu is attached
     * @param modifier The [Modifier] to be applied to this BottomNavigation
     * @param expanded State to open or close the dropdown menu
     * @param interactionSource Representing the stream of interaction for the text input
     * @param onDismissRequest The callback to be called when the dropdown menu is dismiss
     * @param children Declare your dropdown menu item components inside your dropdown
     */
    @Composable
    fun Dropdown(
        anchor: @Composable () -> Unit,
        modifier: Modifier = Modifier,
        expanded: MutableState<Boolean> = remember { mutableStateOf(false) },
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        onDismissRequest: () -> Unit = {},
        children: @Composable VitaminMenuItems.() -> Unit
    ) {
        LaunchedEffect(interactionSource) {
            interactionSource.interactions
                .filter { it is PressInteraction.Press }
                .collect {
                    expanded.value = !expanded.value
                }
        }

        Box {
            anchor()
            DropdownMenu(
                modifier = modifier,
                expanded = expanded.value,
                onDismissRequest = {
                    onDismissRequest()
                    expanded.value = false
                },
                content = { VitaminMenuItems.children() }
            )
        }
    }
}
