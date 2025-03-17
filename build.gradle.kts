plugins {
    java
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "Main"
    }
}