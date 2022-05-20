package com.decathlon.vitamin.compose.cards.previews

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.decathlon.vitamin.compose.cards.VitaminCards
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Preview
@Composable
fun previewWithoutImageTitleAndText() {
    VitaminTheme {
        VitaminCards.WithoutImage(
            content = {
                TitleAndText(
                    title = "Card without image",
                    text = "A container for content representing a single entity. e.g. a contact, article, or task." +
                        "A container for content representing a single entity. e.g. a contact, article, or task." +
                        "A container for content representing a single entity. e.g. a contact, article, or task." +
                        "A container for content representing a single entity. e.g. a contact, article, or task.",
                )
            }
        )
    }
}

@Preview
@Composable
fun previewWithoutImageCustomContent() {
    VitaminTheme {
        VitaminCards.WithoutImage(
            content = {
                Text(
                    text = "Card without image - Custom content"
                )
            }
        )
    }
}
