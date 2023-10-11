package com.decathlon.vitamin.compose.textinputs

import androidx.compose.material.ContentAlpha
import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Composable
internal fun TextInputStateColors.outlinedTextFieldColors(): TextFieldColors {
    return TextFieldDefaults.outlinedTextFieldColors(
        backgroundColor = VitaminTheme.colors.vtmnBackgroundPrimary,
        cursorColor = VitaminTheme.colors.vtmnContentAction,
        errorCursorColor = VitaminTheme.colors.vtmnContentNegative,
        textColor = VitaminTheme.colors.vtmnContentPrimary,
        disabledTextColor = VitaminTheme.colors.vtmnContentTertiary.copy(
            ContentAlpha.disabled,
        ),
        focusedBorderColor = focusBorderColor,
        unfocusedBorderColor = borderColor,
        disabledBorderColor = VitaminTheme.colors.vtmnActiveTertiary.copy(
            ContentAlpha.disabled,
        ),
        errorBorderColor = borderColor,
        leadingIconColor = iconColor,
        disabledLeadingIconColor = VitaminTheme.colors.vtmnActiveTertiary.copy(
            ContentAlpha.disabled,
        ),
        errorLeadingIconColor = iconColor,
        trailingIconColor = iconColor,
        disabledTrailingIconColor = VitaminTheme.colors.vtmnContentPrimary.copy(
            ContentAlpha.disabled,
        ),
        errorTrailingIconColor = iconColor,
        focusedLabelColor = focusTextColor,
        unfocusedLabelColor = textColor,
        disabledLabelColor = VitaminTheme.colors.vtmnContentTertiary.copy(
            ContentAlpha.disabled,
        ),
        errorLabelColor = textColor,
    )
}

@Composable
internal fun TextInputStateColors.textFieldColors(): TextFieldColors {
    return TextFieldDefaults.textFieldColors(
        backgroundColor = VitaminTheme.colors.vtmnBackgroundPrimary,
        cursorColor = VitaminTheme.colors.vtmnContentAction,
        errorCursorColor = VitaminTheme.colors.vtmnContentNegative,
        textColor = VitaminTheme.colors.vtmnContentPrimary,
        disabledTextColor = VitaminTheme.colors.vtmnContentTertiary.copy(
            ContentAlpha.disabled,
        ),
        focusedIndicatorColor = focusBorderColor,
        unfocusedIndicatorColor = borderColor,
        disabledIndicatorColor = VitaminTheme.colors.vtmnActiveTertiary.copy(
            ContentAlpha.disabled,
        ),
        errorIndicatorColor = borderColor,
        leadingIconColor = iconColor,
        disabledLeadingIconColor = VitaminTheme.colors.vtmnActiveTertiary.copy(
            ContentAlpha.disabled,
        ),
        errorLeadingIconColor = iconColor,
        trailingIconColor = iconColor,
        disabledTrailingIconColor = VitaminTheme.colors.vtmnContentPrimary.copy(
            ContentAlpha.disabled,
        ),
        errorTrailingIconColor = iconColor,
        focusedLabelColor = focusTextColor,
        unfocusedLabelColor = textColor,
        disabledLabelColor = VitaminTheme.colors.vtmnContentTertiary.copy(
            ContentAlpha.disabled,
        ),
        errorLabelColor = textColor,
    )
}
