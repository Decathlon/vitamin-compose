import com.decathlon.vitamin.compose.Dependencies

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("VitaminComposeLibraryPlugin")
    id("com.vanniktech.maven.publish")
}

dependencies {
    implementation(Dependencies.AndroidX.core)
    api(Dependencies.Vitamin.icons)
    api(Dependencies.Vitamin.assets)
    api(Dependencies.Compose.ui)
    api(Dependencies.Compose.material)
}
