name := "JSAI"

version := "1.0"

scalaVersion := "2.12.2"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-language:postfixOps", "-language:implicitConversions")//, "-Xdisable-assertions")

// ScalaTest
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

// Disable parallel execution of tests
parallelExecution in Test := false

// show durations.
testOptions in Test ++= Seq(Tests.Argument("-oD"), Tests.Argument("-l"), Tests.Argument("Concrete"))

excludeFilter in unmanagedJars := HiddenFileFilter || "WithRewriter.jar"

