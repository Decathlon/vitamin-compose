package com.decathlon.vitamin.compose.appbars.topbars.icons

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.ContentAlpha
import androidx.compose.material.IconButton
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.decathlon.vitamin.compose.appbars.topbars.LocalVitaminTopBarColors
import com.decathlon.vitamin.compose.appbars.topbars.TopBarColors

@Composable
internal fun IconButtons(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: TopBarColors = LocalVitaminTopBarColors.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    icon: @Composable () -> Unit
) {
    IconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        interactionSource = interactionSource
    ) {
        val color =
            if (enabled || colors.disabledIconColor == null) colors.iconColor else colors.disabledIconColor
        CompositionLocalProvider(
            LocalContentColor provides color,
            LocalContentAlpha provides ContentAlpha.high
        ) {
            icon()
        }
    }
}
