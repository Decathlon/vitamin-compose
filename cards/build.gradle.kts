import com.decathlon.vitamin.compose.Dependencies

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("VitaminComposeLibraryPlugin")
    id("com.vanniktech.maven.publish")
    id("shot")
}

dependencies {
    api(project(":foundation"))
    api(project(":buttons"))
    debugApi(project(":tags"))
    implementation(Dependencies.Compose.tooling)
    androidTestImplementation(Dependencies.Test.testRules)
    androidTestImplementation(Dependencies.Compose.test)
    androidTestImplementation(Dependencies.Compose.testManifest)
}
