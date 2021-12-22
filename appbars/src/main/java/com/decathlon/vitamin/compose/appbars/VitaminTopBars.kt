package com.decathlon.vitamin.compose.appbars

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
import androidx.compose.ui.text.TextStyle
import com.decathlon.vitamin.compose.appbars.dropdown.ActionItem
import com.decathlon.vitamin.compose.appbars.dropdown.OverflowMenu
import com.decathlon.vitamin.compose.appbars.dropdown.SearchActionItem
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import kotlin.math.min

object VitaminTopBars {
    private const val MAX_ACTIONS = 3

    @Composable
    fun Primary(
        title: String,
        modifier: Modifier = Modifier,
        maxActions: Int = 2,
        actions: List<ActionItem> = emptyList(),
        isContextualized: Boolean = false,
        expanded: MutableState<Boolean> = remember { mutableStateOf(false) },
        overflowIcon: (@Composable VitaminMenuIconButtons.() -> Unit)? = null,
        navigationIcon: (@Composable VitaminNavigationIconButtons.() -> Unit)? = null
    ) {
        val colors = if (isContextualized) VitaminTopBarsColors.contextual()
        else VitaminTopBarsColors.primary()
        CompositionLocalProvider(LocalVitaminTopBarColors provides colors) {
            TopAppBar(
                title = { Text(text = title) },
                modifier = modifier,
                navigationIcon = navigationIcon.takeOrNull(),
                actions = {
                    val showAsActionItems = actions.take(min(MAX_ACTIONS, maxActions))
                    val overflowItems = actions.subtract(showAsActionItems.toSet())
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

    @Composable
    fun Search(
        value: String,
        placeholder: String,
        modifier: Modifier = Modifier,
        isEnabled: Boolean = true,
        actions: List<SearchActionItem> = emptyList(),
        textStyle: TextStyle = VitaminTheme.typography.body2,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        keyboardActions: KeyboardActions = KeyboardActions.Default,
        navigationIcon: @Composable VitaminSearchNavigationIconButtons.() -> Unit,
        onValueChange: (String) -> Unit
    ) {
        val colors = VitaminTopBarsColors.search()
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
                    enabled = isEnabled,
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
                                    modifier = Modifier.fillMaxHeight().weight(1f),
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

internal val LocalVitaminTopBarColors = compositionLocalOf<TopBarsColors> {
    error("No TopBarsColors provided")
}

internal fun (@Composable VitaminNavigationIconButtons.() -> Unit)?.takeOrNull(): (@Composable () -> Unit)? {
    if (this == null) return null
    return {
        VitaminNavigationIconButtons.this()
    }
}
