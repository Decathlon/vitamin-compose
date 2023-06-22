package com.decathlon.vitamin.compose.scaffolds

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.vector.ImageVector

@Stable
@Immutable
data class TabActionUi(
    val route: String,
    val label: String,
    val icon: ImageVector? = null
)
