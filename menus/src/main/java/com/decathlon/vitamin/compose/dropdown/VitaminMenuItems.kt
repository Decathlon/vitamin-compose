package com.decathlon.vitamin.compose.dropdown

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.ContentAlpha
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.LocalContentColor
import androidx.compose.material.MenuDefaults
import androidx.compose.material.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object VitaminMenuItems {
    /**
     * Dropdown menu item should be declared inside the dropdown menu.
     * @param onClick The callback to be called when the user click on the dropdown item
     * @param modifier The [Modifier] to be applied to this BottomNavigation
     * @param enabled True if you can click on the button, otherwise false
     * @param interactionSource Representing the stream of interaction for the dropdown item
     * @param colors The colors of the background and the content elements
     * @param contentPadding The padding applied to the content of this menu item
     * @param startIcon Icon displayed at the beginning of the dropdown item
     * @param endIcon Icon displayed at the end of the dropdown item
     * @param content Option label displayed in the center of the dropdown item
     */
    @Composable
    fun PrimaryItem(
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        colors: MenuItemColors = VitaminMenuItemColors.primary(),
        contentPadding: PaddingValues = MenuDefaults.DropdownMenuItemContentPadding,
        startIcon: (@Composable () -> Unit)? = null,
        endIcon: (@Composable () -> Unit)? = null,
        content: @Composable () -> Unit
    ) {
        DropdownMenuItem(
            onClick = onClick,
            modifier = modifier.background(color = colors.background),
            enabled = enabled,
            contentPadding = contentPadding,
            interactionSource = interactionSource,
            content = {
                ProvideTextStyle(
                    VitaminTheme.typography.subtitle1
                        .copy(color = colors.contentColor)
                ) {
                    if (startIcon != null) {
                        CompositionLocalProvider(
                            LocalContentColor provides colors.iconColor,
                            LocalContentAlpha provides ContentAlpha.high
                        ) {
                            startIcon()
                        }
                        Spacer(modifier = Modifier.width(32.dp))
                    }
                    Box(modifier = Modifier.weight(1f)) {
                        content()
                    }
                    if (endIcon != null) {
                        CompositionLocalProvider(
                            LocalContentColor provides colors.iconColor,
                            LocalContentAlpha provides ContentAlpha.high
                        ) {
                            endIcon()
                        }
                    }
                }
            }
        )
    }
}
