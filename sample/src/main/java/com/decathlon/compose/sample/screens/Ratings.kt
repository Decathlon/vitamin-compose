package com.decathlon.compose.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.ratings.VitaminRatingColors
import com.decathlon.vitamin.compose.ratings.VitaminRatingSizes
import com.decathlon.vitamin.compose.ratings.VitaminRatings
import com.decathlon.vitamin.compose.switches.VitaminSwitches

object Ratings : Screen {
    override val name: String
        get() = "Ratings"
    override val navigationKey: String
        get() = "ratings"

    @SuppressWarnings("LongMethod")
    @Composable
    override fun Screen() {
        SampleScaffold(title = name) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 4.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(horizontal = 8.dp)
            ) {
                item { Text(text = "Read Only Mode", style = VitaminTheme.typography.h6) }
                item {
                    val isEmphasis = remember { mutableStateOf(false) }
                    val colors = if (isEmphasis.value) VitaminRatingColors.emphasis()
                    else VitaminRatingColors.primary()
                    Spacer(modifier = Modifier.height(20.dp))
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        VitaminRatings.ReadOnly(
                            number = .3f,
                            sizes = VitaminRatingSizes.small(),
                            colors = colors
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        VitaminRatings.ReadOnly(
                            number = 1.3f,
                            sizes = VitaminRatingSizes.small(),
                            colors = colors
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        VitaminRatings.ReadOnly(
                            number = 4.8f,
                            sizes = VitaminRatingSizes.small(),
                            colors = colors
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        VitaminRatings.ReadOnly(
                            number = 4.865f,
                            nbComments = 42,
                            showNote = true,
                            sizes = VitaminRatingSizes.small(),
                            colors = colors
                        )
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Emphasis")
                        VitaminSwitches.Primary(
                            checked = isEmphasis.value,
                            onCheckedChange = { isEmphasis.value = !isEmphasis.value }
                        )
                    }
                }
                item { Text(text = "Compact Read Only Mode", style = VitaminTheme.typography.h6) }
                item {
                    val isEmphasis = remember { mutableStateOf(false) }
                    val colors = if (isEmphasis.value) VitaminRatingColors.emphasis()
                    else VitaminRatingColors.primary()
                    Spacer(modifier = Modifier.height(20.dp))
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        VitaminRatings.ReadOnlyCompact(
                            number = 4.8f,
                            sizes = VitaminRatingSizes.small(),
                            colors = colors
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        VitaminRatings.ReadOnlyCompact(
                            number = 4.865f,
                            nbComments = 42,
                            sizes = VitaminRatingSizes.small(),
                            colors = colors
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        VitaminRatings.ReadOnlyCompact(
                            number = 4.865f,
                            nbComments = 0,
                            sizes = VitaminRatingSizes.small(),
                            colors = colors
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        VitaminRatings.ReadOnlyCompact(
                            number = 4.865f,
                            nbComments = 1,
                            sizes = VitaminRatingSizes.small(),
                            colors = colors
                        )
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Emphasis")
                        VitaminSwitches.Primary(
                            checked = isEmphasis.value,
                            onCheckedChange = { isEmphasis.value = !isEmphasis.value }
                        )
                    }
                }
                item { Text(text = "Interactive Mode", style = VitaminTheme.typography.h6) }
                item {
                    val interact = remember { mutableStateOf(0) }
                    val isEmphasis = remember { mutableStateOf(false) }
                    val colors = if (isEmphasis.value) VitaminRatingColors.emphasis()
                    else VitaminRatingColors.primary()
                    Spacer(modifier = Modifier.height(20.dp))
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        VitaminRatings.Interactive(
                            number = interact.value,
                            sizes = VitaminRatingSizes.small(),
                            colors = colors,
                            onValueChange = { interact.value = it }
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        VitaminRatings.Interactive(
                            number = interact.value,
                            colors = colors,
                            onValueChange = { interact.value = it }
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        VitaminRatings.Interactive(
                            number = 4,
                            enabled = false,
                            colors = colors,
                            onValueChange = { interact.value = it }
                        )
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Emphasis")
                        VitaminSwitches.Primary(
                            checked = isEmphasis.value,
                            onCheckedChange = { isEmphasis.value = !isEmphasis.value }
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewRatings() {
    VitaminTheme {
        Ratings.Screen()
    }
}
