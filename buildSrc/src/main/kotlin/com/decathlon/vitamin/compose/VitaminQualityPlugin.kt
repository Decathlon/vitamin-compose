package com.decathlon.vitamin.compose

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure

class VitaminQualityPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.apply(plugin = "app.cash.licensee")
        target.configure<app.cash.licensee.LicenseeExtension> {
            allow("Apache-2.0")
        }
    }
}
