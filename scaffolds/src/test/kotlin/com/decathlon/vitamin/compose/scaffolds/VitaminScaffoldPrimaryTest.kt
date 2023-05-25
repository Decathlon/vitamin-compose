package com.decathlon.vitamin.compose.scaffolds

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import app.cash.paparazzi.Paparazzi
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.scaffolds.utils.Theme
import com.decathlon.vitamin.compose.scaffolds.utils.Variant
import com.decathlon.vitamin.compose.vitaminicons.Fill
import com.decathlon.vitamin.compose.vitaminicons.Line
import com.decathlon.vitamin.compose.vitaminicons.fill.Amazon
import com.decathlon.vitamin.compose.vitaminicons.fill.Apple
import com.decathlon.vitamin.compose.vitaminicons.fill.Google
import com.decathlon.vitamin.compose.vitaminicons.line.Add
import com.decathlon.vitamin.compose.vitaminicons.line.Amazon
import com.decathlon.vitamin.compose.vitaminicons.line.Apple
import com.decathlon.vitamin.compose.vitaminicons.line.Calendar
import com.decathlon.vitamin.compose.vitaminicons.line.Football
import com.decathlon.vitamin.compose.vitaminicons.line.Google
import com.decathlon.vitamin.compose.vitaminicons.line.Search
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(TestParameterInjector::class)
class VitaminScaffoldPrimaryTest(
    @TestParameter val variant: Variant
) {

    @get:Rule
    val paparazzi = Paparazzi()

    @Suppress("LongMethod")
    @Test
    fun primary(@TestParameter theme: Theme) {
        paparazzi.snapshot {
            VitaminTheme(theme == Theme.Dark) {
                val topBarConfiguration = remember { mutableStateOf(TopBarConfiguration.Primary()) }
                VitaminScaffolds.Primary(
                    title = "Title here",
                    topBarConfiguration = topBarConfiguration.value,
                    topActionsUi = TopActionsUi(
                        actions = listOf(
                            TopActionUi(
                                id = 0,
                                icon = VitaminIcons.Line.Search,
                                contentDescription = "Search"
                            )
                        )
                    ),
                    tabSelectedIndex = 1,
                    tabActionsUi = TabActionsUi(
                        actions = listOf(
                            TabActionUi(
                                route = "football",
                                label = "Football",
                                icon = VitaminIcons.Line.Football
                            ),
                            TabActionUi(
                                route = "calendar",
                                label = "Calendar",
                                icon = VitaminIcons.Line.Calendar
                            )
                        )
                    ),
                    fabAction = FabActionUi(
                        id = 0,
                        icon = VitaminIcons.Line.Add,
                        contentDescription = "More"
                    ),
                    bottomRouteSelected = "apple",
                    bottomActionsUi = BottomActionsUi(
                        actions = listOf(
                            BottomActionUi(
                                route = "google",
                                icon = VitaminIcons.Line.Google,
                                iconSelected = VitaminIcons.Fill.Google,
                                label = "Google",
                                contentDescription = null
                            ),
                            BottomActionUi(
                                route = "apple",
                                icon = VitaminIcons.Line.Apple,
                                iconSelected = VitaminIcons.Fill.Apple,
                                label = "Apple",
                                contentDescription = null
                            ),
                            BottomActionUi(
                                route = "amazon",
                                icon = VitaminIcons.Line.Amazon,
                                iconSelected = VitaminIcons.Fill.Amazon,
                                label = "Amazon",
                                contentDescription = null
                            )
                        )
                    )
                ) {
                    Text(text = "Content here", modifier = Modifier.padding(it))
                }
            }
        }
    }
}
