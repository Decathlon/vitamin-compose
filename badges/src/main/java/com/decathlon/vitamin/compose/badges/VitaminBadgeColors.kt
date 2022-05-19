package com.decathlon.vitamin.compose.badges

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

/**
 * Badge color
 *
 * @property backgroundColor
 * @property contentColor
 */
@Immutable
data class BadgeColors(
    val backgroundColor: Color,
    val contentColor: Color
)

object VitaminBadgeColors {
    /**
     * Default color
     *
     * @param backgroundColor
     * @param contentColor
     */
    @Composable
    fun default(
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundTertiary,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimary
    ): BadgeColors = remember(backgroundColor, contentColor) {
        BadgeColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }

    /**
     * Accent color
     *
     * @param backgroundColor
     * @param contentColor
     */
    @Composable
    fun accent(
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundAccent,
        contentColor: Color = VitaminTheme.colors.vtmnContentAccent
    ): BadgeColors = remember(backgroundColor, contentColor) {
        BadgeColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }

    /**
     * Brand color
     *
     * @param backgroundColor
     * @param contentColor
     */
    @Composable
    fun brand(
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundBrandPrimary,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimaryReversed
    ): BadgeColors = remember(backgroundColor, contentColor) {
        BadgeColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }

    /**
     * Reversed color
     *
     * @param backgroundColor
     * @param contentColor
     */
    @Composable
    fun reversed(
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundBrandPrimaryReversed,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimary
    ): BadgeColors = remember(backgroundColor, contentColor) {
        BadgeColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }

    /**
     * Alert color
     *
     * @param backgroundColor
     * @param contentColor
     */
    @Composable
    fun alert(
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundDiscount,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimaryReversed
    ): BadgeColors = remember(backgroundColor, contentColor) {
        BadgeColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }
}
