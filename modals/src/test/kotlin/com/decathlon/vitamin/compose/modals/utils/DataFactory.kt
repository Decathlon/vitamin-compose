package com.decathlon.vitamin.compose.modals.utils

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle

object DataFactory {

    internal const val title: String = "Subtitle"
    internal const val message: String = "Lorem ipsum dolor sit amet, consectetur adipiscing " +
            "elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut " +
            "enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip " +
            "ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate " +
            "velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat " +
            "cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id " +
            "est laborum."
    internal val longAnnotatedMessage: AnnotatedString = buildAnnotatedString {
        append("$message\n\n")
        withStyle(
            style = SpanStyle(fontStyle = FontStyle.Italic)
        ) {
            append("$message\n\n")
        }
        withStyle(
            style = SpanStyle(fontWeight = FontWeight.Bold)
        ) {
            append("$message\n\n")
        }
        append("$message\n\n")
        withStyle(
            style = SpanStyle(fontStyle = FontStyle.Italic)
        ) {
            append(message)
        }
    }
}
