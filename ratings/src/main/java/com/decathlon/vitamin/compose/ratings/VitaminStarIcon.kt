package com.decathlon.vitamin.compose.ratings

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role

@Composable
internal fun VitaminStarIcon(
    icon: Icon,
    tint: Color,
    onClick: (() -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val selectableModifier = if (onClick != null) {
        Modifier.selectable(
            selected = icon != Icon.Empty,
            onClick = onClick,
            enabled = enabled,
            role = Role.RadioButton,
            interactionSource = interactionSource,
            indication = null
        )
    } else {
        Modifier
    }
    Icon(
        imageVector = icon.imageVector,
        contentDescription = null,
        modifier = modifier.then(selectableModifier),
        tint = tint
    )
}
