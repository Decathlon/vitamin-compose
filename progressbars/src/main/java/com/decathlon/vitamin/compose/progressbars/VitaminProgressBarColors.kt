package com.decathlon.vitamin.compose.progressbars

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
data class ProgressBarColors(
    val backgroundColor: Color,
    val progressColor: Color,
    val labelColor: Color
)

object VitaminProgressBarColors {
    @Composable
    fun primary(
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundTertiary,
        progressColor: Color = VitaminTheme.colors.vtmnContentActive,
        labelColor: Color = VitaminTheme.colors.vtmnContentPrimary
    ): ProgressBarColors = remember(backgroundColor, progressColor, labelColor) {
        ProgressBarColors(
            backgroundColor = backgroundColor,
            progressColor = progressColor,
            labelColor = labelColor
        )
    }
}
