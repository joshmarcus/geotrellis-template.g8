import sbt._
import sbt.Keys._

object MyBuild extends Build {
  val geotoolsVersion = "2.7.4"

  lazy val project = Project("root", file(".")) settings(
    organization := "$org$",

    name := "$project_name$",

    version := "$version$",

    scalaVersion := "2.9.2",

    scalacOptions ++= Seq("-deprecation", "-unchecked", "-optimize"),

    parallelExecution := false,

    libraryDependencies ++= Seq(
      "com.google.code.caliper" % "caliper" % "1.0-SNAPSHOT" from "http://n0d.es/jars/caliper-1.0-SNAPSHOT.jar",
      "org.scalatest" %% "scalatest" % "1.6.1" % "test",
      "junit" % "junit" % "4.5" % "test",
      "org.eclipse.jetty" % "jetty-webapp" % "8.1.0.RC4",
      "com.sun.jersey" % "jersey-bundle" % "1.11",
      "com.azavea.math" %% "numeric" % "0.1" from "http://n0d.es/jars/numeric_2.9.1-0.1.jar",
      "com.azavea.math.plugin" %% "optimized-numeric" % "0.1" from "http://plastic-idolatry.com/jars/optimized-numeric-plugin_2.9.1-0.1.jar",
      "com.azavea.geotrellis" %% "geotrellis" % "0.7.0-SNAPSHOT"
    ),

    resolvers ++= Seq(
      "NL4J Repository" at "http://nativelibs4java.sourceforge.net/maven/",
      "maven2 dev repository" at "http://download.java.net/maven/2",
      "Scala Test" at "http://www.scala-tools.org/repo-reloases/",
      "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/",
      "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository",
      "sonatypeSnapshots" at "http://oss.sonatype.org/content/repositories/snapshots"
    ),

    // enable forking in run
    fork in run := true
  )
}


object PluginDef extends Build {
  lazy val root = Project("plugins", file(".")) dependsOn(pamflet)

  lazy val pamflet = uri("git://github.com/n8han/pamflet-plugin#0.3.0")
}

//TODO: add in new sbt-assembly
