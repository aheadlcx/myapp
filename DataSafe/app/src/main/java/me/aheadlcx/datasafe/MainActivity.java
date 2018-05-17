package me.aheadlcx.datasafe;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MainActivity extends AppCompatActivity {

    private android.widget.TextView txtOne;
    private android.widget.TextView txtTwo;

    PriorityBlockingQueue<Person> queue = new PriorityBlockingQueue<>();
    int count = 0;
    ReentrantLock lock;
    Condition mCondition;
    private TextView txtThree;
    private TextView txtFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txtFour = (TextView) findViewById(R.id.txtFour);
        this.txtThree = (TextView) findViewById(R.id.txtThree);
        this.txtTwo = (TextView) findViewById(R.id.txtTwo);
        this.txtOne = (TextView) findViewById(R.id.txtOne);
        lock = new ReentrantLock(true);
        mCondition = lock.newCondition();

        txtOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread thread = new Thread() {
                    @Override
                    public void run() {
                        super.run();
                        add();
                    }
                };
                thread.start();
                add = thread;
            }
        });

        txtTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread thread = new Thread() {
                    @Override
                    public void run() {
                        super.run();
                        delete();
                    }
                };
                thread.start();
                delete = thread;
            }
        });
        txtThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interrupt();
            }
        });
        Semaphore sw = new Semaphore(2, false);
        try {

            sw.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        txtFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(){
                    @Override
                    public void run() {
                        super.run();
                        testWait();
                    }
                }.start();
            }
        });
    }

    private void testWait() {
        Log.i(TAG, "testWait: one");
        synchronized (lock2) {
            try {
                txtFour.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        testUiRun();
                    }
                }, 1000 * 2);
                lock2.wait();
                Log.i(TAG, "testWait: two");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void testUiRun() {
        WindowManager wm = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
//        wm.addView();
        Toast.makeText(this, "ss", Toast.LENGTH_SHORT).show();
        synchronized (lock2){
            Log.i(TAG, "run: ");
            lock2.notifyAll();
        }
    }

    private void interrupt() {
        if (delete != null) {
            Log.i(TAG, "interrupt: ");
            delete.interrupt();
            delete = null;
        }
    }

    Object lock2 = new Object();

    Thread delete;
    Thread add;

    private static final String TAG = "MainActivity";

    private void delete() {
        try {
            lock.lock();
            Log.i(TAG, "delete: ");
            if (count == 0) {
//                mCondition.await();
            }
//            Thread.sleep(3000);
            Log.i(TAG, "delete: lock.lock()");
//            Person take = queue.take();
//            Log.i(TAG, "delete: " + take.name);
//        } catch (InterruptedException e) {
        } catch (Exception e) {
            e.printStackTrace();
            Log.i(TAG, "delete: InterruptedException");
        } finally {
            try {
                if (lock.isLocked()) {
                    lock.unlock();
                }
            } catch (Exception e) {
                Log.i(TAG, "delete: Exception");
                e.printStackTrace();
            }
        }
        count--;
    }

    private void add() {
        count++;
        try {
            lock.lock();
            Log.i(TAG, "add: ");
            Log.i(TAG, "add:  lock.lock()");
            Thread.sleep(9000);
            mCondition.signal();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

//        queue.add(new Person(count));
    }


}
