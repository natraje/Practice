package com.nat.algo;

import com.nat.util.PrintHelper;

public class PrimeNumber {

    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] a){
        PrintHelper.print(isPrime(7));
    }
}
