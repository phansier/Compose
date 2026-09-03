import com.android.build.api.dsl.CommonExtension
import io.github.kakaocup.withVersionCatalog

withVersionCatalog { libs ->
    configure<CommonExtension> {
        compileSdk = libs.versions.compileSdk.get().toInt()
        defaultConfig.apply {
            minSdk = libs.versions.minSdk.get().toInt()
        }
    }
}
