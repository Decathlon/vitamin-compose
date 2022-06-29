package com.decathlon.vitamin.compose.snackbars

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
data class SnackbarColors(
    val contentColor: Color,
    val backgroundColor: Color
)

object VitaminSnackbarColors {

    @Composable
    fun primary(
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimaryReversed,
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundPrimaryReversed
    ): SnackbarColors = remember(contentColor, backgroundColor) {
        SnackbarColors(
            contentColor = contentColor,
            backgroundColor = backgroundColor
        )
    }
}
