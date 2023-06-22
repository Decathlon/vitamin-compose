package com.decathlon.vitamin.compose.scaffolds

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable

@Stable
@Immutable
data class TopActionsUi(
    val actions: List<TopActionUi> = emptyList(),
    val maxActions: Int = 3
)
