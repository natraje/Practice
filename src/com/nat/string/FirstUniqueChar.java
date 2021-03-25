package com.nat.string;

import com.nat.util.PrintHelper;

public class FirstUniqueChar {

    public static void main(String[] s){
        String str="nataraj";
        PrintHelper.prints(getFirstUniqueChar(str));
    }

    public static char getFirstUniqueChar(String s){
        int len=s.length();
        int[] count=new int[26];
        for(int i=0;i<len;i++)count[s.charAt(i)-'a']++;
        char c='\0';
        for(int i=0;i<len;i++)
            if(count[s.charAt(i)-'a']==1){
                c=s.charAt(i);
                break;
            }
        return c;
    }
}
