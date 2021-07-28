plugins {
    application
}

application {
    mainClass.set("dev.onyx.server.launcher.Launcher")
    executableDir = rootProject.projectDir.path
}

dependencies {
    implementation(project(":server:common"))
    implementation(project(":server:config"))
    implementation(project(":server:cache"))
}

tasks.register("run server") {
    group = "onyx"
    dependsOn(tasks.run)
}

tasks.named<JavaExec>("run") {
    workingDir = rootProject.projectDir
}