import com.lenioapp.sbt.findbugs._

name := "findbugs-fail"

organization := "com.lenioapp"

version := "2.0.0-SNAPSHOT"

FindBugs.failOnError := true