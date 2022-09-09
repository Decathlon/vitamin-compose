package com.decathlon.vitamin.compose.switches

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.Switch
import androidx.compose.material.SwitchColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object VitaminSwitches {
    /**
     * The primary switch toggle the state of a single item on or off.
     * @param checked Whether Switch is checked or unchecked
     * @param modifier The [Modifier] to be applied to the component
     * @param enabled True if you can check the switch, otherwise false
     * @param interactionSource Representing the stream of interaction for the switch
     * @param colors The colors of the switch in selected and unselected mode
     * @param onCheckedChange The callback to be called when the state of the switch changed
     */
    @Composable
    fun Primary(
        checked: Boolean,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        colors: SwitchColors = VitaminSwitchesColors.primary(),
        onCheckedChange: ((Boolean) -> Unit)? = null
    ) {
        Switch(
            checked = checked,
            modifier = modifier,
            onCheckedChange = onCheckedChange,
            enabled = enabled,
            colors = colors,
            interactionSource = interactionSource
        )
    }
}

@Preview
@Composable
private fun VitaminSwitchOnPreview() {
    VitaminTheme {
        VitaminSwitches.Primary(
            checked = false
        )
    }
}
