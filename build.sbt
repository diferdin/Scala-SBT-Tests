name := "Scala-SBT-Tests"

version := "1.0"

scalaVersion := "2.12.0"

mainClass in (Compile, run) := some("Application")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"
libraryDependencies += "junit" % "junit" % "4.11" % "test"