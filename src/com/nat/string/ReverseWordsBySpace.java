package com.nat.string;

import com.nat.util.PrintHelper;
/***********************************************
 * This class has an algorithm to reverse the words inplace by tracking the locations and also changes
 *  iterate (str length-1 to 0) backwards until finding a space and substring from space to end
 *  append the substring after trimming with the already extracted ones
 *  Ex:     This is reverse words test only
 *
 *  Itr 1: only This is reverse words test
 *  Itr 1: only test This is reverse words
 *  ---
 *  ---
 *  Itr l-1: only test words reverse is This
 *
 *  Trick:
 *   - we need to track of the last parsed index and where the iterations are.
 *   - trimming is needed to append the space as needed.
 *
 * Conditions:
 *    - No inbuilt array/util or split method should be used
 *    - substring can be used
 *    - in place replacement
 **********************************************/
public class ReverseWordsBySpace {

    public static void main(String[] a){
        reverseWords("This is reverse words test only");
    }
    public static String reverseWords(String str){
        if(str==null || str.trim().length()==0){
            return null;
        }
        str=str.trim();
        int len=str.length();
        String temp1=" ";
        int ptr=0;
        int j=0;
        for(int i=len-1;i>=0;i--){
            j++;
            if(str.charAt(ptr+i)==' '){
               // str=str.substring(0,ptr)+str.substring(ptr+i).trim()+temp1+str.substring(ptr,ptr+i);
                str=str.substring(0,ptr)+str.substring(ptr+i).trim()+temp1+str.substring(ptr,ptr+i);
                ptr=j;
            }

        }
        PrintHelper.print(str);
        return str;
    }
}
