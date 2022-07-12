package com.decathlon.vitamin.compose.tags

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
data class TagColors(
    val backgroundColor: Color,
    val contentColor: Color
)

/**
 * Colors that can be used to colored [VitaminTags]
 */
@Suppress("TooManyFunctions")
object VitaminTagColors {
    @Composable
    fun accent(
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundAccent,
        contentColor: Color = VitaminTheme.colors.vtmnContentAccent
    ): TagColors = remember(backgroundColor, contentColor) {
        TagColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }

    @Composable
    fun alert(
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundDiscount,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimaryReversed
    ): TagColors = remember(backgroundColor, contentColor) {
        TagColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }

    @Composable
    fun brand(
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundBrandPrimary,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimaryReversed
    ): TagColors = remember(backgroundColor, contentColor) {
        TagColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }

    @Composable
    fun decorativeAmethyst(
        backgroundColor: Color = VitaminTheme.colors.vtmnDecorativeAmethyst,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimary
    ): TagColors = remember(backgroundColor, contentColor) {
        TagColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }

    @Composable
    fun decorativeBrick(
        backgroundColor: Color = VitaminTheme.colors.vtmnDecorativeBrick,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimary
    ): TagColors = remember(backgroundColor, contentColor) {
        TagColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }

    @Composable
    fun decorativeCobalt(
        backgroundColor: Color = VitaminTheme.colors.vtmnDecorativeCobalt,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimary
    ): TagColors = remember(backgroundColor, contentColor) {
        TagColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }

    @Composable
    fun decorativeEmerald(
        backgroundColor: Color = VitaminTheme.colors.vtmnDecorativeEmerald,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimary
    ): TagColors = remember(backgroundColor, contentColor) {
        TagColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }

    @Composable
    fun decorativeGold(
        backgroundColor: Color = VitaminTheme.colors.vtmnDecorativeGold,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimary
    ): TagColors = remember(backgroundColor, contentColor) {
        TagColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }

    @Composable
    fun decorativeGravel(
        backgroundColor: Color = VitaminTheme.colors.vtmnDecorativeGravel,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimary
    ): TagColors = remember(backgroundColor, contentColor) {
        TagColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }

    @Composable
    fun decorativeJade(
        backgroundColor: Color = VitaminTheme.colors.vtmnDecorativeJade,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimary
    ): TagColors = remember(backgroundColor, contentColor) {
        TagColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }

    @Composable
    fun decorativeSaffron(
        backgroundColor: Color = VitaminTheme.colors.vtmnDecorativeSaffron,
        contentColor: Color = VitaminTheme.colors.vtmnContentPrimary
    ): TagColors = remember(backgroundColor, contentColor) {
        TagColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        )
    }
}
