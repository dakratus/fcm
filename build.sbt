name := "fcm"

version := "0.1"

scalaVersion := "2.12.6"


lazy val root = (project in file(".")).
  settings(

    inThisBuild(List(
      organization := "peerchat",
      scalaVersion := "2.12.3"
    )),

    crossScalaVersions := Seq("2.12.3", "2.11.11"),
    autoScalaLibrary := true,

    name := "fcm-scala",

    licenses += ("Apache-2.0", url("http://apache.org/licenses/LICENSE-2.0")),

    libraryDependencies ++= Seq(
    )
  )