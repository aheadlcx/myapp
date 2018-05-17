package me.aheadlcx.app311;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/5/1 下午9:10
 */
public class BadTokenAct extends AppCompatActivity {
    private static final String TAG = "BadTokenAct";
    View viewById;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.i(TAG, "onCreate: BadTokenAct");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_leak);
        try {
//            Thread.sleep(1000*31);
        } catch (Exception e) {
            e.printStackTrace();
            Log.i(TAG, "onCreate: BadTokenAct InterruptedException");
        }

        viewById = findViewById(R.id.txtLeak);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogT();
            }
        });
    }

    private Handler mHandler = new Handler();
    private void showDialogT() {
        Log.i(TAG, "showDialogT: ");
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final AlertDialog dialog = builder.setTitle("title")
                .setPositiveButton("确定", null)
                .setNegativeButton("取消", null)
                .create();
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.i(TAG, "run: showDialogT postDelayed");
                dialog.show();
            }
        }, 1000*31);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: BadTokenAct");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: BadTokenAct");
    }
}
