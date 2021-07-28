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
    implementation(project(":server:engine"))
    implementation("ch.qos.logback:logback-classic:_")
}

tasks.register("run server") {
    group = "onyx"
    dependsOn(tasks.run)
}

tasks.named<JavaExec>("run") {
    workingDir = rootProject.projectDir
}