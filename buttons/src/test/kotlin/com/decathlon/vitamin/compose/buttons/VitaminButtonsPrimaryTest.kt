package com.decathlon.vitamin.compose.buttons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import app.cash.paparazzi.Paparazzi
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(TestParameterInjector::class)
class VitaminButtonsPrimaryTest(
    @TestParameter val variant: Variant
) {
    enum class Variant {
        Primary, PrimaryReversed, Secondary, Tertiary, Ghost, GhostReversed, Conversion
    }

    enum class Theme { Light, Dark }

    @get:Rule
    val paparazzi = Paparazzi()

    @Suppress("LongMethod")
    @Test
    fun medium(@TestParameter theme: Theme) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                Scaffold { padding ->
                    Column(
                        modifier = Modifier.padding(padding),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(text = variant.name, style = VitaminTheme.typography.subtitle1)
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
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
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.medium(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line)
                            )
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.medium(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                                enabled = false
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.medium(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                                iconSide = IconSide.RIGHT
                            )
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.medium(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                                iconSide = IconSide.RIGHT,
                                enabled = false
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            ButtonVariantsFactory.Button(
                                modifier = Modifier.weight(1f),
                                variant = variant,
                                size = VitaminButtonsSizes.medium(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                                text = "Button with long text"
                            )
                            ButtonVariantsFactory.Button(
                                modifier = Modifier.weight(1f),
                                variant = variant,
                                size = VitaminButtonsSizes.medium(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                                text = "Button with long text",
                                enabled = false
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            ButtonVariantsFactory.Button(
                                modifier = Modifier.weight(1f),
                                variant = variant,
                                size = VitaminButtonsSizes.medium(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                                iconSide = IconSide.RIGHT,
                                text = "Button with long text"
                            )
                            ButtonVariantsFactory.Button(
                                modifier = Modifier.weight(1f),
                                variant = variant,
                                size = VitaminButtonsSizes.medium(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
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
                Scaffold { padding ->
                    Column(
                        modifier = Modifier.padding(padding),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(text = variant.name, style = VitaminTheme.typography.subtitle1)
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
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
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.large(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line)
                            )
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.large(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                                enabled = false
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.large(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                                iconSide = IconSide.RIGHT
                            )
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.large(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                                iconSide = IconSide.RIGHT,
                                enabled = false
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            ButtonVariantsFactory.Button(
                                modifier = Modifier.weight(1f),
                                variant = variant,
                                size = VitaminButtonsSizes.large(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                                text = "Button with long text"
                            )
                            ButtonVariantsFactory.Button(
                                modifier = Modifier.weight(1f),
                                variant = variant,
                                size = VitaminButtonsSizes.large(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                                text = "Button with long text",
                                enabled = false
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            ButtonVariantsFactory.Button(
                                modifier = Modifier.weight(1f),
                                variant = variant,
                                size = VitaminButtonsSizes.large(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                                iconSide = IconSide.RIGHT,
                                text = "Button with long text"
                            )
                            ButtonVariantsFactory.Button(
                                modifier = Modifier.weight(1f),
                                variant = variant,
                                size = VitaminButtonsSizes.large(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
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
