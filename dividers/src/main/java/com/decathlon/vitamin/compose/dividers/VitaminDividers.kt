package com.decathlon.vitamin.compose.dividers

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object VitaminDividers {

    /**
     * Full-bleed dividers separate content into sections. They can also be used to establish a hierarchy
     * @param modifier The [Modifier] to be applied to this dividers
     * @param thickness thickness of the dividers line, 1 dp is used by default
     * @param color color of the dividers line
     */
    @Composable
    fun FullBleed(
        modifier: Modifier = Modifier,
        thickness: Dp = 1.dp,
        color: Color = VitaminTheme.colors.vtmnBorderPrimary,
    ) = VitaminDividerImpl(color, thickness, 0.dp, 0.dp, modifier)

    /**
     * Inset dividers separate related content, such as list item or thread
     * @param modifier The [Modifier] to be applied to this dividers
     * @param thickness thickness of the dividers line, 1 dp is used by default
     * @param startIndent the start indent padding, default value is 64.dp
     * @param color color of the dividers line
     */
    @Composable
    fun Inset(
        modifier: Modifier = Modifier,
        thickness: Dp = 1.dp,
        startIndent: Dp = 64.dp,
        color: Color = VitaminTheme.colors.vtmnBorderPrimary,
    ) = VitaminDividerImpl(color, thickness, startIndent, 0.dp, modifier)

    /**
     * Middle dividers are used in the middle of the layout. They can be used for separating related content or actions
     * @param modifier The [Modifier] to be applied to this dividers
     * @param thickness thickness of the dividers line, 1 dp is used by default
     * @param startIndent the start indent padding, default value is 32.dp
     * @param endIndent the end indent padding, default value is 32.dp
     * @param color color of the dividers line
     */
    @Composable
    fun Middle(
        modifier: Modifier = Modifier,
        thickness: Dp = 1.dp,
        startIndent: Dp = 32.dp,
        endIndent: Dp = 32.dp,
        color: Color = VitaminTheme.colors.vtmnBorderPrimary,
    ) = VitaminDividerImpl(color, thickness, startIndent, endIndent, modifier)
}

@Composable
private fun VitaminDividerImpl(
    color: Color,
    thickness: Dp,
    startIndent: Dp,
    endIndent: Dp,
    modifier: Modifier = Modifier,
) {
    val indentModifier = if (endIndent.value != 0f) {
        Modifier.padding(end = endIndent)
    } else {
        Modifier
    }
    Divider(
        modifier = modifier.then(indentModifier),
        color = color,
        thickness = thickness,
        startIndent = startIndent,
    )
}
