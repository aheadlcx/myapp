package me.aheadlcx.fmvp;

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

//        assertEquals(Integer.MIN_VALUE - 1, Integer.MAX_VALUE);
//        assertEquals("me.aheadlcx.fmvp", appContext.getPackageName());
        int result = myAtoi("-9223372036854775809");
        System.out.print("result = " + result);
        assertEquals(result , 0);
    }

    public int myAtoi(String str) {
        if(str == null || str.length() == 0){
            return 0;
        }
        long result = 0;
        str = str.trim();
        int len = str.length();
        boolean isPlus = false;
        boolean isMinus = false;
        if(str.charAt(0) == '-'){
            isMinus = true;
        } else if (str.charAt(0) =='+'){
            isPlus = true;
        }
        for(int i = 0; i < len; i++){
            if(i == 0 && ( isMinus || isPlus)){
                continue;
            }
            int digital = str.charAt(i) - '0';
            if(digital >=0 && digital <=9 ){
                result = result * 10 + (str.charAt(i) - '0');
            } else {
                break;
            }
        }
        if(!isMinus && result > Integer.MAX_VALUE){
            result = Integer.MAX_VALUE;
        }
        if(isMinus){
            if(result > Integer.MAX_VALUE){
                result = Integer.MIN_VALUE;
            } else {
                result = -result;
            }
        }
        int tmp = (int)result;
        return tmp;
    }
}
