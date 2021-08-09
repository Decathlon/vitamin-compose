package com.decathlon.compose.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.decathlon.compose.theme.VitaminTheme

class DefaultBorderStroke(
  val stroke: BorderStroke? = null,
  val disabled: BorderStroke? = stroke
)

internal object VitaminButtonsBorders {
  val primary: DefaultBorderStroke
    @Composable
    get() = DefaultBorderStroke(
      stroke = BorderStroke(width = 2.dp, color = Color.Transparent)
    )

  val primaryReversed: DefaultBorderStroke
    @Composable
    get() = DefaultBorderStroke(
      stroke = BorderStroke(width = 2.dp, color = VitaminTheme.colors.uiBackground)
    )

  val secondary: DefaultBorderStroke
    @Composable
    get() = DefaultBorderStroke(
      stroke = BorderStroke(width = 2.dp, color = VitaminTheme.colors.textPrimary),
      disabled = BorderStroke(
        width = 2.dp,
        color = VitaminTheme.colors.textPrimary.copy(alpha = .25f)
      )
    )

  val secondaryReversed: DefaultBorderStroke
    @Composable
    get() = DefaultBorderStroke(
      stroke = BorderStroke(width = 2.dp, color = VitaminTheme.colors.textSecondary),
      disabled = BorderStroke(
        width = 2.dp,
        color = VitaminTheme.colors.textSecondary.copy(alpha = .25f)
      )
    )

  val none: DefaultBorderStroke
    @Composable
    get() = DefaultBorderStroke()
}