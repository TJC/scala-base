lazy val root = (project in file("."))
  .settings(
    name         := "example",
    organization := "net.dryft",
    scalaVersion := "2.12.6",
    version      := "0.1.0-SNAPSHOT"
)

libraryDependencies ++= Seq (
  "org.scalamock"   %% "scalamock-scalatest-support"  % "3.6.0",
  "org.scalatest"   %% "scalatest"                    % "3.0.5"
)

enablePlugins(PackPlugin)
