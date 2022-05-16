package com.decathlon.vitamin.compose.tags

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

class VitaminTagColor(
    val backgroundColor: Color,
    val textColor: Color
)

/**
 * Colors that can be used to colored [VitaminTag]
 */
object VitaminTagColors {
    val accent: VitaminTagColor
        @Composable
        get() = VitaminTagColor(
            VitaminTheme.colors.vtmnBackgroundAccent,
            VitaminTheme.colors.vtmnContentAccent
        )

    val alert: VitaminTagColor
        @Composable
        get() = VitaminTagColor(
            VitaminTheme.colors.vtmnBackgroundDiscount,
            VitaminTheme.colors.vtmnContentPrimaryReversed
        )

    val brand: VitaminTagColor
        @Composable
        get() = VitaminTagColor(
            VitaminTheme.colors.vtmnBackgroundBrandPrimary,
            VitaminTheme.colors.vtmnContentPrimaryReversed
        )

    val decorativeAmethyst: VitaminTagColor
        @Composable
        get() = VitaminTagColor(
            VitaminTheme.colors.vtmnDecorativeAmethyst,
            VitaminTheme.colors.vtmnContentPrimary
        )

    val decorativeBrick: VitaminTagColor
        @Composable
        get() = VitaminTagColor(
            VitaminTheme.colors.vtmnDecorativeBrick,
            VitaminTheme.colors.vtmnContentPrimary
        )

    val decorativeCobalt: VitaminTagColor
        @Composable
        get() = VitaminTagColor(
            VitaminTheme.colors.vtmnDecorativeCobalt,
            VitaminTheme.colors.vtmnContentPrimary
        )

    val decorativeEmerald: VitaminTagColor
        @Composable
        get() = VitaminTagColor(
            VitaminTheme.colors.vtmnDecorativeEmerald,
            VitaminTheme.colors.vtmnContentPrimary
        )

    val decorativeGold: VitaminTagColor
        @Composable
        get() = VitaminTagColor(
            VitaminTheme.colors.vtmnDecorativeGold,
            VitaminTheme.colors.vtmnContentPrimary
        )

    val decorativeGravel: VitaminTagColor
        @Composable
        get() = VitaminTagColor(
            VitaminTheme.colors.vtmnDecorativeGravel,
            VitaminTheme.colors.vtmnContentPrimary
        )

    val decorativeJade: VitaminTagColor
        @Composable
        get() = VitaminTagColor(
            VitaminTheme.colors.vtmnDecorativeJade,
            VitaminTheme.colors.vtmnContentPrimary
        )

    val decorativeSaffron: VitaminTagColor
        @Composable
        get() = VitaminTagColor(
            VitaminTheme.colors.vtmnDecorativeSaffron,
            VitaminTheme.colors.vtmnContentPrimary
        )
}
