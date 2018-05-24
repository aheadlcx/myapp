package me.aheadlcx.gamezonexposed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random = new Random();
        int nextInt = random.nextInt(100);
        Log.i(TAG, "onCreate: " + "savedInstanceState" + nextInt);
    }
}
