package com.decathlon.vitamin.compose.scaffolds

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import com.decathlon.vitamin.compose.scaffolds.TabActionUi

@Stable
@Immutable
data class TabActionsUi(
    val scrollable: Boolean = false,
    val actions: List<TabActionUi> = emptyList()
)
