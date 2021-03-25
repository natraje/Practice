package com.nat.string;

import com.nat.util.PrintHelper;

public class OneCharAwayFiner {

    public static void main(String[] a){
        PrintHelper.print(isOneCharAway("PALE","PAL"));
        PrintHelper.print(isOneCharAway("PALE","ALE"));
        PrintHelper.print(isOneCharAway("PALE","BALE"));
        PrintHelper.print(isOneCharAway("PALE","BGPAL"));
        PrintHelper.print(isOneCharAway("PALE","AL"));
        PrintHelper.print(isOneCharAway("PALE","PALE"));
        PrintHelper.print(isOneCharAway("PALE","PAE"));
        PrintHelper.print(isOneCharAway("PALE","PABE"));

    }

    public static boolean isOneCharAway(String s1,String s2){
        if(s1==null || s2==null || s1.length()==0 || s2.length()==0 || s1.length()<s2.length() || (s1.length()-s2.length())>1)
            return false;
        s1=s1.trim();
        s2=s2.trim();
        boolean isSamlength=(s1.length()==s2.length());
        boolean isAwayFind=false;
        int iteLen=s1.length()-1;
        int s2Len=s2.length();
        int s2Ptr=0;
        // PALE ALE
        for(int i=0;i<=iteLen;){
                if(s2Ptr==s2Len)
                    break;

                if (s1.charAt(i) == s2.charAt(s2Ptr)) {
                    s2Ptr = s2Ptr + 1;
                    i++;
                } else if (s1.charAt(i + 1) == s2.charAt(s2Ptr)) {
                    if (isAwayFind) {
                        return false;
                    } else {
                        isAwayFind = true;
                        s2Ptr = s2Ptr + 1;
                        i=i+2;
                    }
                } else {
                    if (!isAwayFind) {
                        isAwayFind = true;
                        s2Ptr = s2Ptr + 1;
                        i++;
                    } else {
                        return false;
                    }
                }
        }

        return true;

    }
}