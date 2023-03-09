package com.decathlon.vitamin.compose.scaffolds

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import com.decathlon.vitamin.compose.appbars.topbars.icons.VitaminNavigationIconButtons
import com.decathlon.vitamin.compose.appbars.topbars.icons.VitaminSearchNavigationIconButtons

sealed interface TopBarConfiguration {
    data class Primary(
        val navigationIcon: @Composable (VitaminNavigationIconButtons.() -> Unit)? = null
    ) : TopBarConfiguration

    data class Search(
        val value: MutableState<String>,
        val placeholder: String,
        val keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        val keyboardActions: KeyboardActions = KeyboardActions.Default,
        val navigationIcon: @Composable VitaminSearchNavigationIconButtons.() -> Unit
    ) : TopBarConfiguration
}
