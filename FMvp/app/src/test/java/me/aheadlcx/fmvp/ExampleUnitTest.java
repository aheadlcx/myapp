package me.aheadlcx.fmvp;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        String one = "hackahackssss";
        String two = "sadsafewfdsfsadshacksss";
        String result = getLongestCommonSubString(one, two);
//        System.out.print("result = " + result);
//        getLCS("14462357", "465");
        int[] arr = {2,1,5,3,6,4,8,9,7};
        System.out.println(lengthofLCS(arr));
        assertEquals(4, 2 + 2);
    }

    public static int lengthofLCS(int[] arr){
        // 辅助变量
        int[] MaxV = new int [arr.length+1]; // 记录递增子序列 LIS 的末尾元素最小值
        int nMaxLength = 1; // 当前LIS的长度
        int [] LIS = new int[arr.length+1]; //LIS[i]记录的是以第i个元素为结尾的最长序列的长度
        // 初始化
        MaxV[0] = -100;
        MaxV[nMaxLength] = arr[0];
        LIS[0] = 0;LIS[1] = 1;

        for(int i=1;i<arr.length;i++){
            if(arr[i] >MaxV[nMaxLength]){
                MaxV[++nMaxLength] = arr[i];
                LIS[i] = LIS[i-1]+1;
            }
            else{
                // 新元素 更小，更有“潜力”，替换大的元素
                int index = binarySearch(MaxV,arr[i],0,nMaxLength);
                //*
                LIS[i] =index;
                MaxV[index] = arr[i];
            }
        }
        Arrays.sort(LIS);
        return LIS[LIS.length-1];
    }

    // 在MaxV数组中查找一个元素刚刚大于arr[i]
    // 返回这个元素的index
    public static int binarySearch(int []arr, int n, int start, int end){
        while(start<end){
            int mid = (start + end)/2;
            if(arr[mid]< n){
                start = mid+1;
            }
            else if(arr[mid]> n) {
                end = mid -1;
            }
            else
                return mid;
        }
        return end;
    }

    private int stringToInt(String params){
        char[] chars = params.toCharArray();
        int i = chars[0] - '0';
        return -1;
    }

    public static void getLCS(String x, String y){

        char[] s1 = x.toCharArray();
        char[] s2 = y.toCharArray();
        int[][] array = new int[x.length()+1][y.length()+1];//此处的棋盘长度要比字符串长度多加1，需要多存储一行0和一列0

        for(int j = 0; j < array[0].length; j++){//第0行第j列全部赋值为0
            array[0][j] = 0;
        }
        for(int i = 0; i < array.length; i++){//第i行，第0列全部为0
            array[i][0] = 0;
        }

        for(int m = 1; m < array.length; m++){//利用动态规划将数组赋满值
            for(int n = 1; n < array[m].length; n++){
                if(s1[m - 1] == s2[n - 1]){
                    array[m][n] = array[m-1][n-1] + 1;//动态规划公式一
                }else{
                    array[m][n] = max(array[m -1][n], array[m][n -1]);//动态规划公式二
                }
            }
        }
//      for(int m = 0; m < array.length; m++){//将数组赋满值,这样可以从右下角开始遍历找出最大公共子序列
//          for(int n = 0; n < array[m].length; n++){
//              System.out.print(array[m][n]);
//          }
//          System.out.println();
//      }
        Stack stack = new Stack();
        int i = x.length() - 1;
        int j = y.length() - 1;

        while((i >= 0) && (j >= 0)){
            if(s1[i] == s2[j]){//字符串从后开始遍历，如若相等，则存入栈中
                stack.push(s1[i]);
                i--;
                j--;
            }else{
                if(array[i+1][j] > array[i][j+1]){//如果字符串的字符不同，则在数组中找相同的字符，注意：数组的行列要比字符串中字符的个数大1，因此i和j要各加1
                    j--;
                }else{
                    i--;
                }
            }
        }

        while(!stack.isEmpty()){//打印输出栈正好是正向输出最大的公共子序列
            System.out.print(stack.pop());
        }
    }

    /**
     * 最长公共子序列，不要求连续的字符串。
     * @param one 第一个参数
     * @param two 第二个参数
     */
    private void getLC2S(String one, String two){
        char[] s1 = one.toCharArray();
        char[] s2 = two.toCharArray();




        Stack stack = new Stack();
        int i = one.length() - 1;
        int j = two.length() - 1;


    }

    private static int max(int a , int b){
        return (a > b)? a: b;
    }

    private String getLongestCommonSubString(String one, String two) {
        if (one == null || two == null) {
            return "";
        }
        char[] str1 = one.toCharArray();
        char[] str2 = two.toCharArray();
        int size1 = str1.length;
        int size2 = str2.length;
        int longest = 0;
        int start1 = 0;
        int start2 = 0;
        for (int i = 0; i < size1; i++) {
            int m = i;
            int n = 0;
            int length = 0;
            while (m < size1 && n < size2) {
                if (str1[m] != str2[n]) {
                    length = 0;
                } else {
                    length++;
                    if (longest < length) {
                        longest = length;
                        start1 = m - longest + 1;
                        start2 = n - longest + 1;
                    }
                }
                ++m;
                ++n;
            }
        }

        for (int i = 0; i < size2; i++) {
            int m = 0;
            int n = i;
            int length = 0;
            while (m < size1 && n < size2) {
                if (str1[m] != str2[n]) {
                    length = 0;
                } else {
                    length++;
                    if (longest < length) {
                        longest = length;
                        start1 = m - longest + 1;
                        start2 = n - longest + 1;
                    }
                }
                ++m;
                ++n;
            }
        }
        System.out.println("start1 = " + start1 + " -- longest= " + longest);

        return one.substring(start1, start1 + longest);
    }
}