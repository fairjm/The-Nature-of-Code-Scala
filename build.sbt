name := """The-Nature-of-Code-Scala"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "2.2.0" % "test",
    "com.typesafe" % "config" % "1.2.1",
    "org.processing" % "core" % "2.2.1"
)
