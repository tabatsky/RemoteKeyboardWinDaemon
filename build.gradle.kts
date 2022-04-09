plugins {
    java
    application
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

tasks {
    shadowJar {
        manifest {
            attributes["Main-Class"] = "jatx.remotekeyboard.windaemon.Main"
        }
        from("jni-wrapper.dll")
    }
}

application {
    mainClass.set("jatx.remotekeyboard.windaemon.Main")
}

dependencies {
    implementation(project(":jni-wrapper"))
}