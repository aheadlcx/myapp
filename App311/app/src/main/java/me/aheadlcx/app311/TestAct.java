package me.aheadlcx.app311;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/4/21 上午10:25
 */
public class TestAct extends AppCompatActivity {
    private static final String TAG = "TestAct";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_new_main);
        final ImageView imgShow = (ImageView) findViewById(R.id.imgShow);
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        final TextView txtShow = (TextView) findViewById(R.id.txtShow);
        findViewById(R.id.txtShow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestAct.this, BadTokenAct.class);
                TestAct.this.startActivity(intent);
            }
        });


//        rootView.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//
//                txtShow.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Intent intent = new Intent(TestAct.this, TestLeak.class);
//                        TestAct.this.startActivity(intent);
//                        Glide.with(imgShow).load("https://timgsa.baidu" +
//                                ".com/timg?image&quality=80&size=b9999_10000&sec=1524292151485&di" +
//                                "=474c4930618de02296381fd87479857f&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu" +
//                                "" +
//                                "" +
//                                "" +
//                                "" +
//                                "" +
//                                "" +
//                                "" +
//                                ".com%2Fimgad%2Fpic%2Fitem%2Fbba1cd11728b4710655829d1c9cec3fdfc0323bc.jpg").into(imgShow);
//                        Toast.makeText(TestAct.this, "Ssss", Toast.LENGTH_SHORT).show();
//
//                    }
//                });
//
//
//                Rect delegateAera = new Rect();
//                txtShow.getHitRect(delegateAera);
//                Log.i(TAG, "run: delegateAera" + delegateAera.left + "  -- " + delegateAera.top
//                        + " -- " + delegateAera.right + " -- "+ delegateAera.bottom);
//
//                delegateAera.left -= 200;
//                delegateAera.top += 50;
//                delegateAera.right += 200;
//                delegateAera.bottom += 100;
//                TouchDelegate touchDelegate = new TouchDelegate(delegateAera, txtShow);
//                if (View.class.isInstance(txtShow.getParent())){
//                    ((View) (txtShow.getParent())).setTouchDelegate(touchDelegate);
//                }
//            }
//        }, 1000);


    }
}
