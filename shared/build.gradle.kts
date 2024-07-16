val kotlinxDatetime = "0.6.0"

plugins {
    kotlin("multiplatform")
}

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        withJava()
    }
    js(IR) {
        nodejs()
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                api("org.jetbrains.kotlinx:kotlinx-datetime:$kotlinxDatetime")
            }
        }
    }
}
