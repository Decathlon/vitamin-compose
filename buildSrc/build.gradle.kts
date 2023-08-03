import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.31"
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions.apiVersion = "1.6"
}

gradlePlugin {
    plugins.register("VitaminComposeLibraryPlugin") {
        id = "VitaminComposeLibraryPlugin"
        implementationClass = "com.decathlon.vitamin.compose.VitaminComposeLibraryPlugin"
    }
    plugins.register("VitaminQualityPlugin") {
        id = "VitaminQualityPlugin"
        implementationClass = "com.decathlon.vitamin.compose.VitaminQualityPlugin"
    }
}

dependencies {
    implementation(gradleApi())
    implementation("com.android.tools.build:gradle:7.4.0")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
    implementation("com.vanniktech:gradle-maven-publish-plugin:0.18.0")
    implementation("app.cash.licensee:licensee-gradle-plugin:1.4.1")
    implementation("app.cash.paparazzi:paparazzi-gradle-plugin:1.2.0")
}
