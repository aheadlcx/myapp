#include <jni.h>
#include <string>
#include <android/log.h>
#define LOG_TAG "来自jni:"
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR,LOG_TAG,__VA_ARGS__)
extern "C"
JNIEXPORT jstring JNICALL
Java_me_aheadlcx_study_ndk_People_sayPeople(JNIEnv *env, jclass type) {
    LOGE("我在 CPP 里面了。");
    return env->NewStringUTF("hello 52pojie");
}
extern "C"
JNIEXPORT jstring JNICALL
Java_me_aheadlcx_study_ndk_People_getName(JNIEnv *env, jclass type) {
    LOGE("hello aheadlcx");
    return env->NewStringUTF("my name is aheadlcx");
}