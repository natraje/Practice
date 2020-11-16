package com.nat.algo;

import com.nat.util.PrintHelper;

public class FibSeries {

    public static int fib(int n){

        if(n<0) {

            return 0;
        }else if(n==1){

            return 1;
        }
       // PrintHelper.print(n);
        return fib(n-1)+fib(n-2);
    }

    // The below method caches the precalcualted values to avoid calculating it again
    public static int fib(int n, int[] cache){

        if(n<0) {
            return 0;
        }else if(n==1){
            return 1;
        } else if(cache[n]>0){
            return cache[n];
        }
        cache[n]=fib(n-1)+fib(n-2);
        return cache[n];
    }
    public static void main(String[] a){
        int n=7;
        int[] cache=new int[n+1];
        PrintHelper.print(fib(n));
        PrintHelper.print(fib(n,cache));
    }
}
