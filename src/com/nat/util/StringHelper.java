package com.nat.util;

public class StringHelper {

    public static String substringAndSwap(String str, int first, int second)
    {
        return str.substring(0,first)+str.substring(second);

    }

    public static String swapChar(String str, int first, int second)
    {
        char c1=str.charAt(first);
        char charArr[]=str.toCharArray();
        charArr[first]=charArr[second];
        charArr[second]=c1;
        return new String(charArr);
    }


    public static void main(String[] a){
        System.out.println(swapChar("gear",0,2));
    }

}
