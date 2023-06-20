import com.decathlon.vitamin.compose.Versions

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
    namespace = "com.decathlon.compose.sample"
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
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
        freeCompilerArgs = freeCompilerArgs + listOf(
            "-opt-in=kotlin.RequiresOptIn",
        )
    }

    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(17))
        }
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Libs.compose_compiler.split(":").last()
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(project(":vitamin"))
    implementation(Libs.vitamin_icons)
    implementation(Libs.vitamin_assets)

    implementation(AndroidX.appCompat)
    implementation(Google.Android.material)

    implementation(AndroidX.activity.compose)
    implementation(AndroidX.navigation.compose)
    implementation(AndroidX.compose.ui.tooling)

    implementation(Google.accompanist.systemUiController)
}
