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

internal object ModalButtons {

    @Composable
    internal fun Buttons(
        modifier: Modifier,
        right: (@Composable () -> Unit),
        middle: (@Composable () -> Unit)?,
        left: (@Composable () -> Unit)?,
        buttonsOrientation: ModalButtonsOrientation,
        topPadding: Dp,
        buttonsSpacer: Dp
    ) {
        if (buttonsOrientation == ModalButtonsOrientation.HORIZONTAL) {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = topPadding),
                horizontalArrangement = Arrangement.End
            ) {
                if (left != null) {
                    left.invoke()
                    Spacer(
                        modifier = Modifier
                            .weight(weight = 1f)
                    )
                }
                if (middle != null) {
                    middle.invoke()
                    Spacer(
                        modifier = Modifier
                            .width(width = buttonsSpacer)
                    )
                }
                right.invoke()
            }
        } else {
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = topPadding),
                horizontalAlignment = Alignment.End
            ) {
                right.invoke()
                if (middle != null) {
                    Spacer(
                        modifier = Modifier
                            .height(height = buttonsSpacer)
                    )
                    middle.invoke()
                }
                if (left != null) {
                    Spacer(
                        modifier = Modifier
                            .height(height = buttonsSpacer)
                    )
                    left.invoke()
                }
            }
        }
    }
}
