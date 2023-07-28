# TextInput test artifact

## Usage

If you want to test easier the component in your junit compose test, this artifact will help
you by providing you selectors and assertions that encapsulate the internal implementation of
the component. To use it, declare the test dependency in your Gradle file:

```kotlin
androidTestImplementation("com.decathlon.vitamin.compose:text-inputs-test:<versions>")
```

## Find the component

### Find by label

If you want to find your semantic EditableText node by its label, you have selectors dedicated to 
this usage:

```kotlin
/**
 * Finds a EditableText semantics node that matches the given label attached to the TextInput.
 *
 * For usage patterns and semantics concepts see [SemanticsNodeInteraction]
 *
 * @param label Label attached to the TextInput
 * @see onAllEditableTextNodeWithLabel to work with multiple elements
 */
fun SemanticsNodeInteractionsProvider.onEditableTextNodeWithLabel(label: String): SemanticsNodeInteraction

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
fun SemanticsNodeInteractionsProvider.onAllEditableTextNodeWithLabel(label: String): SemanticsNodeInteractionCollection
```

They can be used directly from a `ComposeContentTestRule` instance:

```kotlin
composeTestRule.onEditableTextNodeWithLabel("My label")
composeTestRule.onAllEditableTextNodeWithLabel("My label")
```

### Find by value

If you want to find your semantic EditableText node by its value, you have selectors dedicated to 
this usage:

```kotlin
/**
 * Finds a EditableText semantics node that matches the given value filled in the TextInput.
 *
 * For usage patterns and semantics concepts see [SemanticsNodeInteraction]
 *
 * @param value Value filled in the content of the TextInput
 * @see onAllEditableTextNodesWithValue to work with multiple elements
 */
fun SemanticsNodeInteractionsProvider.onEditableTextNodeWithValue(value: String): SemanticsNodeInteraction

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
fun SemanticsNodeInteractionsProvider.onAllEditableTextNodesWithValue(value: String): SemanticsNodeInteractionCollection
```

They can be used directly from a `ComposeContentTestRule` instance:

```kotlin
composeTestRule.onEditableTextNodeWithValue("My value")
composeTestRule.onAllEditableTextNodesWithValue("My value")
```

## Assertions

### Check the value

If you want to check the value from a semantic EditableText node, you have dedicated assertions for 
this usage:

```kotlin
/**
 * Asserts that the node's edittext contains the given [values] and nothing else.
 *
 * @param value Value to match
 * @see SemanticsProperties.EditableText
 */
fun SemanticsNodeInteraction.assertEditableTextValueEquals(value: String): SemanticsNodeInteraction
```

They can be used when you find your EditableText node with selectors described in a previous section:

```kotlin
composeTestRule.onEditableTextNodeWithLabel("My label")
    .assertEditableTextValueEquals("My value")
```

### Check modes

If you want to check normal, error and success mode of the EditableText node, you have dedicated 
assertions to check if the mode is in error or not:

```kotlin
/**
 * Asserts that the current semantics node is in error.
 *
 * Throws [AssertionError] if the node is in error or not.
 */
fun SemanticsNodeInteraction.assertIsError(description: String = "Invalid input"): SemanticsNodeInteraction

/**
 * Asserts that the current semantics node is in error.
 *
 * Throws [AssertionError] if the node is in error or not.
 */
fun SemanticsNodeInteraction.assertIsNotError(description: String = "Invalid input"): SemanticsNodeInteraction
```

Note that the normal and success mode have the exact same semantic and should be tested by the same
way. These functions can be used when you find your EditableText node with selectors described in a
previous section:

```kotlin
composeTestRule.onEditableTextNodeWithLabel("My label")
    .assertIsError() // is in error mode
    .assertIsNotError() // is in normal or success mode
```

## Semantic Matchers

### Check helper text and counter

If you want to check the helper text or counter content, uou have dedicated semantic matchers for 
this usage:

```kotlin
/**
 * Returns whether the node's editable text helper text contains the given value.
 *
 * @param helperText Helper text to match the editable text helper text from semantic tree
 * @see SemanticsProperties.EditableHelperText
 */
fun hasEditableTextHelperText(helperText: String): SemanticsMatcher

/**
 * Returns whether the node's editable counter pair contains the given value.
 *
 * @param counter Counter to match the editable text counter from semantic tree
 * @see SemanticsProperties.EditableCounter
 */
fun hasEditableTextCounter(counter: Pair<Int, Int>): SemanticsMatcher
```

They can be used when you find your EditableText node with selectors described in a previous section:

```kotlin
composeTestRule.onEditableTextNodeWithLabel("My label")
    .assert(hasEditableTextHelperText("Helper text"))
    .assert(hasEditableTextCounter(Pair(4, 2)))
```

## Out of the scope

### Check trailing icon action

Because the trailing icon action is declared outside the Vitamin component, there is no dedicated
selectors, assertions or semantic matchers to find the icon and check if they is any click action
on it but you can easily use the native compose test api to find your icon by its content 
description and check if it is clickable.

```kotlin
composeTestRule.setContent {
    VitaminTheme {
        VitaminTextInputs.Outlined(
            value = "My value",
            label = "My label",
            onValueChange = {},
            icon = {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = VitaminIcons.Line.Check,
                        contentDescription = "check"
                    )
                }
            }
        )
    }
}
composeTestRule.onNodeWithContentDescription(label = "check")
    .assertHasClickAction()
```
