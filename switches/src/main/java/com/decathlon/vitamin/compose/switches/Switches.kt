package com.decathlon.vitamin.compose.switches

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object VitaminSwitches {
    @Composable
    fun Primary(
        checked: Boolean,
        modifier: Modifier = Modifier,
        onCheckedChange: ((Boolean) -> Unit)? = null,
        enabled: Boolean = true,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
    ) {
        Switch(
            checked = checked,
            modifier = modifier,
            onCheckedChange = onCheckedChange,
            enabled = enabled,
            colors = VitaminSwitchesColors.primary,
            interactionSource = interactionSource
        )
    }
}

@Preview
@Composable
fun VitaminSwitchOnPreview() {
    VitaminTheme {
        VitaminSwitches.Primary(
            checked = false
        )
    }
}