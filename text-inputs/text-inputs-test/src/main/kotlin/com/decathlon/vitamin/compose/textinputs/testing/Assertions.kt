package com.decathlon.vitamin.compose.textinputs.testing

import androidx.compose.ui.semantics.SemanticsProperties
import androidx.compose.ui.test.SemanticsNodeInteraction
import androidx.compose.ui.test.assert

/**
 * Asserts that the current semantics node is in error.
 *
 * Throws [AssertionError] if the node is in error or not.
 */
fun SemanticsNodeInteraction.assertIsError(description: String = "Invalid input"): SemanticsNodeInteraction =
    assert(isError(description))

/**
 * Asserts that the current semantics node is in error.
 *
 * Throws [AssertionError] if the node is in error or not.
 */
fun SemanticsNodeInteraction.assertIsNotError(description: String = "Invalid input"): SemanticsNodeInteraction =
    assert(isError(description).not())

/**
 * Asserts that the node's edittext contains the given [values] and nothing else.
 *
 * @param value Value to match
 * @see SemanticsProperties.EditableText
 */
fun SemanticsNodeInteraction.assertEditableTextValueEquals(value: String): SemanticsNodeInteraction =
    assert(hasEditableTextValue(value))
