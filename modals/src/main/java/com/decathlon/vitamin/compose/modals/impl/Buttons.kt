package com.decathlon.vitamin.compose.modals.impl

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import com.decathlon.vitamin.compose.modals.ModalButtonsOrientation

@Composable
internal fun Buttons(
    topPadding: Dp,
    buttonsOrientation: ModalButtonsOrientation,
    positiveButton: (@Composable () -> Unit)?,
    negativeButton: (@Composable () -> Unit)?,
    neutralButton: (@Composable () -> Unit)?,
    modifier: Modifier = Modifier,
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
