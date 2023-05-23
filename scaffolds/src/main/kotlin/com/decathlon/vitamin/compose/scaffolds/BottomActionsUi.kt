package com.decathlon.vitamin.compose.scaffolds

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable

@Stable
@Immutable
data class BottomActionsUi(
    val actions: List<BottomActionUi> = emptyList()
)
