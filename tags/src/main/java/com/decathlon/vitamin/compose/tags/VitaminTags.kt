package com.decathlon.vitamin.compose.tags

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Suppress("TooManyFunctions")
object VitaminTags {
    /**
     * Brand tag can be used to identify your brand DNA inside a list.
     * @param label The item label
     * @param modifier The [Modifier] to be applied to the component
     * @param iconPainter the [Painter] resource used for the icon
     * @param colors define the background and text color used to accentuate the tag
     * @param sizes The sizes for the text, paddings and icon sizes
     * @param onClick The callback to be called when the user click on the tag
     */
    @Composable
    fun Brand(
        label: String,
        modifier: Modifier = Modifier,
        iconPainter: Painter? = null,
        colors: TagColors = VitaminTagColors.brand(),
        sizes: TagSizes = VitaminTagSizes.medium(),
        onClick: (() -> Unit)? = null,
    ) = VitaminTagImpl(
        label = label,
        colors = colors,
        sizes = sizes,
        modifier = modifier,
        iconPainter = iconPainter,
        onClick = onClick
    )

    /**
     * Accent tag accentuate an item.
     * @param label The item label
     * @param modifier The [Modifier] to be applied to the component
     * @param iconPainter the [Painter] resource used for the icon
     * @param colors define the background and text color used to accentuate the tag.
     * @param sizes The sizes for the text, paddings and icon sizes
     * @param onClick The callback to be called when the user click on the tag
     */
    @Composable
    fun Accent(
        label: String,
        modifier: Modifier = Modifier,
        iconPainter: Painter? = null,
        colors: TagColors = VitaminTagColors.accent(),
        sizes: TagSizes = VitaminTagSizes.medium(),
        onClick: (() -> Unit)? = null,
    ) = VitaminTagImpl(
        label = label,
        colors = colors,
        sizes = sizes,
        modifier = modifier,
        iconPainter = iconPainter,
        onClick = onClick
    )

    /**
     * Alert tag accentuate an item.
     * @param label The item label
     * @param modifier The [Modifier] to be applied to the component
     * @param iconPainter the [Painter] resource used for the icon
     * @param colors define the background and text color used to accentuate the tag.
     * @param sizes The sizes for the text, paddings and icon sizes
     * @param onClick The callback to be called when the user click on the tag
     */
    @Composable
    fun Alert(
        label: String,
        modifier: Modifier = Modifier,
        iconPainter: Painter? = null,
        colors: TagColors = VitaminTagColors.alert(),
        sizes: TagSizes = VitaminTagSizes.medium(),
        onClick: (() -> Unit)? = null,
    ) = VitaminTagImpl(
        label = label,
        colors = colors,
        sizes = sizes,
        modifier = modifier,
        iconPainter = iconPainter,
        onClick = onClick
    )

    /**
     * Decorative tag can be used to organize a large amount of content.
     * @param label The item label
     * @param modifier The [Modifier] to be applied to the component
     * @param iconPainter the [Painter] resource used for the icon
     * @param colors define the background and text color used to accentuate the tag.
     * @param sizes The sizes for the text, paddings and icon sizes
     * @param onClick The callback to be called when the user click on the tag
     */
    @Composable
    fun DecorativeGravel(
        label: String,
        modifier: Modifier = Modifier,
        iconPainter: Painter? = null,
        colors: TagColors = VitaminTagColors.decorativeGravel(),
        sizes: TagSizes = VitaminTagSizes.medium(),
        onClick: (() -> Unit)? = null,
    ) = VitaminTagImpl(
        label = label,
        colors = colors,
        sizes = sizes,
        modifier = modifier,
        iconPainter = iconPainter,
        onClick = onClick
    )

    /**
     * Decorative tag can be used to organize a large amount of content.
     * @param label The item label
     * @param modifier The [Modifier] to be applied to the component
     * @param iconPainter the [Painter] resource used for the icon
     * @param colors define the background and text color used to accentuate the tag.
     * @param sizes The sizes for the text, paddings and icon sizes
     * @param onClick The callback to be called when the user click on the tag
     */
    @Composable
    fun DecorativeBrick(
        label: String,
        modifier: Modifier = Modifier,
        iconPainter: Painter? = null,
        colors: TagColors = VitaminTagColors.decorativeBrick(),
        sizes: TagSizes = VitaminTagSizes.medium(),
        onClick: (() -> Unit)? = null,
    ) = VitaminTagImpl(
        label = label,
        colors = colors,
        sizes = sizes,
        modifier = modifier,
        iconPainter = iconPainter,
        onClick = onClick
    )

