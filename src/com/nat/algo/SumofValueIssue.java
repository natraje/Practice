package com.nat.algo;

import com.nat.util.PrintHelper;

public class SumofValueIssue {

    public static void main(String[] s){
        int x=46;
        SumofValueIssue sum=new SumofValueIssue();
        PrintHelper.prints(sum.getValue(x));
    }

    public int getValue(int x){
        int l=0, h=x-1;
        int val=0;
        while(l<=h) {
            int m = l + (h - l) / 2;
            long s = m*(m+1)/2;
            if(s>=x){
                val=m;
                h=m-1;
            } else{
                l=m+1;
            }
        }

        return val;
    }
}
