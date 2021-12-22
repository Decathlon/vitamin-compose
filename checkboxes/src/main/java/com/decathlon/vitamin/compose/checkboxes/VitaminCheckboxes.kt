package com.decathlon.vitamin.compose.checkboxes

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.Checkbox
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.VtmnStatesDisabled

object VitaminCheckboxes {
    @Composable
    fun Primary(
        checked: Boolean,
        modifier: Modifier = Modifier,
        onCheckedChange: (Boolean) -> Unit,
        enabled: Boolean = true,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        endContent: (@Composable () -> Unit)? = null
    ) {
        Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = checked,
                onCheckedChange = onCheckedChange,
                enabled = enabled,
                interactionSource = interactionSource,
                colors = VitaminCheckboxesColors.primary(enabled)
            )
            endContent?.let {
                val alpha = if (enabled) 1f else VtmnStatesDisabled
                Spacer(modifier = Modifier.width(7.dp))
                CompositionLocalProvider(LocalContentAlpha provides alpha) {
                    ProvideTextStyle(
                        value = VitaminTheme.typography.body2.copy(
                            color = VitaminTheme.colors.vtmnContentPrimary
                        )
                    ) {
                        endContent()
                    }
                }
            }
        }
    }
}
