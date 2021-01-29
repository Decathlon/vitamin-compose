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
  @Composable
  val primary: DefaultBorderStroke
    get() = DefaultBorderStroke(
      stroke = BorderStroke(width = 2.dp, color = Color.Transparent)
    )

  @Composable
  val primaryReversed: DefaultBorderStroke
    get() = DefaultBorderStroke(
      stroke = BorderStroke(width = 2.dp, color = VitaminTheme.colors.uiBackground)
    )

  @Composable
  val secondary: DefaultBorderStroke
    get() = DefaultBorderStroke(
      stroke = BorderStroke(width = 2.dp, color = VitaminTheme.colors.textPrimary),
      disabled = BorderStroke(
        width = 2.dp,
        color = VitaminTheme.colors.textPrimary.copy(alpha = .25f)
      )
    )

  @Composable
  val secondaryReversed: DefaultBorderStroke
    get() = DefaultBorderStroke(
      stroke = BorderStroke(width = 2.dp, color = VitaminTheme.colors.textSecondary),
      disabled = BorderStroke(
        width = 2.dp,
        color = VitaminTheme.colors.textSecondary.copy(alpha = .25f)
      )
    )

  @Composable
  val none: DefaultBorderStroke
    get() = DefaultBorderStroke()
}