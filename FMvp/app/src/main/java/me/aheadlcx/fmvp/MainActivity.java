package me.aheadlcx.fmvp;

import android.content.Intent;
import android.database.sqlite.SQLiteStatement;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private android.widget.TextView textShow;
    private TextView txtTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate: ");
        try {
            setContentView(R.layout.activity_main);
            this.txtTest = (TextView) findViewById(R.id.txtTest);
            txtTest.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    testId();
                }
            });

            this.textShow = (TextView) findViewById(R.id.textShow);
            textShow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    show();
//                    test();
//                    showdialog();
//                    testSync();
                    testDog();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        } catch (AssertionError assertionError) {

        }
    }


    public void testDog() {
        final Person person = new Person();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                person.showDog();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                person.showCat();
            }
        });
        thread.start();
        thread2.start();
    }

    ReentrantLock lock = new ReentrantLock();

    private synchronized void testId() {
        try {
            Condition empty = lock.newCondition();
            lock.lockInterruptibly();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        String resourceEntryName = getResources().getResourceEntryName(R.id.txtTest);
        Log.i(TAG, "testId: resourceEntryName = " + resourceEntryName);
    }

    private void showdialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("hhhh");
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    Handler mHandler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Log.i(TAG, "handleMessage: count = " + msg.arg1);
        }
    };


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "onDestroy: ");
        super.onDestroy();
    }

    public void test() {
        Intent intent = new Intent(this, NewMainAct.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT);
        intent.setFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        startActivity(intent);
        int i = Integer.MIN_VALUE - 1;
        Log.i(TAG, "test: i = " + i);
        Log.i(TAG, "test: Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        Log.i(TAG, "test: Integer.MIN_VALUE = " + Integer.MIN_VALUE);

    }

    private void testSync() {
        Log.i(TAG, "testSync: ");
        final Semaphore semp = new Semaphore(5);
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int index = 0; index < 20; index++) {
            final int NO = index;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        // 获取许可
                        semp.acquire();
                        Log.i(TAG, "Accessing: " + NO);
                        Thread.sleep((long) (Math.random() * 10000));
                        // 访问完后，释放
                        semp.release();
                        Log.i(TAG, "-----------------" + semp.availablePermits());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            exec.execute(run);
        }
//        exec.shutdown();

    }

    int count;

    public void show() {
        for (int i = 0; i < 10000; i++) {
            count++;
            Person person = new Person();
            person.name = count + "";
            Log.i(TAG, "show:  person.name = " + person.name);
//            Message msg = Message.obtain();
//            msg.arg1 = count;
//            mHandler.sendMessage(msg);
        }
    }
}
