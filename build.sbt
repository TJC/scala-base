
lazy val root = (project in file("."))
  .settings(
    name         := "example",
    organization := "net.dryft",
    scalaVersion := "2.13.1",
    version      := "0.2.0"
)

// In Australia, this is much faster than the default external resolver
externalResolvers := Seq(Resolver.jcenterRepo)

libraryDependencies ++= Seq (
  "org.scalatest"   %% "scalatest"                    % "3.1.0",
  "org.scalamock"   %% "scalamock"                    % "4.4.0",
)

scalacOptions ++= Seq("-Xlint", "-target:11")

enablePlugins(PackPlugin)
