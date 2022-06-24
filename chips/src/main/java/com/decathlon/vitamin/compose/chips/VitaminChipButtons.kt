package com.decathlon.vitamin.compose.chips

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

object VitaminChipButtons {
    @Composable
    fun Close(
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        contentDescription: String?,
        enabled: Boolean = true,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
    ) {
        IconButton(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            interactionSource = interactionSource
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_vtmn_close_line),
                contentDescription = contentDescription
            )
        }
    }
}

