name := """akkademy-db-client"""

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  // Uncomment to use Akka
  //"com.typesafe.akka" %% "akka-actor" % "2.3.9",
  "junit"             % "junit"           % "4.12"  % "test",
  "com.novocode"      % "junit-interface" % "0.11"  % "test",
  "com.akkademy-db"   %% "akkademy-db"     % "0.0.1-SNAPSHOT",
  "org.scala-lang.modules" %% "scala-java8-compat" % "0.7.0"
)

fork in run := true