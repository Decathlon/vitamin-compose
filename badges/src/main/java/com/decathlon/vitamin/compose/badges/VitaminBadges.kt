package com.decathlon.vitamin.compose.badges

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import com.decathlon.vitamin.compose.badges.internals.VitaminEmptyBadge

object VitaminBadges {
    /**
     * Default
     * @param colors color of the badge background
     * @param anchor composable anchor which own the badge
     */
    @Composable
    fun Default(
        colors: BadgeColors = VitaminBadgeColors.default(),
        anchor: @Composable BoxScope.() -> Unit
    ) = VitaminEmptyBadge(
        backgroundColor = colors.backgroundColor,
        anchor = anchor
    )

    /**
     * Accent
     * @param colors color of the badge background
     * @param anchor composable anchor which own the badge
     */
    @Composable
    fun Accent(
        colors: BadgeColors = VitaminBadgeColors.accent(),
        anchor: @Composable BoxScope.() -> Unit,
    ) = VitaminEmptyBadge(
        backgroundColor = colors.backgroundColor,
        anchor = anchor
    )

    /**
     * Brand
     * @param colors color of the badge background
     * @param anchor composable anchor which own the badge
     */
    @Composable
    fun Brand(
        colors: BadgeColors = VitaminBadgeColors.brand(),
        anchor: @Composable BoxScope.() -> Unit
    ) = VitaminEmptyBadge(
        backgroundColor = colors.backgroundColor,
        anchor = anchor
    )

    /**
     * Reversed
     * @param colors color of the badge background
     * @param anchor composable anchor which own the badge
     */
    @Composable
    fun Reversed(
        colors: BadgeColors = VitaminBadgeColors.reversed(),
        anchor: @Composable BoxScope.() -> Unit
    ) = VitaminEmptyBadge(
        backgroundColor = colors.backgroundColor,
        anchor = anchor
    )

    /**
     * Alert
     * @param colors color of the badge background
     * @param anchor composable anchor which own the badge
     */
    @Composable
    fun Alert(
        colors: BadgeColors = VitaminBadgeColors.alert(),
        anchor: @Composable BoxScope.() -> Unit
    ) = VitaminEmptyBadge(
        backgroundColor = colors.backgroundColor,
        anchor = anchor
    )
}
