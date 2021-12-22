package com.decathlon.compose.sample.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.decathlon.vitamin.compose.appbars.VitaminTopBars

@Composable
fun SampleScaffold(
    title: String,
    modifier: Modifier = Modifier,
    content: @Composable (padding: PaddingValues) -> Unit,
) {
    Scaffold(
        topBar = { VitaminTopBars.Primary(title = title) },
        modifier = modifier,
        content = { content(it) }
    )
}
