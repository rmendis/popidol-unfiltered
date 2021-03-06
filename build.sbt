organization := "com.example"

name := "popidol-unfiltered"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-directives" % "0.7.0",
  "net.databinder" %% "unfiltered-filter" % "0.7.0",
  "net.databinder" %% "unfiltered-jetty" % "0.7.0",
  "net.databinder" %% "unfiltered-spec" % "0.7.0" % "test"
)

resolvers ++= Seq(
  "java m2" at "http://download.java.net/maven/2"
)
