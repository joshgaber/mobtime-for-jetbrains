package com.github.joshgaber.mobtimeforjetbrains.services

import com.github.joshgaber.mobtimeforjetbrains.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
