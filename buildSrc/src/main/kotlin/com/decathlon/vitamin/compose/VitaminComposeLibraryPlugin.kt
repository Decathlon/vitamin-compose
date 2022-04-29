package com.decathlon.vitamin.compose

import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.*
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
            add("debugImplementation", Dependencies.AndroidX.lifecycle)
            add("debugImplementation", Dependencies.AndroidX.lifecycleViewModel)
            add("debugImplementation", Dependencies.AndroidX.savedstate)
            add("debugImplementation", Dependencies.AndroidX.core)

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
}
