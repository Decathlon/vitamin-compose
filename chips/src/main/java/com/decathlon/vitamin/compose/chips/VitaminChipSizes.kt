package com.decathlon.vitamin.compose.chips

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
data class ChipSizes(
    /**
     * Font size for the label inside a [VitaminChips].
     */
    val fontSize: TextUnit,

    /**
     * Font weight for the label inside a [VitaminChips].
     */
    val fontWeight: FontWeight,

    /**
     * Size of the icon when used inside a [VitaminChips].
     */
    val iconSize: Dp,

    /**
     * Horizontal spacing (start & end padding) inside a [VitaminChips].
     */
    val horizontalPadding: Dp,

    /**
     * Vertical spacing (top & bottom padding) inside a [VitaminChips].
     */
    val verticalPadding: Dp,

    /**
     * Size of the spacing between an icon and a text when they used inside a [VitaminChips].
     */
    val innerSpacing: Dp,

    /**
     * Width of the [VitaminChips].
     */
    val borderWidth: Dp
)

object VitaminChipSizes {
    @Composable
    fun small(
        fontSize: TextUnit = VitaminTheme.typography.body3.fontSize,
        fontWeight: FontWeight = FontWeight.W700,
        iconSize: Dp = 20.dp,
        horizontalPadding: Dp = 10.dp,
        verticalPadding: Dp = 6.dp,
        innerSpacing: Dp = 8.dp,
        borderWidth: Dp = 1.dp
    ) = ChipSizes(
        fontSize = fontSize,
        fontWeight = fontWeight,
        iconSize = iconSize,
        horizontalPadding = horizontalPadding,
        verticalPadding = verticalPadding,
        innerSpacing = innerSpacing,
        borderWidth = borderWidth
    )

    @Composable
    fun medium(
        fontSize: TextUnit = VitaminTheme.typography.body2.fontSize,
        fontWeight: FontWeight = FontWeight.W700,
        iconSize: Dp = 20.dp,
        horizontalPadding: Dp = 10.dp,
        verticalPadding: Dp = 8.dp,
        innerSpacing: Dp = 8.dp,
        borderWidth: Dp = 1.dp
    ) = ChipSizes(
        fontSize = fontSize,
        fontWeight = fontWeight,
        iconSize = iconSize,
        horizontalPadding = horizontalPadding,
        verticalPadding = verticalPadding,
        innerSpacing = innerSpacing,
        borderWidth = borderWidth
    )
}