plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/org.testng/testng
    testImplementation("org.testng:testng:7.9.0")

// https://mvnrepository.com/artifact/io.appium/java-client
    implementation("io.appium:java-client:9.0.0")

}

tasks.test {
    useTestNG()
}