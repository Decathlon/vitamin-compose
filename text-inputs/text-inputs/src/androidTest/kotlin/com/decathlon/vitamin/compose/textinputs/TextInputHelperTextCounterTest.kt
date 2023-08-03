package com.decathlon.vitamin.compose.textinputs

import androidx.compose.ui.test.assert
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.textinputs.testing.hasEditableTextCounter
import com.decathlon.vitamin.compose.textinputs.testing.hasEditableTextHelperText
import com.decathlon.vitamin.compose.textinputs.testing.onEditableTextNodeWithLabel
import org.junit.Rule
import org.junit.Test

class TextInputHelperTextCounterTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    /**
     * Given Vitamin TextInput with an helper text
     * When we compose the component tree
     * Then we can check in the semantic props if the helper text is available
     */
    @Test
    fun checkHelperTextIsAccessibleAndDisplayed() {
        composeTestRule.setContent {
            VitaminTheme {
                VitaminTextInputs.Outlined(
                    value = "My value",
                    label = "My label",
                    onValueChange = {
                    },
                    helperText = "Short description"
                )
            }
        }
        composeTestRule.onEditableTextNodeWithLabel("My label")
            .assert(hasEditableTextHelperText("Short description"))
    }

    /**
     * Given Vitamin TextInput with an helper text
     * When we compose the component tree
     * Then we can check if the helper text Text is accessible for Talkback
     */
    @Test
    fun checkHelperTextIsAccessibleForTalkback() {
        composeTestRule.setContent {
            VitaminTheme {
                VitaminTextInputs.Outlined(
                    value = "My value",
                    label = "My label",
                    onValueChange = {
                    },
                    helperText = "Short description"
                )
            }
        }
        composeTestRule.onNodeWithText("Short description")
            .assertExists()
            .assertIsDisplayed()
    }

    /**
     * Given Vitamin TextInput with an helper text
     * When we compose the component tree
     * Then we can check in the semantic props if the helper text is available
     */
    @Test
    fun checkCounterIsAccessibleAndDisplayed() {
        composeTestRule.setContent {
            VitaminTheme {
                VitaminTextInputs.Outlined(
                    value = "My value",
                    label = "My label",
                    onValueChange = {
                    },
                    counter = Pair(4, 2)
                )
            }
        }
        composeTestRule.onEditableTextNodeWithLabel("My label")
            .assert(hasEditableTextCounter(Pair(4, 2)))
    }

    /**
     * Given Vitamin TextInput with a counter
     * When we compose the component tree
     * Then we can check if the counter Text is accessible for Talkback
     */
    @Test
    fun checkCounterIsAccessibleForTalkback() {
        composeTestRule.setContent {
            VitaminTheme {
                VitaminTextInputs.Outlined(
                    value = "My value",
                    label = "My label",
                    onValueChange = {
                    },
                    counter = Pair(4, 2)
                )
            }
        }
        composeTestRule.onNodeWithText("4/2")
            .assertExists()
            .assertIsDisplayed()
    }
}
