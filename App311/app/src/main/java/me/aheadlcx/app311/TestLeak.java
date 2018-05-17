package me.aheadlcx.app311;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/4/23 下午3:46
 */
public class TestLeak extends AppCompatActivity {

    View viewById;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_leak);
        viewById = findViewById(R.id.txtLeak);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testLeak();
            }
        });
    }

    private void testLeak() {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... params) {
                // Do some slow work in background
                SystemClock.sleep(20000);
                return null;
            }
        }.execute();
        Toast.makeText(TestLeak.this, "onClick: test leak", Toast.LENGTH_SHORT).show();
        viewById.postDelayed(new Runnable() {
            @Override
            public void run() {
            }
        }, 1000 * 30);
    }
}
