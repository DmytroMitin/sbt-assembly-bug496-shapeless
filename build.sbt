ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.16"

lazy val root = (project in file("."))
  .settings(
    name := "sbt-assembly-bug496-shapeless",
    libraryDependencies ++= Seq(
      "com.chuusai" %% "shapeless" % "2.3.13",
      "org.scalatest" %% "scalatest" % "3.2.19" % Test,
    ),
  )
