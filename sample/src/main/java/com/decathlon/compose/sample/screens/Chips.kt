package com.decathlon.compose.sample.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.compose.sample.R
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.chips.ChipSizes
import com.decathlon.vitamin.compose.chips.VitaminChipSizes
import com.decathlon.vitamin.compose.chips.VitaminChips
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object Chips : Screen {
    override val name: String
        get() = "Chips"

    override val navigationKey: String
        get() = "chips"

    @SuppressWarnings("LongMethod")
    @Composable
    override fun Screen() {
        SampleScaffold(title = name) {
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                // ACTION CHIPS
                item {
                    Text(
                        modifier = Modifier.padding(16.dp),
                        text = "Action Chips",
                        style = VitaminTheme.typography.h6,
                    )
                }
                item {
                    SubTitle("Medium")
                    ActionRow(enabled = true, sizes = VitaminChipSizes.medium())
                    ActionRow(enabled = false, sizes = VitaminChipSizes.medium())

                    SubTitle("Small")
                    ActionRow(enabled = true, sizes = VitaminChipSizes.small())
                    ActionRow(enabled = false, sizes = VitaminChipSizes.small())
                }

                // FILTER CHIPS
                item {
                    Text(
                        modifier = Modifier.padding(16.dp),
                        text = "Filter Chips",
                        style = VitaminTheme.typography.h6
                    )
                }
                item {
                    SubTitle("Medium")
                    val selectedMediumFilters =
                        remember { mutableStateListOf("Climbing", "Badminton") }
                    FilterRaw(
                        enabled = true,
                        sizes = VitaminChipSizes.medium(),
                        selectedMediumFilters
                    )
                    FilterRaw(enabled = false, sizes = VitaminChipSizes.medium())

                    SubTitle("Small")
                    val selectedSmallFilters =
                        remember { mutableStateListOf("Climbing", "Badminton") }
                    FilterRaw(
                        enabled = true,
                        sizes = VitaminChipSizes.small(),
                        selectedSmallFilters
                    )
                    FilterRaw(enabled = false, sizes = VitaminChipSizes.small())
                }

                // INPUT CHIPS
                item {
                    Text(
                        modifier = Modifier.padding(16.dp),
                        text = "Input Chips",
                        style = VitaminTheme.typography.h6
                    )
                }
                item {
                    InputColumn()
                }

                // SINGLE CHOICE CHIPS
                item {
                    Text(
                        modifier = Modifier.padding(16.dp),
                        text = "Single Choice Chips",
                        style = VitaminTheme.typography.h6
                    )
                }
                item {
                    SingleChoiceChips()
                }

                item {
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
        }
    }
}

@Composable
private fun SubTitle(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        modifier = modifier.padding(start = 16.dp),
        text = text,
        style = VitaminTheme.typography.subtitle1
    )
}

//region action chips

@Composable
private fun ActionRow(enabled: Boolean, sizes: ChipSizes) {
    Row(
        modifier = Modifier.padding(top = 8.dp, bottom = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Spacer(modifier = Modifier.width(16.dp))
        VitaminChips.Action(
            label = "Select",
            enabled = enabled,
            sizes = sizes,
            onClick = {}
        )
        VitaminChips.Action(
            label = "Set a reminder",
            enabled = enabled,
            sizes = sizes,
            onClick = {},
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_vtmn_calendar_line),
                    contentDescription = null
                )
            }
        )
        VitaminChips.Action(
            label = "Share",
            enabled = enabled,
            sizes = sizes,
            onClick = {},
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_vtmn_share_line),
                    contentDescription = null
                )
            }
        )
        Spacer(modifier = Modifier.width(16.dp))
    }
}

//endregion action chips

//region filter chips

