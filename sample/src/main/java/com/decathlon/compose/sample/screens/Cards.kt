package com.decathlon.compose.sample.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement.Bottom
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.decathlon.compose.sample.R
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.buttons.VitaminButtons
import com.decathlon.vitamin.compose.buttons.VitaminIconButtons
import com.decathlon.vitamin.compose.cards.VitaminCards
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.vtmnTypography

object Cards : Screen {
    override val name: String
        get() = "Cards"

    override val navigationKey: String
        get() = "cards"

    @Composable
    override fun Screen(navController: NavController?) {
        SampleScaffold(
            title = Checkboxes.name,
            onBackClick = {
                navController?.popBackStack()
            }
        ) {
            Column(
                modifier = Modifier.verticalScroll(ScrollState(0))
            ) {
                MediaTopFitImage()
                MediaTopFullImage()
                MediaTopFullImageSolid()
                MediaFullImageGradient()
                SideImage()
                WithoutImage()
            }
        }
    }

    @Composable
    private fun WithoutImage() {
        Text(
            text = "Without image",
            style = vtmnTypography.h6,
            modifier = Modifier.padding(start = 32.dp, top = 16.dp)
        )
        VitaminCards.Primary(
            modifier = Modifier.padding(
                top = 16.dp, bottom = 16.dp, start = 32.dp, end = 32.dp
            )
        ) {
            BottomContent(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize()
            )
        }
    }

    @Composable
    private fun SideImage() {
        Text(
            text = "Side image",
            style = vtmnTypography.h6,
            modifier = Modifier.padding(start = 32.dp, top = 16.dp)
        )
        VitaminCards.Primary(
            modifier = Modifier.padding(
                top = 16.dp, bottom = 16.dp, start = 32.dp, end = 32.dp
            )
        ) {
            Column(
                Modifier.padding(16.dp), horizontalAlignment = Alignment.End
            ) {
                Row {
                    Image(
                        modifier = Modifier
                            .width(96.dp)
                            .aspectRatio(1f),
                        painter = painterResource(id = R.drawable.store_decathlon),
                        contentScale = ContentScale.Crop,
                        contentDescription = null
                    )
                    BottomContent(
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .fillMaxWidth()
                    )
                }
                VitaminIconButtons.Ghost(
                    modifier = Modifier.padding(top = 4.dp),
                    icon = painterResource(id = R.drawable.ic_add_fill),
                    contentDescription = null
                ) {}
            }
        }
    }

    @Composable
    private fun MediaFullImageGradient() {
        Text(
            text = "Media full image gradient",
            style = vtmnTypography.h6,
            modifier = Modifier.padding(start = 32.dp, top = 16.dp)
        )
        VitaminCards.Primary(
            modifier = Modifier
                .padding(
                    top = 16.dp, bottom = 16.dp, start = 32.dp, end = 32.dp
                )
                .height(250.dp)
        ) {
            Image(
                modifier = Modifier.fillMaxWidth(),
                painter = painterResource(id = R.drawable.store_decathlon),
                contentScale = ContentScale.FillWidth,
                contentDescription = null
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent, Color.Black
                            )
                        )
                    )
            )
            Box(
                modifier = Modifier
                    .height(250.dp)
                    .padding(16.dp)
                    .fillMaxSize()
            ) {
                BottomContent(
                    modifier = Modifier.fillMaxSize(),
                    textColor = VitaminTheme.colors.vtmnContentPrimaryReversed,
                    displayButton = true
                )
            }
        }
    }

    @Composable
    private fun MediaTopFullImageSolid() {
        Text(
            text = "Media top full image solid",
            style = vtmnTypography.h6,
            modifier = Modifier.padding(start = 32.dp, top = 16.dp)
        )
        VitaminCards.Primary(
            modifier = Modifier
                .padding(
                    top = 16.dp, bottom = 16.dp, start = 32.dp, end = 32.dp
                )
                .height(250.dp)
        ) {
            Image(
                modifier = Modifier.fillMaxWidth(),
                painter = painterResource(id = R.drawable.store_decathlon),
                contentScale = ContentScale.FillWidth,
                contentDescription = null
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Color.Black.copy(alpha = 0.4f)
                    )
            )
            Box(
                modifier = Modifier
                    .height(250.dp)
                    .padding(16.dp)
                    .fillMaxSize()
            ) {
                BottomContent(
                    modifier = Modifier.fillMaxSize(),
                    textColor = VitaminTheme.colors.vtmnContentPrimaryReversed,
                    displayButton = true
                )
            }
        }
    }

    @Composable
    private fun MediaTopFullImage() {
        Text(
            text = "Media top (full image)",
            style = vtmnTypography.h6,
            modifier = Modifier.padding(start = 32.dp, top = 16.dp)
        )
        VitaminCards.Primary(
            modifier = Modifier.padding(
                top = 16.dp, bottom = 16.dp, start = 32.dp, end = 32.dp
            )
        ) {
            Column {
                Image(
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillWidth,
                    painter = painterResource(id = R.drawable.store_decathlon),
                    contentDescription = null
                )
                BottomContent(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxSize()
                )
            }
        }
    }

    @Composable
    private fun MediaTopFitImage() {
        Text(
            text = "Media top (fit image)",
            style = vtmnTypography.h6,
            modifier = Modifier.padding(start = 32.dp, top = 16.dp)
        )
        VitaminCards.Primary(
            modifier = Modifier.padding(
                top = 16.dp, bottom = 16.dp, start = 32.dp, end = 32.dp
            )
        ) {
            Box(modifier = Modifier.padding(16.dp)) {
                Column {
                    Image(
                        modifier = Modifier.fillMaxWidth(),
                        contentScale = ContentScale.FillWidth,
                        painter = painterResource(id = R.drawable.store_decathlon),
                        contentDescription = null
                    )
                    BottomContent(
                        modifier = Modifier
                            .padding(top = 16.dp)
                            .fillMaxSize()
                    )
                }
            }
        }
    }
}

@Composable
private fun BottomContent(
    modifier: Modifier,
    textColor: Color = VitaminTheme.colors.vtmnContentPrimary,
    displayButton: Boolean = false
) {
    Column(modifier = modifier, verticalArrangement = Bottom) {
        Text(
            text = "Card title", style = VitaminTheme.typography.h6, color = textColor
        )
        Text(
            text = "A container for content representing a single entity. e.g. a contact, article, or task.",
            style = VitaminTheme.typography.text3,
            color = textColor
        )

        if (displayButton) {
            VitaminButtons.PrimaryReversed(
                modifier = Modifier.padding(top = 12.dp), text = "Button"
            ) {}
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    VitaminTheme {
        Cards.Screen(null)
    }
}
