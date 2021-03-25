package com.nat.rec;

import com.nat.util.PrintHelper;

public class MakeChange {

    public static void main(String[] a){
        PrintHelper.print(makeChange(6));
    }

    // Conins : 1,5,10,25
    public static int makeChange(int amt){
        int[] coins={25,10,5,1};
        //coins.
        int num=0;
        for( int c:coins){
            if(amt-c>=0){
                int curMin=makeChange(amt-c);
                if(curMin<num)
                    num=curMin;
            }
        }
        return num+1;
    }
}
