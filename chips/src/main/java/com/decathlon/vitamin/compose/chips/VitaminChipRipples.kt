package com.decathlon.vitamin.compose.chips

import android.os.Build
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import com.decathlon.vitamin.compose.foundation.VitaminTheme

// todo to delete
internal object VitaminChipRipples {
    @Composable
    fun default(): RippleTheme = object : RippleTheme {
        @Composable
        override fun defaultColor() = VitaminTheme.colors.vtmnActiveBrand

        @Composable
        override fun rippleAlpha(): RippleAlpha = RippleAlpha(1f, 1f, 1f, getAlpha())
    }

    /**
     * On API 21-27 the ripple animation is split into two sections - an overlay and an
     * animation on top. Due to this split, we need to divide by 2 the original alpha.
     */
    private fun getAlpha(alpha: Float = 1f): Float =
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.P) alpha / 2f else alpha
}
