name := "passengers-service"
version := "0.1-SNAPSHOT"
scalaVersion := "2.13.6"

lazy val commonSettings = Seq(
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "test"
)

lazy val core = project.settings(commonSettings)

lazy val ports = project.settings(commonSettings).dependsOn(core)
