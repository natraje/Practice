package com.nat.string;

import com.nat.util.PrintHelper;

/***********************************************
 * This class has an algorithm to find given string s2 is substring of s1
 * **********************************************/
public class PermutationOfOther {

    public static void main(String[] s){
        boolean isPerm=isPermutationOfOther("testing 123","ig1");
        PrintHelper.print(isPerm);
        PrintHelper.print(isPermutationOfOther("testing 123","ig14"));
    }

    public static boolean isPermutationOfOther(String s1,String s2){
        if(s1==null|| s1.length()==0 || s2==null || s2.length()==0){
            return false;
        }
        if(s1.equals(s2)){
            return true;
        }
        boolean[] charPresent=new boolean[128];
        for(int i=0; i<s1.length();i++){
            char c=s1.charAt(i);
            charPresent[c]=true;
        }
        for(int i=0; i<s2.length();i++){
            char c=s2.charAt(i);
            if(!charPresent[c]){
                return false;
            }
        }
        return true;
    }
}
