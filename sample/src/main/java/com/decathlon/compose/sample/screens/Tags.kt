package com.decathlon.compose.sample.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.compose.sample.R
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.tags.VitaminTag
import com.decathlon.vitamin.compose.tags.VitaminTagColors

object Tags : Screen {
    override val name: String
        get() = "Tags"

    override val navigationKey: String
        get() = "Tags"

    @Composable
    override fun Screen() {
        val allTagColors = listOf(
            Pair("Accent", VitaminTagColors.accent),
            Pair("Alert", VitaminTagColors.alert),
            Pair("Brand", VitaminTagColors.brand),
            Pair("Decorative Amethyst", VitaminTagColors.decorativeAmethyst),
            Pair("Decorative Brick", VitaminTagColors.decorativeBrick),
            Pair("Decorative Cobalt", VitaminTagColors.decorativeCobalt),
            Pair("Decorative Emerald", VitaminTagColors.decorativeEmerald),
            Pair("Decorative Gold", VitaminTagColors.decorativeGold),
            Pair("Decorative Gravel", VitaminTagColors.decorativeGravel),
            Pair("Decorative Jade", VitaminTagColors.decorativeJade),
            Pair("Decorative Saffron", VitaminTagColors.decorativeSaffron)
        )
        val context = LocalContext.current

        SampleScaffold(title = name) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 4.dp)
            ) {
                items(allTagColors) { color ->
                    Row(modifier = Modifier.padding(10.dp)) {
                        // Simple tag
                        VitaminTag(label = color.first, color = color.second)

                        Spacer(Modifier.width(8.dp))

                        // Tag with icon
                        VitaminTag(
                            label = color.first, color = color.second,
                            iconPainter = painterResource(
                                id = R.drawable.ic_vtmn_football_line
                            )
                        )
                    }
                }
                items(allTagColors) { color ->
                    Column(modifier = Modifier.padding(10.dp)) {
                        // Clickable tag
                        VitaminTag(label = "Clickable ${color.first}", color = color.second) {
                            Toast.makeText(context, "Click on tag ${color.first}", Toast.LENGTH_SHORT).show()
                        }

                        // Clickable tag with icon
                        VitaminTag(
                            label = "Clickable ${color.first}", color = color.second,
                            iconPainter = painterResource(
                                id = R.drawable.ic_vtmn_football_fill
                            )
                        ) {
                            Toast.makeText(context, "Click on tag ${color.first}", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewTagsScreen() {
    VitaminTheme(darkTheme = true) {
        Tags.Screen()
    }
}
