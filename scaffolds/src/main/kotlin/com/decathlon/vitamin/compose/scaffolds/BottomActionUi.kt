package com.decathlon.vitamin.compose.scaffolds

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.vector.ImageVector

@Stable
@Immutable
open class BottomActionUi(
    val route: String,
    val icon: ImageVector,
    val iconSelected: ImageVector,
    val label: String,
    val contentDescription: String?,
    val selectedRoutes: List<String> = emptyList()
)
