package com.decathlon.vitamin.compose

object Versions {
    object AndroidConfig {
        const val minSdk = 21
        const val compileSdk = 31
    }
    const val kotlin = "1.5.31"
    const val material = "1.4.0"
    const val vitamin = "0.2.0-beta01"
    object AndroidX {
        const val core = "1.7.0"
        const val appcompat = "1.4.0"
    }
    object Compose {
        const val library = "1.0.5"
        const val activity = "1.4.0"
        const val navigation = "2.4.0-rc01"
    }
    object Accompanist {
        const val systemuicontroller = "0.21.3-beta"
    }
}

object Dependencies {
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val material = "com.google.android.material:material:${Versions.material}"
    object AndroidX {
        const val core = "androidx.core:core-ktx:${Versions.AndroidX.core}"
        const val appcompat = "androidx.appcompat:appcompat:${Versions.AndroidX.appcompat}"
    }
    object Compose {
        const val ui = "androidx.compose.ui:ui:${Versions.Compose.library}"
        const val material = "androidx.compose.material:material:${Versions.Compose.library}"
        const val tooling = "androidx.compose.ui:ui-tooling:${Versions.Compose.library}"
        const val activity = "androidx.activity:activity-compose:${Versions.Compose.activity}"
        const val navigation = "androidx.navigation:navigation-compose:${Versions.Compose.navigation}"
    }
    object Accompanist {
        const val systemuicontroller = "com.google.accompanist:accompanist-systemuicontroller:${Versions.Accompanist.systemuicontroller}"
    }
    object Vitamin {
        const val icons = "com.decathlon.vitamin:foundation-icons:${Versions.vitamin}"
        const val assets = "com.decathlon.vitamin:foundation-assets:${Versions.vitamin}"
    }
}
