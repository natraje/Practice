package com.nat.string;

import com.nat.util.PrintHelper;
import com.nat.util.StringHelper;

public class ReverseString {

    public static String reverse(String str){
        if(str==null || str.trim().length()==0){
            return null;
        }
        for(int i=0,j=str.length()-1;i<=j;i++,j--){
            str= StringHelper.swapChar(str,i,j);
        }
        return str;
    }

    public static void main(String[] a){
        PrintHelper.print(reverse("gear"));
    }
}
