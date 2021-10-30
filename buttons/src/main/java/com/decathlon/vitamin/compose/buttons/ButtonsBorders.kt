package com.decathlon.vitamin.compose.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

class DefaultBorderStroke(
  val stroke: BorderStroke? = null,
  val disabled: BorderStroke? = stroke
)

internal object VitaminButtonsBorders {

  val primaryReversed: DefaultBorderStroke
    @Composable
    get() = DefaultBorderStroke(
      stroke = BorderStroke(width = 2.dp, color = VitaminTheme.colors.vtmnBackgroundBrandPrimaryReversed),
      disabled = BorderStroke(width = 2.dp, color = VitaminTheme.colors.vtmnBackgroundBrandPrimaryReversed.copy(alpha = vtmnStatesDisabled))
    )

  val secondary: DefaultBorderStroke
    @Composable
    get() = DefaultBorderStroke(
      stroke = BorderStroke(width = 2.dp, color = VitaminTheme.colors.vtmnBorderSecondary),
      disabled = BorderStroke(width = 2.dp, color = VitaminTheme.colors.vtmnBorderSecondary.copy(alpha = vtmnStatesDisabled))
    )

  val none: DefaultBorderStroke
    @Composable
    get() = DefaultBorderStroke()
}