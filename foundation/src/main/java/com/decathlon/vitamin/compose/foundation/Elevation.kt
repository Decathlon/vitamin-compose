package com.decathlon.vitamin.compose.foundation

import androidx.compose.material.ElevationOverlay
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

object VitaminNoColorComputeElevationOverlay : ElevationOverlay {
    @ReadOnlyComposable
    @Composable
    override fun apply(color: Color, elevation: Dp): Color {
        return color
    }
}
