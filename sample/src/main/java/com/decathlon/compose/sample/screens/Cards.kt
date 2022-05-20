package com.decathlon.compose.sample.screens

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.cards.R
import com.decathlon.vitamin.compose.cards.SideImageActionContent
import com.decathlon.vitamin.compose.cards.VitaminCardImageScale
import com.decathlon.vitamin.compose.cards.VitaminCards
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.tags.VitaminTag
import com.decathlon.vitamin.compose.tags.VitaminTagColors

object Cards : Screen {
    override val name: String
        get() = "Cards"

    override val navigationKey: String
        get() = "Cards"

    @SuppressWarnings("LongMethod", "MaxLineLength")
    @Composable
    override fun Screen() {
        val context = LocalContext.current

        SampleScaffold(title = name) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 4.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                item {
                    Text(
                        text = "Side cards",
                        style = VitaminTheme.typography.h2,
                        modifier = Modifier.semantics {
                            heading()
                        }
                    )
                }

                item {
                    VitaminCards.SideImage(
                        painter = rememberAsyncImagePainter(
                            "https://picsum.photos/400/400",
                            placeholder = painterResource(id = R.drawable.card_placeholder)
                        ),
                        contentDescription = "Red bike with nice blue bell",
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

                item {
                    VitaminCards.SideImage(
                        painter = rememberAsyncImagePainter(
                            "https://picsum.photos/400/400",
                            placeholder = painterResource(id = R.drawable.card_placeholder)
                        ),
                        contentDescription = "Red bike with nice blue bell",
                        content = {
                            Column {
                                Text(text = "Custom content")
                                Icon(Icons.Default.ShoppingCart, contentDescription = null)
                            }
                        }
                    )
                }

                item {
                    VitaminCards.SideImage(
                        painter = rememberAsyncImagePainter(
                            "https://picsum.photos/200/200",
                            placeholder = painterResource(id = R.drawable.card_placeholder)
                        ),
                        contentDescription = "Red bike with nice blue bell",
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

                item {
                    Text(
                        text = "Full cards",
                        style = VitaminTheme.typography.h2,
                        modifier = Modifier.semantics {
                            heading()
                        }
                    )
                }

                item {
                    VitaminCards.FullImage(
                        painter = rememberAsyncImagePainter(
                            "https://picsum.photos/300/200",
                            placeholder =
                            painterResource(id = R.drawable.card_placeholder)
                        ),
                        contentDescription = "We should set here a description " +
                            "of the content if not decorative, otherwise null",
                        content = {
                            TitleTextAndButton(
                                title = "Card Title - Clickable card",
                                text = "A container for content representing a single entity. " +
                                    "e.g. a contact, article, or task.",
                                buttonText = "Button",
                                onButtonClick = {
                                    Toast.makeText(context, "Click on Button!", Toast.LENGTH_SHORT)
                                        .show()
                                }
                            )
                        },
                        modifier = Modifier.clickable {
                            Toast.makeText(context, "Click on Card!", Toast.LENGTH_SHORT)
                                .show()
                        }
                    )
                }

                item {
                    VitaminCards.FullImage(
                        painter = rememberAsyncImagePainter(
                            "https://picsum.photos/300/200",
                            placeholder =
                            painterResource(id = R.drawable.card_placeholder)
                        ),
                        contentDescription = "We should set here a description " +
                            "of the content if not decorative, otherwise null",
                        imageWithGradient = true,
                        content = {
                            TitleTextAndButton(
                                title = "Card Title - Card with Gradient",
                                text = "A container for content representing a single entity. " +
                                    "e.g. a contact, article, or task.",
                                buttonText = "Button",
                                onButtonClick = {
                                    Toast.makeText(context, "Click on Button!", Toast.LENGTH_SHORT)
                                        .show()
                                }
                            )
                        }
                    )
                }

                item {
                    Text(
                        text = "Top cards",
                        style = VitaminTheme.typography.h2,
                        modifier = Modifier.semantics {
                            heading()
                        }
                    )
                }
                item {
                    VitaminCards.TopImage(
                        painter = rememberAsyncImagePainter(
                            "https://picsum.photos/300/200",
                            placeholder =
                            painterResource(id = R.drawable.card_placeholder)
                        ),
                        contentDescription = "We should set here a description " +
                            "of the content if not decorative, otherwise null",
                        content = {
                            TitleAndText(
                                title = "Card  Top Fit",
                                text = "A container for content representing a single entity. " +
                                    "e.g. a contact, article, or task."
                            )
                        }
                    )
                }

                item {
                    VitaminCards.TopImage(
                        painter = rememberAsyncImagePainter(
                            "https://picsum.photos/300/200",
                            placeholder =
                            painterResource(id = R.drawable.card_placeholder)
                        ),
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

                item {
                    VitaminCards.TopImage(
                        painter = rememberAsyncImagePainter(
                            "https://picsum.photos/300/200",
                            placeholder =
                            painterResource(id = R.drawable.card_placeholder)
                        ),
                        contentDescription = "We should set here a description " +
                            "of the content if not decorative, otherwise null",
                        imageScale = VitaminCardImageScale.Full,
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

                item {
                    VitaminCards.TopImage(
                        painter = rememberAsyncImagePainter(
                            "https://picsum.photos/300/200",
                            placeholder =
                            painterResource(id = R.drawable.card_placeholder)
                        ),
                        contentDescription = "We should set here a description " +
                            "of the content if not decorative, otherwise null",
                        imageScale = VitaminCardImageScale.Full,
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

                item {
                    VitaminCards.TopImage(
                        painter = rememberAsyncImagePainter(
                            "https://picsum.photos/300/200",
                            placeholder =
                            painterResource(id = R.drawable.card_placeholder)
                        ),
                        contentDescription = "We should set here a description " +
                            "of the content if not decorative, otherwise null",
                        imageScale = VitaminCardImageScale.Full,
                        content = {
                            TitleAndText(
                                title = "Card Title - Clickable card",
                                text = "A container for content representing a single entity. " +
                                    "e.g. a contact, article, or task."
                            )
                        },
                        modifier = Modifier.clickable {
                            Toast.makeText(context, "Click !", Toast.LENGTH_SHORT).show()
                        }
                    )
                }

                item {
                    Text(
                        text = "Without image cards",
                        style = VitaminTheme.typography.h2,
                        modifier = Modifier.semantics {
                            heading()
                        }
                    )
                }

                item {
                    VitaminCards.WithoutImage(
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

                item {
                    VitaminCards.WithoutImage(
                        content = {
                            Text(
                                text = "Custom content"
                            )
                        }
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewCardsScreen() {
    VitaminTheme(darkTheme = true) {
        Cards.Screen()
    }
}
