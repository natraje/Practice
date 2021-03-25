package com.nat.string;

import com.nat.util.PrintHelper;

public class Lapindrome {

    public static void main(String[] a){
        PrintHelper.print(isLapindrome("abccab"));
        PrintHelper.print(isLapindrome("abcacba"));
        PrintHelper.print(isLapindrome("rotor"));
        PrintHelper.print(isLapindrome("abccab"));
        PrintHelper.print(isLapindrome("abbaab"));
    }


    public static boolean isLapindrome(String s){
        boolean isLap=true;
        // Find mid and split
        int m=s.length()/2; //6 ->3 7 ->3
        int[] ar=new int[26];
        //abccab -> first 0--2 0,1,2  rootr
        for(int i=0,j=m-1;i<=j;i++,j--){
            char c1=s.charAt(i);
            ar[c1-'a']++;
            if(i<j) {
                char c2 = s.charAt(j);
                ar[c2 - 'a']++;
            }
        }
        if(s.length()%2!=0){
            m=m+1;
        }
        for(int i=m,j=s.length()-1;i<=j;i++,j--){
            char c1=s.charAt(i);
            if(ar[c1-'a']>0){
                ar[c1-'a']--;
            } else{
                isLap=false;
                break;
            }
            if(i<j) {
                char c2 = s.charAt(j);
                if(ar[c2-'a']>0){
                    ar[c2-'a']--;
                } else{
                    isLap=false;
                    break;
                }
            }
        }

        return isLap;
    }
}
