plugins {
    id("com.android.library")
    id("kotlin-android")
    id("VitaminComposeLibraryPlugin")
    id("com.vanniktech.maven.publish")
}

dependencies {
    implementation(AndroidX.core)
    api(AndroidX.compose.ui)
    api(AndroidX.compose.material)
    api(Libs.vitamin_icons)
    api(Libs.vitamin_assets)
}
