package com.demo.plugin1

import org.gradle.api.Plugin
import org.gradle.api.Project

class PluginImpl implements Plugin<Project> {
    void apply(Project project) {
        project.task('testPlugin') {
            doLast {
                println "自定义插件ccc"
            }
        }
    }
}

