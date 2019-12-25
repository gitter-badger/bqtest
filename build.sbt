import java.time.format.DateTimeFormatter
import java.time.{LocalDateTime, ZoneOffset}

name := "bquery"

version := "0.1"

scalaVersion := "2.13.1"

includePluginResolvers := true

libraryDependencies += "com.google.cloud" % "google-cloud-bigquery" % "1.100.0"

libraryDependencies += "com.github.scopt" %% "scopt" % "3.7.1"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.1.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0" % "test"

test in assembly := {}
assemblyJarName in assembly := s"${name.value}-${LocalDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmm"))}.jar"
