package com.decathlon.vitamin.compose.snackbars

import androidx.compose.material.Snackbar
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object VitaminSnackbars {

    /**
     * The primary snackbar is the main (and the only one for now) to use * when you need to show a snackbar
     * @param text The text inside the snackbar * @param modifier The [Modifier] to be applied to the component
     * @param actionOnNewLine whether or not action should be put on the separate line.
     * Recommended for action with long action text
     * @param colors The colors of the background and the content
     * @param action vitamin action the snackbar
     */
    @Composable
    fun Primary(
        text: String,
        modifier: Modifier = Modifier,
        actionOnNewLine: Boolean = false,
        colors: SnackbarColors = VitaminSnackbarColors.primary(),
        action: @Composable (VitaminSnackbarsActions.() -> Unit)? = null
    ) = Snackbar(
        modifier = modifier,
        action = { action?.let { VitaminSnackbarsActions.it() } },
        actionOnNewLine = actionOnNewLine,
        backgroundColor = colors.backgroundColor,
        contentColor = colors.contentColor,
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
        VitaminSnackbars.Primary(text = "This is the description of the snackbar")
    }
}

@Preview
@Composable
fun PreviewVitaminSnackBarWithActionOneLine() {
    VitaminTheme {
        VitaminSnackbars.Primary(
            text = "This is the description of the snackbar",
            action = {
                VitaminSnackbarsActions.Button(
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
        VitaminSnackbars.Primary(
            text = "This is the description of the snackbar",
            action = {
                VitaminSnackbarsActions.Button(
                    text = "Button",
                    onClick = { /*TODO*/ }
                )
            },
            actionOnNewLine = true
        )
    }
}
