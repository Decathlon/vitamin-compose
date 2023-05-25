package com.decathlon.vitamin.compose.scaffolds

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.appbars.bottomnavigations.SelectedActionItem
import com.decathlon.vitamin.compose.appbars.bottomnavigations.VitaminBottomNavigations
import com.decathlon.vitamin.compose.fabs.VitaminFabs
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.vitaminicons.Line
import com.decathlon.vitamin.compose.vitaminicons.line.Calendar
import com.decathlon.vitamin.compose.vitaminicons.line.Football
import com.decathlon.vitamin.compose.vitaminicons.line.Search

object VitaminScaffolds {
    /**
     * Material design layout with Vitamin components.
     * Scaffold implements Material design visual layout structure and this component
     * will use Vitamin TopBar, Tabs, BottomBar and Floating Action Button according to
     * models given in input.
     * @param title Title specified in the Vitamin TopBar.
     * @param modifier The [Modifier] to be applied to the component.
     * @param topBarConfiguration Switch dynamically from primary to search configuration.
     * @param topActionsUi List actions in TopBar and maximum actions you want to show with an icon.
     * @param tabActionsUi List actions in Tabs and if it should be used in scrollable mode or not.
     * @param bottomActionsUi List actions in BottomBar.
     * @param fabAction Display a floating action bottom at the bottom end of the content.
     * @param tabSelectedIndex Inform which tab is selected.
     * @param bottomRouteSelected Inform which bottom action is selected.
     * @param onTopActionClicked The callback to be called when the user click on a TopBar action.
     * @param onTabClicked The callback to be called when the user click on a tab action.
     * @param onBottomActionClicked The callback to be called when the user click on a bottom action.
     * @param onFabActionClicked The callback to be called when the user click on the fab.
     * @param onSearchValueChanged The callback to be called when the user type a character in the searchbar.
     * @param content The content of your screen. As Material design Scaffold component, the
     * expected [PaddingValues] is passed and should be used by your root component in this api slot.
     */
    @Composable
    fun Primary(
        title: String,
        modifier: Modifier = Modifier,
        topBarConfiguration: TopBarConfiguration = TopBarConfiguration.Primary(),
        topActionsUi: TopActionsUi = TopActionsUi(),
        tabActionsUi: TabActionsUi = TabActionsUi(),
        bottomActionsUi: BottomActionsUi = BottomActionsUi(),
        fabAction: FabActionUi? = null,
        tabSelectedIndex: Int? = null,
        bottomRouteSelected: String? = null,
        onTopActionClicked: (TopActionUi) -> Unit = {},
        onTabClicked: (TabActionUi) -> Unit = {},
        onBottomActionClicked: (BottomActionUi) -> Unit = {},
        onFabActionClicked: (FabActionUi) -> Unit = {},
        onSearchValueChanged: (String) -> Unit = {},
        content: @Composable (PaddingValues) -> Unit
    ) {
        val expandedMenu = remember { mutableStateOf(false) }
        Scaffold(
            modifier = modifier,
            topBar = {
                VitaminTopBar(
                    title = title,
                    topBarConfiguration = topBarConfiguration,
                    onSearchValueChanged = onSearchValueChanged,
                    topActionsUi = topActionsUi,
                    onTopActionClicked = onTopActionClicked,
                    expandedMenu = expandedMenu,
                    tabActionsUi = tabActionsUi,
                    tabSelectedIndex = tabSelectedIndex,
                    onTabClicked = onTabClicked
                )
            },
            bottomBar = {
                if (bottomActionsUi.actions.isNotEmpty()) {
                    VitaminBottomNavigations.Primary(
                        actions = bottomActionsUi.actions.map { action ->
                            val hasSelectedRoutes =
                                action.selectedRoutes.find { it == bottomRouteSelected } != null
                            val selected = hasSelectedRoutes || action.route == bottomRouteSelected
                            val icon = if (selected) action.iconSelected else action.icon
                            SelectedActionItem(
                                icon = rememberVectorPainter(image = icon),
                                contentDescription = action.contentDescription,
                                text = action.label,
                                selected = selected,
                                onClick = {
                                    onBottomActionClicked(action)
                                    return@SelectedActionItem true
                                }
                            )
                        }
                    )
                }
            },
            backgroundColor = VitaminTheme.colors.vtmnBackgroundSecondary,
            contentColor = VitaminTheme.colors.vtmnContentPrimary,
            content = content,
            floatingActionButton = {
                if (fabAction != null) {
                    VitaminFabs.Primary(
                        icon = rememberVectorPainter(image = fabAction.icon),
                        contentDescription = fabAction.contentDescription,
                        onClick = { onFabActionClicked(fabAction) }
                    )
                }
            },
        )
    }
}

@Preview
@Composable
internal fun VitaminScaffoldPreview() {
    VitaminTheme {
        VitaminScaffolds.Primary(
            title = "Titre",
            topActionsUi = TopActionsUi(
                actions = listOf(
                    TopActionUi(
                        id = 0,
                        icon = VitaminIcons.Line.Search,
                        contentDescription = "Search"
                    )
                )
            ),
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
            bottomActionsUi = BottomActionsUi(
                actions = listOf()
            ),
            content = {
            }
        )
    }
}
