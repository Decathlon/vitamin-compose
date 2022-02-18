package com.decathlon.vitamin.compose.chips

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import app.cash.paparazzi.Paparazzi
import com.decathlon.vitamin.compose.chips.utils.ChipsVariantsFactory
import com.decathlon.vitamin.compose.chips.utils.Theme
import com.decathlon.vitamin.compose.chips.utils.Variant
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(TestParameterInjector::class)
class VitaminChipsPrimaryTest(@TestParameter val variant: Variant) {
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
                        if (variant == Variant.Action || variant == Variant.Filter) {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(4.dp),
                                modifier = Modifier
                            ) {
                                ChipsVariantsFactory.chip(
                                    variant = variant,
                                    size = VitaminChipSizes.medium(),
                                    selected = true
                                )
                                ChipsVariantsFactory.chip(
                                    variant = variant,
                                    size = VitaminChipSizes.medium(),
                                    enabled = false,
                                    selected = true
                                )
                            }
                        }
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            modifier = Modifier
                        ) {
                            ChipsVariantsFactory.chip(
                                variant = variant,
                                size = VitaminChipSizes.medium(),
                                icon = {
                                    Icon(
                                        painter = painterResource(
                                            id = R.drawable.ic_vtmn_earth_line
                                        ),
                                        contentDescription = null
                                    )
                                },
                                image = {
                                    Image(
                                        painter = painterResource(R.drawable.vtmn_flag_es),
                                        contentScale = ContentScale.Crop,
                                        alignment = Alignment.Center,
                                        contentDescription = null
                                    )
                                }
                            )
                            ChipsVariantsFactory.chip(
                                variant = variant,
                                size = VitaminChipSizes.medium(),
                                enabled = false,
                                icon = {
                                    Icon(
                                        painter = painterResource(
                                            id = R.drawable.ic_vtmn_earth_line
                                        ),
                                        contentDescription = null
                                    )
                                },
                                image = {
                                    Image(
                                        painter = painterResource(R.drawable.vtmn_flag_es),
                                        contentScale = ContentScale.Crop,
                                        alignment = Alignment.Center,
                                        contentDescription = null
                                    )
                                }
                            )
                        }
                    }
                }
            }
        }
    }

    @Suppress("LongMethod")
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
                        if (variant == Variant.Action || variant == Variant.Filter) {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(4.dp),
                                modifier = Modifier
                            ) {
                                ChipsVariantsFactory.chip(
                                    variant = variant,
                                    size = VitaminChipSizes.small(),
                                    selected = true
                                )
                                ChipsVariantsFactory.chip(
                                    variant = variant,
                                    size = VitaminChipSizes.small(),
                                    enabled = false,
                                    selected = true
                                )
                            }
                        }
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            modifier = Modifier
                        ) {
                            ChipsVariantsFactory.chip(
                                variant = variant,
                                size = VitaminChipSizes.small(),
                                icon = {
                                    Icon(
                                        painter = painterResource(
                                            id = R.drawable.ic_vtmn_earth_line
                                        ),
                                        contentDescription = null
                                    )
                                },
                                image = {
                                    Image(
                                        painter = painterResource(R.drawable.vtmn_flag_es),
                                        contentScale = ContentScale.Crop,
                                        alignment = Alignment.Center,
                                        contentDescription = null
                                    )
                                }
                            )
                            ChipsVariantsFactory.chip(
                                variant = variant,
                                size = VitaminChipSizes.small(),
                                enabled = false,
                                icon = {
                                    Icon(
                                        painter = painterResource(
                                            id = R.drawable.ic_vtmn_earth_line
                                        ),
                                        contentDescription = null
                                    )
                                },
                                image = {
                                    Image(
                                        painter = painterResource(R.drawable.vtmn_flag_es),
                                        contentScale = ContentScale.Crop,
                                        alignment = Alignment.Center,
                                        contentDescription = null
                                    )
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}
