package com.nat.arrays;

public class JumpGame {
    public static void main(String[] s){
        int a[]={3,2,1,1,4};
        int b[]={3,0,3,0,4};
        System.out.println(jumpGame(a));
        System.out.println(jumpGame(b));

    }

    public static boolean jumpGame(int a[]){
        int idx=0;
        int max_reach=0;
        int len=a.length-1;
        while(idx<=len){
            int canreach=idx+a[idx];
            if(canreach>max_reach)
                max_reach=canreach;
            if(max_reach>idx)
                idx++;
            else
                break;
        }
       return idx>=len?true:false;
    }
}
