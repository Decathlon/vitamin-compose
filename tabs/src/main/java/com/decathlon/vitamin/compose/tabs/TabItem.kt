package com.decathlon.vitamin.compose.tabs

import androidx.compose.ui.graphics.painter.Painter

data class TabItem(
    val label: String,
    val icon: Painter? = null,
    val topIcon: Boolean = false,
    var selected: Boolean = false,
    var testTags: TabItemTags? = null,
)

data class TabItemTags(
    val labelTag: String? = null,
    val tabTag: String? = null,
    val iconTag: String? = null,
)
