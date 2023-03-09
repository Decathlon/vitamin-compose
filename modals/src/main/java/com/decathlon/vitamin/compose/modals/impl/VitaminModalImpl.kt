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
    title: String?,
    painter: Painter?,
    buttonsOrientation: ModalButtonsOrientation,
    colors: ModalColors,
    sizes: ModalSizes,
    contentScrollState: ScrollState,
    onDismissRequest: () -> Unit,
    content: @Composable (() -> Unit),
    positiveButton: (@Composable () -> Unit)?,
    negativeButton: (@Composable () -> Unit)?,
    neutralButton: (@Composable () -> Unit)?,
    modifier: Modifier = Modifier
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
                    painter = painter,
                    iconColor = colors.iconColor,
                    iconSize = sizes.iconSize,
                    title = title,
                    titleColor = colors.titleColor,
                    bottomPadding = sizes.spacerSize
                )
                Column(
                    modifier = Modifier
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
                    topPadding = sizes.spacerSize,
                    buttonsOrientation = buttonsOrientation,
                    positiveButton = positiveButton,
                    negativeButton = negativeButton,
                    neutralButton = neutralButton,
                )
            }
        }
    )
}
