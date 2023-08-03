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
        target.repositories {
            google()
            mavenCentral()
        }
        target.configureAndroid()
        // Weird but necessary for the compose preview.
        target.dependencies {
            add("debugImplementation", Libs.lifecycle_viewmodel)
            add("debugImplementation", Libs.lifecycle_runtime)
            add("debugImplementation", Libs.savedstate)
            add("debugImplementation", Libs.core)
            add("debugImplementation", Libs.compose_ui)
            add("debugImplementation", Libs.compose_ui_util)
            add("debugImplementation", Libs.poolingcontainer)

            add("androidTestImplementation", Libs.junit)
            add("androidTestImplementation", Libs.espresso)
            add("androidTestImplementation", Libs.compose_test)
            // Needed for createComposeRule, but not createAndroidComposeRule:
            add("debugImplementation", Libs.compose_test_manifest)
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
        kotlinCompilerExtensionVersion = Libs.compose_ui.split(":").last()
    }
    tasks.withType<KotlinCompile> {
        kotlinOptions {
            allWarningsAsErrors = true
            jvmTarget = JavaVersion.VERSION_11.toString()
            freeCompilerArgs = freeCompilerArgs + listOf(
                "-opt-in=kotlin.RequiresOptIn"
            )
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
