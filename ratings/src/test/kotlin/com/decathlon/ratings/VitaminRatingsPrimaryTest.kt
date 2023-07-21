package com.decathlon.ratings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.cash.paparazzi.Paparazzi
import com.decathlon.ratings.utils.RatingVariantsFactory
import com.decathlon.ratings.utils.Theme
import com.decathlon.ratings.utils.Variant
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.ratings.VitaminRatingColors
import com.decathlon.vitamin.compose.ratings.VitaminRatingSizes
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(TestParameterInjector::class)
class VitaminRatingsPrimaryTest(
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
                        RatingVariantsFactory.Rating(
                            variant = variant,
                            colors = VitaminRatingColors.primary(),
                            size = VitaminRatingSizes.small(),
                        )
                        RatingVariantsFactory.Rating(
                            variant = variant,
                            colors = VitaminRatingColors.emphasis(),
                            size = VitaminRatingSizes.small(),
                        )
                        RatingVariantsFactory.Rating(
                            variant = variant,
                            colors = VitaminRatingColors.emphasis(),
                            size = VitaminRatingSizes.small(),
                            enabled = false
                        )
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
                        RatingVariantsFactory.Rating(
                            variant = variant,
                            colors = VitaminRatingColors.primary(),
                            size = VitaminRatingSizes.medium(),
                        )
                        RatingVariantsFactory.Rating(
                            variant = variant,
                            colors = VitaminRatingColors.emphasis(),
                            size = VitaminRatingSizes.medium(),
                        )
                        RatingVariantsFactory.Rating(
                            variant = variant,
                            colors = VitaminRatingColors.emphasis(),
                            size = VitaminRatingSizes.medium(),
                            enabled = false
                        )
                    }
                }
            }
        }
    }
}
