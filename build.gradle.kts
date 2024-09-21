plugins {
    kotlin("jvm") version "1.9.23"
}

group = "ru.pavlentygood"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.9.23")
    implementation("io.arrow-kt:arrow-core:1.2.4")

    testImplementation("io.kotest:kotest-runner-junit5:5.9.0")
    testImplementation("io.kotest.extensions:kotest-assertions-arrow-jvm:1.4.0")
    testImplementation("io.mockk:mockk:1.13.12")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.11.0")
}

tasks.test {
    useJUnitPlatform()
}
