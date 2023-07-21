package com.decathlon.vitamin.badges

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.cash.paparazzi.Paparazzi
import com.decathlon.vitamin.badges.utils.BadgesVariantsFactory
import com.decathlon.vitamin.badges.utils.Theme
import com.decathlon.vitamin.badges.utils.Variant
import com.decathlon.vitamin.compose.badges.VitaminBadgeSizes
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(TestParameterInjector::class)
class VitaminStandaloneBadgesPrimaryTest(
    @TestParameter val variant: Variant
) {

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
                        Row (horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                            BadgesVariantsFactory.StandaloneBadges(
                                count = 120,
                                variant = variant,
                                sizes = VitaminBadgeSizes.small()
                            )
                            BadgesVariantsFactory.StandaloneBadges(
                                count = 50,
                                variant = variant,
                                sizes = VitaminBadgeSizes.small()
                            )
                            BadgesVariantsFactory.StandaloneBadges(
                                count = 1,
                                variant = variant,
                                sizes = VitaminBadgeSizes.small()
                            )
                            BadgesVariantsFactory.StandaloneBadges(
                                count = 0,
                                variant = variant,
                                sizes = VitaminBadgeSizes.small()
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
                        Row (horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                            BadgesVariantsFactory.StandaloneBadges(
                                count = 120,
                                variant = variant,
                                sizes = VitaminBadgeSizes.medium()
                            )
                            BadgesVariantsFactory.StandaloneBadges(
                                count = 50,
                                variant = variant,
                                sizes = VitaminBadgeSizes.medium()
                            )
                            BadgesVariantsFactory.StandaloneBadges(
                                count = 1,
                                variant = variant,
                                sizes = VitaminBadgeSizes.medium()
                            )
                            BadgesVariantsFactory.StandaloneBadges(
                                count = 0,
                                variant = variant,
                                sizes = VitaminBadgeSizes.medium()
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
                        Row (horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                            BadgesVariantsFactory.StandaloneBadges(
                                count = 120,
                                variant = variant,
                                sizes = VitaminBadgeSizes.large()
                            )
                            BadgesVariantsFactory.StandaloneBadges(
                                count = 50,
                                variant = variant,
                                sizes = VitaminBadgeSizes.large()
                            )
                            BadgesVariantsFactory.StandaloneBadges(
                                count = 1,
                                variant = variant,
                                sizes = VitaminBadgeSizes.large()
                            )
                            BadgesVariantsFactory.StandaloneBadges(
                                count = 0,
                                variant = variant,
                                sizes = VitaminBadgeSizes.large()
                            )
                        }
                    }
                }
            }
        }
    }
}

