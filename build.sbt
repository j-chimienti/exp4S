name := "exp4s"

organization := "me.prassee"

version := "0.0.5"

scalaVersion := "2.13.3"

libraryDependencies ++= Seq("net.objecthunter" % "exp4j" % "0.4.8", "org.scalatest" %% "scalatest" % "3.2.2" % "test")

scalacOptions ++= Seq(
//  "-Xfatal-warnings", private class AsTuple in object Exp4sProcessor is never used
  "-deprecation",
  "-unchecked",
  "-feature",
  "-Xlint"
)
