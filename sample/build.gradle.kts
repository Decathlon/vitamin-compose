import com.decathlon.vitamin.compose.Versions
import de.fayard.refreshVersions.core.versionFor

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
}

repositories {
    google()
    mavenCentral()
}

android {
    compileSdk = Versions.AndroidConfig.compileSdk

    defaultConfig {
        applicationId = "com.decathlon.compose.sample"
        minSdk = Versions.AndroidConfig.minSdk
        targetSdk = Versions.AndroidConfig.compileSdk
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
        freeCompilerArgs = freeCompilerArgs + listOf(
            "-opt-in=kotlin.RequiresOptIn"
        )
    }

    composeOptions {
        kotlinCompilerExtensionVersion = versionFor(AndroidX.compose.ui)
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(project(":buttons"))
    implementation(project(":text-inputs"))
    implementation(project(":checkboxes"))
    implementation(project(":switches"))
    implementation(project(":progressbars"))
    implementation(project(":radiobuttons"))
    implementation(project(":appbars"))
    implementation(project(":dividers"))
    implementation(project(":tabs"))
    implementation(project(":skeletons"))
    implementation(project(":tags"))
    implementation(project(":ratings"))
    implementation(project(":prices"))
    implementation(project(":modals"))
    implementation(project(":snackbars"))
    implementation(project(":badges"))
    implementation(project(":quantity-pickers"))

    implementation(AndroidX.appCompat)
    implementation(Google.Android.material)

    implementation(AndroidX.activity.compose)
    implementation(AndroidX.navigation.compose)
    implementation(AndroidX.compose.ui.tooling)

    implementation(Google.Accompanist.systemuicontroller)
}
