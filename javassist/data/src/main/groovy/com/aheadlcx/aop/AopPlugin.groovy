package com.aheadlcx.aop

import org.gradle.api.Plugin
import org.gradle.api.Project;
import com.android.build.gradle.AppPlugin
import com.android.build.gradle.AppExtension

class AopPlugin implements Plugin<Project>{

    AopPlugin() {
    }

    @Override
    void apply(Project project) {
        def isApp = project.plugins.hasPlugin(AppPlugin)
        if (isApp) { //注册trasform
            def androidPlugin = project.extensions.getByType(AppExtension)
            def analysisTrasform = new AnalysisTransform(project)
            androidPlugin.registerTransform(analysisTrasform)
        }
    }
}