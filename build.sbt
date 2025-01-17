name := "docker-management"

version := "1.0"

scalaVersion := "3.3.3"

scalacOptions ++= Seq(
  "-Werror",
  "-Wunused:all",
  "-Wvalue-discard",
  "-Wnonunit-statement"
)

libraryDependencies ++= Seq(
  "org.virtuslab" %% "besom-core" % "0.2.2",
  "org.virtuslab" %% "besom-docker" % "4.5.1-core.0.2"
)