    /**
     * Decorative tag can be used to organize a large amount of content.
     * @param label The item label
     * @param modifier The [Modifier] to be applied to the component
     * @param iconPainter the [Painter] resource used for the icon
     * @param colors define the background and text color used to accentuate the tag.
     * @param sizes The sizes for the text, paddings and icon sizes
     * @param onClick The callback to be called when the user click on the tag
     */
    @Composable
    fun DecorativeSaffron(
        label: String,
        modifier: Modifier = Modifier,
        iconPainter: Painter? = null,
        colors: TagColors = VitaminTagColors.decorativeSaffron(),
        sizes: TagSizes = VitaminTagSizes.medium(),
        onClick: (() -> Unit)? = null,
    ) = VitaminTagImpl(
        label = label,
        colors = colors,
        sizes = sizes,
        modifier = modifier,
        iconPainter = iconPainter,
        onClick = onClick
    )

    /**
     * Decorative tag can be used to organize a large amount of content.
     * @param label The item label
     * @param modifier The [Modifier] to be applied to the component
     * @param iconPainter the [Painter] resource used for the icon
     * @param colors define the background and text color used to accentuate the tag.
     * @param sizes The sizes for the text, paddings and icon sizes
     * @param onClick The callback to be called when the user click on the tag
     */
    @Composable
    fun DecorativeGold(
        label: String,
        modifier: Modifier = Modifier,
        iconPainter: Painter? = null,
        colors: TagColors = VitaminTagColors.decorativeGold(),
        sizes: TagSizes = VitaminTagSizes.medium(),
        onClick: (() -> Unit)? = null,
    ) = VitaminTagImpl(
        label = label,
        colors = colors,
        sizes = sizes,
        modifier = modifier,
        iconPainter = iconPainter,
        onClick = onClick
    )

    /**
     * Decorative tag can be used to organize a large amount of content.
     * @param label The item label
     * @param modifier The [Modifier] to be applied to the component
     * @param iconPainter the [Painter] resource used for the icon
     * @param colors define the background and text color used to accentuate the tag.
     * @param sizes The sizes for the text, paddings and icon sizes
     * @param onClick The callback to be called when the user click on the tag
     */
    @Composable
    fun DecorativeJade(
        label: String,
        modifier: Modifier = Modifier,
        iconPainter: Painter? = null,
        colors: TagColors = VitaminTagColors.decorativeJade(),
        sizes: TagSizes = VitaminTagSizes.medium(),
        onClick: (() -> Unit)? = null,
    ) = VitaminTagImpl(
        label = label,
        colors = colors,
        sizes = sizes,
        modifier = modifier,
        iconPainter = iconPainter,
        onClick = onClick
    )

    /**
     * Decorative tag can be used to organize a large amount of content.
     * @param label The item label
     * @param modifier The [Modifier] to be applied to the component
     * @param iconPainter the [Painter] resource used for the icon
     * @param colors define the background and text color used to accentuate the tag.
     * @param sizes The sizes for the text, paddings and icon sizes
     * @param onClick The callback to be called when the user click on the tag
     */
    @Composable
    fun DecorativeEmerald(
        label: String,
        modifier: Modifier = Modifier,
        iconPainter: Painter? = null,
        colors: TagColors = VitaminTagColors.decorativeEmerald(),
        sizes: TagSizes = VitaminTagSizes.medium(),
        onClick: (() -> Unit)? = null,
    ) = VitaminTagImpl(
        label = label,
        colors = colors,
        sizes = sizes,
        modifier = modifier,
        iconPainter = iconPainter,
        onClick = onClick
    )

