pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        jcenter()
        mavenCentral()
    }
}
rootProject.name = "validation-api"

enableFeaturePreview("GRADLE_METADATA")

include(":lib")

