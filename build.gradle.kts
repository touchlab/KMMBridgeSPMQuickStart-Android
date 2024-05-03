plugins {
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.android.application) apply false
}

subprojects {
    val GROUP: String by project
    group = GROUP
    version = "0.1"
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}
