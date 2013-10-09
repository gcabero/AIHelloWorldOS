name := "AIHelloWorldOS"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "org.mongodb" % "mongo-java-driver" % "2.9.3",
  "org.mongojack" %% "play-mongojack" % "2.0.0-RC2"
)     

play.Project.playJavaSettings
