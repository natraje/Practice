package com.nat.rec;

import com.nat.util.PrintHelper;

import java.util.Arrays;

public class ClaimbStairs {

    public static void main(String[] s){
        ClaimbStairs cs=new ClaimbStairs();
        int n=2;
        int[] memo=new int[n+1];
        Arrays.fill(memo,-1);
        PrintHelper.print(cs.countOptions(n,memo));
    }

    // Child can climb 1 step or 2 step or 3 step, calculate the different possiblites

    public int countOptions(int n, int memo[]){
        if(n<0)
            return 0;
        if(n==0) return 1;
        if(memo[n]>-1)
                return memo[n];
        else
            memo[n]=countOptions(n-1,memo)+countOptions(n-2,memo)+countOptions(n-3,memo);
        return memo[n];
    }
}
