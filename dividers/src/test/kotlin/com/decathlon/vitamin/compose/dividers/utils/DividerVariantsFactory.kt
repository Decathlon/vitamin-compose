package com.decathlon.vitamin.compose.dividers.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.decathlon.vitamin.compose.dividers.VitaminDividers

object DividerVariantsFactory {

    @Composable
    fun Divider(
        variant: Variant,
        modifier: Modifier = Modifier
    ) {
        when (variant) {
            Variant.FullBleed -> VitaminDividers.FullBleed(
                modifier = modifier
            )
            Variant.Inset -> VitaminDividers.Inset(
                modifier = modifier
            )
            Variant.Middle -> VitaminDividers.Middle(
                modifier = modifier
            )
        }
    }
}
