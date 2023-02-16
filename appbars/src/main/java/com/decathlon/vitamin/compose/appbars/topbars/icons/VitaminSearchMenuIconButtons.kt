package com.decathlon.vitamin.compose.appbars.topbars.icons

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.vitaminicons.Line
import com.decathlon.vitamin.compose.vitaminicons.line.Close
import com.decathlon.vitamin.compose.vitaminicons.line.Mic

internal object VitaminSearchMenuIconButtons {
    @Composable
    fun Microphone(
        onClick: () -> Unit,
        contentDescription: String?,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
    ) {
        IconButtons(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            interactionSource = interactionSource,
            icon = {
                Icon(
                    imageVector = VitaminIcons.Line.Mic,
                    contentDescription = contentDescription
                )
            }
        )
    }

    @Composable
    fun Close(
        onClick: () -> Unit,
        contentDescription: String?,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    ) {
        IconButtons(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            interactionSource = interactionSource,
            icon = {
                Icon(
                    imageVector = VitaminIcons.Line.Close,
                    contentDescription = contentDescription
                )
            }
        )
    }
}
