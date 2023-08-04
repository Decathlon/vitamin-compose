package com.decathlon.ratings.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.decathlon.vitamin.compose.ratings.RatingColors
import com.decathlon.vitamin.compose.ratings.RatingSizes
import com.decathlon.vitamin.compose.ratings.VitaminRatings

object RatingVariantsFactory {

    @Composable
    fun Rating(
        variant: Variant,
        size: RatingSizes,
        colors: RatingColors,
        modifier: Modifier = Modifier,
        number: Float = 3.865f,
        nbComments: Int = 42,
        enabled: Boolean = true
    ) {
        when (variant) {
            Variant.ReadOnly -> VitaminRatings.ReadOnly(
                nbComments = nbComments,
                colors = colors,
                sizes = size,
                number = number,
                modifier = modifier,
                showNote = true
            )
            Variant.ReadOnlyCompact -> VitaminRatings.ReadOnlyCompact(
                nbComments = nbComments,
                colors = colors,
                sizes = size,
                number = number,
                modifier = modifier
            )
            Variant.Interactive -> VitaminRatings.Interactive(
                colors = colors,
                sizes = size,
                number = number.toInt(),
                modifier = modifier,
                enabled = enabled,
                onValueChange = {}
            )
        }
    }
}
