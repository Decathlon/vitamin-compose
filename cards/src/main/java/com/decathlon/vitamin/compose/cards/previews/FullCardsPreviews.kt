package com.decathlon.vitamin.compose.cards.previews

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.cards.R
import com.decathlon.vitamin.compose.cards.VitaminCards
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Preview
@Composable
fun PreviewFullCardImageClickable() {
    VitaminTheme {
        VitaminCards.FullImage(
            painterResource(id = R.drawable.card_placeholder),
            contentDescription = "We should set here a description " +
                "of the content if not decorative, otherwise null",
            content = {
                TitleTextAndButton(
                    title = "Card Title - Clickable card",
                    text = "A container for content representing a single entity. " +
                        "e.g. a contact, article, or task.",
                    buttonText = "Button",
                    onButtonClick = {}
                )
            },
            modifier = Modifier.clickable {}
        )
    }
}

@Preview
@Composable
fun PreviewFullCardImageTitleTextAndButton() {
    VitaminTheme {
        VitaminCards.FullImage(
            painterResource(id = R.drawable.card_placeholder),
            contentDescription = "We should set here a description " +
                "of the content if not decorative, otherwise null",
            content = {
                TitleTextAndButton(
                    title = "Card Title",
                    text = "A container for content representing a single entity. " +
                        "e.g. a contact, article, or task.",
                    buttonText = "Button",
                    onButtonClick = {}
                )
            }
        )
    }
}

@Preview
@Composable
fun PreviewCustomFullCardImage() {
    VitaminTheme {
        VitaminCards.FullImage(
            painter = painterResource(id = R.drawable.card_placeholder),
            contentDescription = "We should set here a description " +
                "of the content if not decorative, otherwise null",
            content = {
                Box(
                    modifier = Modifier
                        .background(
                            color = VitaminTheme.colors.vtmnBackgroundSecondary,
                            shape = RoundedCornerShape(6.dp)
                        )
                        .border(BorderStroke(2.dp, SolidColor(VitaminTheme.colors.vtmnActiveBrand)))
                        .padding(24.dp)
                        .fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier
                            .padding(24.dp)
                            .fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Text(
                            text = "Replace this instance",
                            style = VitaminTheme.typography.body2
                        )
                        Text(
                            text = "By your own or vitamin component",
                            style = VitaminTheme.typography.body3
                        )
                    }
                }
            },
            imageWithGradient = true
        )
    }
}
