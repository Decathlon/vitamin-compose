package com.decathlon.vitamin.compose.ratings

import androidx.compose.material.ContentAlpha
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
data class RatingColors(
    val starColor: Color,
    val noteColor: Color,
    val commentsColor: Color,
    val disabledStarColor: Color
)

object VitaminRatingColors {
    @Composable
    fun primary(
        starColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        noteColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        commentsColor: Color = VitaminTheme.colors.vtmnContentSecondary,
        disabledStarColor: Color = starColor.copy(alpha = ContentAlpha.disabled)
    ): RatingColors {
        return remember(
            starColor,
            noteColor,
            commentsColor,
            disabledStarColor
        ) {
            RatingColors(
                starColor = starColor,
                noteColor = noteColor,
                commentsColor = commentsColor,
                disabledStarColor = disabledStarColor
            )
        }
    }

    @Composable
    fun emphasis(
        starColor: Color = VitaminTheme.colors.vtmnContentActive,
        noteColor: Color = VitaminTheme.colors.vtmnContentPrimary,
        commentsColor: Color = VitaminTheme.colors.vtmnContentSecondary,
        disabledStarColor: Color = starColor.copy(alpha = ContentAlpha.disabled)
    ): RatingColors {
        return remember(
            starColor,
            noteColor,
            commentsColor,
            disabledStarColor
        ) {
            RatingColors(
                starColor = starColor,
                noteColor = noteColor,
                commentsColor = commentsColor,
                disabledStarColor = disabledStarColor
            )
        }
    }
}
