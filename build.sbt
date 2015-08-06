lazy val root = (project in file(".")).
  settings(
    organization := "hyperflux",
    name := "hyperflux-framework",
    version := "0.1",
    scalaVersion := "2.11.7",
    libraryDependencies ++= Seq(
      "org.scala-js" %% "scalajs-dom_sjs0.6" % "0.8.1",
      "com.lihaoyi" %% "upickle_sjs0.6" % "0.3.4",
      "org.scala-lang.modules" %% "scala-async" % "0.9.3"
    )
  )
