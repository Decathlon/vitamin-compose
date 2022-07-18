package com.decathlon.vitamin.compose.badges

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.decathlon.vitamin.compose.badges.internals.LayoutId
import com.decathlon.vitamin.compose.badges.internals.VitaminCountBadgeImpl

object VitaminCountBadges {
    /**
     * Default
     * @param count the text inside de badge
     * @param modifier The [Modifier] to be applied to the component
     * @param nbMaxChar the number of digit that you want before "+" (nbMaxChar = 2, count= 110, result = 99+ )
     * @param colors the colors of the background and text
     * @param sizes the sizes of the text and padding
     * @param anchor the icon or content which own the badge
     */
    @Composable
    fun Default(
        count: Int,
        modifier: Modifier = Modifier,
        nbMaxChar: Int = LayoutId.defaultMaxChar,
        colors: BadgeColors = VitaminBadgeColors.default(),
        sizes: BadgeSizes = VitaminBadgeSizes.small(),
        anchor: @Composable BoxScope.() -> Unit,
    ) = VitaminCountBadgeImpl(
        count = count,
        modifier = modifier,
        colors = colors,
        nbMaxChar = nbMaxChar,
        anchor = anchor,
        sizes = sizes,
    )

    /**
     * Accent
     * @param count the text inside de badge
     * @param modifier The [Modifier] to be applied to the component
     * @param nbMaxChar the number of digit that you want before "+" (nbMaxChar = 2, count= 110, result = 99+ )
     * @param colors the colors of the background and text
     * @param sizes the sizes of the text and padding
     * @param anchor the icon or content which own the badge
     */
    @Composable
    fun Accent(
        count: Int,
        modifier: Modifier = Modifier,
        nbMaxChar: Int = LayoutId.defaultMaxChar,
        colors: BadgeColors = VitaminBadgeColors.accent(),
        sizes: BadgeSizes = VitaminBadgeSizes.small(),
        anchor: @Composable BoxScope.() -> Unit,
    ) = VitaminCountBadgeImpl(
        count = count,
        modifier = modifier,
        colors = colors,
        nbMaxChar = nbMaxChar,
        anchor = anchor,
        sizes = sizes
    )

    /**
     * Brand
     * @param count the text inside de badge
     * @param modifier The [Modifier] to be applied to the component
     * @param nbMaxChar the number of digit that you want before "+" (nbMaxChar = 2, count= 110, result = 99+ )
     * @param colors the colors of the background and text
     * @param sizes the sizes of the text and padding
     * @param anchor the icon or content which own the badge
     */
    @Composable
    fun Brand(
        count: Int,
        modifier: Modifier = Modifier,
        nbMaxChar: Int = LayoutId.defaultMaxChar,
        colors: BadgeColors = VitaminBadgeColors.brand(),
        sizes: BadgeSizes = VitaminBadgeSizes.small(),
        anchor: @Composable BoxScope.() -> Unit,
    ) = VitaminCountBadgeImpl(
        count = count,
        modifier = modifier,
        colors = colors,
        nbMaxChar = nbMaxChar,
        anchor = anchor,
        sizes = sizes,
    )

    /**
     * Reversed
     * @param count the text inside de badge
     * @param modifier The [Modifier] to be applied to the component
     * @param nbMaxChar the number of digit that you want before "+" (nbMaxChar = 2, count= 110, result = 99+ )
     * @param colors the colors of the background and text
     * @param sizes the sizes of the text and padding
     * @param anchor the icon or content which own the badge
     */
    @Composable
    fun Reversed(
        count: Int,
        modifier: Modifier = Modifier,
        nbMaxChar: Int = LayoutId.defaultMaxChar,
        colors: BadgeColors = VitaminBadgeColors.reversed(),
        sizes: BadgeSizes = VitaminBadgeSizes.small(),
        anchor: @Composable BoxScope.() -> Unit,
    ) = VitaminCountBadgeImpl(
        count = count,
        modifier = modifier,
        colors = colors,
        nbMaxChar = nbMaxChar,
        anchor = anchor,
        sizes = sizes,
    )

    /**
     * Alert
     * @param count the text inside de badge
     * @param modifier The [Modifier] to be applied to the component
     * @param nbMaxChar the number of digit that you want before "+" (nbMaxChar = 2, count= 110, result = 99+ )
     * @param colors the colors of the background and text
     * @param sizes the sizes of the text and padding
     * @param anchor the icon or content which own the badge
     */
    @Composable
    fun Alert(
        count: Int,
        modifier: Modifier = Modifier,
        nbMaxChar: Int = LayoutId.defaultMaxChar,
        colors: BadgeColors = VitaminBadgeColors.alert(),
        sizes: BadgeSizes = VitaminBadgeSizes.small(),
        anchor: @Composable BoxScope.() -> Unit,
    ) = VitaminCountBadgeImpl(
        count = count,
        modifier = modifier,
        colors = colors,
        nbMaxChar = nbMaxChar,
        anchor = anchor,
        sizes = sizes,
    )
}
