package com.decathlon.vitamin.compose.snackbars

import androidx.compose.material.Snackbar
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object VitaminSnackbars {
    @Composable
    fun VitaminSnackbar(
        text: String,
        modifier: Modifier = Modifier,
        action: @Composable (VitaminSnackbarsAction.() -> Unit)? = null,
        actionOnNewLine: Boolean = false
    ) = Snackbar(
        modifier = modifier,
        action = { action?.let { VitaminSnackbarsAction.it() } },
        actionOnNewLine = actionOnNewLine,
        backgroundColor = VitaminTheme.colors.vtmnBackgroundPrimaryReversed,
        contentColor = VitaminTheme.colors.vtmnContentPrimaryReversed,
        content = {
            Text(
                text = text,
                style = VitaminTheme.typography.body3
            )
        }
    )
}


@Preview
@Composable
fun PreviewVitaminSnackBarWithTextOnly() {
    VitaminTheme {
        VitaminSnackbars.VitaminSnackbar(text = "This is the description of the snackbar")
    }
}

@Preview
@Composable
fun PreviewVitaminSnackBarWithActionOneLine() {
    VitaminTheme {
        VitaminSnackbars.VitaminSnackbar(text = "This is the description of the snackbar",
            action = {
                VitaminSnackbarsAction.SnackbarAction(
                    text = "Button",
                    onClick = { /*TODO*/ }
                )
            }
        )
    }
}

@Preview
@Composable
fun PreviewVitaminSnackBarWithActionTwoLine() {
    VitaminTheme {
        VitaminSnackbars.VitaminSnackbar(text = "This is the description of the snackbar",
            action = {
                VitaminSnackbarsAction.SnackbarAction(
                    text = "Button",
                    onClick = { /*TODO*/ }
                )
            },
            actionOnNewLine = true
        )
    }
}