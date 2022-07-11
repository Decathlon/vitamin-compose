package com.decathlon.vitamin.compose.appbars.topbars

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import com.decathlon.vitamin.compose.appbars.OverflowMenu
import com.decathlon.vitamin.compose.appbars.topbars.icons.IconButtons
import com.decathlon.vitamin.compose.appbars.topbars.icons.VitaminMenuIconButtons
import com.decathlon.vitamin.compose.appbars.topbars.icons.VitaminNavigationIconButtons
import com.decathlon.vitamin.compose.appbars.topbars.icons.VitaminSearchMenuIconButtons
import com.decathlon.vitamin.compose.appbars.topbars.icons.VitaminSearchNavigationIconButtons
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import kotlin.math.min

object VitaminTopBars {
    private const val MAX_ACTIONS = 3

    /**
     * The primary TopBar displays information and actions related to the current screen.
     * @param title The title of your screen
     * @param modifier The [Modifier] to be applied to this TopBar
     * @param maxActions The max number of icon actions at the right of the TopBar
     * @param actions The [ActionItem] actions of your topBar.
     * [ActionItem] define the look and the event associated to an item in the topBar
     * @param expandedMenu Open menu for actions greater than `maxActions` value
     * @param colors The colors of the background and the content elements in enabled and disabled mode
     * @param onDismissOverflowMenu The callback called when the menu should be removed
     * @param overflowIcon The icon to open overflow menu
     * @param navigationIcon The navigation icon displayed at the start of the TopBar
     */
    @Composable
    fun Primary(
        title: String,
        modifier: Modifier = Modifier,
        maxActions: Int = MAX_ACTIONS,
        actions: List<ActionItem> = emptyList(),
        expandedMenu: MutableState<Boolean> = remember { mutableStateOf(false) },
        colors: TopBarColors = VitaminTopBarColors.primary(),
        onDismissOverflowMenu: (() -> Unit)? = null,
        overflowIcon: (@Composable VitaminMenuIconButtons.() -> Unit)? = null,
        navigationIcon: (@Composable VitaminNavigationIconButtons.() -> Unit)? = null
    ) {
        CompositionLocalProvider(LocalVitaminTopBarColors provides colors) {
            TopAppBar(
                title = { Text(text = title) },
                modifier = modifier,
                navigationIcon = navigationIcon.takeOrNull(),
                actions = {
                    val showAsActionItems = actions.take(min(MAX_ACTIONS, maxActions))
                    val overflowItems = actions.subtract(showAsActionItems.toSet()).toList()
                    showAsActionItems.forEach { action ->
                        if (action.icon != null) {
                            IconButtons(onClick = { action.onClick() }) {
                                Icon(
                                    painter = action.icon,
                                    contentDescription = action.contentDescription,
                                    tint = colors.iconColor
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
                            actions = overflowItems,
                            expanded = expandedMenu,
                            overflowIcon = overflowIcon,
                            onDismissRequest = onDismissOverflowMenu
                        )
                    }
                },
                backgroundColor = colors.background,
                contentColor = colors.contentColor
            )
        }
    }

    /**
     * The search TopBar displays a text input to search in the current screen.
     * @param value The value of your search
     * @param placeholder The placeholder value inside the text input of the TopBar
     * @param modifier The [Modifier] to be applied to this TopBar
     * @param enabled True if you can type in the search bar, otherwise false
     * @param actions The [SearchActionItem] actions of your topBar.
     * [SearchActionItem] define the look and the event associated to an item in the topBar
     * @param keyboardOptions Software keyboard options that contains options such as KeyboardType or ImeAction
     * @param keyboardActions When the text input emit an IME action, the corresponding callback is called
     * @param interactionSource Representing the stream of interaction for the text input
     * @param colors The colors of the background and the content elements in enabled and disabled mode
     * @param textStyle The typography of the text inside the text input
     * @param navigationIcon The navigation icon displayed at the start of the TopBar
     * @param onValueChange The callback to be called when the user type a new character
     */
    @Composable
    fun Search(
        value: String,
        placeholder: String,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        actions: List<SearchActionItem> = emptyList(),
        keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        keyboardActions: KeyboardActions = KeyboardActions.Default,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        colors: TopBarColors = VitaminTopBarColors.search(),
        textStyle: TextStyle = VitaminTheme.typography.body2,
        onValueChange: (String) -> Unit,
        navigationIcon: @Composable VitaminSearchNavigationIconButtons.() -> Unit,
    ) {
        CompositionLocalProvider(LocalVitaminTopBarColors provides colors) {
            TopAppBar(
                modifier = modifier,
                backgroundColor = colors.background,
                contentColor = colors.contentColor
            ) {
                VitaminSearchNavigationIconButtons.navigationIcon()
                BasicTextField(
                    value = value,
                    onValueChange = onValueChange,
                    enabled = enabled,
                    textStyle = textStyle.copy(color = colors.inputColor!!),
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true,
                    maxLines = 1,
                    interactionSource = interactionSource,
                    keyboardOptions = keyboardOptions,
                    keyboardActions = keyboardActions,
                    cursorBrush = SolidColor(colors.cursorColor!!),
                    decorationBox = { textField ->
                        if (value == "") {
                            Text(text = placeholder)
                        } else {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxHeight()
                                        .weight(1f),
                                    contentAlignment = Alignment.CenterStart,
                                ) {
                                    textField()
                                }
                                actions.forEach {
                                    when (it) {
                                        is SearchActionItem.Microphone -> VitaminSearchMenuIconButtons.Microphone(
                                            onClick = it.onClick,
                                            contentDescription = it.contentDescription
                                        )
                                        is SearchActionItem.Close -> VitaminSearchMenuIconButtons.Close(
                                            onClick = it.onClick,
                                            contentDescription = it.contentDescription
                                        )
                                    }
                                }
                            }
                        }
                    }
                )
            }
        }
    }
}

open class ActionItem(
    val icon: Painter? = null,
    val contentDescription: String?,
    val content: @Composable () -> Unit = {},
    val onClick: () -> Unit,
)

sealed class SearchActionItem(
    val contentDescription: String?,
    val onClick: () -> Unit
) {
    class Microphone(contentDescription: String?, onClick: () -> Unit) :
        SearchActionItem(contentDescription = contentDescription, onClick = onClick)

    class Close(contentDescription: String?, onClick: () -> Unit) :
        SearchActionItem(contentDescription = contentDescription, onClick = onClick)
}

internal val LocalVitaminTopBarColors = compositionLocalOf<TopBarColors> {
    error("No TopBarsColors provided")
}

internal fun (@Composable VitaminNavigationIconButtons.() -> Unit)?.takeOrNull(): (@Composable () -> Unit)? {
    if (this == null) return null
    return {
        VitaminNavigationIconButtons.this()
    }
}
