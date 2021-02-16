package org.jboss.sbtman

import sbt._
import Keys._

object SbtmanPlugin extends AutoPlugin {
  override def trigger = allRequirements

  object autoImport {
    val sbtManVersionSuffix = settingKey[String]("Version suffix")

    val suffix = taskKey[Unit]("Add suffix to project versions")
  }

  import autoImport._

  override lazy val globalSettings = Seq(
    sbtManVersionSuffix := "redhat"
  )

  override lazy val projectSettings = Seq(
    suffix := {
      val log = streams.value.log
      log.info("suffix=" + sbtManVersionSuffix.value)
    }
  )

}
