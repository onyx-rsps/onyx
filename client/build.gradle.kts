plugins {
    java
    application
}

application {
    mainClass.set("ClientLauncher")
    executableDir = rootProject.projectDir.path
}

dependencies {
    implementation("com.formdev:flatlaf:_")
    implementation("com.formdev:flatlaf-intellij-themes:_")
}

tasks.register("run client") {
    group = "onyx"
    dependsOn(tasks.run)
}