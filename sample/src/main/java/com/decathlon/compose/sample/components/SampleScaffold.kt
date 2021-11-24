package com.decathlon.compose.sample.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SampleScaffold(
    title: String,
    modifier: Modifier = Modifier,
    content: @Composable (padding: PaddingValues) -> Unit,
) {
    Scaffold(
        topBar = { TopAppBar(title = { Text(text = title) }) },
        modifier = modifier,
        content = { content(it) }
    )
}