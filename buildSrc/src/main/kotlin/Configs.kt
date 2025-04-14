import org.gradle.api.JavaVersion

object Configs {
    const val minSdk = 26
    const val targetSdk = 35
    const val compileSdk = 35

    // Kotlin
    const val kotlinCompilerExtensionVersion = "1.5.10"

    //
    const val jvmTarget = "11"
    val sourceCompatibility = JavaVersion.VERSION_11
    val targetCompatibility = JavaVersion.VERSION_11

    const val buildToolsVersion = "36.0.0"
}