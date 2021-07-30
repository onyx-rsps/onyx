import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.project

fun DependencyHandler.gameScript(name: String): Dependency? =
    add("implementation", project(":server:scripts:game:$name"))

fun DependencyHandler.contentScript(name: String): Dependency? =
    add("implementation", project(":server:scripts:content:$name"))