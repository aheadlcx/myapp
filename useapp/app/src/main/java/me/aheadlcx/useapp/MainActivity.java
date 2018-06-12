package me.aheadlcx.useapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

import me.aheadlcx.study.ndk.People;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

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
//                System.exit(1);
            }
        });
        findViewById(R.id.txtExit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                System.exit(0);
            }
        });
        findViewById(R.id.txtVpn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkVpn();
            }
        });
        findViewById(R.id.txtExitNative).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                People.exit(1);
            }
        });
    }

    private void checkVpn() {
        try {
            Enumeration<NetworkInterface> lists = NetworkInterface.getNetworkInterfaces();
            ArrayList<NetworkInterface> list = Collections.list(lists);
            for (int i = 0; i < list.size(); i++) {
                NetworkInterface item = list.get(i);
                if (!item.isUp() || item.getInterfaceAddresses().size() == 0) {
                    continue;
                }
                Log.d(TAG, "checkVpn: item.getName() = " + item.getName());
                if ("tun0".equals(item.getName()) || "ppp0".equals(item.getName())) {
                    Log.i(TAG, "checkVpn: 是用 VPN 了 ");
                    return; // The VPN is up
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
