//
// Created by apple on 2018/3/21.
//
//test.c
# include "me_aheadlcx_myjni_EncryUtil.h"
# include <stdio.h>
JNIEXPORT jstring JNICALL Java_me_aheadlcx_myjni_EncryUtil_get(JNIEnv *env, jobject thiz){
    printf("invoke get in c++\n");
    return (*env)->NewStringUTF("Hello from JNI");
}

JNIEXPORT void JNICALL Java_me_aheadlcx_myjni_EncryUtil_set(JNIEnv *env, jobject thiz,jstring str){
    printf("invoke set in c++ jni");
    char* string = (char*)env->GetStringUTFChars(str,NULL);
    printf("%s\n",string);
    (*env)->ReleaseStringUTFChars(str, string);
}
