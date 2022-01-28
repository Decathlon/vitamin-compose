package com.decathlon.vitamin.compose.ratings

import kotlin.math.roundToInt

fun Float.rounded(rounded: Float = 10.0f): Float = (this * rounded).roundToInt() / rounded
