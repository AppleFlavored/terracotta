plugins {
    id("java")
}

group = "io.github.appleflavored"
version = "0.1.0"

repositories {
    mavenCentral()
    maven {
        url = uri("https://libraries.minecraft.net")
    }
}

dependencies {
    implementation("io.netty:netty-all:4.1.77.Final")
    implementation("com.mojang:brigadier:1.0.18")
}