plugins {
    application
    kotlin("jvm") version "2.0.0"
}

group = "ibm.it.consulting"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

application {
    mainClass.set("net.littlelite.fphasher.MainKt")
}

tasks.test {
    useJUnitPlatform()
}