package com.nat.arrays;

import com.nat.util.PrintHelper;

public class ArrayTwiceOnce {

    public static void main(String[] s){
        int a[] ={2,2,4,3,3};
        PrintHelper.print(getUniqueNumber(a));
    }

    public static int getUniqueNumber(int a[]){
        int c=0;
        for(int i=0;i<a.length;i++) c=c^a[i];
        return c;
    }
}
