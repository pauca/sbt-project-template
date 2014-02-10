import AssemblyKeys._

assemblySettings

jarName in assembly := "sbt-project-template.jar"

name := "sbt-project-template"

version := "0.1"

scalaVersion := "2.10.3"

//libraryDependencies ++= Seq(   )

exportJars := true

mainClass := Some("mainObject")


resolvers += Resolver.sonatypeRepo("public")

libraryDependencies += "com.github.scopt" %% "scopt" % "3.2.0"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"

org.scalastyle.sbt.ScalastylePlugin.Settings