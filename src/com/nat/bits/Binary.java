package com.nat.bits;

import com.nat.util.PrintHelper;

public class Binary {

    public static void main(String[] a){
        bin(-12);
        PrintHelper.print("\n");
        rev("boom");
    }

    public static void bin(int x){
        if(x>1)
            bin(x/2);
        PrintHelper.prints(x%2);
    }

    public static void rev(String s){
        if(s.length()>1)
            rev(s.substring(1));
        System.out.print(s.charAt(0));
    }
}
