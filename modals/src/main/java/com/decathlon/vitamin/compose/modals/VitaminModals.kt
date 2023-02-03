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
        message = "Please use Acknowledge or Confirmation variant.",
        replaceWith = ReplaceWith("Confirmation")
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
        val rightButton = positiveButton ?: negativeButton ?: neutralButton
        val middleButton = when {
            positiveButton != null -> negativeButton ?: neutralButton
            negativeButton != null -> neutralButton
            else -> null
        }
        val leftButton = when {
            positiveButton != null && negativeButton != null -> neutralButton
            else -> null
        }
        when {
            (middleButton == null) -> Acknowledge(
                content = content,
                onDismissRequest = onDismissRequest,
                modifier = modifier,
                title = title,
                painter = iconRes?.let { painterResource(id = it) },
                contentScrollState = contentScrollState,
                colors = colors,
                sizes = sizes,
                button = rightButton,
            )
            else -> Confirmation(
                content = content,
                onDismissRequest = onDismissRequest,
                rightButton = rightButton!!,
                middleButton = middleButton,
                modifier = modifier,
                title = title,
                painter = iconRes?.let { painterResource(id = it) },
                buttonsOrientation = buttonsOrientation,
                contentScrollState = contentScrollState,
                colors = colors,
                sizes = sizes,
                leftButton = leftButton,
            )
        }
    }

    /**
     * The [Confirmation] modal used to ask for decision.
     * @param content The content to be displayed below the title
     * @param onDismissRequest The callback to be called when the user need to dismiss the modal
     * @param rightButton The button used to confirm the action
     * @param middleButton The button used to dismiss the action
     * @param modifier The [Modifier] to be applied to the component
     * @param title The optional title to be displayed at the top of the modal
     * @param painter The optional leading icon to be displayed at the start of the title
     * @param buttonsOrientation The optional buttons orientation to display buttons vertically or horizontally
     * @param contentScrollState The optional scroll state to observe the scrolling
     * @param colors The optional sizes used to define colors of icon, title, content and background of the modal
     * @param sizes The optional sizes used to define modal padding, spacers sizes and icon size
     * @param leftButton The optional button used to display a third action
     */
    @Composable
    fun Confirmation(
        content: @Composable (() -> Unit),
        onDismissRequest: () -> Unit,
        rightButton: (@Composable VitaminModalButtons.() -> Unit),
        middleButton: (@Composable VitaminModalButtons.() -> Unit),
        modifier: Modifier = Modifier,
        title: String? = null,
        painter: Painter? = null,
        buttonsOrientation: ModalButtonsOrientation = ModalButtonsOrientation.HORIZONTAL,
        contentScrollState: ScrollState = rememberScrollState(),
        colors: ModalColors = VitaminModalColors.primary(),
        sizes: ModalSizes = VitaminModalSizes.medium(),
        leftButton: (@Composable VitaminModalButtons.() -> Unit)? = null,
    ) = VitaminModalImpl(
        content = content,
        onDismissRequest = onDismissRequest,
        modifier = modifier,
        title = title,
        painter = painter,
        buttonsOrientation = buttonsOrientation,
        contentScrollState = contentScrollState,
        rightButton = rightButton.take(),
        middleButton = middleButton.take(),
        leftButton = leftButton.takeOrNull(),
        colors = colors,
        sizes = sizes,
    )

    /**
     * The [Acknowledge] modal used to provide information.
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
    fun Acknowledge(
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
        rightButton = button.takeOrNull(),
        middleButton = null,
        leftButton = null,
        buttonsOrientation = ModalButtonsOrientation.HORIZONTAL,
        sizes = sizes,
        colors = colors
    )
}

private fun (@Composable VitaminModalButtons.() -> Unit).take(): (@Composable () -> Unit) {
    return {
        VitaminModalButtons.this()
    }
}

private fun (@Composable VitaminModalButtons.() -> Unit)?.takeOrNull(): (@Composable () -> Unit)? {
    if (this == null) return null
    return {
        VitaminModalButtons.this()
    }
}
