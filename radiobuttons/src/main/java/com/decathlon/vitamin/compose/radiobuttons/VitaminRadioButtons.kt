package com.decathlon.vitamin.compose.radiobuttons

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.vtmnStatesDisabled

object VitaminRadioButtons {
    @Composable
    fun Primary(
        selected: Boolean,
        modifier: Modifier = Modifier,
        onClick: (() -> Unit)?,
        enabled: Boolean = true,
        colors: RadioButtonColors = RadioButtonDefaults.colors(
            selectedColor = VitaminTheme.colors.vtmnContentActive,
            unselectedColor = VitaminTheme.colors.vtmnContentInactive,
            disabledColor = if (selected) VitaminTheme.colors.vtmnContentActive.copy(alpha = vtmnStatesDisabled) else VitaminTheme.colors.vtmnContentInactive.copy(
                alpha = vtmnStatesDisabled
            )
        ),
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        endContent: (@Composable () -> Unit)? = null
    ) {
        //Add click on row if endContent is set
        var rowModifier = modifier
        endContent?.let {
            rowModifier = modifier
                .clip(RoundedCornerShape(4.dp))
                .clickable(enabled = true,
                    onClick = {
                        onClick?.invoke()
                    },
                    interactionSource = remember { MutableInteractionSource() },
                    indication = LocalIndication.current)
                .padding(4.dp)
        }

        Row(modifier = rowModifier, verticalAlignment = Alignment.CenterVertically) {
            endContent?.let {
                RadioButton(
                    selected = selected,
                    onClick = null,
                    enabled = enabled,
                    interactionSource = interactionSource,
                    colors = colors
                )

                val alpha = if (enabled) 1f else vtmnStatesDisabled
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
            } ?: run {
                RadioButton(
                    selected = selected,
                    onClick = onClick,
                    enabled = enabled,
                    interactionSource = interactionSource,
                    colors = colors
                )
            }
        }
    }
}

