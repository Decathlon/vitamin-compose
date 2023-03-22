package com.decathlon.vitamin.compose.chips

import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.vitaminicons.Line
import com.decathlon.vitamin.compose.vitaminicons.line.Check
import com.decathlon.vitamin.compose.vitaminicons.line.Close

internal object VitaminChipButtons {
    @Composable
    fun Close(
        contentDescription: String?,
        modifier: Modifier = Modifier,
    ) {
        Icon(
            modifier = modifier,
            imageVector = VitaminIcons.Line.Close,
            contentDescription = contentDescription
        )
    }

    @Composable
    fun Check(
        contentDescription: String?,
        modifier: Modifier = Modifier,
    ) {
        Icon(
            modifier = modifier,
            imageVector = VitaminIcons.Line.Check,
            contentDescription = contentDescription
        )
    }
}
