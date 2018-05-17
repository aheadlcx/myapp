package me.aheadlcx.app311;

import android.app.Application;
import android.util.Log;

import com.squareup.leakcanary.LeakCanary;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/4/23 下午3:50
 */
public class APP extends Application {
    private static final String TAG = "APP";
    @Override
    public void onCreate() {

        super.onCreate();

        try {
            Log.i(TAG, "onCreate: sleep");
//            Thread.sleep(1000*31);
        } catch (Exception e) {
            e.printStackTrace();
            Log.i(TAG, "onCreate: InterruptedException");
        }

        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
        // Normal app init code...
    }
}
