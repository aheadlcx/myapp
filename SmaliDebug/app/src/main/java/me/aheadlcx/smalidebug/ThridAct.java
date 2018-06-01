package me.aheadlcx.smalidebug;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/5/28 下午6:11
 */
public class ThridAct extends AppCompatActivity {
    private static final String TAG = "ThridAct";

    private android.widget.TextView txtTwo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_two);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String key = extras.getString("key");
            this.txtTwo = (TextView) findViewById(R.id.txtTwo);
            txtTwo.setText(TAG + key);
        }
        txtTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
