pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    val GITHUB_PACKAGES_USERNAME: String by settings
    val GITHUB_PACKAGES_PASSWORD: String by settings

    @Suppress("UnstableApiUsage")
    repositories {
        google()
        mavenCentral()
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/touchlab/KMMBridgeSPMQuickStart")
            credentials {
                username = GITHUB_PACKAGES_USERNAME
                password = GITHUB_PACKAGES_PASSWORD
            }
        }
    }
}

include(":android")
