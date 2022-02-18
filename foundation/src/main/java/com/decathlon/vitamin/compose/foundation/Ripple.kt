package com.decathlon.vitamin.compose.foundation

import android.os.Build
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

private const val AlphaPrimaryReversed = 0.25f
private const val AlphaBrandReversed = 0.6f

@Immutable
private object BrandRippleTheme : RippleTheme {
    @Composable
    override fun defaultColor(): Color = VitaminTheme.colors.vtmnActiveBrand

    @Composable
    override fun rippleAlpha(): RippleAlpha = RippleAlpha(1f, 1f, 1f, getAlpha())
}

@Immutable
private object BrandReversedRippleTheme : RippleTheme {
    @Composable
    override fun defaultColor() = VitaminTheme.colors.vtmnActiveBrandReversedTransparent

    @Composable
    override fun rippleAlpha(): RippleAlpha {
        return RippleAlpha(1f, 1f, 1f, getAlpha(AlphaBrandReversed))
    }
}

@Immutable
private object PrimaryRippleTheme : RippleTheme {
    @Composable
    override fun defaultColor() = VitaminTheme.colors.vtmnActivePrimary

    @Composable
    override fun rippleAlpha(): RippleAlpha = RippleAlpha(1f, 1f, 1f, getAlpha())
}

@Immutable
private object PrimaryReversedRippleTheme : RippleTheme {
    @Composable
    override fun defaultColor() = VitaminTheme.colors.vtmnActivePrimaryReversedTransparent

    @Composable
    override fun rippleAlpha(): RippleAlpha {
        return RippleAlpha(1f, 1f, 1f, getAlpha(AlphaPrimaryReversed))
    }
}

@Immutable
private object TertiaryRippleTheme : RippleTheme {
    @Composable
    override fun defaultColor() = VitaminTheme.colors.vtmnActiveTertiary

    @Composable
    override fun rippleAlpha(): RippleAlpha = RippleAlpha(1f, 1f, 1f, getAlpha())
}

@Immutable
private object AccentRippleTheme : RippleTheme {
    @Composable
    override fun defaultColor() = VitaminTheme.colors.vtmnActiveAccent

    @Composable
    override fun rippleAlpha(): RippleAlpha = RippleAlpha(1f, 1f, 1f, getAlpha())
}

@Immutable
class NoRippleInteractionSource : MutableInteractionSource {
    override val interactions: Flow<Interaction> = emptyFlow()
    override suspend fun emit(interaction: Interaction) { /*not used in this context*/
    }

    override fun tryEmit(interaction: Interaction) = true
}

@Immutable
data class VitaminRipples(
    val brand: RippleTheme,
    val brandReversed: RippleTheme,
    val primary: RippleTheme,
    val primaryReversed: RippleTheme,
    val tertiary: RippleTheme,
    val accent: RippleTheme
)

internal val LocalVitaminRipples = compositionLocalOf<VitaminRipples> {
    error("No VitaminRipples provided")
}

val vtmnRipples = VitaminRipples(
    brand = BrandRippleTheme,
    brandReversed = BrandReversedRippleTheme,
    primary = PrimaryRippleTheme,
    primaryReversed = PrimaryReversedRippleTheme,
    tertiary = TertiaryRippleTheme,
    accent = AccentRippleTheme
)

/**
 * On API 21-27 the ripple animation is split into two sections - an overlay and an
 * animation on top. Due to this split, we need to divide by 2 the original alpha.
 */
private fun getAlpha(alpha: Float = 1f): Float =
    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.P) alpha / 2f else alpha
