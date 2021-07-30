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
include(":server:engine")
includeModules("server:game")

fun includeModules(module: String) {
    val moduleRelativePath = module.replace(":", "/")
    val moduleRootDir = rootProject.projectDir.toPath().resolve(moduleRelativePath)
    if(moduleRootDir.toFile().exists()) {
        val buildFiles = groovy.ant.FileNameFinder().getFileNames("$moduleRootDir", "**/*.gradle.kts")
        buildFiles.forEach { filename ->
            val buildFilePath = java.nio.file.Paths.get(filename)
            val moduleDir = buildFilePath.parent
            val relativePath = moduleRootDir.relativize(moduleDir)
            val moduleName = "$relativePath".replace(File.separator, ":")
            include(":$module:$moduleName")
        }
    }
}