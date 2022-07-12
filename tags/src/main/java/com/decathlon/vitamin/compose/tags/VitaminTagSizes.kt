package com.decathlon.vitamin.compose.tags

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
data class TagSizes(
    val contentPadding: PaddingValues,
    val clickablePadding: PaddingValues,
    val iconSize: Dp,
    val labelStartPadding: Dp,
    val textStyle: TextStyle
)

object VitaminTagSizes {
    @Composable
    fun medium(
        contentPadding: PaddingValues = PaddingValues(horizontal = 8.dp, vertical = 2.dp),
        clickablePadding: PaddingValues = PaddingValues(vertical = 8.dp),
        iconSize: Dp = 13.dp,
        labelStartPadding: Dp = 6.dp,
        textStyle: TextStyle = VitaminTheme.typography.body3
    ): TagSizes = remember(
        contentPadding,
        clickablePadding,
        iconSize,
        labelStartPadding,
        textStyle
    ) {
        TagSizes(
            contentPadding = contentPadding,
            clickablePadding = clickablePadding,
            iconSize = iconSize,
            labelStartPadding = labelStartPadding,
            textStyle = textStyle
        )
    }
}
