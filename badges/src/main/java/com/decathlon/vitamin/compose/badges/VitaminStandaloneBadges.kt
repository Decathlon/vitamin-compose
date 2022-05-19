package com.decathlon.vitamin.compose.badges

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.decathlon.vitamin.compose.badges.internals.LayoutId
import com.decathlon.vitamin.compose.badges.internals.VitaminStandaloneBadgeImpl

object VitaminStandaloneBadges {
    /**
     * Default
     * @param count the text inside de badge
     * @param nbMaxChar the number of digit that you want before "+" (nbMaxChar = 2, count= 110, result = 99+ )
     * @param areHiddenItemsLeft check if the badge is use to hidden more elements ex (+4)
     * @param colors the colors of the background and text
     * @param sizes the sizes of the text and padding
     */
    @Composable
    fun Default(
        count: Int,
        modifier: Modifier = Modifier,
        nbMaxChar: Int = LayoutId.defaultMaxChar,
        areHiddenItemsLeft: Boolean = false,
        colors: BadgeColors = VitaminBadgeColors.default(),
        sizes: BadgeSizes = VitaminBadgeSizes.smallSize(),
    ) = VitaminStandaloneBadgeImpl(
        count = count,
        modifier = modifier,
        colors = colors,
        nbMaxChar = nbMaxChar,
        areHiddenItemsLeft = areHiddenItemsLeft,
        sizes = sizes,
    )

    /**
     * Accent
     * @param count the text inside de badge
     * @param nbMaxChar the number of digit that you want before "+" (nbMaxChar = 2, count= 110, result = 99+ )
     * @param areHiddenItemsLeft check if the badge is use to hidden more elements ex (+4)
     * @param colors the colors of the background and text
     * @param sizes the sizes of the text and padding
     */
    @Composable
    fun Accent(
        count: Int,
        modifier: Modifier = Modifier,
        nbMaxChar: Int = LayoutId.defaultMaxChar,
        areHiddenItemsLeft: Boolean = false,
        colors: BadgeColors = VitaminBadgeColors.accent(),
        sizes: BadgeSizes = VitaminBadgeSizes.smallSize(),
    ) = VitaminStandaloneBadgeImpl(
        count = count,
        modifier = modifier,
        colors = colors,
        nbMaxChar = nbMaxChar,
        areHiddenItemsLeft = areHiddenItemsLeft,
        sizes = sizes,
    )

    /**
     * Brand
     * @param count the text inside de badge
     * @param nbMaxChar the number of digit that you want before "+" (nbMaxChar = 2, count= 110, result = 99+ )
     * @param areHiddenItemsLeft check if the badge is use to hidden more elements ex (+4)
     * @param colors the colors of the background and text
     * @param sizes the sizes of the text and padding
     */
    @Composable
    fun Brand(
        count: Int,
        modifier: Modifier = Modifier,
        nbMaxChar: Int = LayoutId.defaultMaxChar,
        areHiddenItemsLeft: Boolean = false,
        colors: BadgeColors = VitaminBadgeColors.brand(),
        sizes: BadgeSizes = VitaminBadgeSizes.smallSize(),
    ) = VitaminStandaloneBadgeImpl(
        count = count,
        modifier = modifier,
        colors = colors,
        nbMaxChar = nbMaxChar,
        areHiddenItemsLeft = areHiddenItemsLeft,
        sizes = sizes,
    )

    /**
     * Reversed
     * @param count the text inside de badge
     * @param nbMaxChar the number of digit that you want before "+" (nbMaxChar = 2, count= 110, result = 99+ )
     * @param areHiddenItemsLeft check if the badge is use to hidden more elements ex (+4)
     * @param colors the colors of the background and text
     * @param sizes the sizes of the text and padding
     */
    @Composable
    fun Reversed(
        count: Int,
        modifier: Modifier = Modifier,
        nbMaxChar: Int = LayoutId.defaultMaxChar,
        areHiddenItemsLeft: Boolean = false,
        colors: BadgeColors = VitaminBadgeColors.reversed(),
        sizes: BadgeSizes = VitaminBadgeSizes.smallSize(),
    ) = VitaminStandaloneBadgeImpl(
        count = count,
        modifier = modifier,
        colors = colors,
        nbMaxChar = nbMaxChar,
        areHiddenItemsLeft = areHiddenItemsLeft,
        sizes = sizes,
    )

    /**
     * Alert
     * @param count the text inside de badge
     * @param nbMaxChar the number of digit that you want before "+" (nbMaxChar = 2, count= 110, result = 99+ )
     * @param areHiddenItemsLeft check if the badge is use to hidden more elements ex (+4)
     * @param colors the colors of the background and text
     * @param sizes the sizes of the text and padding
     */
    @Composable
    fun Alert(
        count: Int,
        modifier: Modifier = Modifier,
        nbMaxChar: Int = LayoutId.defaultMaxChar,
        areHiddenItemsLeft: Boolean = false,
        colors: BadgeColors = VitaminBadgeColors.alert(),
        sizes: BadgeSizes = VitaminBadgeSizes.smallSize(),
    ) = VitaminStandaloneBadgeImpl(
        count = count,
        modifier = modifier,
        colors = colors,
        nbMaxChar = nbMaxChar,
        areHiddenItemsLeft = areHiddenItemsLeft,
        sizes = sizes
    )
}
