package com.decathlon.compose.sample.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.decathlon.compose.sample.R
import com.decathlon.compose.sample.components.SampleRow
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.buttons.IconSide
import com.decathlon.vitamin.compose.buttons.VitaminButtons
import com.decathlon.vitamin.compose.foundation.VitaminTheme

const val BigText =
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
        "Curabitur sodales eros molestie orci semper tempor. Mauris ac placerat urna. " +
        "In pellentesque ac ex sed fringilla. " +
        "Phasellus ipsum tellus, feugiat quis porta ut, viverra eget est. " +
        "Fusce pulvinar eros nunc, non tincidunt quam fermentum vitae. " +
        "Sed porttitor augue sed pretium rutrum. " +
        "Aliquam auctor posuere porttitor. Quisque cursus purus eget facilisis interdum."

object Buttons : Screen {
    override val name: String
        get() = "Buttons"

    override val navigationKey: String
        get() = "buttons"

    @SuppressWarnings("LongMethod")
    @Composable
    override fun Screen() {
        SampleScaffold(title = name) {
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                item {
                    SampleRow(firstItem = true) {
                        VitaminButtons.Primary(text = "Primary") {}
                        VitaminButtons.Primary(text = "Primary", enabled = false) {}
                    }
                }
                item {
                    SampleRow {
                        VitaminButtons.Primary(
                            text = BigText
                        ) {}
                    }
                }
                item {
                    SampleRow {
                        VitaminButtons.Primary(
                            text = "Primary",
                            icon = painterResource(id = R.drawable.ic_add_fill)
                        ) {}
                        VitaminButtons.Primary(
                            text = "Primary",
                            icon = painterResource(id = R.drawable.ic_add_fill),
                            enabled = false
                        ) {}
                    }
                }
                item {
                    SampleRow {
                        VitaminButtons.Primary(
                            text = "Primary",
                            icon = painterResource(id = R.drawable.ic_add_fill),
                            iconSide = IconSide.RIGHT
                        ) {}
                        VitaminButtons.Primary(
                            text = "Primary",
                            icon = painterResource(id = R.drawable.ic_add_fill),
                            iconSide = IconSide.RIGHT,
                            enabled = false
                        ) {}
                    }
                }
                item {
                    SampleRow {
                        VitaminButtons.Secondary(text = "Secondary") {}
                        VitaminButtons.Secondary(text = "Secondary", enabled = false) {}
                    }
                }
                item {
                    SampleRow {
                        VitaminButtons.Secondary(
                            text = "Secondary",
                            icon = painterResource(id = R.drawable.ic_add_fill)
                        ) {}
                        VitaminButtons.Secondary(
                            text = "Secondary",
                            icon = painterResource(id = R.drawable.ic_add_fill),
                            enabled = false
                        ) {}
                    }
                }
                item {
                    SampleRow {
                        VitaminButtons.Ghost(text = "Ghost") {}
                        VitaminButtons.Ghost(text = "Ghost", enabled = false) {}
                    }
                }
                item {
                    SampleRow {
                        VitaminButtons.Ghost(
                            text = "Ghost",
                            icon = painterResource(id = R.drawable.ic_add_fill)
                        ) {}
                        VitaminButtons.Ghost(
                            text = "Ghost",
                            icon = painterResource(id = R.drawable.ic_add_fill),
                            enabled = false
                        ) {}
                    }
                }
                item {
                    SampleRow {
                        VitaminButtons.Conversion(text = "Conversion") {}
                        VitaminButtons.Conversion(text = "Conversion", enabled = false) {}
                    }
                }
                item {
                    SampleRow(lastItem = true) {
                        VitaminButtons.Conversion(
                            text = "Conversion",
                            icon = painterResource(id = R.drawable.ic_add_fill)
                        ) {}
                        VitaminButtons.Conversion(
                            text = "Conversion",
                            icon = painterResource(id = R.drawable.ic_add_fill),
                            enabled = false
                        ) {}
                    }
                }
                item {
                    SampleRow(
                        firstItem = true,
                        color = VitaminTheme.colors.vtmnBackgroundBrandPrimary
                    ) {
                        VitaminButtons.PrimaryReversed(text = "Primary Reversed") {}
                        VitaminButtons.PrimaryReversed(text = "Primary Reversed", enabled = false) {}
                    }
                }
                item {
                    SampleRow(color = VitaminTheme.colors.vtmnBackgroundBrandPrimary) {
                        VitaminButtons.PrimaryReversed(
                            text = "Primary Reversed",
                            icon = painterResource(id = R.drawable.ic_add_fill)
                        ) {}
                        VitaminButtons.PrimaryReversed(
                            text = "Primary Reversed",
                            icon = painterResource(id = R.drawable.ic_add_fill),
                            enabled = false
                        ) {}
                    }
                }
                item {
                    SampleRow(firstItem = true) {
                        VitaminButtons.Tertiary(text = "Tertiary") {}
                        VitaminButtons.Tertiary(text = "Tertiary", enabled = false) {}
                    }
                }
                item {
                    SampleRow(color = VitaminTheme.colors.vtmnBackgroundBrandPrimary) {
                        VitaminButtons.GhostReversed(text = "Ghost") {}
                        VitaminButtons.GhostReversed(text = "Ghost", enabled = false) {}
                    }
                }
                item {
                    SampleRow(
                        lastItem = true,
                        color = VitaminTheme.colors.vtmnBackgroundBrandPrimary
                    ) {
                        VitaminButtons.GhostReversed(
                            text = "Ghost",
                            icon = painterResource(id = R.drawable.ic_add_fill)
                        ) {}
                        VitaminButtons.GhostReversed(
                            text = "Ghost",
                            icon = painterResource(id = R.drawable.ic_add_fill),
                            enabled = false
                        ) {}
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    VitaminTheme {
        Buttons.Screen()
    }
}
