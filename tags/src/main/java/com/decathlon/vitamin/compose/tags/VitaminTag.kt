package com.decathlon.vitamin.compose.tags

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

/**
 * A tag highlights, organize and categorize items.
 * @param label The item label
 * @param modifier The `Modifier` to be applied to [VitaminTag].
 * @param color define the background and text color used to accentuate the tag. Type is [VitaminTagColor].
 * @param textStyle The [TextStyle] to be applied to the text inside the tag.
 * @param iconPainter the [Painter] ressource used for the icon.
 * @param onClick The callback to be called when the user click on the tag.
 */
@Composable
fun VitaminTag(
    label: String,
    modifier: Modifier = Modifier,
    color: VitaminTagColor = VitaminTagColors.brand,
    textStyle: TextStyle = VitaminTheme.typography.body3,
    iconPainter: Painter? = null,
    onClick: (() -> Unit)? = null,
) {
    if (onClick != null) {
        Row(
            modifier = modifier
                .clickable {
                    onClick.invoke()
                }
                .padding(vertical = 8.dp)
                .background(color.backgroundColor, RoundedCornerShape(4.dp))
                .padding(horizontal = 8.dp, vertical = 2.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {
            TagContent(label, textStyle, color, iconPainter)
        }
    } else {
        Row(
            modifier = modifier
                .background(color.backgroundColor, RoundedCornerShape(4.dp))
                .padding(horizontal = 8.dp, vertical = 2.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TagContent(label, textStyle, color, iconPainter)
        }
    }
}

@Composable
private fun RowScope.TagContent(
    label: String,
    textStyle: TextStyle,
    color: VitaminTagColor = VitaminTagColors.brand,
    leftIcon: Painter? = null,
) {
    leftIcon?.let {
        Icon(
            painter = it,
            contentDescription = null,
            modifier = Modifier
                .padding(end = 4.dp)
                .size(16.dp),
            tint = color.textColor
        )
    }
    Text(
        text = label,
        color = color.textColor,
        style = textStyle
    )
}

@Preview
@Composable
fun PreviewAccentVitaminTag() {
    VitaminTheme {
        VitaminTag(
            label = "Accent tag",
            color = VitaminTagColors.accent,
            iconPainter = painterResource(id = R.drawable.ic_vtmn_football_fill),
        )
    }
}

@Preview
@Composable
fun PreviewAccentClickableVitaminTag() {
    VitaminTheme {
        VitaminTag(
            label = "Accent tag clickable",
            color = VitaminTagColors.accent,
            onClick = {}
        )
    }
}

@Preview
@Composable
fun PreviewAlertVitaminTag() {
    VitaminTheme {
        VitaminTag(
            label = "Alert tag",
            color = VitaminTagColors.alert
        )
    }
}

@Preview
@Composable
fun PreviewBrandVitaminTag() {
    VitaminTheme {
        VitaminTag(
            label = "Brand tag",
            iconPainter = painterResource(id = R.drawable.ic_vtmn_gift_2_fill)
        )
    }
}

@Preview
@Composable
fun PreviewDecorativeVitaminTag() {
    VitaminTheme {
        VitaminTag(
            label = "Decorative Emerald tag",
            color = VitaminTagColors.decorativeAmethyst
        )
    }
}
