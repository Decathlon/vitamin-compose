package com.decathlon.vitamin.compose.appbars.topbars.icons

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.decathlon.vitamin.compose.appbars.R

object VitaminNavigationIconButtons {
    @Composable
    fun PreviousPage(
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
                    painter = painterResource(R.drawable.ic_vtmn_arrow_left_s_line),
                    contentDescription = contentDescription
                )
            }
        )
    }

    @Composable
    fun Drawer(
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
                    painter = painterResource(R.drawable.ic_vtmn_menu_line),
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
    ) {
        IconButtons(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            interactionSource = interactionSource,
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_vtmn_arrow_left_line),
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
                    painter = painterResource(R.drawable.ic_vtmn_close_line),
                    contentDescription = contentDescription
                )
            }
        )
    }
}
