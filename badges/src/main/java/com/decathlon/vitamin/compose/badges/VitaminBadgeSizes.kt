package com.decathlon.vitamin.compose.badges

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

/**
 * Badge size
 * Model used to manage badge size, padding and radius
 *
 * @property horizontalPadding
 * @property verticalPadding
 * @property badgeHorizontalOffset
 * @property radius
 * @property textStyle
 */
@Immutable
data class BadgeSizes(
    val horizontalPadding: Dp,
    val verticalPadding: Dp,
    val badgeHorizontalOffset: Dp,
    val radius: Dp,
    val textStyle: TextStyle
)

/**
 * Badge size object
 * This object provide 3 default vitamin badge size
 *
 */
object VitaminBadgeSizes {
    /**
     * Large size
     *
     * @param horizontalPadding
     * @param verticalPadding
     * @param badgeHorizontalOffset
     * @param radius
     * @param textStyle
     */
    @Composable
    fun large(
        horizontalPadding: Dp = 6.dp,
        verticalPadding: Dp = 5.dp,
        @Suppress("MagicNumber")
        badgeHorizontalOffset: Dp = (-5).dp,
        radius: Dp = 14.dp,
        textStyle: TextStyle = VitaminTheme.typography.text3.copy(
            fontWeight = FontWeight.W700
        )
    ): BadgeSizes = remember(
        horizontalPadding,
        verticalPadding,
        badgeHorizontalOffset,
        radius,
        textStyle
    ) {
        BadgeSizes(
            horizontalPadding = horizontalPadding,
            verticalPadding = verticalPadding,
            badgeHorizontalOffset = badgeHorizontalOffset,
            radius = radius,
            textStyle = textStyle
        )
    }

    /**
     * Medium size
     *
     * @param horizontalPadding
     * @param verticalPadding
     * @param badgeHorizontalOffset
     * @param radius
     * @param textStyle
     */
    @Composable
    fun medium(
        horizontalPadding: Dp = 5.dp,
        verticalPadding: Dp = 3.dp,
        @Suppress("MagicNumber")
        badgeHorizontalOffset: Dp = (-5).dp,
        radius: Dp = 12.dp,
        textStyle: TextStyle = VitaminTheme.typography.caption.copy(
            fontWeight = FontWeight.W700
        )
    ): BadgeSizes = remember(
        horizontalPadding,
        verticalPadding,
        badgeHorizontalOffset,
        radius,
        textStyle
    ) {
        BadgeSizes(
            horizontalPadding = horizontalPadding,
            verticalPadding = verticalPadding,
            badgeHorizontalOffset = badgeHorizontalOffset,
            radius = radius,
            textStyle = textStyle
        )
    }

    /**
     * Small size
     *
     * @param horizontalPadding
     * @param verticalPadding
     * @param badgeHorizontalOffset
     * @param radius
     * @param textStyle
     */
    @Composable
    fun small(
        horizontalPadding: Dp = 4.dp,
        verticalPadding: Dp = 2.dp,
        @Suppress("MagicNumber")
        badgeHorizontalOffset: Dp = (-6).dp,
        radius: Dp = 8.dp,
        textStyle: TextStyle = VitaminTheme.typography.caption.copy(
            fontSize = 8.sp,
            fontWeight = FontWeight.W700
        )
    ): BadgeSizes = remember(
        horizontalPadding,
        verticalPadding,
        badgeHorizontalOffset,
        radius,
        textStyle
    ) {
        BadgeSizes(
            horizontalPadding = horizontalPadding,
            verticalPadding = verticalPadding,
            badgeHorizontalOffset = badgeHorizontalOffset,
            radius = radius,
            textStyle = textStyle
        )
    }
}
