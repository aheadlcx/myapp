package me.aheadlcx.myjavassist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.concurrent.ThreadPoolExecutor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor()
        poolExecutor.allowCoreThreadTimeOut(true);
    }
}
