package com.decathlon.vitamin.compose.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.VtmnStatesDisabled
import com.decathlon.vitamin.compose.foundation.vtmnLightColorPalette

class DefaultBorderStroke(
    val stroke: BorderStroke? = null,
    val disabled: BorderStroke? = stroke
)

internal object VitaminButtonsBorders {
    val primaryReversed: DefaultBorderStroke
        @Composable
        get() = DefaultBorderStroke(
            stroke = BorderStroke(
                width = 2.dp,
                color = VitaminTheme.colors.vtmnBackgroundBrandPrimaryReversed
            ),
            disabled = BorderStroke(
                width = 2.dp,
                color = VitaminTheme.colors.vtmnBackgroundBrandPrimaryReversed.copy(alpha = VtmnStatesDisabled)
            )
        )

    val secondary: DefaultBorderStroke
        @Composable
        get() = DefaultBorderStroke(
            stroke = BorderStroke(width = 2.dp, color = VitaminTheme.colors.vtmnBorderSecondary),
            disabled = BorderStroke(
                width = 2.dp,
                color = VitaminTheme.colors.vtmnBorderSecondary.copy(alpha = VtmnStatesDisabled)
            )
        )

    /* Colors always light on card button. Use only in card component */
    val card: DefaultBorderStroke
        @Composable
        get() = DefaultBorderStroke(
            stroke = BorderStroke(
                width = 2.dp,
                color = vtmnLightColorPalette.vtmnBackgroundBrandPrimaryReversed
            ),
            disabled = BorderStroke(
                width = 2.dp,
                color = vtmnLightColorPalette.vtmnBackgroundBrandPrimaryReversed.copy(alpha = VtmnStatesDisabled)
            )
        )

    val none: DefaultBorderStroke
        @Composable
        get() = DefaultBorderStroke()
}
