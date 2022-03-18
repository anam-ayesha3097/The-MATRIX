name := """Freelancelot"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.6"

libraryDependencies += guice
libraryDependencies += ws
libraryDependencies ++= Seq(javaWs, ws)
libraryDependencies += ehcache
libraryDependencies += "org.json" % "json" % "20131018"
libraryDependencies += javaForms
libraryDependencies += "org.mockito" % "mockito-core" % "2.10.0" % "test"