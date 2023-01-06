package com.decathlon.vitamin.compose.buttons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.cash.paparazzi.Paparazzi
import com.decathlon.vitamin.compose.buttons.utils.ProgressVariantsFactory
import com.decathlon.vitamin.compose.buttons.utils.Theme
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.progressbars.VitaminLinearProgressBarSizes
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(TestParameterInjector::class)
class VitaminLinearProgressPrimaryTest {
    @get:Rule
    val paparazzi = Paparazzi()


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
                            ProgressVariantsFactory.LinearProgress(
                                size = VitaminLinearProgressBarSizes.small(),
                                progress = 0.5f
                            )
                            ProgressVariantsFactory.LinearProgress(
                                size = VitaminLinearProgressBarSizes.small()
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            ProgressVariantsFactory.LinearProgress(
                                size = VitaminLinearProgressBarSizes.small(),
                                progress = 0.5f,
                                label = "Download"
                            )
                            ProgressVariantsFactory.LinearProgress(
                                size = VitaminLinearProgressBarSizes.small(),
                                label = "Download"
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
                            ProgressVariantsFactory.LinearProgress(
                                size = VitaminLinearProgressBarSizes.medium(),
                                progress = 0.5f
                            )
                            ProgressVariantsFactory.LinearProgress(
                                size = VitaminLinearProgressBarSizes.medium()
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            ProgressVariantsFactory.LinearProgress(
                                size = VitaminLinearProgressBarSizes.medium(),
                                progress = 0.5f,
                                label = "Download"
                            )
                            ProgressVariantsFactory.LinearProgress(
                                size = VitaminLinearProgressBarSizes.medium(),
                                label = "Download"
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
                        modifier = Modifier
                            .padding(padding)
                            .padding(horizontal = 16.dp, vertical = 16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            ProgressVariantsFactory.LinearProgress(
                                size = VitaminLinearProgressBarSizes.large(),
                                progress = 0.5f
                            )
                            ProgressVariantsFactory.LinearProgress(
                                size = VitaminLinearProgressBarSizes.large()
                            )
                        }

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            ProgressVariantsFactory.LinearProgress(
                                size = VitaminLinearProgressBarSizes.large(),
                                progress = 0.5f,
                                label = "Download"
                            )
                            ProgressVariantsFactory.LinearProgress(
                                size = VitaminLinearProgressBarSizes.large(),
                                label = "Download"
                            )
                        }
                    }
                }
            }
        }
    }
}
