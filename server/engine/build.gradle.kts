dependencies {
    implementation(project(":server:common"))
    implementation(project(":server:config"))
    implementation(project(":server:cache"))
    implementation("com.google.guava:guava:_")
    implementation("io.netty:netty-all:_")
    implementation("org.jetbrains.kotlin:kotlin-scripting-common:_")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:_")
}