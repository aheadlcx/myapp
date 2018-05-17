package me.aheadlcx.base;

import android.support.annotation.NonNull;
import android.util.Log;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/3/1 下午11:28
 */

public class LibUtil {
    private static final String TAG = "LibUtil";
    public static void show(){
        Log.i(TAG, "show: aheadlcx");

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    private static void testThread() {
        BlockingDeque<Runnable> blockingDeque = new LinkedBlockingDeque<>(128);

        int CPU_COUNT = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(CPU_COUNT + 1,30, 128, TimeUnit
                .SECONDS, blockingDeque, new ThreadFactory(){
            @Override
            public Thread newThread(@NonNull Runnable r) {
                return new Thread(r);
            }
        });
        poolExecutor.allowCoreThreadTimeOut(true);
        new ThreadFactory(){

            @Override
            public Thread newThread(@NonNull Runnable r) {
                return new Thread(r);
            }
        };
    }
}
