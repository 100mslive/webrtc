/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java library project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.2/userguide/building_java_projects.html
 */

plugins {
    // Apply the java-library plugin for API and implementation separation.
    `java-library`
    `maven-publish`
    `signing`
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit test framework.
    testImplementation("junit:junit:4.13.2")
}

tasks.register("generateFakeSources") {
    doLast {
        val fakeSourceReadmeFolder = File("${rootDir}/lib/build/fakesources/")
        fakeSourceReadmeFolder.mkdirs()

        val fakeSourceReadme = File("${rootDir}/lib/build/fakesources/README.md")

        if(!fakeSourceReadme.exists()) {
            fakeSourceReadme.createNewFile()
        }

        fakeSourceReadme.writeText("Sources are available at: https://webrtc.googlesource.com/src")
    }
}

tasks.register<Jar>("fakeSources") {
    dependsOn("generateFakeSources")
    archiveFileName.set("lib-release-sources.jar")
    from("${rootDir}/lib/build/fakesources/")
    archiveClassifier.set("sources")
}

tasks.register("generateFakeJavadoc") {
    doLast {
        val fakeJavadocReadmeFolder = File("${rootDir}/lib/build/fakejavadoc/")
        fakeJavadocReadmeFolder.mkdirs()

        val fakeJavadocReadme = File("${rootDir}/lib/build/fakejavadoc/README.md")

        if(!fakeJavadocReadme.exists()) {
            fakeJavadocReadme.createNewFile()
        }

        fakeJavadocReadme.writeText("Javadoc available at: https://webrtc.org/")
    }
}

tasks.register<Jar>("fakeJavadoc") {
    dependsOn("generateFakeJavadoc")
    archiveFileName.set("lib-release-javadoc.jar")
    from("build/fakejavadoc")
    archiveClassifier.set("javadoc")
}


publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "io.github.100mslive"
            artifactId = "webrtc"
            version = "m97-hms-1.0"

            artifact("../libwebrtc.aar")
/*
            artifact(tasks["fakeSources"])
            artifact(tasks["fakeJavadoc"])

            signing {
                sign(tasks["fakeSources"])
                sign(tasks["fakeJavadoc"])
                sign(publishing.publications["release"])
                sign(configurations.archives.get())
            }
*/
            pom {
                name.set("WebRTC")
                description.set("A packaging of the webrtc library. Branch heads 4577")
                url.set("https://webrtc.github.io/webrtc-org/native-code/android/")
                licenses {
                    license {
                        name.set("WebRTC Licence")
                        url.set("https://webrtc.github.io/webrtc-org/license/")
                    }
                }
                developers {
                        developer {
                            id.set("1")
                            name.set("https://webrtc.org/")
                            email.set("discuss-webrtc@googlegroups.com")
                        }
                    }
                    scm {
                        connection.set("SCM can be found at https://webrtc.github.io/webrtc-org/native-code/development/prerequisite-sw/")
                        developerConnection.set("SCM can be found at https://webrtc.github.io/webrtc-org/native-code/development/prerequisite-sw/")
                        url.set("https://webrtc.github.io/webrtc-org/native-code/development/prerequisite-sw/")
                    }

            }
        }
    }
}
