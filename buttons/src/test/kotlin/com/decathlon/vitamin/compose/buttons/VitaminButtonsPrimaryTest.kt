package com.decathlon.vitamin.compose.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import app.cash.paparazzi.Paparazzi
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.buttons.utils.ButtonVariantsFactory
import com.decathlon.vitamin.compose.buttons.utils.Theme
import com.decathlon.vitamin.compose.buttons.utils.Variant
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.vitaminicons.Line
import com.decathlon.vitamin.compose.vitaminicons.line.Android
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(TestParameterInjector::class)
class VitaminButtonsPrimaryTest(
    @TestParameter val variant: Variant
) {
    @get:Rule
    val paparazzi = Paparazzi()

    @Suppress("LongMethod")
    @Test
    fun medium(@TestParameter theme: Theme) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                val icon = rememberVectorPainter(VitaminIcons.Line.Android)
                Scaffold { padding ->
                    Column(
                        modifier = Modifier.padding(padding),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(text = variant.name, style = VitaminTheme.typography.subtitle1)
                        val rowModifier = if (variant == Variant.GhostReversed) {
                            Modifier.background(VitaminTheme.colors.vtmnBackgroundBrandPrimary)
                        } else {
                            Modifier
                        }
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            modifier = rowModifier
                        ) {
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.medium()
                            )
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.medium(),
                                enabled = false
                            )
                        }
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            modifier = rowModifier
                        ) {
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.medium(),
                                icon = icon
                            )
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.medium(),
                                icon = icon,
                                enabled = false
                            )
                        }
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            modifier = rowModifier
                        ) {
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.medium(),
                                icon = icon,
                                iconSide = IconSide.RIGHT
                            )
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.medium(),
                                icon = icon,
                                iconSide = IconSide.RIGHT,
                                enabled = false
                            )
                        }
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            modifier = rowModifier
                        ) {
                            ButtonVariantsFactory.Button(
                                modifier = Modifier.weight(1f),
                                variant = variant,
                                size = VitaminButtonsSizes.medium(),
                                icon = icon,
                                text = "Button with long text"
                            )
                            ButtonVariantsFactory.Button(
                                modifier = Modifier.weight(1f),
                                variant = variant,
                                size = VitaminButtonsSizes.medium(),
                                icon = icon,
                                text = "Button with long text",
                                enabled = false
                            )
                        }
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            modifier = rowModifier
                        ) {
                            ButtonVariantsFactory.Button(
                                modifier = Modifier.weight(1f),
                                variant = variant,
                                size = VitaminButtonsSizes.medium(),
                                icon = icon,
                                iconSide = IconSide.RIGHT,
                                text = "Button with long text"
                            )
                            ButtonVariantsFactory.Button(
                                modifier = Modifier.weight(1f),
                                variant = variant,
                                size = VitaminButtonsSizes.medium(),
                                icon = icon,
                                text = "Button with long text",
                                iconSide = IconSide.RIGHT,
                                enabled = false
                            )
                        }
                    }
                }
            }
        }
    }

    @Suppress("LongMethod")
    @Test
    fun large(@TestParameter theme: Theme) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                val icon = rememberVectorPainter(VitaminIcons.Line.Android)
                Scaffold { padding ->
                    Column(
                        modifier = Modifier.padding(padding),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(text = variant.name, style = VitaminTheme.typography.subtitle1)
                        val rowModifier = if (variant == Variant.GhostReversed) {
                            Modifier.background(VitaminTheme.colors.vtmnBackgroundBrandPrimary)
                        } else {
                            Modifier
                        }
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            modifier = rowModifier
                        ) {
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.large()
                            )
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.large(),
                                enabled = false
                            )
                        }
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            modifier = rowModifier
                        ) {
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.large(),
                                icon = icon
                            )
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.large(),
                                icon = icon,
                                enabled = false
                            )
                        }
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            modifier = rowModifier
                        ) {
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.large(),
                                icon = icon,
                                iconSide = IconSide.RIGHT
                            )
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.large(),
                                icon = icon,
                                iconSide = IconSide.RIGHT,
                                enabled = false
                            )
                        }
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            modifier = rowModifier
                        ) {
                            ButtonVariantsFactory.Button(
                                modifier = Modifier.weight(1f),
                                variant = variant,
                                size = VitaminButtonsSizes.large(),
                                icon = icon,
                                text = "Button with long text"
                            )
                            ButtonVariantsFactory.Button(
                                modifier = Modifier.weight(1f),
                                variant = variant,
                                size = VitaminButtonsSizes.large(),
                                icon = icon,
                                text = "Button with long text",
                                enabled = false
                            )
                        }
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            modifier = rowModifier
                        ) {
                            ButtonVariantsFactory.Button(
                                modifier = Modifier.weight(1f),
                                variant = variant,
                                size = VitaminButtonsSizes.large(),
                                icon = icon,
                                iconSide = IconSide.RIGHT,
                                text = "Button with long text"
                            )
                            ButtonVariantsFactory.Button(
                                modifier = Modifier.weight(1f),
                                variant = variant,
                                size = VitaminButtonsSizes.large(),
                                icon = icon,
                                text = "Button with long text",
                                iconSide = IconSide.RIGHT,
                                enabled = false
                            )
                        }
                    }
                }
            }
        }
    }
}
