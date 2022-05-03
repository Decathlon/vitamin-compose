package com.decathlon.vitamin.compose.prices

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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
    @Composable
    fun Default(
        text: String,
        size: VitaminPriceSize = VitaminPriceSizes.medium,
        modifier: Modifier = Modifier
    ) = VitaminPrice(
        text = text,
        size = size,
        modifier = modifier
    )

    @Composable
    fun Accent(
        text: String,
        size: VitaminPriceSize = VitaminPriceSizes.medium,
        modifier: Modifier = Modifier
    ) = VitaminPrice(
        text = text,
        size = size,
        modifier = modifier,
        color = VitaminPriceColors.accent
    )

    @Composable
    fun Alert(
        text: String,
        size: VitaminPriceSize = VitaminPriceSizes.medium,
        modifier: Modifier = Modifier
    ) = VitaminPrice(
        text = text,
        size = size,
        modifier = modifier,
        color = VitaminPriceColors.alert
    )

    @Composable
    fun Strikethrough(
        text: String,
        size: VitaminPriceSize = VitaminPriceSizes.medium,
        modifier: Modifier = Modifier
    ) = VitaminPrice(
        text = text,
        size = size,
        modifier = modifier,
        color = VitaminPriceColors.strikethrough,
        strikethrough = true
    )
}

@Composable
internal fun VitaminPrice(
    text: String,
    size: VitaminPriceSize,
    modifier: Modifier = Modifier,
    color: VitaminPriceColor = VitaminPriceColors.default,
    strikethrough: Boolean = false
) {
    val textStyle = size.textStyle.let {
        if (strikethrough) {
            it.copy(textDecoration = TextDecoration.LineThrough)
        } else {
            it
        }
    }

    val accessibleStrikethroughText = stringResource(id = R.string.vtmn_price_strikethrough, text)
    Text(
        text = text,
        color = color.textColor,
        style = textStyle,
        modifier = modifier
            .background(color.backgroundColor, RoundedCornerShape(4.dp))
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
fun PreviewPriceDefaultMedium() {
    VitaminTheme {
        VitaminPrices.Default(text = "250,00 €", size = VitaminPriceSizes.medium)
    }
}

@Preview
@Composable
fun PreviewPriceAccentMedium() {
    VitaminTheme {
        VitaminPrices.Accent(
            text = "250,00 €",
            size = VitaminPriceSizes.medium
        )
    }
}

@Preview
@Composable
fun PreviewPriceAlertLarge() {
    VitaminTheme {
        VitaminPrices.Alert(text = "250,00 €", size = VitaminPriceSizes.large)
    }
}

@Preview
@Composable
fun PreviewPriceStrikethroughSmall() {
    VitaminTheme {
        VitaminPrices.Strikethrough(text = "250,00 €", size = VitaminPriceSizes.small)
    }
}
