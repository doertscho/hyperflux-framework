lazy val root = (project in file(".")).
  settings(
    name := "hyperflux-framework",
    version := "0.1",
    scalaVersion := "2.11.6",
    libraryDependencies ++= Seq(
      "org.scala-js" %% "scalajs-dom_sjs0.6" % "0.8.1",
      "org.scala-lang.modules" %% "scala-async" % "0.9.3",
      "com.lihaoyi" %% "scalatags" % "0.5.2"
    )
  )