package com.nat.algo;

import com.nat.util.PrintHelper;

public class Factorial {

    public static int fact(int n){
        if (n<=1){
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] a){
        PrintHelper.print(fact(7));
    }
}
