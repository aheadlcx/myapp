package me.aheadlcx.datasafe.semaphore;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.concurrent.Semaphore;

import me.aheadlcx.datasafe.R;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/3/27 下午4:05
 */

public class SemapActivity extends AppCompatActivity {


    private TextView txtOne;
    private TextView txtTwo;
    private TextView txtThree;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Semaphore semaphore = new Semaphore(4);
        this.txtThree = (TextView) findViewById(R.id.txtThree);
        this.txtTwo = (TextView) findViewById(R.id.txtTwo);
        this.txtOne = (TextView) findViewById(R.id.txtOne);
    }
}
