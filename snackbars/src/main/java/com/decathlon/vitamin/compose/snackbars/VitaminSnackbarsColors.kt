package com.decathlon.vitamin.compose.snackbars

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

data class VitaminSnackbarsColor(
    val contentColor: Color,
    val backgroundColor: Color
)

object VitaminSnackbarsColors {
    val default: VitaminSnackbarsColor
        @Composable
        get() = VitaminSnackbarsColor(
            contentColor = VitaminTheme.colors.vtmnContentPrimaryReversed,
            backgroundColor = VitaminTheme.colors.vtmnBackgroundPrimaryReversed
        )
}
