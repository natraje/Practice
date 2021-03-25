package com.nat.string;

import com.nat.util.PrintHelper;

public class RotateString {

    public static boolean isRotateMatch(String s1, String s2,int count){
        if(count==s1.length())
            return false;
        if(s1.equals(s2))
            return true;
        char c=s1.charAt(0);
        s1=s1.substring(1)+c;
        count++;
        return isRotateMatch(s1,s2,count);
    }

    public static void main(String[] a){
        PrintHelper.print(isRotateMatch("waterbottle","bottlewater",0));
    }
}
