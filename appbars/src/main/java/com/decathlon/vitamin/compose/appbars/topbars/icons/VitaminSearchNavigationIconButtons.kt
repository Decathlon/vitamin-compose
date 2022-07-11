package com.decathlon.vitamin.compose.appbars.topbars.icons

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.decathlon.vitamin.compose.appbars.R

object VitaminSearchNavigationIconButtons {
    @Composable
    fun Search(
        contentDescription: String?,
        modifier: Modifier = Modifier,
    ) {
        IconButtons(
            onClick = { },
            modifier = modifier,
            enabled = false,
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_vtmn_search_line),
                    contentDescription = contentDescription
                )
            }
        )
    }

    @Composable
    fun Context(
        onClick: () -> Unit,
        contentDescription: String?,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    ) = VitaminNavigationIconButtons.Context(
        onClick = onClick,
        modifier = modifier,
        contentDescription = contentDescription,
        enabled = enabled,
        interactionSource = interactionSource
    )
}
