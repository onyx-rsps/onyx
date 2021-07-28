plugins {
    id("de.fayard.refreshVersions") version "0.10.1"
}

rootProject.name = "onyx"

include(":client")

include(":server")
include(":server:launcher")
include(":server:common")
include(":server:config")
include(":server:cache")