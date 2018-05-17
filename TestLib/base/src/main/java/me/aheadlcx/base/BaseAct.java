package me.aheadlcx.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/2/27 下午10:43
 */

public class BaseAct extends AppCompatActivity {

    private android.widget.FrameLayout rlBase;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_base);
        this.rlBase = (FrameLayout) findViewById(R.id.rlBase);
        int id = 1;
    }
}