    /**
     * Decorative tag can be used to organize a large amount of content.
     * @param label The item label
     * @param modifier The [Modifier] to be applied to the component
     * @param iconPainter the [Painter] resource used for the icon
     * @param colors define the background and text color used to accentuate the tag.
     * @param sizes The sizes for the text, paddings and icon sizes
     * @param onClick The callback to be called when the user click on the tag
     */
    @Composable
    fun DecorativeCobalt(
        label: String,
        modifier: Modifier = Modifier,
        iconPainter: Painter? = null,
        colors: TagColors = VitaminTagColors.decorativeCobalt(),
        sizes: TagSizes = VitaminTagSizes.medium(),
        onClick: (() -> Unit)? = null,
    ) = VitaminTagImpl(
        label = label,
        colors = colors,
        sizes = sizes,
        modifier = modifier,
        iconPainter = iconPainter,
        onClick = onClick
    )

    /**
     * Decorative tag can be used to organize a large amount of content.
     * @param label The item label
     * @param modifier The [Modifier] to be applied to the component
     * @param iconPainter the [Painter] resource used for the icon
     * @param colors define the background and text color used to accentuate the tag.
     * @param sizes The sizes for the text, paddings and icon sizes
     * @param onClick The callback to be called when the user click on the tag
     */
    @Composable
    fun DecorativeAmethyst(
        label: String,
        modifier: Modifier = Modifier,
        iconPainter: Painter? = null,
        colors: TagColors = VitaminTagColors.decorativeAmethyst(),
        sizes: TagSizes = VitaminTagSizes.medium(),
        onClick: (() -> Unit)? = null,
    ) = VitaminTagImpl(
        label = label,
        colors = colors,
        sizes = sizes,
        modifier = modifier,
        iconPainter = iconPainter,
        onClick = onClick
    )
}

@Composable
internal fun VitaminTagImpl(
    label: String,
    colors: TagColors,
    sizes: TagSizes,
    modifier: Modifier,
    iconPainter: Painter? = null,
    onClick: (() -> Unit)? = null,
) {
    if (onClick != null) {
        Row(
            modifier = modifier
                .clickable {
                    onClick.invoke()
                }
                .padding(sizes.clickablePadding)
                .background(colors.backgroundColor, VitaminTheme.shapes.radius100)
                .padding(sizes.contentPadding),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TagContentImpl(label, sizes, colors, iconPainter)
        }
    } else {
        Row(
            modifier = modifier
                .background(colors.backgroundColor, VitaminTheme.shapes.radius100)
                .padding(sizes.contentPadding),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TagContentImpl(label, sizes, colors, iconPainter)
        }
    }
}

@Composable
private fun TagContentImpl(
    label: String,
    sizes: TagSizes,
    colors: TagColors,
    leftIcon: Painter? = null,
) {
    leftIcon?.let {
        Icon(
            painter = it,
            contentDescription = null,
            modifier = Modifier
                .padding(end = sizes.labelStartPadding)
                .size(sizes.iconSize),
            tint = colors.contentColor
        )
    }
    Text(
        text = label,
        color = colors.contentColor,
        style = sizes.textStyle
    )
}

@Preview
@Composable
private fun PreviewAccentVitaminTag() {
    VitaminTheme {
        VitaminTags.Accent(
            label = "Accent tag",
            iconPainter = painterResource(id = R.drawable.ic_vtmn_football_fill),
        )
    }
}

@Preview
@Composable
private fun PreviewAccentClickableVitaminTag() {
    VitaminTheme {
        VitaminTags.Accent(
            label = "Accent tag clickable",
            onClick = {}
        )
    }
}

@Preview
@Composable
private fun PreviewAlertVitaminTag() {
    VitaminTheme {
        VitaminTags.Alert(label = "Alert tag")
    }
}

@Preview
@Composable
private fun PreviewBrandVitaminTag() {
    VitaminTheme {
        VitaminTags.Brand(
            label = "Brand tag",
            iconPainter = painterResource(id = R.drawable.ic_vtmn_gift_line)
        )
    }
}

@Preview
@Composable
private fun PreviewDecorativeVitaminTag() {
    VitaminTheme {
        VitaminTags.DecorativeEmerald(label = "Decorative Emerald tag")
    }
}
