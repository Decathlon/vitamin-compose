package com.decathlon.vitamin.compose.cards.previews

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.cards.R
import com.decathlon.vitamin.compose.cards.VitaminCardImageScale
import com.decathlon.vitamin.compose.cards.VitaminCards
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.tags.VitaminTag
import com.decathlon.vitamin.compose.tags.VitaminTagColors

@Preview
@Composable
fun PreviewCardsTopImage() {
    VitaminTheme {
        VitaminCards.TopImage(
            painter = painterResource(id = R.drawable.card_placeholder),
            contentDescription = "We should set here a description " +
                "of the content if not decorative, otherwise null",
            imageScale = VitaminCardImageScale.Full,
            content = {
                TitleAndText(
                    title = "Card Top full",
                    text = "A container for content representing a single entity. " +
                        "e.g. a contact, article, or task."
                )
            }
        )
    }
}

@Preview
@Composable
fun PreviewCardsTopImageCustomContent() {
    VitaminTheme {
        VitaminCards.TopImage(
            painter = painterResource(id = R.drawable.card_placeholder),
            contentDescription = "We should set here a description " +
                "of the content if not decorative, otherwise null",
            content = {
                Text(
                    text = "Custom content"
                )
            }
        )
    }
}

@Preview
@Composable
fun PreviewCardsTopImageWithOverlay() {
    VitaminTheme {
        VitaminCards.TopImage(
            painter = painterResource(id = R.drawable.card_placeholder),
            contentDescription = "We should set here a description " +
                "of the content if not decorative, otherwise null",
            content = {
                TitleAndText(
                    title = "Card Top with overlay (tags) on image",
                    text = "A container for content representing a single entity. " +
                        "e.g. a contact, article, or task."
                )
            },
            imageOverlay = {
                Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                    VitaminTag(
                        label = "Tag",
                        color = VitaminTagColors.decorativeBrick
                    )
                    VitaminTag(label = "Tag 2", color = VitaminTagColors.alert)
                    VitaminTag(
                        label = "Tag 3",
                        color = VitaminTagColors.decorativeGravel
                    )
                }
            }
        )
    }
}

@Preview
@Composable
fun PreviewCardsTopImageWithOverlayBottomEnd() {
    VitaminTheme {
        VitaminCards.TopImage(
            painter = painterResource(id = R.drawable.card_placeholder),
            contentDescription = "We should set here a description " +
                "of the content if not decorative, otherwise null",
            content = {
                TitleAndText(
                    title = "Card Top with overlay (tags) on image at bottom end",
                    text = "A container for content representing a single entity. " +
                        "e.g. a contact, article, or task."
                )
            },
            imageOverlay = {
                Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                    VitaminTag(
                        label = "Tag", color = VitaminTagColors.decorativeBrick
                    )
                    VitaminTag(
                        label = "Tag 2", color = VitaminTagColors.alert
                    )
                    VitaminTag(
                        label = "Tag 3",
                        color = VitaminTagColors.decorativeGravel
                    )
                }
            },
            imageOverlayAlignment = Alignment.BottomEnd
        )
    }
}

@Preview
@Composable
fun PreviewCardsTopImageClickable() {
    VitaminTheme {
        VitaminCards.TopImage(
            painter = painterResource(id = R.drawable.card_placeholder),
            contentDescription = "We should set here a description " +
                "of the content if not decorative, otherwise null",
            content = {
                TitleAndText(
                    title = "Card Title - Clickable card",
                    text = "A container for content representing a single entity. " +
                        "e.g. a contact, article, or task."
                )
            },
            modifier = Modifier.clickable {}
        )
    }
}
