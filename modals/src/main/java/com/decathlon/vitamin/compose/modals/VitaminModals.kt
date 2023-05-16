package com.decathlon.vitamin.compose.modals

import androidx.annotation.DrawableRes
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.decathlon.vitamin.compose.modals.impl.VitaminModalImpl

object VitaminModals {
    /**
     * The default modal used to provide critical information or ask for decision.
     * @param content The content to be displayed below the title
     * @param onDismissRequest The callback to be called when the user need to dismiss the modal
     * @param modifier The [Modifier] to be applied to the component
     * @param title The optional title to be displayed at the top of the modal
     * @param iconRes The optional leading icon to be displayed at the start of the title
     * @param buttonsOrientation The optional buttons orientation to display buttons vertically or horizontally
     * @param contentScrollState The optional scroll state to observe the scrolling
     * @param colors The optional sizes used to define colors of icon, title, content and background of the modal
     * @param sizes The optional sizes used to define modal padding, spacers sizes and icon size
     * @param positiveButton The optional positive button to be displayed at the bottom of the modal
     * @param negativeButton The optional negative button to be displayed at the bottom of the modal
     * @param neutralButton The optional neutral button to be displayed at the bottom of the modal
     */
    @Deprecated(
        message = "Please use other Primary implementations.",
        replaceWith = ReplaceWith("Primary")
    )
    @Composable
    fun Primary(
        content: @Composable (() -> Unit),
        onDismissRequest: () -> Unit,
        modifier: Modifier = Modifier,
        title: String? = null,
        @DrawableRes iconRes: Int? = null,
        buttonsOrientation: ModalButtonsOrientation = ModalButtonsOrientation.HORIZONTAL,
        contentScrollState: ScrollState = rememberScrollState(),
        colors: ModalColors = VitaminModalColors.primary(),
        sizes: ModalSizes = VitaminModalSizes.medium(),
        positiveButton: (@Composable VitaminModalButtons.() -> Unit)? = null,
        negativeButton: (@Composable VitaminModalButtons.() -> Unit)? = null,
        neutralButton: (@Composable VitaminModalButtons.() -> Unit)? = null,
    ) {
        // To avoid incorrect display of buttons, we need to display them from right to left
        // If only one button is needed (positive, negative or neutral) -> display one button as confirmationButton
        // If two buttons are defined -> display the first one as confirmationButton (positive or negative,
        // in this order) & the other as dismissButton
        // If three buttons are defined -> display positiveButton as confirmationButton, negativeButton as dismissButton
        // & neutralButton as thirdButton

        // We get the rightmost button as confirmationButton
        val confirmationButton = positiveButton ?: negativeButton ?: neutralButton
        // We get the rightmost button (exclude the confirmationButton) as dismissButton
        val dismissButton = when {
            positiveButton != null -> negativeButton ?: neutralButton
            negativeButton != null -> neutralButton
            else -> null
        }
        // We get the last button as thirdButton
        val thirdButton = when {
            positiveButton != null && negativeButton != null -> neutralButton
            else -> null
        }
        when {
            // In this case, we have only one button or no button
            (dismissButton == null) -> Primary(
                content = content,
                onDismissRequest = onDismissRequest,
                modifier = modifier,
                title = title,
                painter = iconRes?.let { painterResource(id = it) },
                contentScrollState = contentScrollState,
                colors = colors,
                sizes = sizes,
                button = confirmationButton,
            )
            // In this cas, we have at least two buttons
            else -> Primary(
                content = content,
                onDismissRequest = onDismissRequest,
                confirmationButton = confirmationButton!!,
                dismissButton = dismissButton,
                modifier = modifier,
                title = title,
                painter = iconRes?.let { painterResource(id = it) },
                buttonsOrientation = buttonsOrientation,
                contentScrollState = contentScrollState,
                colors = colors,
                sizes = sizes,
                thirdButton = thirdButton,
            )
        }
    }

    /**
     * This implementation will be use to validate an action or request information from the user
     * In this case, two buttons are mandatory. One must be a confirming action, and the other a dismissing action.
     * Providing a third action, such as "Learn more" is not recommended as it navigates the user away from the dialog,
     * leaving the dialog task unfinished.
     * @param content The content to be displayed below the title
     * @param onDismissRequest The callback to be called when the user need to dismiss the modal
     * @param confirmationButton The button used to confirm the action
     * @param dismissButton The button used to dismiss the action
     * @param modifier The [Modifier] to be applied to the component
     * @param title The optional title to be displayed at the top of the modal
     * @param painter The optional leading icon to be displayed at the start of the title
     * @param buttonsOrientation The optional buttons orientation to display buttons vertically or horizontally
     * @param contentScrollState The optional scroll state to observe the scrolling
     * @param colors The optional sizes used to define colors of icon, title, content and background of the modal
     * @param sizes The optional sizes used to define modal padding, spacers sizes and icon size
     * @param thirdButton The optional button used to display a third action (Not recommended).
     */
    @Composable
    fun Primary(
        content: @Composable (() -> Unit),
        onDismissRequest: () -> Unit,
        confirmationButton: (@Composable VitaminModalButtons.() -> Unit),
        dismissButton: (@Composable VitaminModalButtons.() -> Unit),
        modifier: Modifier = Modifier,
        title: String? = null,
        painter: Painter? = null,
        buttonsOrientation: ModalButtonsOrientation = ModalButtonsOrientation.HORIZONTAL,
        contentScrollState: ScrollState = rememberScrollState(),
        colors: ModalColors = VitaminModalColors.primary(),
        sizes: ModalSizes = VitaminModalSizes.medium(),
        thirdButton: (@Composable VitaminModalButtons.() -> Unit)? = null,
    ) = VitaminModalImpl(
        content = content,
        onDismissRequest = onDismissRequest,
        modifier = modifier,
        title = title,
        painter = painter,
        buttonsOrientation = buttonsOrientation,
        contentScrollState = contentScrollState,
        confirmationButton = confirmationButton,
        dismissButton = dismissButton,
        thirdButton = thirdButton,
        colors = colors,
        sizes = sizes,
    )

    /**
     * This implementation will be use to notify the user.
     * In this case, only one button is available to dismiss the [VitaminModals]
     * @param content The content to be displayed below the title
     * @param onDismissRequest The callback to be called when the user need to dismiss the modal
     * @param modifier The [Modifier] to be applied to the component
     * @param title The optional title to be displayed at the top of the modal
     * @param painter The optional leading icon to be displayed at the start of the title
     * @param contentScrollState The optional scroll state to observe the scrolling
     * @param colors The optional sizes used to define colors of icon, title, content and background of the modal
     * @param sizes The optional sizes used to define modal padding, spacers sizes and icon size
     * @param button The optional button to do the acknowledgement action
     */
    @Composable
    fun Primary(
        content: @Composable (() -> Unit),
        onDismissRequest: () -> Unit,
        modifier: Modifier = Modifier,
        title: String? = null,
        painter: Painter? = null,
        contentScrollState: ScrollState = rememberScrollState(),
        colors: ModalColors = VitaminModalColors.primary(),
        sizes: ModalSizes = VitaminModalSizes.medium(),
        button: (@Composable VitaminModalButtons.() -> Unit)? = null,
    ) = VitaminModalImpl(
        content = content,
        onDismissRequest = onDismissRequest,
        modifier = modifier,
        title = title,
        painter = painter,
        contentScrollState = contentScrollState,
        confirmationButton = button,
        dismissButton = null,
        thirdButton = null,
        buttonsOrientation = ModalButtonsOrientation.HORIZONTAL,
        sizes = sizes,
        colors = colors
    )
}
