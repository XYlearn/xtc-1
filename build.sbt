name := "xtc"

version := "2.4.0"

scalaVersion := "2.9.1"

javaSource in Compile <<= baseDirectory(_ / "src")

javacOptions ++= Seq("-source", "1.5", "-target", "1.5")
