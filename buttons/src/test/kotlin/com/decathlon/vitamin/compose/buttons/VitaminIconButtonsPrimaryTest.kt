package com.decathlon.vitamin.compose.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import app.cash.paparazzi.Paparazzi
import com.decathlon.vitamin.compose.buttons.utils.ButtonVariantsFactory
import com.decathlon.vitamin.compose.buttons.utils.Theme
import com.decathlon.vitamin.compose.buttons.utils.Variant
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(TestParameterInjector::class)
class VitaminIconButtonsPrimaryTest(
    @TestParameter val variant: Variant
) {

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
                        val rowModifier = if (variant == Variant.GhostReversed) {
                            Modifier.background(VitaminTheme.colors.vtmnBackgroundBrandPrimary)
                        } else {
                            Modifier
                        }
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            modifier = rowModifier
                        ) {
                            ButtonVariantsFactory.IconButton(
                                variant = variant,
                                size = VitaminIconButtonsSizes.medium(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                                contentDescription = "Add"
                            )
                            ButtonVariantsFactory.IconButton(
                                variant = variant,
                                size = VitaminIconButtonsSizes.medium(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                                contentDescription = "Add",
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
                        val rowModifier = if (variant == Variant.GhostReversed) {
                            Modifier.background(VitaminTheme.colors.vtmnBackgroundBrandPrimary)
                        } else {
                            Modifier
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp), modifier = rowModifier) {
                            ButtonVariantsFactory.IconButton(
                                variant = variant,
                                size = VitaminIconButtonsSizes.large(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                                contentDescription = "Add"
                            )
                            ButtonVariantsFactory.IconButton(
                                variant = variant,
                                size = VitaminIconButtonsSizes.large(),
                                icon = painterResource(id = R.drawable.ic_vtmn_android_line),
                                contentDescription = "Add",
                                enabled = false
                            )
                        }
                    }
                }
            }
        }
    }
}
