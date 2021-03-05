
lazy val root = (project in file("."))
  .settings(
    name         := "example",
    organization := "net.dryft",
    scalaVersion := "2.13.4",
    version      := "0.3.0"
)

libraryDependencies ++= Seq (
  "org.scalatest"              %% "scalatest"     % "3.2.5",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
)

scalacOptions ++= Seq(
  "-feature",
  "-Xlint",
  "-language:higherKinds",
  "-language:reflectiveCalls",
  "-Ymacro-annotations",
  "-target:11",
  "-Wconf:cat=deprecation:w,cat=lint-byname-implicit:s,any:e",
)

javacOptions ++= Seq("--release", "11")

enablePlugins(PackPlugin)
