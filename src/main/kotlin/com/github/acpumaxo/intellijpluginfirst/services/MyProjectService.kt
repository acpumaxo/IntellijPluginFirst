package com.github.acpumaxo.intellijpluginfirst.services

import com.github.acpumaxo.intellijpluginfirst.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
