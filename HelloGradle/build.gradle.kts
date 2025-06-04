plugins {
    java
application
    application
}
group = "com.example"
version = "1.0"
repositories {
    mavenCentral()
}
dependencies {
    testImplementation("junit:junit:4.13.2")
}
application {
    mainClass.set("com.example.App")
}
// A custom task example using Kotlin DSL
tasks.register("hello") {
    doLast {
        println("Hello, Gradle with Kotlin DSL!")
    }
}