package me.aheadlcx.study.ndk;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/5/24 下午12:29
 */
public class People {
    static {
        System.loadLibrary("people");
    }
    public static void init(){

    }
    public static native String sayPeople();
    public static native String getName();
    public static native boolean checkPackageName(String packageName);
}
