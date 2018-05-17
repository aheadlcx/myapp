package me.aheadlcx.datasafe;

import android.support.annotation.NonNull;

/**
 * Description:
 * author: aheadlcx
 * Date:2018/3/27 上午11:37
 */

public class Person implements Comparable<String>{
    public String name;

    public Person(int name) {
        this.name = name + "";
    }

    @Override
    public int compareTo(@NonNull String o) {
            return 0;
    }
}
