package me.aheadlcx.leak;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";
    Personl woman = new Woman();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout testShow = (FrameLayout) findViewById(R.id.testShow);

        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Man man = new Man();
                Woman woman = new Woman();
                method.invoke(woman, args);
                return method.invoke(man, args);
            }
        };
        final Personl proxyInstance = (Personl) Proxy.newProxyInstance(getClassLoader(), woman
                        .getClass().getInterfaces(),
//        final Personl proxyInstance = (Personl) Proxy.newProxyInstance(getClassLoader(), new Class[]{Personl.class},
                handler);
        woman = proxyInstance;
        testShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ToastUtil.show();
                String name = woman.getName();
                Log.i(TAG, "onClick: name = " + name);
            }
        });


    }
}
