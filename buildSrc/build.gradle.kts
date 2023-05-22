import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.21"
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
        apiVersion = "1.6"
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

gradlePlugin {
    plugins.register("VitaminComposeLibraryPlugin") {
        id = "VitaminComposeLibraryPlugin"
        implementationClass = "com.decathlon.vitamin.compose.VitaminComposeLibraryPlugin"
    }
}

dependencies {
    implementation(gradleApi())
    implementation("com.android.tools.build:gradle:8.0.1")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.21")
    implementation("com.vanniktech:gradle-maven-publish-plugin:0.18.0")
    implementation("app.cash.licensee:licensee-gradle-plugin:1.4.1")
    implementation("app.cash.paparazzi:paparazzi-gradle-plugin:1.2.0")
}
