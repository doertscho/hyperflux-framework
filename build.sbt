enablePlugins(ScalaJSPlugin)
scalaJSStage in Global := FastOptStage

lazy val root = project.
  in(file(".")).
  aggregate(hffJS, hffJVM)

lazy val hff = crossProject.
  in(file(".")).
  settings(
    organization := "hyperflux",
    name := "hyperflux-framework",
    version := "0.1",
    scalaVersion := "2.11.7",
    libraryDependencies ++= Seq(
      "org.scala-js" %% "scalajs-dom_sjs0.6" % "0.8.1",
      "com.lihaoyi" %%% "upickle" % "0.3.4",
      "com.lihaoyi" %%% "scalatags" % "0.5.2",
      "org.scala-lang.modules" %% "scala-async" % "0.9.5"
    )
  )
  .jvmSettings(
    libraryDependencies ++= Seq(
      "org.http4s" %% "http4s-dsl" % "0.10.0",
      "org.http4s" %% "http4s-blaze-server" % "0.10.0"
    )
  )

lazy val hffJS = hff.js
lazy val hffJVM = hff.jvm
