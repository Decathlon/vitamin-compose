plugins {
    id("com.android.library")
    id("kotlin-android")
    id("VitaminComposeLibraryPlugin")
    id("com.vanniktech.maven.publish")
    id("app.cash.paparazzi")
}

dependencies {
    api(project(":foundation:foundation"))
    api(project(":appbars"))
    api(project(":tabs"))
    api(project(":fabs"))
    implementation(AndroidX.compose.ui.tooling)
    testImplementation("com.google.testparameterinjector:test-parameter-injector:1.8")
}

android {
    namespace = "com.decathlon.vitamin.compose.scaffolds"
}
