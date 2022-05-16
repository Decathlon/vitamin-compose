package com.decathlon.vitamin.compose.ratings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription

object VitaminRatings {
    /**
     * The read only rating displays a note with 5 stars by default and can
     * optionally display the note with the number of comments at the end of the stars.
     * @param number The note of the rating component
     * @param modifier The [Modifier] to be applied to the component
     * @param showNote Displays the note and the number of comments at the end of the stars
     * @param nbComments Number of comments attached to the note. Null if you want to display nothing
     * @param maxValue Max value of the note. By default, 5
     * @param colors Primary or emphasis colors applied on stars
     * @param sizes Small or medium size applied on stars and text if they are displayed
     */
    @Composable
    fun ReadOnly(
        number: Float,
        modifier: Modifier = Modifier,
        showNote: Boolean = false,
        nbComments: Int? = null,
        maxValue: Int = 5,
        colors: RatingsColors = VitaminRatingsColors.primary(),
        sizes: RatingsSizes = VitaminRatingsSizes.mediumSize(),
    ) {
        val rounded = number.rounded()
        val contentDescription = if (nbComments == null) {
            stringResource(
                id = R.string.vtmn_ratings_read_only, rounded, maxValue
            )
        } else {
            LocalContext.current.resources.getQuantityString(
                R.plurals.vtmn_ratings_read_only_with_comments, nbComments, rounded, maxValue, nbComments
            )
        }
        Row(
            modifier = modifier
                .padding(sizes.contentPadding)
                .semantics {
                    this.contentDescription = contentDescription
                },
            horizontalArrangement = Arrangement.spacedBy(sizes.spaceBetween),
            verticalAlignment = Alignment.CenterVertically
        ) {
            (0 until maxValue).forEach {
                val icon = Icon.get(it, number)
                VitaminStarIcon(
                    icon = icon,
                    tint = colors.starColor,
                    onClick = null,
                    enabled = false,
                    modifier = Modifier
                        .size(size = sizes.starSize)
                        .semantics { this.contentDescription = "${it + 1}" }
                )
            }
            if (showNote) {
                VitaminRatingNote.NoteAndComments(
                    number = number,
                    maxValue = maxValue,
                    nbComments = nbComments,
                    sizes = sizes,
                    colors = colors
                )
            }
        }
    }

    /**
     * The read only compact rating displays a note with 1 star and the note with the number of
     * comments at the end of the stars.
     * @param number The note of the rating component
     * @param modifier The [Modifier] to be applied to the component
     * @param nbComments Number of comments attached to the note. Null if you want to display nothing
     * @param maxValue Max value of the note. By default, 5
     * @param colors Primary or emphasis colors applied on stars
     * @param sizes Small or medium size applied on stars and text if they are displayed
     */
    @Composable
    fun ReadOnlyCompact(
        number: Float,
        modifier: Modifier = Modifier,
        nbComments: Int? = null,
        maxValue: Int = 5,
        colors: RatingsColors = VitaminRatingsColors.primary(),
        sizes: RatingsSizes = VitaminRatingsSizes.mediumSize(),
    ) {
        val rounded = number.rounded()
        val contentDescription = if (nbComments == null) {
            stringResource(
                id = R.string.vtmn_ratings_read_only, rounded, maxValue
            )
        } else {
            LocalContext.current.resources.getQuantityString(
                R.plurals.vtmn_ratings_read_only_with_comments, nbComments, rounded, maxValue, nbComments
            )
        }
        Row(
            modifier = modifier
                .padding(sizes.contentPadding)
                .semantics {
                    this.contentDescription = contentDescription
                },
            horizontalArrangement = Arrangement.spacedBy(sizes.spaceBetween),
            verticalAlignment = Alignment.CenterVertically
        ) {
            VitaminStarIcon(
                icon = Icon.Fill,
                tint = colors.starColor,
                onClick = null,
                enabled = false,
                modifier = Modifier.size(size = sizes.starSize)
            )
            VitaminRatingNote.NoteAndComments(
                number = number,
                maxValue = maxValue,
                nbComments = nbComments,
                sizes = sizes,
                colors = colors
            )
        }
    }

    /**
     * The interactive rating allows the user to click on one star to give a note.
     * @param number The number of star marked as selected
     * @param modifier The [Modifier] to be applied to the component
     * @param enabled True if you can give a note, otherwise false
     * @param maxValue Max value of the note. By default, 5
     * @param colors Primary or emphasis colors applied on stars
     * @param sizes Small or medium size applied on stars and text if they are displayed
     * @param onValueChange The callback to be called when the user click on a star
     */
    @Composable
    fun Interactive(
        number: Int,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        maxValue: Int = 5,
        colors: RatingsColors = VitaminRatingsColors.primary(),
        sizes: RatingsSizes = VitaminRatingsSizes.mediumSize(),
        onValueChange: (number: Int) -> Unit
    ) {
        Row(
            modifier = modifier
                .padding(sizes.contentPadding)
                .semantics {
                    this.contentDescription = "$number"
                },
            horizontalArrangement = Arrangement.spacedBy(sizes.spaceBetween)
        ) {
            for (it in 0 until maxValue) {
                val stateDescription = if (it + 1 == number) {
                    stringResource(
                        id = R.string.vtmn_ratings_interactive_star_selected, (it + 1)
                    )
                } else {
                    stringResource(
                        id = R.string.vtmn_ratings_interactive_star_unselected, (it + 1)
                    )
                }
                val onClick: (() -> Unit)? = if (enabled) {
                    { onValueChange(it + 1) }
                } else null
                VitaminStarIcon(
                    icon = if (it < number) Icon.Fill else Icon.Empty,
                    tint = if (enabled) colors.starColor else colors.disabledStarColor,
                    onClick = onClick,
                    modifier = Modifier
                        .size(size = sizes.starSize)
                        .semantics {
                            this.stateDescription = stateDescription
                        }
                )
            }
        }
    }
}
