import sbt._
import sbt.Keys._

object PluginDef extends Build {
  override def projects = Seq(root)
  lazy val root = Project("plugins", file(".")) dependsOn (junitXmlListener, proguard)

  lazy val junitXmlListener = uri("git://github.com/ijuma/junit_xml_listener.git#fe434773255b451a38e8d889536ebc260f4225ce")

  lazy val proguard = uri("git://github.com/siasia/xsbt-proguard-plugin.git")

}

// vim: set ts=4 sw=4 et:
