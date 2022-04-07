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
     * @param color color of the dividers line
     * @param thickness thickness of the dividers line, 1 dp is used by default
     */
    @Composable
    fun FullBleed(
        modifier: Modifier = Modifier,
        color: Color = VitaminTheme.colors.vtmnBorderSecondary,
        thickness: Dp = 1.dp,
    ) {
        VitaminDivider(modifier, color, thickness, 0.dp, 0.dp)
    }

    /**
     * Inset dividers separate related content, such as list item or thread
     * @param modifier The [Modifier] to be applied to this dividers
     * @param color color of the dividers line
     * @param thickness thickness of the dividers line, 1 dp is used by default
     * @param startIndent the start indent padding, default value is 64.dp
     */
    @Composable
    fun Inset(
        modifier: Modifier = Modifier,
        color: Color = VitaminTheme.colors.vtmnBorderSecondary,
        thickness: Dp = 1.dp,
        startIndent: Dp = 64.dp
    ) {
        VitaminDivider(modifier, color, thickness, startIndent, 0.dp)
    }

    /**
     * Middle dividers are used in the middle of the layout. They can be used for separating related content or actions
     * @param modifier The [Modifier] to be applied to this dividers
     * @param color color of the dividers line
     * @param thickness thickness of the dividers line, 1 dp is used by default
     * @param startIndent the start indent padding, default value is 32.dp
     * @param endIndent the end indent padding, default value is 32.dp
     */
    @Composable
    fun Middle(
        modifier: Modifier = Modifier,
        color: Color = VitaminTheme.colors.vtmnBorderSecondary,
        thickness: Dp = 1.dp,
        startIndent: Dp = 32.dp,
        endIndent: Dp = 32.dp
    ) {
        VitaminDivider(modifier, color, thickness, startIndent, endIndent)
    }
}

@Composable
private fun VitaminDivider(
    modifier: Modifier,
    color: Color,
    thickness: Dp,
    startIndent: Dp,
    endIndent: Dp
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
