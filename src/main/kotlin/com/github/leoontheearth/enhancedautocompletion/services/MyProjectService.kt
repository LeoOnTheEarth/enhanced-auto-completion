package com.github.leoontheearth.enhancedautocompletion.services

import com.github.leoontheearth.enhancedautocompletion.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
