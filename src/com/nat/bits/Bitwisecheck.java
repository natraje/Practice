package com.nat.bits;

import com.nat.util.PrintHelper;

public class Bitwisecheck {

    public static void main(String[] a){
        int x=3;
        String s[] = { "negative", "zero", "positive" };
        PrintHelper.print(s[check(x)]);

    }

    public static int check(int d){
        //for(i)
        return (1 + (d >> 31) - (-d >> 31));

    }
}
