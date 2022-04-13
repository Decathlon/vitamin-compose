package com.decathlon.vitamin.compose.skeleton

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.google.accompanist.placeholder.PlaceholderHighlight
import com.google.accompanist.placeholder.placeholder
import com.google.accompanist.placeholder.shimmer


/**
 * Extension function to apply shimmer effect on every
 * @param visible visibility state of the shimmer effect
 * @param color color of the skeleton shape
 * @param shape shape of the skeleton
 * @param highlightColor color of the shimmer effect
 * @param contentDescription the [String] for the content description
 */
@Composable
fun Modifier.vtmnSkeleton(
    visible: Boolean = true,
    color: Color = VitaminTheme.colors.vtmnBackgroundTertiary,
    shape: Shape = RectangleShape,
    highlightColor: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
    contentDescription: String = stringResource(R.string.vtmn_cd_is_loading)
): Modifier {
     return this
        .placeholder(
            visible = visible,
            color = color,
            shape = shape,
            highlight = PlaceholderHighlight.shimmer(
                highlightColor = highlightColor,
            ),
        )
        .semantics {
            if (visible) {
                this.contentDescription = contentDescription
            }
        }
}

