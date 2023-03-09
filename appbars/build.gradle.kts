plugins {
    id("com.android.library")
    id("kotlin-android")
    id("VitaminComposeLibraryPlugin")
    id("com.vanniktech.maven.publish")
}

dependencies {
    api(project(":foundation:foundation"))
    api(project(":foundation:foundation-icons"))
    api(project(":menus"))
    implementation(KotlinX.collections.immutable)
    implementation(AndroidX.compose.ui.tooling)
    lintChecks(Libs.compose_lint_checks)
}
