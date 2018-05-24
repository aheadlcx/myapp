package me.aheadlcx.study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

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
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
