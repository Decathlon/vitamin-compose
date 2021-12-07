package com.decathlon.vitamin.compose.appbars.dropdown

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

data class DropdownItem(
    val startIcon: Painter? = null,
    val startContentDescription: String? = null,
    val endIcon: Painter? = null,
    val endContentDescription: String? = null
)

@Composable
internal fun VitaminDropdownItem(
    onClick: () -> Unit,
    modifier: Modifier   = Modifier,
    item: DropdownItem? = null,
    enabled: Boolean = true,
    contentPadding: PaddingValues = MenuDefaults.DropdownMenuItemContentPadding,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    style: TextStyle = VitaminTheme.typography.subtitle1,
    colors: DropdownItemColors = VitaminDropdownItemColors.primary(),
    content: @Composable () -> Unit
) {
    VitaminDropdownItemContent(
        onClick = onClick,
        modifier = modifier.background(color = colors.background),
        enabled = enabled,
        contentPadding = contentPadding,
        interactionSource = interactionSource,
        style = style.copy(color = colors.contentColor),
        startIcon = if (item?.startIcon != null) {
            {
                Icon(
                    painter = item.startIcon,
                    contentDescription = item.startContentDescription,
                    tint = colors.iconColor
                )
            }
        } else null,
        endIcon = if (item?.endIcon != null) {
            {
                Icon(
                    painter = item.endIcon,
                    contentDescription = item.endContentDescription,
                    tint = colors.iconColor
                )
            }
        } else null,
        content = content
    )
}

@Composable
internal fun VitaminDropdownItemContent(
    onClick: () -> Unit,
    modifier: Modifier   = Modifier,
    startIcon: (@Composable () -> Unit)? = null,
    endIcon: (@Composable () -> Unit)? = null,
    enabled: Boolean = true,
    contentPadding: PaddingValues = MenuDefaults.DropdownMenuItemContentPadding,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    style: TextStyle = VitaminTheme.typography.subtitle1,
    content: @Composable () -> Unit
) {
    DropdownMenuItem(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        contentPadding = contentPadding,
        interactionSource = interactionSource,
        content = {
            ProvideTextStyle(style) {
                if (startIcon != null) {
                    startIcon()
                    Spacer(modifier = Modifier.width(32.dp))
                }
                Box(modifier = Modifier.weight(1f)) {
                    content()
                }
                if (endIcon != null) {
                    endIcon()
                }
            }
        }
    )
}
