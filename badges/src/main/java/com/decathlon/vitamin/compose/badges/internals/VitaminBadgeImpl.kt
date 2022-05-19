package com.decathlon.vitamin.compose.badges.internals

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import com.decathlon.vitamin.compose.badges.BadgeColors
import com.decathlon.vitamin.compose.badges.BadgeSizes

@Composable
internal fun VitaminBadgeImpl(
    count: Int,
    nbMaxChar: Int,
    colors: BadgeColors,
    sizes: BadgeSizes,
    modifier: Modifier = Modifier,
    anchor: @Composable BoxScope.() -> Unit
) {
    Layout(
        content = {
            Box(
                modifier = Modifier.layoutId(LayoutId.ANCHOR),
                contentAlignment = Alignment.Center,
                content = anchor
            )
            VitaminStandaloneBadgeImpl(
                modifier = Modifier.layoutId(LayoutId.BADGE),
                count = count,
                colors = colors,
                nbMaxChar = nbMaxChar,
                sizes = sizes,
                areHiddenItemsLeft = false
            )
        },
        modifier = modifier
    ) { measurables, constraints ->
        badgeMeasurePolicy(
            scope = this,
            measurables = measurables,
            constraints = constraints,
            badgeHorizontalOffset = sizes.badgeHorizontalOffset.roundToPx(),
            badgeWithContentVerticalOffset = 0
        )
    }
}
