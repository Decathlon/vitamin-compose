package com.decathlon.vitamin.compose.snackbars.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.decathlon.vitamin.compose.snackbars.VitaminSnackbars
import com.decathlon.vitamin.compose.snackbars.VitaminSnackbarsActions

object SnackbarVariantsFactory {

    @Composable
    fun Snackbar(
        variant: Variant,
        modifier: Modifier = Modifier,
        text: String = "This is the description of the snackbar",
        actionOnNewLine: Boolean = false,
        action: @Composable (VitaminSnackbarsActions.() -> Unit)? = null
    ) {
        when (variant) {
            Variant.Primary -> VitaminSnackbars.Primary(
                modifier = modifier,
                text = text,
                action = action,
                actionOnNewLine = actionOnNewLine
            )
        }
    }
}
