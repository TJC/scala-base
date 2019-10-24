
lazy val root = (project in file("."))
  .settings(
    name         := "example",
    organization := "net.dryft",
    scalaVersion := "2.12.9",
    version      := "0.2.0"
)

// In Australia, this is much faster than the default external resolver
externalResolvers := Seq(Resolver.jcenterRepo)

libraryDependencies ++= Seq (
  "org.scalatest"   %% "scalatest"                    % "3.0.8",
  "org.scalamock"   %% "scalamock"                    % "4.4.0",
  "org.scalamock"   %% "scalamock-scalatest-support"  % "3.6.0",
)

enablePlugins(PackPlugin)
