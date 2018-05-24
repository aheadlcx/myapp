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
        if (!lpparam.packageName.equals("com.taptap") && !lpparam.packageName.equals("com.huya.meaningjokes")) {
            Log.i(TAG, "handleLoadPackage: lpparam.packageName " + lpparam.packageName);
            return;
        }
        if (lpparam.packageName.equals("com.huya.meaningjokes")){
            Log.i(TAG, "找到段子了 : " + lpparam.packageName);
        }
        XposedHelpers.findAndHookMethod("com.huya.meaningjokes.module.test.DebugActivity",
                lpparam.classLoader, "testHaha", String.class, new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        Log.i(TAG, " DebugActivity afterHookedMethod: " + param.args[0]);
                        super.afterHookedMethod(param);
                    }

                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        Log.i(TAG, " DebugActivity beforeHookedMethod: " + param.args[0]);
                        super.beforeHookedMethod(param);
                    }
                });

        Class<?> hookClass = null;
        try {
            hookClass = lpparam.classLoader.loadClass("com.huya.meaningjokes.module.test.DebugActivity");
            Log.i(TAG, "找到段子 debug 名称: " + hookClass.getSimpleName());
        } catch (Exception e) {
            e.printStackTrace();
            Log.i(TAG, "Exception: " + e.getMessage());
        }
        XposedBridge.hookAllMethods(hookClass, "testHaha", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Log.i(TAG, " DebugActivity afterHookedMethod: " + param.args[0]);
                super.beforeHookedMethod(param);
            }
        });

    }
}
