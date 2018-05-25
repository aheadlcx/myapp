package me.aheadlcx.study;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import me.aheadlcx.study.ndk.ContextImpl;
import me.aheadlcx.study.ndk.People;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());
        TextView txtShow = (TextView) findViewById(R.id.txtShow);
        txtShow.setText(People.sayPeople());
        txtShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = People.getName();
                Log.i(TAG, "onClick: name = " + name);
            }
        });
        findViewById(R.id.txtPack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checkPackageName = People.checkPackageName("me.aheadlcx.study");
                Log.i(TAG, "onClick: checkPackageName" + checkPackageName);
            }
        });

        findViewById(R.id.txtPackError).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checkPackageName = People.checkPackageName("me.aheadlcx.study2");
                Log.i(TAG, "onClick: checkPackageName error" + checkPackageName);
            }
        });
        findViewById(R.id.txtSign).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContextImpl.getSign(MainActivity.this);
                ContextImpl.getInstance().init(MainActivity.this);
                People.checkSign(MainActivity.this);
            }
        });
        ContextImpl.getInstance().init(this);
    }

    private String getSign(Context context){
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager
                    .GET_SIGNATURES);
            Signature[] signatures = packageInfo.signatures;
            String sign = new String(signatures[0].toByteArray());
            Log.i(TAG, "getSign: " + sign);
            return sign;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
