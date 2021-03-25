package com.nat.dp;

import com.nat.util.PrintHelper;

public class DiiferentWays {

    public static void main(String[] s){
        int n=5;
        DiiferentWays d=new DiiferentWays();
        int[] m=new int[n+1];
        PrintHelper.print(d.calcJump(n,m));

    }

    private int calcJump(int n,int[] m){
        if(n<0)
            return 0;
        else if(n== 0)
            return 1;
        if(m[n]==0)
            m[n]=calcJump(n-1,m)+calcJump(n-2,m)+calcJump(n-3,m);
        return m[n];
    }
}
