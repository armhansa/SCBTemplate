package com.github.armhansa.scbtemplate.services

import com.intellij.openapi.project.Project
import com.github.armhansa.scbtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
