package com.decathlon.vitamin.compose.buttons

import android.os.Build
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.vtmnLightColorPalette

internal object VitaminButtonsRipples {
    val primary: RippleTheme
        @Composable
        get() = object : RippleTheme {
            @Composable
            override fun defaultColor() = VitaminTheme.colors.vtmnActiveBrand

            @Composable
            override fun rippleAlpha(): RippleAlpha = RippleAlpha(1f, 1f, 1f, getAlpha())
        }

    val primaryReversed: RippleTheme
        @Composable
        get() = object : RippleTheme {
            @Composable
            override fun defaultColor() = VitaminTheme.colors.vtmnActiveBrandReversedTransparent

            @Composable
            override fun rippleAlpha(): RippleAlpha = RippleAlpha(1f, 1f, 1f, getAlpha(0.6f))
        }

    val secondary: RippleTheme
        @Composable
        get() = object : RippleTheme {
            @Composable
            override fun defaultColor() = VitaminTheme.colors.vtmnActivePrimary

            @Composable
            override fun rippleAlpha(): RippleAlpha = RippleAlpha(1f, 1f, 1f, getAlpha())
        }

    val tertiary: RippleTheme
        @Composable
        get() = object : RippleTheme {
            @Composable
            override fun defaultColor() = VitaminTheme.colors.vtmnActiveTertiary

            @Composable
            override fun rippleAlpha(): RippleAlpha = RippleAlpha(1f, 1f, 1f, getAlpha())
        }

    val ghost: RippleTheme
        @Composable
        get() = object : RippleTheme {
            @Composable
            override fun defaultColor() = VitaminTheme.colors.vtmnActivePrimary

            @Composable
            override fun rippleAlpha(): RippleAlpha = RippleAlpha(1f, 1f, 1f, getAlpha())
        }

    val ghostReversed: RippleTheme
        @Composable
        get() = object : RippleTheme {
            @Composable
            override fun defaultColor() = VitaminTheme.colors.vtmnActivePrimaryReversedTransparent

            @Composable
            override fun rippleAlpha(): RippleAlpha = RippleAlpha(1f, 1f, 1f, getAlpha(0.25f))
        }

    val conversion: RippleTheme
        @Composable
        get() = object : RippleTheme {
            @Composable
            override fun defaultColor() = VitaminTheme.colors.vtmnActiveAccent

            @Composable
            override fun rippleAlpha(): RippleAlpha = RippleAlpha(1f, 1f, 1f, getAlpha())
        }

    /* Colors always light on card button. Use only in card component */
    val card: RippleTheme
        @Composable
        get() = object : RippleTheme {
            @Composable
            override fun defaultColor() = vtmnLightColorPalette.vtmnActiveBrandReversedTransparent

            @Composable
            override fun rippleAlpha(): RippleAlpha = RippleAlpha(1f, 1f, 1f, getAlpha(0.6f))
        }

    /**
     * On API 21-27 the ripple animation is split into two sections - an overlay and an
     * animation on top. Due to this split, we need to divide by 2 the original alpha.
     */
    private fun getAlpha(alpha: Float = 1f): Float =
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.P) alpha / 2f else alpha
}
