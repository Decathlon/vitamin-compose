package com.decathlon.vitamin.compose.badges.internals

import androidx.compose.ui.layout.FirstBaseline
import androidx.compose.ui.layout.LastBaseline
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.Constraints

/**
 * Badge measure policy
 * This calculates the placement of the badge in relation to its content
 *
 * @param scope
 * @param measurables
 * @param constraints
 * @param badgeHorizontalOffset
 * @param badgeWithContentVerticalOffset
 * @return MeasureResult
 */
internal fun badgeMeasurePolicy(
    scope: MeasureScope,
    measurables: List<Measurable>,
    constraints: Constraints,
    badgeHorizontalOffset: Int,
    badgeWithContentVerticalOffset: Int,
): MeasureResult {
    val badgePlaceable = measurables.first { it.layoutId == LayoutId.BADGE }.measure(
        // Measure with loose constraints for height as we don't want the text to take up more
        // space than it needs.
        constraints.copy(minHeight = 0)
    )

    val anchorPlaceable = measurables.first { it.layoutId == LayoutId.ANCHOR }.measure(constraints)

    val firstBaseline = anchorPlaceable[FirstBaseline]
    val lastBaseline = anchorPlaceable[LastBaseline]
    val totalWidth = anchorPlaceable.width
    val totalHeight = anchorPlaceable.height

    return scope.layout(
        width = totalWidth,
        height = totalHeight,
        // Provide custom baselines based only on the anchor content to avoid default baseline
        // calculations from including by any badge content.
        alignmentLines = mapOf(
            FirstBaseline to firstBaseline,
            LastBaseline to lastBaseline
        ),
        placementBlock = {
            anchorPlaceable.placeRelative(0, 0)
            val badgeX = anchorPlaceable.width + badgeHorizontalOffset
            val badgeY = (-badgePlaceable.height + badgeWithContentVerticalOffset) / 2
            badgePlaceable.placeRelative(badgeX, badgeY)
        }
    )
}
