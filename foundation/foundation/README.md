# Foundation module

## Responsibilities

This module is used by all Vitamin component artifacts to apply the correct design
specification and contain atomic components of the Decathlon Design System with:

* Vitamin text styles
* Vitamin semantic colors
* Vitamin theme with dark and light mode

These resources are public and can be imported as a standalone artifact in an external
application.

Note that icons and assets are imported from Vitamin Android to avoid the duplication of
resources.

## How to use it?

If you want to use this module because you are only interested by Vitamin colors,
texts or icons, you can import this dependency in your `build.gradle` file of your
Android project:

````kotlin
implementation("com.decathlon.vitamin.compose:foundation:<version>")
````

When you declare a Vitamin Compose component, you need to declare `VitaminTheme` component
before to inject and use Vitamin colors and typography. Note that the Vitamin theme configure
a color and typography mapping for Material Design components too. You can use unsupported
Material components by Vitamin in your Android application with the Vitamin theme.

```kotlin
VitaminTheme {
  // Your composable declarations
}
```