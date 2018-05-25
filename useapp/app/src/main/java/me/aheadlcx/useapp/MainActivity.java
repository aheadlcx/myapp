package me.aheadlcx.useapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import me.aheadlcx.study.ndk.People;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtShow = findViewById(R.id.txtShow);
        txtShow.setText(People.sayPeople());
        txtShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                People.checkPackageName("sss");
            }
        });
    }
}
