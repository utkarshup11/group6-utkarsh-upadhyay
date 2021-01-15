name := "group6-utkarsh upadhyay"
version := "1.0"
scalaVersion := "2.12.12"


lazy val actor = project.in(file("actor"))
  .settings(
    libraryDependencies ++= Seq(
    	"com.typesafe.akka" %% "akka-actor-typed" % "2.6.10",
    "com.typesafe.akka" %% "akka-persistence-typed" % "2.6.10",
    "org.scalactic" %% "scalactic" % "3.3.0-SNAP3",
    "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test,
    "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.10" % Test,
  "com.typesafe.akka" %% "akka-persistence-testkit" % "2.6.10" % Test
	)
)

  lazy val persistance = project.in(file("persistence"))
  .settings(
    libraryDependencies ++= Seq(
    	"com.typesafe.slick" %% "slick" % "3.3.3",
    "mysql" % "mysql-connector-java" % "8.0.22",
    "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test,
    "com.h2database" % "h2" % "1.4.200" % Test

	)
)


lazy val root = project.in(file(".")).aggregate(actor , persistance)
