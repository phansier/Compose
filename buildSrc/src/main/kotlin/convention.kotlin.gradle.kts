import io.github.kakaocup.withVersionCatalog
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidExtension

// Since AGP 9.0 Kotlin support is built in, so 'org.jetbrains.kotlin.android' must not be applied.
// AGP registers the 'kotlin' extension itself once an android plugin is applied.
withVersionCatalog { libs ->
    configure<KotlinAndroidExtension> {
        jvmToolchain(libs.versions.jvmVersion.get().toInt())
    }
}
