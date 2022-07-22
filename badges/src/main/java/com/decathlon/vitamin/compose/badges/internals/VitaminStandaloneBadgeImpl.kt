package com.decathlon.vitamin.compose.badges.internals

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.decathlon.vitamin.compose.badges.BadgeColors
import com.decathlon.vitamin.compose.badges.BadgeSizes

@Composable
internal fun VitaminStandaloneBadgeImpl(
    count: Int,
    nbMaxChar: Int,
    areHiddenItemsLeft: Boolean,
    colors: BadgeColors,
    sizes: BadgeSizes,
    modifier: Modifier = Modifier
) {
    if (count > 0) {
        val shape = sizes.radius
        Row(
            modifier = modifier
                .background(
                    color = colors.backgroundColor,
                    shape = shape
                )
                .clip(shape)
                .padding(
                    horizontal = sizes.horizontalPadding, vertical = sizes.verticalPadding
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = if (areHiddenItemsLeft) "+$count" else getFormattedCount(
                    count = count,
                    nbMaxChar = nbMaxChar
                ),
                style = sizes.textStyle
            )
        }
    }
}

/**
 * Return  formated count
 *
 * @param count
 * @param nbMaxChar
 * @return formated text
 * ex: count = 100, nbMaxChar = 2 @return "99+"
 * ex: count = 125, nbMaxChar = 3 @return "125"
 */
private fun getFormattedCount(count: Int, nbMaxChar: Int) =
    when (count.toString().count() > nbMaxChar) {
        true -> formatMaxText(nbMaxChar = nbMaxChar)
        false -> count.toString()
    }

/**
 * Format max text
 *
 * @param nbMaxChar
 * @return formated text
 * ex: nbMaxChar = 2 => "99+"
 */
private fun formatMaxText(nbMaxChar: Int): String {
    var newCount = ""
    (1..nbMaxChar).forEach { _ ->
        newCount += "9"
    }
    return "$newCount+"
}
