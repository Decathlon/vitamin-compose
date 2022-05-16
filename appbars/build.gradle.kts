import com.decathlon.vitamin.compose.Dependencies

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("VitaminComposeLibraryPlugin")
    id("com.vanniktech.maven.publish")
}

dependencies {
    api(project(":foundation"))
    api(project(":menus"))
    implementation(Dependencies.Compose.tooling)
}
