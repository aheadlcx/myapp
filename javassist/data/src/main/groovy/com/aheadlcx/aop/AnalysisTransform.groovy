package com.aheadlcx.aop

import com.android.build.api.transform.Context
import com.android.build.api.transform.JarInput
import com.android.build.api.transform.QualifiedContent
import com.android.build.api.transform.Transform
import com.android.build.api.transform.TransformException
import com.android.build.api.transform.TransformInput
import com.android.build.api.transform.TransformOutputProvider
import com.android.build.gradle.internal.pipeline.TransformManager
import javassist.ClassPool
import javassist.CtClass
import javassist.CtMethod
import org.gradle.api.Project

public class AnalysisTransform extends Transform {

    public static String NAME = "Analysis"

    Project mProject

    AnalysisTransform(Project project) {
        mProject = project
    }

    @Override
    String getName() {
        return NAME
    }

    @Override
    Set<QualifiedContent.ContentType> getInputTypes() {
        return TransformManager.CONTENT_CLASS;
    }

    @Override
    Set<? super QualifiedContent.Scope> getScopes() {
        return TransformManager.SCOPE_FULL_PROJECT
    }

    @Override
    boolean isIncremental() {
        return false
    }

    @Override
    void transform(Context context, Collection<TransformInput> inputs, Collection<TransformInput> referencedInputs, TransformOutputProvider outputProvider, boolean isIncremental) throws IOException, TransformException, InterruptedException {
        super.transform(context, inputs, referencedInputs, outputProvider, isIncremental)

        inputs.each { TransformInput input ->
            //对类型为jar文件的input进行遍历
            input.jarInputs.each { JarInput jarInput ->
                //生成输出路径

                patchJarFile(jarInput, outputProvider)
            }

        }
    }

    private void patchJarFile(JarInput jarInput, TransformOutputProvider outputProvider) {
        def jarName = jarInput.name
        println("jarName =  ${jarName}")
        ClassPool classPool = ClassPool.getDefault()
        CtClass ctClass = classPool.makeClass("Ss");
        def method = ctClass.getDeclaredMethod("ss");
        method.insertBefore()
        ctClass.setSuperclass()
    }
}