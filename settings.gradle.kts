include(":compose")
include(":compose-ui")
include(":compose-test")
include(":compose-semantics")
include(":sample")

pluginManagement {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
    }
}

buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies {
        classpath("org.gradle.toolchains:foojay-resolver:1.0.0")
    }
}

apply {
    plugin("org.gradle.toolchains.foojay-resolver-convention")
}
