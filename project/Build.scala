import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "play2test"
    val appVersion      = "1.0-SNAPSHOT"

	
    val appDependencies = Seq(
	  "org.webjars" % "webjars-play" % "2.0",
      "org.webjars" % "bootstrap" % "2.2.2-1",
	  "postgresql" % "postgresql" % "9.1-901.jdbc4"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      
    )

}
