name := "bqtest"

version := "0.1"

scalaVersion := "2.13.1"

resolvers += "Artima Maven Repository" at "https://repo.artima.com/releases"
resolvers += Resolver.bintrayIvyRepo("eed3si9n", "sbt-plugins")

libraryDependencies += "com.google.cloud" % "google-cloud-bigquery" % "1.100.0"

libraryDependencies += "com.github.scopt" %% "scopt" % "3.7.1"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.1.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0" % "test"
