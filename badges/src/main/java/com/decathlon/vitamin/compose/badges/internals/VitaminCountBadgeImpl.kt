package com.decathlon.vitamin.compose.badges.internals

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.decathlon.vitamin.compose.badges.BadgeColors
import com.decathlon.vitamin.compose.badges.BadgeSizes

@Composable
internal fun VitaminCountBadgeImpl(
    count: Int,
    nbMaxChar: Int,
    colors: BadgeColors,
    sizes: BadgeSizes,
    modifier: Modifier = Modifier,
    anchor: @Composable BoxScope.() -> Unit
) {
    if (count == 0) {
        Box(content = anchor, modifier = modifier)
    } else {
        VitaminBadgeImpl(
            anchor = anchor,
            count = count,
            colors = colors,
            nbMaxChar = nbMaxChar,
            sizes = sizes,
            modifier = modifier
        )
    }
}
