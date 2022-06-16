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
import com.decathlon.vitamin.compose.buttons.VitaminButtonsSizes.mediumSize
import com.decathlon.vitamin.compose.buttons.VitaminButtonsSizes.smallSize
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

    @Test
    fun small(@TestParameter theme: Theme) {
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
                                size = VitaminButtonsSizes.smallSize()
                            )
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.smallSize(),
                                enabled = false
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.smallSize(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line)
                            )
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.smallSize(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                                enabled = false
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.smallSize(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                                iconSide = IconSide.RIGHT
                            )
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.smallSize(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                                iconSide = IconSide.RIGHT,
                                enabled = false
                            )
                        }
                    }
                }
            }
        }
    }

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
                                size = VitaminButtonsSizes.mediumSize()
                            )
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.mediumSize(),
                                enabled = false
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.mediumSize(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line)
                            )
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.mediumSize(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                                enabled = false
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.mediumSize(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                                iconSide = IconSide.RIGHT
                            )
                            ButtonVariantsFactory.Button(
                                variant = variant,
                                size = VitaminButtonsSizes.mediumSize(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                                iconSide = IconSide.RIGHT,
                                enabled = false
                            )
                        }
                    }
                }
            }
        }
    }

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
                        ButtonVariantsFactory.Button(
                            variant = variant,
                            size = VitaminButtonsSizes.largeSize()
                        )
                        ButtonVariantsFactory.Button(
                            variant = variant,
                            size = VitaminButtonsSizes.largeSize(),
                            enabled = false
                        )
                        ButtonVariantsFactory.Button(
                            variant = variant,
                            size = VitaminButtonsSizes.largeSize(),
                            icon = painterResource(id = R.drawable.ic_vtmn_android_line)
                        )
                        ButtonVariantsFactory.Button(
                            variant = variant,
                            size = VitaminButtonsSizes.largeSize(),
                            icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                            enabled = false
                        )
                        ButtonVariantsFactory.Button(
                            variant = variant,
                            size = VitaminButtonsSizes.largeSize(),
                            icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                            iconSide = IconSide.RIGHT
                        )
                        ButtonVariantsFactory.Button(
                            variant = variant,
                            size = VitaminButtonsSizes.largeSize(),
                            icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                            iconSide = IconSide.RIGHT,
                            enabled = false
                        )
                    }
                }
            }
        }
    }
}