@Composable
private fun FilterRaw(
    enabled: Boolean,
    sizes: ChipSizes,
    selectedFilters: SnapshotStateList<String> = SnapshotStateList()
) {
    Row(
        modifier = Modifier
            .padding(top = 8.dp, bottom = 8.dp)
            .horizontalScroll(rememberScrollState()),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        val filters = listOf("Basket", "Climbing", "Badminton", "Football")
        Spacer(modifier = Modifier.width(16.dp))
        filters.forEach {
            val selected = selectedFilters.contains(it)
            VitaminChips.Filter(
                label = it,
                enabled = enabled,
                selected = selected,
                sizes = sizes,
                onClick = {
                    if (selected) {
                        selectedFilters.remove(it)
                    } else {
                        selectedFilters.add(it)
                    }
                }
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
    }
}

//endregion filter chips

//region input chips

@Composable
private fun InputColumn() {
    SubTitle("Medium")
    val displayedContacts =
        remember { mutableStateListOf("John", "Alice", "Helen", "Charles") }
    val disabledDisplayedContacts =
        remember { mutableStateListOf("John", "Alice", "Helen", "Charles") }
    InputRows(enabled = true, sizes = VitaminChipSizes.medium(), displayedContacts)
    InputRows(enabled = false, sizes = VitaminChipSizes.medium(), disabledDisplayedContacts)

    InputRowsWithLeadingIcon(true, VitaminChipSizes.medium())
    InputRowsWithLeadingIcon(false, VitaminChipSizes.medium())

    InputRowsWithLeadingImage(true, VitaminChipSizes.medium())
    InputRowsWithLeadingImage(false, VitaminChipSizes.medium())

    SubTitle("Small")
    val displayedContactsSmall =
        remember { mutableStateListOf("John", "Alice", "Helen", "Charles") }
    InputRows(enabled = true, sizes = VitaminChipSizes.small(), displayedContactsSmall)
    InputRows(enabled = false, sizes = VitaminChipSizes.small(), disabledDisplayedContacts)

    InputRowsWithLeadingIcon(true, VitaminChipSizes.small())
    InputRowsWithLeadingIcon(false, VitaminChipSizes.small())

    InputRowsWithLeadingImage(true, VitaminChipSizes.small())
    InputRowsWithLeadingImage(false, VitaminChipSizes.small())
}

@Composable
private fun InputRowsWithLeadingImage(enabled: Boolean, sizes: ChipSizes) {
    Row(
        modifier = Modifier
            .padding(top = 8.dp, bottom = 8.dp)
            .horizontalScroll(rememberScrollState()),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Spacer(modifier = Modifier.width(16.dp))

        VitaminChips.Input(
            label = "España",
            enabled = enabled,
            sizes = sizes,
            onClick = {
            },
            leadingContent = {
                Image(
                    painter = painterResource(R.drawable.vtmn_flag_es),
                    contentScale = ContentScale.Crop,
                    alignment = Alignment.Center,
                    contentDescription = null
                )
            }
        )
        VitaminChips.Input(
            label = "Belgium",
            enabled = enabled,
            sizes = sizes,
            onClick = {
            },
            leadingContent = {
                Image(
                    painter = painterResource(R.drawable.vtmn_flag_be),
                    contentScale = ContentScale.Crop,
                    alignment = Alignment.Center,
                    contentDescription = null
                )
            }
        )
        Spacer(modifier = Modifier.width(16.dp))
    }
}

@Composable
private fun InputRowsWithLeadingIcon(enabled: Boolean, sizes: ChipSizes) {
    Row(
        modifier = Modifier
            .padding(top = 8.dp, bottom = 8.dp)
            .horizontalScroll(rememberScrollState()),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Spacer(modifier = Modifier.width(16.dp))

        VitaminChips.Input(
            label = "Never mind",
            enabled = enabled,
            sizes = sizes,
            leadingIcon = {
                Icon(
                    painter = painterResource(
                        id = R.drawable.ic_vtmn_earth_line
                    ),
                    contentDescription = null
                )
            },
            onClick = {
            }
        )
        VitaminChips.Input(
            label = "Driving",
            enabled = enabled,
            sizes = sizes,
            onClick = {
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(
                        id = R.drawable.ic_vtmn_car_line
                    ),
                    contentDescription = null
                )
            }
        )
        VitaminChips.Input(
            label = "Walking",
            enabled = enabled,
            sizes = sizes,
            onClick = {
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(
                        id = R.drawable.ic_vtmn_walk_line
                    ),
                    contentDescription = null
                )
            }
        )
        Spacer(modifier = Modifier.width(16.dp))
    }
}

@Composable
private fun InputRows(
    enabled: Boolean,
    sizes: ChipSizes,
    displayedChips: SnapshotStateList<String> = SnapshotStateList()
) {
    Row(
        modifier = Modifier
            .padding(top = 8.dp, bottom = 8.dp)
            .horizontalScroll(rememberScrollState()),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Spacer(modifier = Modifier.width(16.dp))
        if (enabled) {
            VitaminChips.Action(
                label = "Re fill",
                sizes = sizes,
                onClick = {
                    displayedChips.clear()
                    displayedChips.addAll(listOf("John", "Alice", "Helen", "Charles"))
                },
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_vtmn_refresh_line),
                        contentDescription = null
                    )
                }
            )
        }

        displayedChips.forEach { contact ->
            VitaminChips.Input(
                label = contact,
                enabled = enabled,
                sizes = sizes,
                onClick = {
                    displayedChips.remove(contact)
                }
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
    }
}

//endregion input chips

//region single choice chips

@Composable
private fun SingleChoiceChips() {
    SubTitle("Medium")
    Row(
        modifier = Modifier
            .padding(top = 8.dp, bottom = 8.dp)
            .horizontalScroll(rememberScrollState()),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Spacer(modifier = Modifier.width(16.dp))

        var selected by remember { mutableStateOf("Medium") }
        listOf("Easy", "Medium", "Hard", "Expert").forEach { value ->
            VitaminChips.SingleChoice(
                label = value,
                enabled = value != "Easy",
                selected = value == selected,
                onClick = {
                    selected = value
                }
            )
        }

        Spacer(modifier = Modifier.width(16.dp))
    }

    SubTitle("Small")
    Row(
        modifier = Modifier
            .padding(top = 8.dp, bottom = 8.dp)
            .horizontalScroll(rememberScrollState()),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Spacer(modifier = Modifier.width(16.dp))

        var smallSelected by remember { mutableStateOf("Expert") }
        listOf("Easy", "Medium", "Hard", "Expert").forEach { value ->
            VitaminChips.SingleChoice(
                label = value,
                enabled = value != "Hard",
                selected = value == smallSelected,
                sizes = VitaminChipSizes.small(),
                onClick = {
                    smallSelected = value
                }
            )
        }

        Spacer(modifier = Modifier.width(16.dp))
    }
}

//endregion single choice chips

@Preview(showBackground = true)
@Composable
fun ChipsPreview() {
    VitaminTheme {
        Chips.Screen()
    }
}
