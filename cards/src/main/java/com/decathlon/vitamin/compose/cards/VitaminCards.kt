package com.decathlon.vitamin.compose.cards

import androidx.compose.material.Card
import androidx.compose.material.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier

object VitaminCards {

    /**
     * The card is a flexible and extensible content container
     * @param modifier The [Modifier] to be applied to the component
     * @param colors The colors for the card, background and content colors of the card can be customized
     * @param sizes The sizes for the card, elevation and radius can be customized
     * @param content The content to add inside the card
     */
    @Composable
    fun Primary(
        modifier: Modifier = Modifier,
        colors: CardColors = VitaminCardsColors.primary(),
        sizes: CardSizes = VitaminCardSizes.medium(),
        content: @Composable () -> Unit
    ) {
        Card(
            modifier = modifier,
            backgroundColor = colors.backgroundColor,
            elevation = sizes.elevation,
            content = {
                CompositionLocalProvider(
                    LocalContentColor provides colors.contentColor,
                    content = content
                )
            },
            shape = sizes.radius
        )
    }
}
