package com.decathlon.compose.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
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
import com.decathlon.vitamin.compose.progressbars.VitaminCircularProgressBarSizes
import com.decathlon.vitamin.compose.progressbars.VitaminLinearProgressBarSizes
import com.decathlon.vitamin.compose.progressbars.VitaminProgressBars

object Progress : Screen {
    override val name: String
        get() = "Progress"

    override val navigationKey: String
        get() = "progress"

    @SuppressWarnings("LongMethod")
    @Composable
    override fun Screen() {
        SampleScaffold(title = name) {
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                item {
                    VitaminProgressBars.Linear(
                        progress = 0.8f,
                        modifier = Modifier.progressScreenModifier(firstItem = true),
                        sizes = VitaminLinearProgressBarSizes.small()
                    )
                }
                item {
                    VitaminProgressBars.Linear(
                        progress = 0.9f,
                        modifier = Modifier.progressScreenModifier(),
                        sizes = VitaminLinearProgressBarSizes.medium()
                    )
                }
                item {
                    VitaminProgressBars.Linear(
                        progress = 0.05f,
                        modifier = Modifier.progressScreenModifier(),
                        sizes = VitaminLinearProgressBarSizes.large()
                    )
                }
                item {
                    VitaminProgressBars.Linear(
                        progress = 0.1f,
                        modifier = Modifier.progressScreenModifier(),
                        sizes = VitaminLinearProgressBarSizes.small(),
                        label = "Download"
                    )
                }
                item {
                    VitaminProgressBars.Linear(
                        progress = 0.35f,
                        modifier = Modifier.progressScreenModifier(),
                        sizes = VitaminLinearProgressBarSizes.medium(),
                        label = "Download"
                    )
                }
                item {
                    VitaminProgressBars.Linear(
                        progress = 0.7f,
                        modifier = Modifier.progressScreenModifier(),
                        sizes = VitaminLinearProgressBarSizes.large(),
                        label = "Download"
                    )
                }
                item {
                    VitaminProgressBars.Linear(
                        modifier = Modifier.progressScreenModifier(),
                        sizes = VitaminLinearProgressBarSizes.small(),
                        label = "Loading"
                    )
                }
                item {
                    VitaminProgressBars.Linear(
                        modifier = Modifier.progressScreenModifier(),
                        sizes = VitaminLinearProgressBarSizes.medium(),
                        label = "Loading"
                    )
                }
                item {
                    VitaminProgressBars.Linear(
                        modifier = Modifier.progressScreenModifier(),
                        sizes = VitaminLinearProgressBarSizes.large(),
                        label = "Loading"
                    )
                }
                item {
                    VitaminProgressBars.Linear(
                        modifier = Modifier.progressScreenModifier(),
                        sizes = VitaminLinearProgressBarSizes.small()
                    )
                }
                item {
                    VitaminProgressBars.Linear(
                        modifier = Modifier.progressScreenModifier(),
                        sizes = VitaminLinearProgressBarSizes.medium()
                    )
                }
                item {
                    VitaminProgressBars.Linear(
                        modifier = Modifier.progressScreenModifier(),
                        sizes = VitaminLinearProgressBarSizes.large()
                    )
                }
                item {
                    ProgressRow {
                        VitaminProgressBars.Circular(
                            progress = 0.6f,
                            modifier = Modifier.progressScreenModifier(),
                            sizes = VitaminCircularProgressBarSizes.medium(),
                            content = {
                                ImageCircular(
                                    painter = painterResource(id = R.drawable.store_decathlon),
                                    contentDescription = "Decathlon Store"
                                )
                            }
                        )
                        VitaminProgressBars.Circular(
                            modifier = Modifier.progressScreenModifier(),
                            sizes = VitaminCircularProgressBarSizes.medium(),
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
                            sizes = VitaminCircularProgressBarSizes.small(),
                            content = {
                                ImageCircular(
                                    painter = painterResource(id = R.drawable.store_decathlon),
                                    contentDescription = "Decathlon Store"
                                )
                            }
                        )
                        VitaminProgressBars.Circular(
                            modifier = Modifier.progressScreenModifier(),
                            sizes = VitaminCircularProgressBarSizes.small(),
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
                            sizes = VitaminCircularProgressBarSizes.medium(),
                            content = {
                                ProgressIndicatorText()
                            }
                        )
                        VitaminProgressBars.Circular(
                            modifier = Modifier.progressScreenModifier(),
                            sizes = VitaminCircularProgressBarSizes.medium(),
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
                            sizes = VitaminCircularProgressBarSizes.small(),
                        )
                        VitaminProgressBars.Circular(
                            progress = 0.9f,
                            modifier = Modifier.progressScreenModifier(),
                            sizes = VitaminCircularProgressBarSizes.small(),
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
                            sizes = VitaminCircularProgressBarSizes.medium(),
                        )
                        VitaminProgressBars.Circular(
                            modifier = Modifier.progressScreenModifier(),
                            sizes = VitaminCircularProgressBarSizes.small(),
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
): Modifier {
    val top = if (firstItem) 15.dp else 10.dp
    val bottom = if (lastItem) 15.dp else 10.dp
    return this
        .wrapContentSize()
        .padding(top = top, start = 15.dp, end = 15.dp, bottom = bottom)
}

@Preview(showBackground = true)
@Composable
private fun ProgressBarPreview() {
    VitaminTheme {
        Progress.Screen()
    }
}
