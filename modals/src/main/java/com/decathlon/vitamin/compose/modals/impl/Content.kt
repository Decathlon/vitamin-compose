package com.decathlon.vitamin.compose.modals.impl

import androidx.compose.material.LocalContentColor
import androidx.compose.material.LocalTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Composable
internal fun Content(
    contentColor: Color,
    content: @Composable (() -> Unit)? = null
) {
    content?.let {
        CompositionLocalProvider(
            LocalContentColor provides contentColor,
            LocalTextStyle provides VitaminTheme.typography.text3
        ) {
            it.invoke()
        }
    }
}
