package com.decathlon.compose.sample.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.compose.sample.R
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.progressbar.VitaminCircularProgressBarSizes
import com.decathlon.vitamin.compose.progressbar.VitaminLinearProgressBarSizes
import com.decathlon.vitamin.compose.progressbar.VitaminProgressBars

object Progress : Screen {
    override val name: String
        get() = "Progress"

    override val navigationKey: String
        get() = "progress"

    @Composable
    override fun Screen() {
        SampleScaffold(title = name) {
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                item {
                    VitaminProgressBars.Linear(
                        progress = 0.8f,
                        modifier = Modifier.progressScreenModifier(firstItem = true),
                        size = VitaminLinearProgressBarSizes.smallSize()
                    )
                }
                item {
                    VitaminProgressBars.Linear(
                        progress = 0.9f,
                        modifier = Modifier.progressScreenModifier(),
                        size = VitaminLinearProgressBarSizes.mediumSize()
                    )
                }
                item {
                    VitaminProgressBars.Linear(
                        progress = 0.05f,
                        modifier = Modifier.progressScreenModifier(),
                        size = VitaminLinearProgressBarSizes.largeSize()
                    )
                }
                item {
                    VitaminProgressBars.Linear(
                        progress = 0.1f,
                        modifier = Modifier.progressScreenModifier(),
                        size = VitaminLinearProgressBarSizes.smallSize(),
                        label = "Download"
                    )
                }
                item {
                    VitaminProgressBars.Linear(
                        progress = 0.35f,
                        modifier = Modifier.progressScreenModifier(),
                        size = VitaminLinearProgressBarSizes.mediumSize(),
                        label = "Download"
                    )
                }
                item {
                    VitaminProgressBars.Linear(
                        progress = 0.7f,
                        modifier = Modifier.progressScreenModifier(),
                        size = VitaminLinearProgressBarSizes.largeSize(),
                        label = "Download"
                    )
                }
                item {
                    VitaminProgressBars.Linear(
                        modifier = Modifier.progressScreenModifier(),
                        size = VitaminLinearProgressBarSizes.smallSize(),
                        label = "Loading"
                    )
                }
                item {
                    VitaminProgressBars.Linear(
                        modifier = Modifier.progressScreenModifier(),
                        size = VitaminLinearProgressBarSizes.mediumSize(),
                        label = "Loading"
                    )
                }
                item {
                    VitaminProgressBars.Linear(
                        modifier = Modifier.progressScreenModifier(),
                        size = VitaminLinearProgressBarSizes.largeSize(),
                        label = "Loading"
                    )
                }
                item {
                    VitaminProgressBars.Linear(
                        modifier = Modifier.progressScreenModifier(),
                        size = VitaminLinearProgressBarSizes.smallSize()
                    )
                }
                item {
                    VitaminProgressBars.Linear(
                        modifier = Modifier.progressScreenModifier(),
                        size = VitaminLinearProgressBarSizes.mediumSize()
                    )
                }
                item {
                    VitaminProgressBars.Linear(
                        modifier = Modifier.progressScreenModifier(),
                        size = VitaminLinearProgressBarSizes.largeSize()
                    )
                }
                item {
                    ProgressRow {
                        VitaminProgressBars.Circular(
                            progress = 0.6f,
                            modifier = Modifier.progressScreenModifier(),
                            size = VitaminCircularProgressBarSizes.mediumSize(),
                            content = {
                                ImageCircular(
                                    painter = painterResource(id = R.drawable.store_decathlon),
                                    contentDescription = "Decathlon Store"
                                )
                            }
                        )
                        VitaminProgressBars.Circular(
                            modifier = Modifier.progressScreenModifier(),
                            size = VitaminCircularProgressBarSizes.mediumSize(),
                            content = {
                                ImageCircular(
                                    painter = painterResource(id = R.drawable.store_decathlon),
                                    contentDescription = "Decathlon Store"
                                )
                            }
                        )
                    }
                }
                item {
                    ProgressRow {
                        VitaminProgressBars.Circular(
                            progress = 0.6f,
                            modifier = Modifier.progressScreenModifier(),
                            size = VitaminCircularProgressBarSizes.smallSize(),
                            content = {
                                ImageCircular(
                                    painter = painterResource(id = R.drawable.store_decathlon),
                                    contentDescription = "Decathlon Store"
                                )
                            }
                        )
                        VitaminProgressBars.Circular(
                            modifier = Modifier.progressScreenModifier(),
                            size = VitaminCircularProgressBarSizes.smallSize(),
                            content = {
                                ImageCircular(
                                    painter = painterResource(id = R.drawable.store_decathlon),
                                    contentDescription = "Decathlon Store"
                                )
                            }
                        )
                    }
                }
                item {
                    ProgressRow {
                        VitaminProgressBars.Circular(
                            progress = 0.6f,
                            modifier = Modifier.progressScreenModifier(),
                            size = VitaminCircularProgressBarSizes.mediumSize(),
                            content = {
                                ProgressIndicatorText()
                            }
                        )
                        VitaminProgressBars.Circular(
                            modifier = Modifier.progressScreenModifier(),
                            size = VitaminCircularProgressBarSizes.mediumSize(),
                            content = {
                                ProgressIndicatorText()
                            }
                        )
                    }
                }
                item {
                    ProgressRow {
                        VitaminProgressBars.Circular(
                            progress = 0.6f,
                            modifier = Modifier.progressScreenModifier(),
                            size = VitaminCircularProgressBarSizes.smallSize(),
                        )
                        VitaminProgressBars.Circular(
                            progress = 0.9f,
                            modifier = Modifier.progressScreenModifier(),
                            size = VitaminCircularProgressBarSizes.smallSize(),
                            content = {
                                ProgressIndicatorText()
                            }
                        )
                    }
                }
                item {
                    ProgressRow {
                        VitaminProgressBars.Circular(
                            modifier = Modifier.progressScreenModifier(),
                            size = VitaminCircularProgressBarSizes.mediumSize(),
                        )
                        VitaminProgressBars.Circular(
                            modifier = Modifier.progressScreenModifier(),
                            size = VitaminCircularProgressBarSizes.smallSize(),
                        )
                    }
                }
            }
        }
    }
}

@Composable
internal fun ProgressRow(
    content: @Composable RowScope.() -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        content = content
    )
}

internal fun Modifier.progressScreenModifier(
    firstItem: Boolean = false,
    lastItem: Boolean = false
) = this
    .wrapContentSize()
    .padding(
        top = if (firstItem) 15.dp else 10.dp,
        start = 15.dp,
        end = 15.dp,
        bottom = if (lastItem) 15.dp else 10.dp
    )

@Preview(showBackground = true)
@Composable
fun ProgressBarPreview() {
    VitaminTheme {
        Progress.Screen()
    }
}