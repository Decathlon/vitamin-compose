package com.decathlon.vitamin.compose.ratings

import androidx.annotation.DrawableRes
import kotlin.math.floor

internal sealed class Icon(@DrawableRes val drawable: Int) {
    object Empty : Icon(drawable = R.drawable.ic_vtmn_star_line)
    object Half : Icon(drawable = R.drawable.ic_vtmn_star_half_fill)
    object Fill : Icon(drawable = R.drawable.ic_vtmn_star_fill)

    companion object {
        private const val HALF = 0.5f
        fun get(index: Int, number: Float): Icon {
            val floor = floor(number).toInt()
            return if (floor == index) {
                val decimal = number - index
                if (decimal < HALF) Half else Fill
            } else if (index < number) {
                Fill
            } else {
                Empty
            }
        }
    }
}
