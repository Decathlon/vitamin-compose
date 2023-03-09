plugins {
    id("com.android.library")
    id("kotlin-android")
    id("VitaminComposeLibraryPlugin")
    id("com.vanniktech.maven.publish")
    id("app.cash.paparazzi")
}

dependencies {
    api(project(":foundation:foundation"))
    api(project(":foundation:foundation-icons"))
    implementation(AndroidX.compose.ui.tooling)
    lintChecks(Libs.compose_lint_checks)
    testImplementation("com.google.testparameterinjector:test-parameter-injector:1.8")
}
