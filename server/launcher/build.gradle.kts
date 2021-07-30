import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    application
    id("com.github.johnrengelman.shadow")
}

application {
    mainClass.set("dev.onyx.server.launcher.Launcher")
    executableDir = rootProject.projectDir.path
}

dependencies {
    project(":server:game").dependencyProject.subprojects.forEach { project ->
        if(project.buildFile.exists()) {
            implementation(project)
        }
    }

    implementation(project(":server:common"))
    implementation(project(":server:config"))
    implementation(project(":server:cache"))
    implementation(project(":server:engine"))
    implementation("ch.qos.logback:logback-classic:_")
}

tasks.withType<ShadowJar> {
    group = "onyx"
    archiveBaseName.set("")
    archiveClassifier.set("")
    archiveVersion.set("")
}

tasks.register("run server") {
    group = "onyx"
    dependsOn(tasks.run)
}

tasks.named<JavaExec>("run") {
    workingDir = rootProject.projectDir
}