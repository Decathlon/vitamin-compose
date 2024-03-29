package com.decathlon.vitamin.compose.ratings

import androidx.compose.ui.graphics.vector.ImageVector
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.vitaminicons.Fill
import com.decathlon.vitamin.compose.vitaminicons.Line
import com.decathlon.vitamin.compose.vitaminicons.fill.Star
import com.decathlon.vitamin.compose.vitaminicons.line.Star
import com.decathlon.vitamin.compose.vitaminicons.line.StarHalf
import kotlin.math.floor

internal sealed class Icon(val imageVector: ImageVector) {
    object Empty : Icon(imageVector = VitaminIcons.Line.Star)
    object Half : Icon(imageVector = VitaminIcons.Line.StarHalf)
    object Fill : Icon(imageVector = VitaminIcons.Fill.Star)

    companion object {
        private const val HALF_LOWER_BOUND = 0.25f
        private const val HALF_UPPER_BOUND = 0.75f
        private const val FILL_UPPER_BOUND = 1f

        fun get(index: Int, number: Float): Icon {
            val floor = floor(number).toInt()
            val decimal = number - index
            return when {
                index < floor -> Fill
                decimal < HALF_LOWER_BOUND -> Empty
                decimal <= HALF_UPPER_BOUND -> Half
                decimal <= FILL_UPPER_BOUND -> Fill
                else -> Empty
            }
        }
    }
}
