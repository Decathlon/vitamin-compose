package com.decathlon.compose.sample.screens

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.dividers.VitaminDividers
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.vtmnTypography

object Dividers : Screen {
    override val name: String
        get() = "Divider"

    override val navigationKey: String
        get() = "dividers"

    @SuppressWarnings("LongMethod")
    @Composable
    override fun Screen() {
        SampleScaffold(title = name) {
            Column(modifier = Modifier.padding(top = 16.dp).verticalScroll(ScrollState(0))) {
                Text(
                    text = "Full bleed divider",
                    style = vtmnTypography.h6,
                    modifier = Modifier.padding(start = 16.dp)
                )

                repeat((0..2).count()) {
                    DummyContent()

                    VitaminDividers.FullBleed(
                        Modifier
                            .fillMaxWidth()
                            .padding(top = 16.dp)
                    )
                }

                Text(
                    text = "Inset divider",
                    style = vtmnTypography.h6,
                    modifier = Modifier.padding(start = 16.dp, top = 32.dp)
                )

                repeat((0..2).count()) {
                    DummyContent()

                    VitaminDividers.Inset(
                        Modifier
                            .fillMaxWidth()
                            .padding(top = 16.dp)
                    )
                }

                Text(
                    text = "Middle divider",
                    style = vtmnTypography.h6,
                    modifier = Modifier.padding(start = 16.dp, top = 32.dp)
                )

                repeat((0..2).count()) {
                    DummyContent()

                    VitaminDividers.Middle(
                        Modifier
                            .fillMaxWidth()
                            .padding(top = 16.dp)
                    )
                }
            }
        }

    }
}

@Composable
fun DummyContent() {
    Box(
        Modifier
            .padding(top = 16.dp, start = 16.dp)
            .size(96.dp, 18.dp)
            .background(VitaminTheme.colors.vtmnContentSecondary)
    )

    Box(
        Modifier
            .padding(top = 8.dp, start = 16.dp)
            .size(192.dp, 12.dp)
            .background(VitaminTheme.colors.vtmnContentSecondary)
    )
}


@Preview(showBackground = true)
@Composable
fun DividerScreenPreview() {
    VitaminTheme {
        Dividers.Screen()
    }
}
