plugins {
    id("com.android.library")
    id("kotlin-android")
    id("VitaminComposeLibraryPlugin")
    id("com.vanniktech.maven.publish")
}

dependencies {
    api(project(":foundation:foundation"))
    implementation(project(":buttons"))
    implementation(AndroidX.compose.ui.tooling)
}

android {
    namespace = "com.decathlon.vitamin.compose.modals"
}
