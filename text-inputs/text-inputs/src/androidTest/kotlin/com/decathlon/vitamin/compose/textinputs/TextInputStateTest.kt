package com.decathlon.vitamin.compose.textinputs

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsNotEnabled
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.textinputs.testing.assertIsError
import com.decathlon.vitamin.compose.textinputs.testing.assertIsNotError
import com.decathlon.vitamin.compose.textinputs.testing.onEditableTextNodeWithLabel
import com.decathlon.vitamin.compose.textinputs.testing.onEditableTextNodeWithValue
import org.junit.Rule
import org.junit.Test

class TextInputStateTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    /**
     * Given a VitaminTextInput in normal mode
     * When we compose the component tree
     * Then it should be displayed but not in error mode
     */
    @Test
    fun checkTextInputIsNotInError() {
        composeTestRule.setContent {
            VitaminTheme {
                VitaminTextInputs.Outlined(
                    value = "My value",
                    label = "My label",
                    onValueChange = {
                    },
                    colors = TextInputsState.normal()
                )
            }
        }
        composeTestRule.onEditableTextNodeWithValue("My value")
            .assertIsDisplayed()
        composeTestRule.onEditableTextNodeWithValue("My value")
            .assertIsNotError()
    }

    /**
     * Given a VitaminTextInput in error mode
     * When we compose the component tree
     * Then it should be displayed and in error mode
     */
    @Test
    fun checkTextInputIsInError() {
        composeTestRule.setContent {
            VitaminTheme {
                VitaminTextInputs.Outlined(
                    value = "My value",
                    label = "My label",
                    onValueChange = {
                    },
                    colors = TextInputsState.error()
                )
            }
        }
        composeTestRule.onEditableTextNodeWithValue("My value")
            .assertIsDisplayed()
        composeTestRule.onEditableTextNodeWithValue("My value")
            .assertIsError()
    }

    /**
     * Given a VitaminTextInput in success mode
     * When we compose the component tree
     * Then it should be the same as normal
     */
    @Test
    fun checkTextInputIsInSuccess() {
        composeTestRule.setContent {
            VitaminTheme {
                VitaminTextInputs.Outlined(
                    value = "My value",
                    label = "My label",
                    onValueChange = {
                    },
                    colors = TextInputsState.success()
                )
            }
        }
        composeTestRule.onEditableTextNodeWithValue("My value")
            .assertIsDisplayed()
        composeTestRule.onEditableTextNodeWithValue("My value")
            .assertIsNotError()
    }

    /**
     * Given a VitaminTextInput disabled
     * When we compose the component tree
     * Then text input, helper text and counter should be tagged as disable
     */
    @Test
    fun checkTextInputIsDisabled() {
        composeTestRule.setContent {
            VitaminTheme {
                VitaminTextInputs.Outlined(
                    value = "My value",
                    label = "My label",
                    onValueChange = {
                    },
                    helperText = "My helper text",
                    counter = Pair(4, 2),
                    enabled = false
                )
            }
        }
        composeTestRule.onEditableTextNodeWithLabel("My label")
            .assertIsNotEnabled()
        composeTestRule.onNodeWithText("My helper text")
            .assertIsNotEnabled()
        composeTestRule.onNodeWithText("4/2")
            .assertIsNotEnabled()
    }
}
