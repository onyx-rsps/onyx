plugins {
    idea
    kotlin("jvm")
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
        implementation(kotlin("stdlib", "_"))
    }

    java {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    tasks {
        compileKotlin {
            kotlinOptions.jvmTarget = JavaVersion.VERSION_11.toString()
            kotlinOptions.freeCompilerArgs = listOf(
                "-Xopt-in=kotlin.ExperimentalStdlibApi", "-XXLanguage:+InlineClasses"
            )
        }

        compileTestKotlin {
            kotlinOptions.jvmTarget = JavaVersion.VERSION_11.toString()
        }
    }

    tasks.build {
        group = "onyx"
    }
}
