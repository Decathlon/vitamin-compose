package com.decathlon.vitamin.compose.textinputs.testing

import androidx.compose.ui.test.SemanticsNodeInteraction
import androidx.compose.ui.test.SemanticsNodeInteractionCollection
import androidx.compose.ui.test.SemanticsNodeInteractionsProvider

/**
 * Finds a EditableText semantics node that matches the given label attached to the TextInput.
 *
 * For usage patterns and semantics concepts see [SemanticsNodeInteraction]
 *
 * @param label Label attached to the TextInput
 * @see onAllEditableTextNodeWithLabel to work with multiple elements
 */
fun SemanticsNodeInteractionsProvider.onEditableTextNodeWithLabel(label: String)
        : SemanticsNodeInteraction = onNode(hasEditableTextLabel(label))

/**
 * Finds all EditableText semantics nodes that match the given label attached to the TextInput.
 *
 * If you are working with elements that are not supposed to occur multiple times use
 * [onEditableTextNodeWithLabel] instead.
 *
 * For usage patterns and semantics concepts see [SemanticsNodeInteraction]
 *
 * @param label Label attached to the TextInput
 * @see onEditableTextNodeWithLabel
 */
fun SemanticsNodeInteractionsProvider.onAllEditableTextNodeWithLabel(label: String)
        : SemanticsNodeInteractionCollection = onAllNodes(hasEditableTextLabel(label))

/**
 * Finds a EditableText semantics node that matches the given value filled in the TextInput.
 *
 * For usage patterns and semantics concepts see [SemanticsNodeInteraction]
 *
 * @param value Value filled in the content of the TextInput
 * @see onAllEditableTextNodesWithValue to work with multiple elements
 */
fun SemanticsNodeInteractionsProvider.onEditableTextNodeWithValue(value: String)
        : SemanticsNodeInteraction = onNode(hasEditableTextValue(value))

/**
 * Finds all EditableText semantics nodes that match the given value filled in the TextInput.
 *
 * If you are working with elements that are not supposed to occur multiple times use
 * [onEditableTextNodeWithValue] instead.
 *
 * For usage patterns and semantics concepts see [SemanticsNodeInteraction]
 *
 * @param value Value filled in the content of the TextInput
 * @see onEditableTextNodeWithValue
 */
fun SemanticsNodeInteractionsProvider.onAllEditableTextNodesWithValue(value: String)
        : SemanticsNodeInteractionCollection = onAllNodes(hasEditableTextValue(value))
