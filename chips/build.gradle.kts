plugins {
    id("com.android.library")
    id("kotlin-android")
    id("VitaminComposeLibraryPlugin")
    id("com.vanniktech.maven.publish")
    id("app.cash.paparazzi")
}

dependencies {
    api(project(":foundation"))
    implementation(AndroidX.compose.ui.tooling)
    testImplementation("com.google.testparameterinjector:test-parameter-injector:1.8")
}
