pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

plugins {
    id("de.fayard.refreshVersions") version "0.51.0"
}

refreshVersions {
    enableBuildSrcLibs()
}

rootProject.name = "vitamin-compose"
include(":vitamin")
include(":foundation")
include(":buttons")
include(":text-inputs")
include(":switches")
include(":appbars")
include(":radiobuttons")
include(":progressbars")
include(":checkboxes")
include(":ratings")
include(":modals")
include(":sample")
include(":dividers")
include(":skeletons")
include(":tabs")
include(":tags")
include(":prices")
include(":menus")
include(":snackbars")
include(":badges")
include(":fabs")
include(":quantity-pickers")
include(":chips")