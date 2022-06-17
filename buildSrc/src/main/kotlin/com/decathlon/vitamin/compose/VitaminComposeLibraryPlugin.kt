package com.decathlon.vitamin.compose

import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.repositories
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

class VitaminComposeLibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.apply(plugin = "app.cash.licensee")
        target.configure<app.cash.licensee.LicenseeExtension> {
            allow("Apache-2.0")
            allow("MIT")
        }
        target.repositories {
            google()
            mavenCentral()
        }
        target.configureAndroid()
        // Weird but necessary for the compose preview.
        target.dependencies {
            add("debugImplementation", Dependencies.AndroidX.lifecycle)
            add("debugImplementation", Dependencies.AndroidX.lifecycleViewModel)
            add("debugImplementation", Dependencies.AndroidX.savedstate)
            add("debugImplementation", Dependencies.AndroidX.core)

            add("androidTestImplementation", Dependencies.Test.junit)
            add("androidTestImplementation", Dependencies.Test.espresso)
            add("androidTestImplementation", Dependencies.Compose.test)
            // Needed for createComposeRule, but not createAndroidComposeRule:
            add("debugImplementation", Dependencies.Compose.testManifest)
        }
    }
}

@Suppress("UnstableApiUsage")
internal fun Project.configureAndroid() = this.extensions.getByType(LibraryExtension::class).run {
    compileSdk = Versions.AndroidConfig.compileSdk
    defaultConfig {
        minSdk = Versions.AndroidConfig.minSdk
        vectorDrawables {
            useSupportLibrary = true
        }
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.Compose.library
    }
    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = JavaVersion.VERSION_11.toString()
        }
    }
    buildFeatures {
        compose = true
    }

    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}
