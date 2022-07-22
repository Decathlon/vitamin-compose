package com.decathlon.vitamin.compose.prices

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.text
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object VitaminPrices {
    /**
     * A price is used to display the monetary value of a product or service.
     * @param text The text of the price
     * @param modifier The [Modifier] to be applied to the component
     * @param colors The colors of the background and the content elements
     * @param sizes The sizes for the text
     */
    @Composable
    fun Default(
        text: String,
        modifier: Modifier = Modifier,
        colors: PriceColors = VitaminPriceColors.default(),
        sizes: PriceSizes = VitaminPriceSizes.medium(),
    ) = VitaminPriceImpl(
        text = text,
        colors = colors,
        sizes = sizes,
        modifier = modifier
    )

    /**
     * Accent price is used to display the monetary value of a product or service.
     * @param text The text of the price
     * @param modifier The [Modifier] to be applied to the component
     * @param colors The colors of the background and the content elements
     * @param sizes The sizes for the text
     */
    @Composable
    fun Accent(
        text: String,
        modifier: Modifier = Modifier,
        colors: PriceColors = VitaminPriceColors.accent(),
        sizes: PriceSizes = VitaminPriceSizes.medium(),
    ) = VitaminPriceImpl(
        text = text,
        colors = colors,
        sizes = sizes,
        modifier = modifier
    )

    /**
     * Alert price is used to display the monetary value of a product or service.
     * @param text The text of the price
     * @param modifier The [Modifier] to be applied to the component
     * @param colors The colors of the background and the content elements
     * @param sizes The sizes for the text
     */
    @Composable
    fun Alert(
        text: String,
        modifier: Modifier = Modifier,
        colors: PriceColors = VitaminPriceColors.alert(),
        sizes: PriceSizes = VitaminPriceSizes.medium(),
    ) = VitaminPriceImpl(
        text = text,
        colors = colors,
        sizes = sizes,
        modifier = modifier
    )

    /**
     * Strikethrough price is used to display the monetary value of a product or service.
     * @param text The text of the price
     * @param modifier The [Modifier] to be applied to the component
     * @param colors The colors of the background and the content elements
     * @param sizes The sizes for the text
     */
    @Composable
    fun Strikethrough(
        text: String,
        modifier: Modifier = Modifier,
        colors: PriceColors = VitaminPriceColors.strikethrough(),
        sizes: PriceSizes = VitaminPriceSizes.medium(),
    ) = VitaminPriceImpl(
        text = text,
        colors = colors,
        sizes = sizes,
        modifier = modifier,
        strikethrough = true
    )
}

@Composable
internal fun VitaminPriceImpl(
    text: String,
    sizes: PriceSizes,
    colors: PriceColors,
    modifier: Modifier = Modifier,
    strikethrough: Boolean = false
) {
    val textStyle = sizes.textStyle.let {
        if (strikethrough) {
            it.copy(textDecoration = TextDecoration.LineThrough)
        } else {
            it
        }
    }

    val accessibleStrikethroughText = stringResource(id = R.string.vtmn_price_strikethrough, text)
    Text(
        text = text,
        color = colors.contentColor,
        style = textStyle,
        modifier = modifier
            .background(colors.backgroundColor, VitaminTheme.shapes.radius100)
            .padding(horizontal = 8.dp, vertical = 2.dp)
            .semantics {
                if (strikethrough) {
                    this.text = AnnotatedString(accessibleStrikethroughText)
                }
            }
    )
}

@Preview
@Composable
private fun PreviewPriceDefaultMedium() {
    VitaminTheme {
        VitaminPrices.Default(text = "250,00 €", sizes = VitaminPriceSizes.medium())
    }
}

@Preview
@Composable
private fun PreviewPriceAccentMedium() {
    VitaminTheme {
        VitaminPrices.Accent(
            text = "250,00 €",
            sizes = VitaminPriceSizes.medium()
        )
    }
}

@Preview
@Composable
private fun PreviewPriceAlertLarge() {
    VitaminTheme {
        VitaminPrices.Alert(text = "250,00 €", sizes = VitaminPriceSizes.large())
    }
}

@Preview
@Composable
private fun PreviewPriceStrikethroughSmall() {
    VitaminTheme {
        VitaminPrices.Strikethrough(text = "250,00 €", sizes = VitaminPriceSizes.small())
    }
}
