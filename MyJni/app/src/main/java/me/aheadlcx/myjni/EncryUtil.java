package me.aheadlcx.myjni;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/3/21 下午12:35
 */

public class EncryUtil {
    static {
        System.loadLibrary("jni-test");
    }

    public native String get();
    public native void set(String str);
}
