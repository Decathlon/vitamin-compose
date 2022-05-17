repositories {
    mavenCentral()
}

plugins {
    id("org.sonarqube") version "3.3"
    id("org.jlleitschuh.gradle.ktlint") version "10.2.0"
    id("io.gitlab.arturbosch.detekt") version "1.19.0"
}

subprojects {
    apply {
        plugin("org.sonarqube")
        plugin("org.jlleitschuh.gradle.ktlint")
        plugin("io.gitlab.arturbosch.detekt")
    }

    val reportMerge by tasks.registering(io.gitlab.arturbosch.detekt.report.ReportMergeTask::class) {
        output.set(rootProject.buildDir.resolve("reports/detekt/merge.xml"))
    }

    plugins.withType(io.gitlab.arturbosch.detekt.DetektPlugin::class) {
        tasks.withType(io.gitlab.arturbosch.detekt.Detekt::class) detekt@{
            finalizedBy(reportMerge)

            reportMerge.configure {
                input.from(this@detekt.xmlReportFile)
            }
        }
    }

    sonarqube {
        properties {
            property("sonar.sources", "src/main")
            property("sonar.debug", true)
        }
    }

    ktlint {
        debug.set(false)
        version.set("0.42.1")
        verbose.set(true)
        android.set(false)
        outputToConsole.set(true)
        ignoreFailures.set(false)
        enableExperimentalRules.set(true)
        disabledRules.set(arrayListOf("experimental:argument-list-wrapping"))
        filter {
            exclude("**/generated/**")
            include("**/kotlin/**")
        }
    }

    tasks {
        withType(io.gitlab.arturbosch.detekt.Detekt::class.java) {
            config.setFrom(rootProject.files("config/detekt/detekt.yml"))
            reports {
                html {
                    required.set(true)
                    outputLocation.set(file("build/reports/detekt.html"))
                }
                xml {
                    required.set(true)
                    outputLocation.set(file("build/reports/detekt.xml"))
                }
            }
        }
    }
}

apply {
    plugin("org.sonarqube")
}

sonarqube {
    properties {
        property("sonar.projectKey", "Decathlon_vitamin-compose")
        property("sonar.projectName", "vitamin-compose")
        property("sonar.organization", "decathlon")
        property("sonar.host.url", "https://sonarcloud.io")
        property("sonar.kotlin.detekt.reportPaths", "$buildDir/reports/detekt/merge.xml")
        property("sonar.login", System.getenv("SONAR_TOKEN"))
    }
}

tasks.create<Delete>("clean") {
    delete(rootProject.buildDir)
}
