plugins {
    id("java")
}

group = "xyz.galaxyy.lualink.addons.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.purpurmc.org/snapshots")
    maven("https://jitpack.io")
    maven {
        url = uri("https://maven.pkg.github.com/lualink/LuaLink") // TODO: Change to the LuaLink organization
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly("org.purpurmc.purpur:purpur-api:1.19.4-R0.1-SNAPSHOT")
    compileOnly("xyz.galaxyy.lualink:lualink:1.20.1-10")
}

tasks.test {
    useJUnitPlatform()
}