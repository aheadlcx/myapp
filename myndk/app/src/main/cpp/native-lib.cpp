#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring

JNICALL
Java_me_aheadlcx_myndk_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
extern "C"
JNIEXPORT jstring JNICALL
Java_me_aheadlcx_myndk_MainActivity_stringFromJNII(JNIEnv *env, jobject instance) {

    // TODO

    std::string hello = "Hello from C++ aheadlcx";

    return env->NewStringUTF(hello.c_str());
}