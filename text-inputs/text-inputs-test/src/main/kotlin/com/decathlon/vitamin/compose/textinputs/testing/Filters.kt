package com.decathlon.vitamin.compose.textinputs.testing

import androidx.compose.ui.semantics.SemanticsProperties
import androidx.compose.ui.test.SemanticsMatcher

/**
 * Returns whether the node is in error mode.
 *
 * @see SemanticsProperties.Error
 */
fun isError(description: String): SemanticsMatcher =
    SemanticsMatcher.expectValue(SemanticsProperties.Error, description)
