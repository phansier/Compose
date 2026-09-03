import com.android.build.api.dsl.ApplicationExtension
import io.github.kakaocup.withVersionCatalog

plugins {
    id("com.android.application")
    id("convention.android-base")
    id("convention.kotlin")
}

withVersionCatalog { libs ->
    configure<ApplicationExtension> {
        defaultConfig.apply {
            targetSdk = libs.versions.targetSdk.get().toInt()
            multiDexEnabled = true
            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }

        testOptions.apply {
            animationsDisabled = true
        }

        signingConfigs.create("kakao") {
            storeFile = rootProject.layout.projectDirectory.file("buildsystem/debug.keystore").asFile
            storePassword = "android"
            keyAlias = "kakaodebugkey"
            keyPassword = "android"
        }

        buildTypes.getByName("debug") {
            signingConfig = signingConfigs.getByName("kakao")
        }
    }
}
