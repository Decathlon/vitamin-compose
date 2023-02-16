package com.decathlon.vitamin.compose.appbars.topbars.icons

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.vitaminicons.Line
import com.decathlon.vitamin.compose.vitaminicons.line.More2

object VitaminMenuIconButtons {
    @Composable
    fun More(
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
                    imageVector = VitaminIcons.Line.More2,
                    contentDescription = contentDescription
                )
            }
        )
    }
}
