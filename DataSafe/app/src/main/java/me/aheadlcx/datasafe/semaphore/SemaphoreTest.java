package me.aheadlcx.datasafe.semaphore;

import java.util.concurrent.Semaphore;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/3/26 下午9:25
 */

public class SemaphoreTest {
    public static void test(){
        Semaphore sw = new Semaphore(3, true);
    }
}
