package com.decathlon.vitamin.compose.buttons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import app.cash.paparazzi.Paparazzi
import com.decathlon.vitamin.compose.buttons.utils.ProgressVariantsFactory
import com.decathlon.vitamin.compose.buttons.utils.Theme
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.progressbars.VitaminCircularProgressBarSizes
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(TestParameterInjector::class)
class VitaminCircularProgressPrimaryTest {
    @get:Rule
    val paparazzi = Paparazzi()

    @Suppress("LongMethod")
    @Test
    fun extraSmall(@TestParameter theme: Theme) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                Scaffold { padding ->
                    Column(
                        modifier = Modifier
                            .padding(padding)
                            .padding(horizontal = 16.dp, vertical = 16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            ProgressVariantsFactory.CircularProgress(
                                size = VitaminCircularProgressBarSizes.extraSmall(),
                                progress = 0.5f
                            )
                            ProgressVariantsFactory.CircularProgress(
                                size = VitaminCircularProgressBarSizes.extraSmall()
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            ProgressVariantsFactory.CircularProgress(
                                size = VitaminCircularProgressBarSizes.extraSmall(),
                                progress = 0.5f,
                                content = {
                                    ProgressIndicatorText()
                                }
                            )
                            ProgressVariantsFactory.CircularProgress(
                                size = VitaminCircularProgressBarSizes.extraSmall(),
                                content = {
                                    ProgressIndicatorText()
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
                        modifier = Modifier
                            .padding(padding)
                            .padding(horizontal = 16.dp, vertical = 16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            ProgressVariantsFactory.CircularProgress(
                                size = VitaminCircularProgressBarSizes.small(),
                                progress = 0.5f
                            )
                            ProgressVariantsFactory.CircularProgress(
                                size = VitaminCircularProgressBarSizes.small()
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            ProgressVariantsFactory.CircularProgress(
                                size = VitaminCircularProgressBarSizes.small(),
                                progress = 0.5f,
                                content = {
                                    ProgressIndicatorText()
                                }
                            )
                            ProgressVariantsFactory.CircularProgress(
                                size = VitaminCircularProgressBarSizes.small(),
                                content = {
                                    ProgressIndicatorText()
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
    fun medium(@TestParameter theme: Theme) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                Scaffold { padding ->
                    Column(
                        modifier = Modifier
                            .padding(padding)
                            .padding(horizontal = 16.dp, vertical = 16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            ProgressVariantsFactory.CircularProgress(
                                size = VitaminCircularProgressBarSizes.medium(),
                                progress = 0.5f
                            )
                            ProgressVariantsFactory.CircularProgress(
                                size = VitaminCircularProgressBarSizes.medium()
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            ProgressVariantsFactory.CircularProgress(
                                size = VitaminCircularProgressBarSizes.medium(),
                                progress = 0.5f,
                                content = {
                                    ProgressIndicatorText()
                                }
                            )
                            ProgressVariantsFactory.CircularProgress(
                                size = VitaminCircularProgressBarSizes.medium(),
                                content = {
                                    ProgressIndicatorText()
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}
