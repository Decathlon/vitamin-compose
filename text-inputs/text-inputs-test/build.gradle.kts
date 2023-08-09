plugins {
    id("com.android.library")
    id("kotlin-android")
    id("VitaminComposeLibraryPlugin")
    id("com.vanniktech.maven.publish")
}

dependencies {
    implementation(AndroidX.compose.ui.test)
    implementation(AndroidX.test.espresso.core)
    implementation(project(":text-inputs:text-inputs-test-semantics"))
}
