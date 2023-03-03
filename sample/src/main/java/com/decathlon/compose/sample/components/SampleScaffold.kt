package com.decathlon.compose.sample.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.decathlon.vitamin.compose.appbars.topbars.VitaminTopBars
import com.decathlon.vitamin.compose.appbars.topbars.icons.VitaminNavigationIconButtons.PreviousPage

@Composable
fun SampleScaffold(
    title: String,
    modifier: Modifier = Modifier,
    onBackClick: (() -> Unit)? = null,
    content: @Composable (padding: PaddingValues) -> Unit,
) {
    Scaffold(
        topBar = {
            VitaminTopBars.Primary(
                navigationIcon = onBackClick?.let {
                    {
                        PreviousPage(
                            onClick = onBackClick,
                            contentDescription = "Click to return to previous page"
                        )
                    }
                },
                title = title
            )
        },
        modifier = modifier,
        content = { content(it) }
    )
}
