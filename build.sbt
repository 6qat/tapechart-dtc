name := "tapechart-dtc"

version := "0.1"
scalaVersion := "2.13.3"

enablePlugins(AkkaGrpcPlugin)
enablePlugins(JavaAgent)

// publishTo := Some(Resolver.file("local-ivy", file("C:\\Users\\cesch\\.ivy2\\local\\")))
publishTo := Some(Resolver.file("local-ivy", file("$HOME/.ivy2/local/")))
publishTo := Some(MavenCache("local-maven", file("$HOME/.m2/repository/")))
