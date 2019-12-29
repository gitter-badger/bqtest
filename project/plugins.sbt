resolvers += "Artima Maven Repository" at "https://repo.artima.com/releases"
resolvers += Resolver.bintrayIvyRepo("eed3si9n", "sbt-plugins")

addSbtPlugin("com.artima.supersafe" % "sbtplugin" % "1.1.9")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.10")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.2.1")
