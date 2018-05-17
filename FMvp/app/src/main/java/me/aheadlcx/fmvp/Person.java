package me.aheadlcx.fmvp;

import android.util.Log;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/3/11 下午2:21
 */

public class Person {
    public String name;
    private static final String TAG = "Person";
    public synchronized void showDog(){
        Log.i(TAG, "showDog: start");
        try {
            Thread.sleep(1000*2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.i(TAG, "showDog: end");
    }

    public synchronized void showCat(){
        Log.i(TAG, "showCat: start");
        try {
            Thread.sleep(1000*2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.i(TAG, "showCat: end");
    }
}
