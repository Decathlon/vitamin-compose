package com.decathlon.vitamin.compose.ratings

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import kotlin.math.roundToInt

internal object VitaminRatingNote {
    @Composable
    fun NoteAndComments(
        number: Float,
        maxValue: Int,
        nbComments: Int?,
        colors: RatingsColors,
        sizes: RatingsSizes
    ) {
        Note(
            number = number,
            maxValue = maxValue,
            sizes = sizes,
            colors = colors
        )
        if (nbComments != null) {
            Comments(
                nbComments = nbComments,
                sizes = sizes,
                colors = colors
            )
        }
    }

    @Composable
    fun Note(
        number: Float,
        maxValue: Int,
        colors: RatingsColors,
        sizes: RatingsSizes,
        rounded: Float = 10.0f
    ) {
        val numberRounded = (number * rounded).roundToInt() / rounded
        Text(
            text = "$numberRounded/$maxValue",
            style = sizes.textStyle.copy(fontWeight = FontWeight.Bold),
            color = colors.noteColor
        )
    }

    @Composable
    fun Comments(
        nbComments: Int,
        colors: RatingsColors,
        sizes: RatingsSizes
    ) {
        Text(
            text = "($nbComments)",
            style = sizes.textStyle,
            color = colors.commentsColor
        )
    }
}
