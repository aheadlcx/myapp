package me.aheadlcx.fmvp;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/3/13 上午8:55
 */

public class NewMainAct extends AppCompatActivity {


    private android.widget.EditText input;
    private TextView txtSend;
    private TextView txtGet;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_socker);
        this.txtGet = (TextView) findViewById(R.id.txtGet);
        this.txtSend = (TextView) findViewById(R.id.txtSend);
        this.input = (EditText) findViewById(R.id.input);
        txtSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });
        startService();
//        Glide.with(this).load("Ss").into();
        new Thread() {
            @Override
            public void run() {
                super.run();
                testSocket();
            }
        }.start();
        txtGet.postDelayed(new Runnable() {
            @Override
            public void run() {
            }
        }, 1000);

    }

    private void startService() {
        Intent service = new Intent(this, SockerService.class);
        startService(service);
    }

    Socket mSocket;
    PrintWriter printWriter;

    private void testSocket() {
        String name = "!";
        int i = name.charAt(0) - '0';
        while (mSocket == null) {
            try {
                mSocket = new Socket("localhost", 8668);
                printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(mSocket
                        .getOutputStream
                                ())), true);
                getData();
            } catch (Exception e) {
                SystemClock.sleep(1000);
                e.printStackTrace();
            }
        }
    }

    private static final String TAG = "NewMainAct";

    private void sendData() {
        final String toString = input.getText().toString();
        if (TextUtils.isEmpty(toString)) {
            return;
        }
        if (printWriter == null) {
            Log.i(TAG, "sendData: printWriter == null");
            return;
        }
        new Thread(){
            @Override
            public void run() {
                super.run();
                printWriter.println(toString);
            }
        }.start();
        input.setText("");
    }

    private void getData() {
//        while (mSocket != null) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(mSocket.getInputStream()));
            while (!NewMainAct.this.isFinishing()) {
                final String dataFromServer = br.readLine();
                if (!TextUtils.isEmpty(dataFromServer)) {
                    txtGet.post(new Runnable() {
                        @Override
                        public void run() {
                            txtGet.setText(dataFromServer);
                        }
                    });
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        }
    }

    @Override
    protected void onDestroy() {
        if (mSocket != null) {
            try {
                mSocket.shutdownInput();
                mSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        super.onDestroy();

    }
}
