package me.aheadlcx.datasafe;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        int[] arr = new int[]{3, 1, 3, 6, 3, 4, 3, 9, 3, 4, 2, 3};
        System.out.print("" + get(arr));
        assertEquals(4, 2 + 2);
    }

    public static int get(int[] arr) {
        if (arr == null) {
            return 0;
        }
        int result = 0;
        int len = arr.length;
        int curNum = 0;
        int temp = 0;

        int maxNum = 0;
        for (int i = 0; i < len; i++) {
            if (curNum == 0) {
                temp = arr[i];
                curNum = 1;
                maxNum = 1;
            } else {
                if (arr[i] == temp) {
                    curNum++;
                    maxNum++;
                } else {
                    if (curNum >= maxNum) {
                        maxNum = curNum;
                        result = temp;
                    }
                    curNum--;
                }
            }
        }

        return result;

    }
}