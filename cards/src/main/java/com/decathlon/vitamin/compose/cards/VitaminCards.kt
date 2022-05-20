package com.decathlon.vitamin.compose.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.buttons.VitaminButtons
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.vtmnLightColorPalette

object VitaminCards {
    /**
     * A card with image at top
     * @param painter the [Painter] resource for the image
     * @param contentDescription to describe image for screen reader. Set to null only if image is decorative.
     * @param content The content of the card. Can be a composable from [TopImageContent] or a custom composable.
     * @param modifier The `Modifier` to be applied to the all card.
     * @param shape to change the shape of the card.
     * @param imageScale The scale [VitaminCardImageScale] of the image in the card. can be
     * [VitaminCardImageScale.Fit] or
     * [VitaminCardImageScale.Full]
     * @param imageOverlayAlignment The overlay position if overlay is set. Default is [Alignment.TopStart]
     * @param imageOverlay The overlay to set upon the image. No overlay by default.
     */
    @Composable
    fun TopImage(
        painter: Painter,
        contentDescription: String?,
        content: @Composable (TopImageContent.() -> Unit),
        modifier: Modifier = Modifier,
        shape: Shape = RoundedCornerShape(4.dp),
        imageScale: VitaminCardImageScale = VitaminCardImageScale.Fit,
        imageOverlayAlignment: Alignment = Alignment.TopStart,
        imageOverlay: (@Composable () -> Unit)? = null,
    ) = Card(modifier = modifier, shape = shape) {
        Column {
            CardImage(
                painter = painter,
                contentDescription = contentDescription,
                modifier = Modifier.padding(if (imageScale == VitaminCardImageScale.Fit) 16.dp else 0.dp),
                overlay = imageOverlay,
                imageOverlayAlignment = imageOverlayAlignment
            )
            Box(
                modifier = Modifier.padding(16.dp),
            ) {
                TopImageContent.content()
            }
        }
    }

    /**
     * A card with full image in background
     * @param painter the [Painter] resource for the image
     * @param contentDescription to describe image for screen reader. Set to null only if image is decorative.
     * @param content The content of the card. Can be a composable from [FullImageContent] or a custom composable.
     * @param modifier The `Modifier` to be applied to the all card.
     * @param shape to change the shape of the card.
     * @param imageWithGradient A boolean value to add a gradient effect to the image. No gradient by default.
     */
    @Composable
    fun FullImage(
        painter: Painter,
        contentDescription: String?,
        content: @Composable (FullImageContent.() -> Unit),
        modifier: Modifier = Modifier,
        shape: Shape = RoundedCornerShape(4.dp),
        imageWithGradient: Boolean = false,
    ) = Card(modifier = modifier, shape = shape) {
        Box {
            CardImage(
                painter = painter,
                contentDescription = contentDescription,
                withGradient = imageWithGradient
            )
            Box(modifier = Modifier.align(Alignment.BottomStart).padding(16.dp)) {
                FullImageContent.content()
            }
        }
    }

    /**
     * A card with thumbnail image at left
     * @param painter the [Painter] resource for the image
     * @param contentDescription to describe image for screen reader. Set to null only if image is decorative.
     * @param content The content of the card. Can be a composable from [SideImageContent] or a custom composable.
     * @param modifier The `Modifier` to be applied to the all card.
     * @param actionContent to add actions icons at the top end of the card like clickable icon.
     * Can be a composable from [SideImageActionContent] or a custom composable.
     * @param shape to change the shape of the card.
     */
    @Composable
    fun SideImage(
        painter: Painter,
        contentDescription: String?,
        content: (@Composable SideImageContent.() -> Unit),
        modifier: Modifier = Modifier,
        actionContent: @Composable (SideImageActionContent.() -> Unit)? = null,
        shape: Shape = RoundedCornerShape(4.dp),
    ) = Card(modifier = modifier, shape = shape) {
        Column {
            if (actionContent != null) {
                SideImageActionContent.actionContent()
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .padding(
                        top = if (actionContent != null) {
                            0.dp
                        } else {
                            16.dp
                        },
                        bottom = 16.dp,
                        start = 16.dp,
                        end = 16.dp
                    )
            ) {
                CardImage(
                    painter = painter,
                    contentDescription = contentDescription,
                    isSideImage = true,
                    modifier = Modifier.weight(weight = 1f).aspectRatio(ratio = 1f)
                )
                Box(Modifier.weight(weight = 3f)) {
                    SideImageContent.content()
                }
            }
        }
    }

    /**
     * A card without image
     * @param content The content of the card. Can be a composable from [WithoutImageContent] or a custom composable.
     * @param modifier The `Modifier` to be applied to the all card.
     * @param shape to change the shape of the card.
     */
    @Composable
    fun WithoutImage(
        content: (@Composable WithoutImageContent.() -> Unit),
        modifier: Modifier = Modifier,
        shape: Shape = RoundedCornerShape(4.dp),
    ) = Card(modifier = modifier, shape = shape) {
        Box(modifier = Modifier.padding(16.dp)) {
            WithoutImageContent.content()
        }
    }
}

@Composable
internal fun CardImage(
    painter: Painter,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    overlay: @Composable (() -> Unit)? = null,
    imageOverlayAlignment: Alignment = Alignment.TopStart,
    withGradient: Boolean = false,
    isSideImage: Boolean = false,
) {
    Box(modifier = modifier) {
        Image(
            painter = painter,
            contentDescription = contentDescription,
            contentScale = ContentScale.FillWidth,
            modifier = when {
                withGradient -> {
                    Modifier
                        .fillMaxWidth().withGradient(vtmnLightColorPalette.vtmnBackgroundPrimaryReversed)
                }
                isSideImage -> {
                    Modifier.fillMaxSize()
                }
                else -> {
                    Modifier.fillMaxWidth()
                }
            }
        )
        overlay?.let {
            Box(
                Modifier
                    .padding(8.dp)
                    .align(imageOverlayAlignment)
            ) {
                overlay()
            }
        }
    }
}

@Composable
internal fun CardDescription(
    title: String,
    text: String,
    textColor: Color,
    modifier: Modifier = Modifier,
    buttonText: String? = null,
    onButtonClick: (() -> Unit)? = null
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(2.dp)
    ) {
        Text(
            text = title,
            style = VitaminTheme.typography.h6,
            color = textColor
        )
        Text(
            text = text,
            style = VitaminTheme.typography.body3,
            color = textColor
        )
        if (buttonText != null && onButtonClick != null) {
            VitaminButtons.CardButton(
                text = buttonText,
                modifier = Modifier.padding(vertical = 12.dp)
            ) {
                onButtonClick()
            }
        }
    }
}

enum class VitaminCardImageScale {
    Fit, Full
}

@SuppressWarnings("MagicNumber")
fun Modifier.withGradient(color: Color) = this.drawWithCache {
    onDrawWithContent {
        drawContent()
        drawRect(
            Brush.verticalGradient(
                0.2f to color.copy(alpha = 0f),
                1f to color
            )
        )
    }
}
