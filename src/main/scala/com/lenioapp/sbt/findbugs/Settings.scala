/*
 * Copyright (c) 2015-2016 Lenio Ltd, Joseph Earl & contributors.
 * All rights reserved.
 *
 * Copyright (c) 2010-2014 Joachim Hofer & contributors
 * All rights reserved.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.lenioapp.sbt.findbugs

import sbt._
import Keys._
import Project.Initialize

import ReportType._
import Priority._
import Effort._

import scala.xml.Node
import java.io.File

private[findbugs] case class PathSettings(reportPath: Option[File], analyzedPath: Seq[File], auxPath: Seq[File])

private[findbugs] case class FilterSettings(includeFilters: Option[Node], excludeFilters: Option[Node])

private[findbugs] case class MiscSettings(
  reportType: Option[ReportType], priority: Priority,
  onlyAnalyze: Option[Seq[String]], maxMemory: Int,
  analyzeNestedArchives: Boolean, sortReportByClassNames: Boolean,
  effort: Effort, failOnError: Boolean, pluginList: Seq[String])
