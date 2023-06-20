package com.decathlon.vitamin.compose.modals.impl

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import com.decathlon.vitamin.compose.modals.ModalButtonsOrientation
import com.decathlon.vitamin.compose.modals.VitaminModalButtons

@Composable
internal fun ModalButtons(
    confirmationButton: (@Composable VitaminModalButtons.() -> Unit),
    dismissButton: (@Composable VitaminModalButtons.() -> Unit)?,
    thirdButton: (@Composable VitaminModalButtons.() -> Unit)?,
    buttonsOrientation: ModalButtonsOrientation,
    topPadding: Dp,
    buttonsSpacer: Dp,
    modifier: Modifier = Modifier,
) {
    if (buttonsOrientation == ModalButtonsOrientation.HORIZONTAL) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(top = topPadding),
            horizontalArrangement = Arrangement.End
        ) {
            if (thirdButton != null) {
                thirdButton.takeOrNull()?.invoke()
                Spacer(
                    modifier = Modifier
                        .weight(weight = 1f)
                )
            }
            if (dismissButton != null) {
                dismissButton.takeOrNull()?.invoke()
                Spacer(
                    modifier = Modifier
                        .width(width = buttonsSpacer)
                )
            }
            confirmationButton.takeOrNull()?.invoke()
        }
    } else {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(top = topPadding),
            horizontalAlignment = Alignment.End
        ) {
            confirmationButton.takeOrNull()?.invoke()
            if (dismissButton != null) {
                Spacer(
                    modifier = Modifier
                        .height(height = buttonsSpacer)
                )
                dismissButton.takeOrNull()?.invoke()
            }
            if (thirdButton != null) {
                Spacer(
                    modifier = Modifier
                        .height(height = buttonsSpacer)
                )
                thirdButton.takeOrNull()?.invoke()
            }
        }
    }
}

private fun (@Composable VitaminModalButtons.() -> Unit)?.takeOrNull(): (@Composable () -> Unit)? {
    if (this == null) return null
    return {
        VitaminModalButtons.this()
    }
}
