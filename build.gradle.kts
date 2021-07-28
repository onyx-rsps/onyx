plugins {
    kotlin("jvm") version "1.5.20"
}

tasks.withType<Wrapper> {
    gradleVersion = "7.1.1"
}

allprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    group = "dev.onyx"
    version = "1.0.0"

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation(kotlin("stdlib"))
    }

    java {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    tasks.build {
        group = "onyx"
    }
}
