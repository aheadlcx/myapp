package me.aheadlcx.fmvp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/3/13 上午11:38
 */

public class SockerService extends Service {
    private static final String TAG = "SockerService";
    boolean isDestory = false;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        new Thread(new TcpServer()){
            @Override
            public void run() {
                super.run();
            }
        }.start();
    }

    @Override
    public void onDestroy() {
        isDestory = true;
        super.onDestroy();
    }

    private class TcpServer implements Runnable{

        @Override
        public void run() {
            ServerSocket serverSocket = null;
            try {
                serverSocket = new ServerSocket(8668);
            } catch (IOException e) {
                e.printStackTrace();
            }

            while (!isDestory){
                try {
                    final Socket client = serverSocket.accept();
                    new Thread(){
                        @Override
                        public void run() {
                            super.run();
                            try {
                                responseClient(client);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }.start();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    String[] outs = new String[]{"欢迎111", "火花塞", " 撒范德萨"};

    private void responseClient(Socket client) throws IOException {
        if (client == null) {
            return;
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter
                (client.getOutputStream())), true);
        out.println("欢迎来到聊天室内");
        while (!isDestory){
            String readLine = reader.readLine();
            if (readLine == null){
                Log.i(TAG, "responseClient: 客户端断开连接");
                break;
            }
            Log.i(TAG, "responseClient: readLine = " + readLine);
            int i = new Random().nextInt(outs.length);
            out.println(outs[i]);
        }
        out.close();
        reader.close();
        client.close();
    }
}
