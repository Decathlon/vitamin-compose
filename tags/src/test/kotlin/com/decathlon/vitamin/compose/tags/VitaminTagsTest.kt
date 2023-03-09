package com.decathlon.vitamin.compose.tags

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import app.cash.paparazzi.Paparazzi
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.tags.utils.Theme
import com.decathlon.vitamin.compose.tags.utils.Variant
import com.decathlon.vitamin.compose.vitaminicons.Line
import com.decathlon.vitamin.compose.vitaminicons.line.Football
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(TestParameterInjector::class)
class VitaminTagsTest(
    @TestParameter val variant: Variant
) {
    @get:Rule
    val paparazzi = Paparazzi()

    @Test
    fun medium(@TestParameter theme: Theme) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                Scaffold { padding ->
                    Tags(
                        variant = variant,
                        sizes = VitaminTagSizes.medium(),
                        modifier = Modifier
                            .padding(padding)
                            .padding(horizontal = 16.dp, vertical = 16.dp),
                    )
                }
            }
        }
    }

    @Test
    fun small(@TestParameter theme: Theme) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                Scaffold { padding ->
                    Tags(
                        variant = variant,
                        sizes = VitaminTagSizes.small(),
                        modifier = Modifier
                            .padding(padding)
                            .padding(horizontal = 16.dp, vertical = 16.dp),
                    )
                }
            }
        }
    }
}

@Suppress("LongMethod")
@Composable
fun Tags(
    variant: Variant,
    sizes: TagSizes,
    modifier: Modifier = Modifier
) {
    val onClick: (() -> Unit)? = if (variant == Variant.Interactive) { {} } else null
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(text = variant.name, style = VitaminTheme.typography.subtitle1)
        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
            VitaminTags.Accent(label = "Tag", sizes = sizes, onClick = onClick)
            VitaminTags.Alert(label = "Tag", sizes = sizes, onClick = onClick)
            VitaminTags.Brand(label = "Tag", sizes = sizes, onClick = onClick)
        }
        val iconPainter = rememberVectorPainter(image = VitaminIcons.Line.Football)
        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
            VitaminTags.Accent(
                label = "Tag",
                iconPainter = iconPainter,
                sizes = sizes,
                onClick = onClick
            )
            VitaminTags.Alert(
                label = "Tag",
                iconPainter = iconPainter,
                sizes = sizes,
                onClick = onClick
            )
            VitaminTags.Brand(
                label = "Tag",
                iconPainter = iconPainter,
                sizes = sizes,
                onClick = onClick
            )
        }
        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
            VitaminTags.DecorativeEmerald(label = "Tag", sizes = sizes, onClick = onClick)
            VitaminTags.DecorativeAmethyst(label = "Tag", sizes = sizes, onClick = onClick)
            VitaminTags.DecorativeBrick(label = "Tag", sizes = sizes, onClick = onClick)
            VitaminTags.DecorativeGold(label = "Tag", sizes = sizes, onClick = onClick)
        }
        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
            VitaminTags.DecorativeEmerald(
                label = "Tag",
                iconPainter = iconPainter,
                sizes = sizes,
                onClick = onClick
            )
            VitaminTags.DecorativeAmethyst(
                label = "Tag",
                iconPainter = iconPainter,
                sizes = sizes,
                onClick = onClick
            )
            VitaminTags.DecorativeBrick(
                label = "Tag",
                iconPainter = iconPainter,
                sizes = sizes,
                onClick = onClick
            )
            VitaminTags.DecorativeGold(
                label = "Tag",
                iconPainter = iconPainter,
                sizes = sizes,
                onClick = onClick
            )
        }
        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
            VitaminTags.DecorativeCobalt(label = "Tag", sizes = sizes, onClick = onClick)
            VitaminTags.DecorativeGravel(label = "Tag", sizes = sizes, onClick = onClick)
            VitaminTags.DecorativeJade(label = "Tag", sizes = sizes, onClick = onClick)
            VitaminTags.DecorativeSaffron(label = "Tag", sizes = sizes, onClick = onClick)
        }
        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
            VitaminTags.DecorativeCobalt(
                label = "Tag",
                iconPainter = iconPainter,
                sizes = sizes,
                onClick = onClick
            )
            VitaminTags.DecorativeGravel(
                label = "Tag",
                iconPainter = iconPainter,
                sizes = sizes,
                onClick = onClick
            )
            VitaminTags.DecorativeJade(
                label = "Tag",
                iconPainter = iconPainter,
                sizes = sizes,
                onClick = onClick
            )
            VitaminTags.DecorativeSaffron(
                label = "Tag",
                iconPainter = iconPainter,
                sizes = sizes,
                onClick = onClick
            )
        }
    }
}
