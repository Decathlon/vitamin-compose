package com.decathlon.vitamin.compose.appbars

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

object VitaminNavigationIconButtons {
    @Composable
    fun PreviousPage(
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        contentDescription: String?,
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
        modifier: Modifier = Modifier,
        contentDescription: String?,
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
        modifier: Modifier = Modifier,
        contentDescription: String?,
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
        modifier: Modifier = Modifier,
        contentDescription: String?,
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

object VitaminSearchNavigationIconButtons {
    @Composable
    fun Search(
        modifier: Modifier = Modifier,
        contentDescription: String?
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
        modifier: Modifier = Modifier,
        contentDescription: String?,
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

object VitaminSearchMenuIconButtons {
    @Composable
    fun Microphone(
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        contentDescription: String?,
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
                    painter = painterResource(R.drawable.ic_vtmn_mic_vtmn_line),
                    contentDescription = contentDescription,
                )
            }
        )
    }

    @Composable
    fun Close(
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        contentDescription: String?,
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
                    contentDescription = contentDescription,
                )
            }
        )
    }
}

object VitaminMenuIconButtons {
    @Composable
    fun More(
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        contentDescription: String?,
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
                    painter = painterResource(R.drawable.ic_vtmn_more_2_line),
                    contentDescription = contentDescription
                )
            }
        )
    }
}

@Composable
internal fun IconButtons(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: TopBarsColors = LocalVitaminTopBarColors.current,
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
