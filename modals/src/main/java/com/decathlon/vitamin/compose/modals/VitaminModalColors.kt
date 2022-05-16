package com.decathlon.vitamin.compose.modals

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

class ModalColors(
    val background: Color,
    val iconColor: Color,
    val titleColor: Color,
    val contentColor: Color
)

object VitaminModalColors {
    @Composable
    fun default(
        background: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        iconColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        titleColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        contentColor: Color = VitaminTheme.colors.vtmnContentTertiary
    ) = ModalColors(
        background = background,
        iconColor = iconColor,
        titleColor = titleColor,
        contentColor = contentColor
    )
}
