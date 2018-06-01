package me.aheadlcx.gamezonexposed;

import android.util.Log;

import com.google.gson.Gson;

import java.util.HashMap;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/5/18 上午11:42
 */
public class GameZonePackger implements IXposedHookLoadPackage {
    private static final String TAG = "GameZonePackger";

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        if (lpparam.packageName.equals("tv.danmaku.bili")) {
            Log.i(TAG, "找到Bili了 : " + lpparam.packageName);
        }
        if (!lpparam.packageName.equals("tv.danmaku.bili")) {
//            Log.i(TAG, "handleLoadPackage: lpparam.packageName " + lpparam.packageName);
            return;
        } else {

        }

        XposedHelpers.findAndHookMethod("java.lang.System",
                lpparam.classLoader, "getProperty", String.class, new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        Log.i(TAG, " DebugActivity afterHookedMethod: " + param.args[0]);
                        if (param.args[0] instanceof String && (((String) param.args[0]).contains
                                ("proxyHost") || ((String) param.args[0]).contains
                                ("proxyPort"))) {
                            Log.i(TAG, "afterHookedMethod: param.getResult()" + param.getResult());
                            param.setResult("");
                            Log.i(TAG, "afterHookedMethod: after setResult param.getResult()" +
                                    param.getResult());
                        }
                        super.afterHookedMethod(param);
                    }

                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        Log.i(TAG, " DebugActivity beforeHookedMethod: " + param.args[0]);
                        super.beforeHookedMethod(param);
                    }
                });



        XposedHelpers.findAndHookMethod("java.lang.System",
                lpparam.classLoader, "exit", int.class, new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        Log.i(TAG, " System exit afterHookedMethod: " + param.args[0]);
                        super.afterHookedMethod(param);
                    }

                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        Log.i(TAG, " System exit beforeHookedMethod: " + param.args[0]);
                        super.beforeHookedMethod(param);
                    }
                });

        XposedHelpers.findAndHookMethod("android.os.Process",
                lpparam.classLoader, "killProcess", int.class, new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        Log.i(TAG, " Process killProcess afterHookedMethod: " + param.args[0]);
                        super.afterHookedMethod(param);
                    }

                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        Log.i(TAG, " Process killProcess beforeHookedMethod: " + param.args[0]);
                        super.beforeHookedMethod(param);
                    }
                });



//        Class<?> hookClass = null;
//        try {
//            hookClass = lpparam.classLoader.loadClass("android.support.v4.app.Fragment");
//            Log.i(TAG, "找到段子 debug 名称: " + hookClass.getSimpleName());
//        } catch (Exception e) {
//            e.printStackTrace();
//            Log.i(TAG, "Exception: " + e.getMessage());
//        }
//        XposedBridge.hookAllMethods(hookClass, "onCreate", new XC_MethodHook() {
//            @Override
//            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
//                Log.i(TAG, " DebugActivity afterHookedMethod: " + param.args[0]);
//                super.beforeHookedMethod(param);
//            }
//
//            @Override
//            protected void afterHookedMethod(MethodHookParam param) throws Throwable {
//                super.afterHookedMethod(param);
//
//            }
//        });

    }
}
