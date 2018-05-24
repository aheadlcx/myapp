package me.aheadlcx.study.ndk;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/5/24 上午10:47
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
