package me.aheadlcx.testlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import me.aheadlcx.base.LibUtil;


public class MainActivity extends AppCompatActivity {

    private android.widget.TextView txtApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txtApp = (TextView) findViewById(R.id.txtApp);
        txtApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoLib();
            }
        });
    }

    private void gotoLib() {
        LibUtil.show();
//        Intent intent = new Intent(this, BaseAct.class);
//        startActivity(intent);
    }
}
