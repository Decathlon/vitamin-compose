package com.decathlon.compose.sample.screens

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.vtmnTypography
import com.decathlon.vitamin.compose.skeleton.VitaminSkeleton
import com.decathlon.vitamin.compose.skeleton.vtmnSkeleton

object Skeleton : Screen {
    override val name: String
        get() = "Skeleton"

    override val navigationKey: String
        get() = "skeleton"

    @SuppressWarnings("LongMethod")
    @Composable
    override fun Screen() {
        SampleScaffold(title = name) {

            Column(
                modifier = Modifier
                    .padding(top = 16.dp, start = 16.dp, end = 16.dp)
                    .verticalScroll(
                        ScrollState(initial = 0)
                    )
            ) {
                Text(
                    text = "Classic list examples",
                    style = vtmnTypography.h6,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                repeat((0..2).count()) {
                    Row(Modifier.padding(top = 16.dp)) {
                        VitaminSkeleton.Rounded(
                            modifier = Modifier.size(80.dp, 80.dp)
                        )
                        SkeletonTextLines(modifier = Modifier.weight(1f))
                    }
                }

                Spacer(modifier = Modifier.height(32.dp))

                repeat((0..2).count()) {

                    Row(Modifier.padding(top = 16.dp)) {
                        VitaminSkeleton.Rectangular(
                            modifier = Modifier.size(80.dp, 80.dp),
                            cornerRadius = 4.dp
                        )

                        SkeletonTextLines(modifier = Modifier.weight(1f))
                    }
                }

                Text(
                    text = "Other shape examples",
                    style = vtmnTypography.h6,
                    modifier = Modifier.padding(top = 32.dp)
                )

                Row {
                    VitaminSkeleton.Rectangular(
                        modifier = Modifier
                            .padding(top = 32.dp)
                            .height(60.dp)
                            .weight(1f)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                }

                Row {
                    VitaminSkeleton.Rectangular(
                        modifier = Modifier
                            .padding(top = 16.dp)
                            .size(80.dp, 60.dp)
                            .weight(2f),
                        cornerRadius = 8.dp
                    )
                    Spacer(modifier = Modifier.weight(1f))
                }

                Row {
                    VitaminSkeleton.Rectangular(
                        modifier = Modifier
                            .padding(top = 16.dp)
                            .size(80.dp, 60.dp)
                            .weight(8f),
                        cornerRadius = 30.dp
                    )
                    Spacer(modifier = Modifier.weight(1f))
                }


                Row {
                    VitaminSkeleton.Rounded(
                        modifier = Modifier
                            .padding(top = 16.dp)
                            .size(50.dp, 50.dp)
                    )

                    VitaminSkeleton.Rounded(
                        modifier = Modifier
                            .padding(top = 16.dp, start = 16.dp)
                            .size(20.dp, 50.dp)
                    )

                    Column {
                        VitaminSkeleton.Rounded(
                            modifier = Modifier
                                .padding(top = 16.dp, start = 16.dp)
                                .size(50.dp, 20.dp)
                        )

                        Row {
                            VitaminSkeleton.Rounded(
                                modifier = Modifier
                                    .padding(top = 8.dp, start = 16.dp)
                                    .size(25.dp, 25.dp)
                            )
                            VitaminSkeleton.Rounded(
                                modifier = Modifier
                                    .padding(top = 8.dp, start = 8.dp)
                                    .size(15.dp, 15.dp)
                            )
                        }
                    }

                    VitaminSkeleton.Rectangular(
                        modifier = Modifier
                            .padding(top = 16.dp, start = 16.dp)
                            .size(50.dp, 50.dp)
                    )

                    VitaminSkeleton.Rectangular(
                        modifier = Modifier
                            .padding(top = 16.dp, start = 16.dp)
                            .size(50.dp, 50.dp),
                        cornerRadius = 4.dp
                    )

                    VitaminSkeleton.Rectangular(
                        modifier = Modifier
                            .padding(top = 16.dp, start = 16.dp)
                            .size(50.dp, 50.dp),
                        cornerRadius = 10.dp
                    )
                }

                Box(
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .height(200.dp)
                        .fillMaxWidth()
                        .vtmnSkeleton()
                )
            }
        }
    }
}


@Composable
fun SkeletonTextLines(modifier: Modifier) {
    Column(
        modifier
            .padding(start = 16.dp)
            .height(80.dp),
        verticalArrangement = Arrangement.Center
    ) {
        VitaminSkeleton.Rectangular(
            modifier = Modifier
                .height(20.dp)
                .fillMaxWidth(),
            cornerRadius = 4.dp
        )
        Row {
            VitaminSkeleton.Rectangular(
                modifier = Modifier
                    .padding(top = 8.dp)
                    .height(20.dp)
                    .fillMaxWidth()
                    .weight(1f),
                cornerRadius = 4.dp
            )
            Spacer(modifier = Modifier.weight(1f))
        }

    }
}

@Preview(showBackground = true)
@Composable
fun SkeletonPreview() {
    VitaminTheme {
        Skeleton.Screen()
    }
}
