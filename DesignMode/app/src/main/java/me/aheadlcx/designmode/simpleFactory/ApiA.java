package me.aheadlcx.designmode.simpleFactory;

import android.util.Log;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/3/21 下午4:43
 */

public class ApiA implements Api {
    private static final String TAG = "ApiA";
    @Override
    public void send(String msg) {
        Log.i(TAG, "send: ");
    }
}
