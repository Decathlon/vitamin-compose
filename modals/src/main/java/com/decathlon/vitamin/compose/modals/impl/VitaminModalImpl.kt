package com.decathlon.vitamin.compose.modals.impl

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.window.Dialog
import com.decathlon.vitamin.compose.modals.ModalButtonsOrientation
import com.decathlon.vitamin.compose.modals.ModalColors
import com.decathlon.vitamin.compose.modals.ModalSizes

@Composable
internal fun VitaminModalImpl(
    content: @Composable (() -> Unit),
    onDismissRequest: () -> Unit,
    modifier: Modifier,
    title: String?,
    painter: Painter?,
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
                    painter = painter,
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
