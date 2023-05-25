package com.decathlon.vitamin.compose.scaffolds

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.vector.ImageVector

@Stable
@Immutable
open class TopActionUi(
    val id: Int,
    val icon: ImageVector,
    val contentDescription: String?
)
