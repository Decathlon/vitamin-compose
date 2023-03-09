package com.decathlon.vitamin.compose.textinputs

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.vitaminicons.Line
import com.decathlon.vitamin.compose.vitaminicons.line.ChevronDown

object VitaminTextInputDropdownIconButtons {
    @Composable
    fun Expand(
        onClick: () -> Unit,
        contentDescription: String?,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    ) {
        IconButton(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            interactionSource = interactionSource
        ) {
            Icon(
                imageVector = VitaminIcons.Line.ChevronDown,
                contentDescription = contentDescription
            )
        }
    }
}
