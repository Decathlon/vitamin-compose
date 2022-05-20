package com.decathlon.vitamin.compose.cards.previews

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.decathlon.vitamin.compose.cards.R
import com.decathlon.vitamin.compose.cards.SideImageActionContent
import com.decathlon.vitamin.compose.cards.VitaminCards
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Preview
@Composable
fun previewSideCardImageTitleAndText() {
    VitaminTheme {
        VitaminCards.SideImage(
            painter = painterResource(id = R.drawable.card_placeholder),
            contentDescription = "Loading image in progress",
            content = {
                TitleAndText(
                    title = "Card Side",
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
fun previewSideCardImageCustomContent() {
    VitaminTheme {
        VitaminCards.SideImage(
            painter = painterResource(id = R.drawable.card_placeholder),
            contentDescription = "Loading image in progress",
            content = {
                Column {
                    Text(text = "Custom content")
                    Icon(Icons.Default.ShoppingCart, contentDescription = null)
                }
            }
        )
    }
}

@Preview
@Composable
fun previewSideCardImageWithActions() {
    VitaminTheme {
        VitaminCards.SideImage(
            painter = painterResource(id = R.drawable.card_placeholder),
            contentDescription = "Loading image in progress",
            content = {
                TitleAndText(
                    title = "Card Title",
                    text = "A container for content representing a single entity. e.g. a contact, article, or task." +
                        "A container for content representing a single entity. e.g. a contact, article, or task." +
                        "A container for content representing a single entity. e.g. a contact, article, or task." +
                        "A container for content representing a single entity. e.g. a contact, article, or task."
                )
            },
            actionContent = {
                Icons(
                    actions = listOf(
                        SideImageActionContent.CardActionItem(
                            painter = painterResource(id = R.drawable.ic_vtmn_add_line),
                            contentDescription = "add"
                        ) {},
                        SideImageActionContent.CardActionItem(
                            painter = painterResource(id = R.drawable.ic_vtmn_close_line),
                            contentDescription = "close"
                        ) {}
                    )
                )
            }
        )
    }
}
