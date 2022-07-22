package com.decathlon.vitamin.compose.foundation

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.dp

private val radius100 = 4.dp
private val radius200 = 8.dp
private val radius300 = 12.dp
private val radius400 = 16.dp
private val radius500 = 20.dp
private val radius600 = 24.dp
private val radius700 = 32.dp
private val radius800 = 48.dp

val vtmnShapes = VitaminShapes(
    radius100 = RoundedCornerShape(radius100),
    radius200 = RoundedCornerShape(radius200),
    radius300 = RoundedCornerShape(radius300),
    radius400 = RoundedCornerShape(radius400),
    radius500 = RoundedCornerShape(radius500),
    radius600 = RoundedCornerShape(radius600),
    radius700 = RoundedCornerShape(radius700),
    radius800 = RoundedCornerShape(radius800)
)

@Immutable
data class VitaminShapes(
    val radius100: RoundedCornerShape,
    val radius200: RoundedCornerShape,
    val radius300: RoundedCornerShape,
    val radius400: RoundedCornerShape,
    val radius500: RoundedCornerShape,
    val radius600: RoundedCornerShape,
    val radius700: RoundedCornerShape,
    val radius800: RoundedCornerShape
)

internal val LocalVitaminShapes = compositionLocalOf<VitaminShapes> {
    error("No VitaminShapes provided")
}

val shapes = Shapes(
    small = vtmnShapes.radius100,
    medium = vtmnShapes.radius100,
    large = RoundedCornerShape(0.dp)
)
