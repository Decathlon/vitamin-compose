package com.decathlon.vitamin.compose.modals

import androidx.annotation.DrawableRes
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.LocalContentColor
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object VitaminModals {
    /**
     * The default modal used to provide critical information or ask for decision.
     * @param content The content to be displayed below the title
     * @param onDismissRequest The callback to be called when the user need to dismiss the modal
     * @param modifier The `Modifier` to be applied to the component
     * @param title The optional title to be displayed at the top of the modal
     * @param iconRes The optional leading icon to be displayed at the start of the title
     * @param contentScrollState The optional scroll state to observe the scrolling
     * @param positiveButton The optional positive button to be displayed at the bottom of the modal
     * @param negativeButton The optional negative button to be displayed at the bottom of the modal
     * @param neutralButton The optional neutral button to be displayed at the bottom of the modal
     * @param buttonsOrientation The optional buttons orientation to display buttons vertically or horizontally
     * @param sizes The optional sizes used to define modal padding, spacers sizes and icon size
     * @param colors The optional sizes used to define colors of icon, title, content and background of the modal
     */
    @Composable
    fun Default(
        content: @Composable (() -> Unit),
        onDismissRequest: () -> Unit,
        modifier: Modifier = Modifier,
        title: String? = null,
        @DrawableRes iconRes: Int? = null,
        contentScrollState: ScrollState = rememberScrollState(),
        positiveButton: (@Composable VitaminModalButtons.() -> Unit)? = null,
        negativeButton: (@Composable VitaminModalButtons.() -> Unit)? = null,
        neutralButton: (@Composable VitaminModalButtons.() -> Unit)? = null,
        buttonsOrientation: ModalButtonsOrientation = ModalButtonsOrientation.HORIZONTAL,
        sizes: ModalSizes = VitaminModalSizes.default(),
        colors: ModalColors = VitaminModalColors.default()
    ) {
        VitaminModal(
            content = content,
            onDismissRequest = onDismissRequest,
            modifier = modifier,
            title = title,
            iconRes = iconRes,
            contentScrollState = contentScrollState,
            positiveButton = positiveButton?.takeOrNull(),
            negativeButton = negativeButton?.takeOrNull(),
            neutralButton = neutralButton?.takeOrNull(),
            buttonsOrientation = buttonsOrientation,
            sizes = sizes,
            colors = colors
        )
    }
}

@Composable
internal fun VitaminModal(
    content: @Composable (() -> Unit),
    onDismissRequest: () -> Unit,
    modifier: Modifier,
    title: String?,
    @DrawableRes iconRes: Int?,
    contentScrollState: ScrollState,
    positiveButton: (@Composable () -> Unit)?,
    negativeButton: (@Composable () -> Unit)?,
    neutralButton: (@Composable () -> Unit)?,
    buttonsOrientation: ModalButtonsOrientation,
    sizes: ModalSizes,
    colors: ModalColors
) {
    Dialog(
        onDismissRequest = onDismissRequest,
        content = {
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .background(
                        color = colors.background
                    )
                    .padding(
                        horizontal = sizes.horizontalPadding,
                        vertical = sizes.verticalPadding
                    )
            ) {
                Title(
                    modifier = modifier,
                    iconRes = iconRes,
                    iconColor = colors.iconColor,
                    iconSize = sizes.iconSize,
                    title = title,
                    titleColor = colors.titleColor,
                    bottomPadding = sizes.spacerSize
                )
                Column(
                    modifier = modifier
                        .verticalScroll(contentScrollState)
                        .weight(
                            weight = 1F,
                            fill = false
                        )
                        .wrapContentHeight()
                ) {
                    Content(
                        content = content,
                        contentColor = colors.contentColor
                    )
                }
                Buttons(
                    modifier = modifier,
                    positiveButton = positiveButton,
                    negativeButton = negativeButton,
                    neutralButton = neutralButton,
                    buttonsOrientation = buttonsOrientation,
                    topPadding = sizes.spacerSize
                )
            }
        }
    )
}

@Composable
internal fun Title(
    modifier: Modifier,
    @DrawableRes iconRes: Int?,
    iconColor: Color,
    iconSize: Dp,
    title: String?,
    titleColor: Color,
    bottomPadding: Dp
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        val hasIconAndText = iconRes != null && title != null
        val hasIconOrText = iconRes != null || title != null
        if (hasIconOrText) {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(
                        bottom = bottomPadding
                    )
            ) {
                iconRes?.let {
                    Icon(
                        modifier = modifier
                            .size(size = iconSize),
                        painter = painterResource(id = it),
                        contentDescription = null,
                        tint = iconColor
                    )
                }
                if (hasIconAndText) {
                    Spacer(
                        modifier = modifier.width(8.dp)
                    )
                }
                title?.let {
                    Text(
                        text = it,
                        color = titleColor,
                        style = VitaminTheme.typography.subtitle1
                    )
                }
            }
        }
    }
}

@Composable
internal fun Content(
    contentColor: Color,
    content: @Composable (() -> Unit)? = null
) {
    content?.let {
        CompositionLocalProvider(
            LocalContentColor provides contentColor,
            LocalTextStyle provides VitaminTheme.typography.body3
        ) {
            it.invoke()
        }
    }
}

@Composable
internal fun Buttons(
    modifier: Modifier,
    positiveButton: (@Composable () -> Unit)?,
    negativeButton: (@Composable () -> Unit)?,
    neutralButton: (@Composable () -> Unit)?,
    buttonsOrientation: ModalButtonsOrientation,
    topPadding: Dp
) {
    if (buttonsOrientation == ModalButtonsOrientation.HORIZONTAL) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(top = topPadding),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            neutralButton?.invoke()
            negativeButton?.invoke()
            positiveButton?.invoke()
        }
    } else {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(top = topPadding),
            horizontalAlignment = Alignment.End
        ) {
            positiveButton?.invoke()
            negativeButton?.invoke()
            neutralButton?.invoke()
        }
    }
}

internal fun (@Composable VitaminModalButtons.() -> Unit)?.takeOrNull(): (@Composable () -> Unit)? {
    if (this == null) return null
    return {
        VitaminModalButtons.this()
    }
}
