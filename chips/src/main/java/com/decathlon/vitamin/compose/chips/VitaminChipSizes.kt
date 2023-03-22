package com.decathlon.vitamin.compose.chips

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
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
     * Size of the spacing between an icon and a text when they used inside a [VitaminChips].
     */
    val innerSpacing: Dp,

    /**
     * Vertical spacing (top & bottom padding) inside a [VitaminChips].
     */
    val verticalPadding: Dp,

    /**
     * Horizontal spacing for the text (start & end padding) inside a [VitaminChips].
     */
    val horizontalPadding: Dp,

    /**
     * Horizontal spacing for icons (start & end padding) inside a [VitaminChips].
     */
    val horizontalIconPadding: Dp,

    /**
     * Width of the [VitaminChips].
     */
    val borderWidth: Dp
)

private val MaterialHorizontalPadding = 12.dp
private val MaterialLeadingIconStartSpacing = 4.dp
private val MaterialTrailingIconSpacing = 4.dp

internal fun ChipSizes.horizontalSpacing() =
    this.horizontalPadding - MaterialHorizontalPadding

internal fun ChipSizes.leadingIconStartSpacing() =
    this.horizontalIconPadding - MaterialLeadingIconStartSpacing

internal fun ChipSizes.trailingIconSpacing() =
    this.horizontalIconPadding - MaterialTrailingIconSpacing

object VitaminChipSizes {
    @Composable
    fun small(
        fontSize: TextUnit = VitaminTheme.typography.text3.fontSize,
        fontWeight: FontWeight = FontWeight.W700,
        iconSize: Dp = 20.dp,
        innerSpacing: Dp = 8.dp,
        verticalPadding: Dp = 6.dp,
        horizontalPadding: Dp = 12.dp,
        horizontalIconPadding: Dp = 8.dp,
        borderWidth: Dp = 1.dp
    ) = remember(
        fontSize,
        fontWeight,
        iconSize,
        innerSpacing,
        verticalPadding,
        horizontalPadding,
        horizontalIconPadding,
        borderWidth
    ) {
        ChipSizes(
            fontSize = fontSize,
            fontWeight = fontWeight,
            iconSize = iconSize,
            innerSpacing = innerSpacing,
            verticalPadding = verticalPadding,
            horizontalPadding = horizontalPadding,
            horizontalIconPadding = horizontalIconPadding,
            borderWidth = borderWidth
        )
    }

    @Composable
    fun medium(
        fontSize: TextUnit = VitaminTheme.typography.text2.fontSize,
        fontWeight: FontWeight = FontWeight.W700,
        iconSize: Dp = 20.dp,
        innerSpacing: Dp = 8.dp,
        verticalPadding: Dp = 8.dp,
        horizontalPadding: Dp = 16.dp,
        horizontalIconPadding: Dp = 10.dp,
        borderWidth: Dp = 1.dp
    ) = remember(
        fontSize,
        fontWeight,
        iconSize,
        verticalPadding,
        innerSpacing,
        horizontalPadding,
        horizontalIconPadding,
        borderWidth
    ) {
        ChipSizes(
            fontSize = fontSize,
            fontWeight = fontWeight,
            iconSize = iconSize,
            innerSpacing = innerSpacing,
            verticalPadding = verticalPadding,
            horizontalPadding = horizontalPadding,
            horizontalIconPadding = horizontalIconPadding,
            borderWidth = borderWidth
        )
    }
}
