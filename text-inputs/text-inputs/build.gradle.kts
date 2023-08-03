plugins {
    id("com.android.library")
    id("kotlin-android")
    id("VitaminComposeLibraryPlugin")
    id("VitaminQualityPlugin")
    id("com.vanniktech.maven.publish")
    id("app.cash.paparazzi")
}

dependencies {
    api(project(":foundation:foundation"))
    api(project(":foundation:foundation-icons"))
    api(project(":menus"))
    implementation(project(":text-inputs:text-inputs-test-semantics"))
    implementation(AndroidX.compose.ui.tooling)
    testImplementation("com.google.testparameterinjector:test-parameter-injector:1.8")
    androidTestImplementation(project(":text-inputs:text-inputs-test"))
}
