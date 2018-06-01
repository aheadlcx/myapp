package me.aheadlcx.smalidebug;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/5/28 下午6:10
 */
public class TwoAct extends AppCompatActivity {
    private static final String TAG = "TwoAct";
    private android.widget.TextView txtTwo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_two);
        this.txtTwo = (TextView) findViewById(R.id.txtTwo);
        txtTwo.setText(TAG);
        txtTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TwoAct.this, ThridAct.class);
                intent.putExtra("key", "hello world");
                TwoAct.this.startActivity(intent);
            }
        });
    }
}
