plugins {
    id("com.android.library")
    id("kotlin-android")
    id("VitaminComposeLibraryPlugin")
    id("VitaminQualityPlugin")
    id("com.vanniktech.maven.publish")
}

dependencies {
    implementation(AndroidX.compose.ui)
}
