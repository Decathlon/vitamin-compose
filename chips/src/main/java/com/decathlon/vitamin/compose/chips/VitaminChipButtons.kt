package com.decathlon.vitamin.compose.chips

import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

internal object VitaminChipButtons {
    @Composable
    fun Close(
        contentDescription: String?,
        modifier: Modifier = Modifier,
    ) {
        Icon(
            modifier = modifier,
            painter = painterResource(R.drawable.ic_vtmn_close_line),
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
            painter = painterResource(R.drawable.ic_vtmn_check_line),
            contentDescription = contentDescription
        )
    }
}
