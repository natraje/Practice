package com.nat.string;

import com.nat.util.PrintHelper;

public class UniqueChar {

    public static void main(String[] s){
        boolean isUnique=isUniqueChars("T esting ");
        PrintHelper.print(isUnique);
    }
    public static boolean isUniqueChars(String str){
        if(str==null || str.length()==0)
            return false;
       // str=str.toLowerCase();
        int len=str.length();
        boolean[] uniqueArr=new boolean[128];
        for(int i=0;i<len;i++){
            char c=str.charAt(i);

            if(uniqueArr[c]){
                return false;
            } else{
                uniqueArr[c]=true;
            }
        }
        return true;
    }
}
