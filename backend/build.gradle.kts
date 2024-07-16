plugins {
    kotlin("jvm")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":shared"))
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass = "example.JavaStuff"
}
