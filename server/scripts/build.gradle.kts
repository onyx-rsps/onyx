subprojects {
    dependencies {
        implementation(project(":server:common"))
        implementation(project(":server:config"))
        implementation(project(":server:cache"))
        implementation(project(":server:engine"))
    }

    gradle.buildFinished { if(!buildFile.exists()) buildDir.deleteRecursively() }
}

gradle.buildFinished { buildDir.deleteRecursively() }