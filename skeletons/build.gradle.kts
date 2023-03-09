plugins {
    id("com.android.library")
    id("kotlin-android")
    id("VitaminComposeLibraryPlugin")
    id("com.vanniktech.maven.publish")
}

dependencies {
    api(project(":foundation:foundation"))
    implementation(AndroidX.compose.ui.tooling)
    implementation(AndroidX.compose.ui.util)
    implementation(Google.accompanist.module("accompanist-placeholder"))
    lintChecks(Libs.compose_lint_checks)
}
