inThisBuild(List(
  scalaVersion := "2.12.8",
  addCompilerPlugin(scalafixSemanticdb),
  scalacOptions ++= List(
    "-Yrangepos"
    )
))

lazy val in = project

lazy val out = project
