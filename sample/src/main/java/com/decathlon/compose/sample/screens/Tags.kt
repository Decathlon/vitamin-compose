package com.decathlon.compose.sample.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.tags.VitaminTagColors
import com.decathlon.vitamin.compose.tags.VitaminTagSizes
import com.decathlon.vitamin.compose.tags.VitaminTags
import com.decathlon.vitamin.compose.textinputs.VitaminTextInputs
import com.decathlon.vitamin.compose.vitaminicons.Line
import com.decathlon.vitamin.compose.vitaminicons.line.Football

private enum class Size(val type: String) {
    Small("Small"), Medium("Medium")
}

object Tags : Screen {
    override val name: String
        get() = "Tags"

    override val navigationKey: String
        get() = "Tags"

    @Suppress("LongMethod")
    @Composable
    override fun Screen() {
        val allTagColors = listOf(
            Pair("Accent", VitaminTagColors.accent()),
            Pair("Alert", VitaminTagColors.alert()),
            Pair("Brand", VitaminTagColors.brand()),
            Pair("Decorative Amethyst", VitaminTagColors.decorativeAmethyst()),
            Pair("Decorative Brick", VitaminTagColors.decorativeBrick()),
            Pair("Decorative Cobalt", VitaminTagColors.decorativeCobalt()),
            Pair("Decorative Emerald", VitaminTagColors.decorativeEmerald()),
            Pair("Decorative Gold", VitaminTagColors.decorativeGold()),
            Pair("Decorative Gravel", VitaminTagColors.decorativeGravel()),
            Pair("Decorative Jade", VitaminTagColors.decorativeJade()),
            Pair("Decorative Saffron", VitaminTagColors.decorativeSaffron())
        )
        val context = LocalContext.current
        var sizeState by remember { mutableStateOf(Size.Medium) }
        val sizes = when (sizeState) {
            Size.Small -> VitaminTagSizes.small()
            Size.Medium -> VitaminTagSizes.medium()
        }
        SampleScaffold(title = name) {
            val icon = rememberVectorPainter(VitaminIcons.Line.Football)
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 24.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                item {
                    VitaminTextInputs.FilledDropdown(
                        value = sizeState.type,
                        label = "Size",
                    ) {
                        Size.values().forEach {
                            PrimaryItem(onClick = { sizeState = it }) {
                                Text(text = it.type)
                            }
                        }
                    }
                }
                item {
                    Text(
                        text = "Tags",
                        style = VitaminTheme.typography.h6
                    )
                }
                items(allTagColors) { color ->
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        // Simple tag
                        VitaminTags.Accent(
                            label = color.first,
                            colors = color.second,
                            sizes = sizes
                        )
                        VitaminTags.Accent(
                            label = color.first,
                            colors = color.second,
                            iconPainter = icon,
                            sizes = sizes
                        )
                    }
                }
                item {
                    Text(
                        text = "Interactive tags",
                        style = VitaminTheme.typography.h6
                    )
                }
                items(allTagColors) { color ->
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        VitaminTags.Accent(
                            label = color.first,
                            colors = color.second,
                            sizes = sizes
                        ) {
                            Toast.makeText(context, "Click on tag ${color.first}", Toast.LENGTH_SHORT).show()
                        }
                        VitaminTags.Accent(
                            label = color.first,
                            colors = color.second,
                            iconPainter = icon,
                            sizes = sizes
                        ) {
                            Toast.makeText(
                                context,
                                "Click on tag ${color.first}",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun PreviewTagsScreen() {
    VitaminTheme(darkTheme = true) {
        Tags.Screen()
    }
}
