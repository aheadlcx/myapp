package me.aheadlcx.datasafe;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        int[] arr = new int[]{1,2,3,3,4,1,2,12};
        System.out.print("" + get(arr));
        assertEquals(4, 2 + 2);

//        assertEquals("me.aheadlcx.datasafe", appContext.getPackageName());
    }

    public static int get(int[] arr){
        if (arr == null) {
            return 0;
        }
        int result = 0;
        int len = arr.length;
        int curNum = 0;
        for (int i = 0; i < len; i++) {
            if(curNum == 0){
                result = arr[i];
                curNum = 1;
            }else {
                if (arr[i] == result){
                    curNum++;
                }else {
                    curNum--;
                }
            }
        }
        return result;

    }
}
