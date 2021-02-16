ThisBuild / organization := "org.jboss.sbtman"
ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / homepage := Some(url("https://github.com/alexcreasy/sbtman"))

lazy val root = (project in file("."))
  .enablePlugins(SbtPlugin)
  .settings(
    name := "sbtman",
    pluginCrossBuild / sbtVersion := {
      scalaBinaryVersion.value match {
        case "2.12" => "1.2.8" // set minimum sbt version
      }
    },
    idePackagePrefix := Some("org.jboss.sbtman")
  )