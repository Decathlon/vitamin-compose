package com.decathlon.vitamin.compose.appbars.topbars

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
class TopBarColors(
    val background: Color,
    val contentColor: Color,
    val iconColor: Color,
    val disabledIconColor: Color?,
    val inputColor: Color?,
    val cursorColor: Color?
)
