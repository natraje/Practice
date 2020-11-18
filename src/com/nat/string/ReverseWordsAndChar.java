package com.nat.string;

import com.nat.util.PrintHelper;
import com.nat.util.StringHelper;
/***********************************************
 * This class has an algorithm to reverse the words inplace and reverse characters in each word by tracking the locations and also changes
 *  iterate (str length-1 to 0) backwards until finding a space and substring from space to end
 *  append the substring after trimming with the already extracted ones
 *  For the first word, there will be reverse from the loop and that has to be done outside of the loop.
 *  Ex:     This is reverse words test only
 *
 *  Itr 1: only This is reverse words test (reverse only)
 *  Itr 1: only test This is reverse words (reverse test)
 *  ---
 *  ---
 *  Itr l-1: only test words reverse is This (reverse This)
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
public class ReverseWordsAndChar {

    public static String reverseAll(String str)
    {
        if(str==null || str.trim().length()==0){
            return null;
        }

        str=str.trim();
        int len=str.length();
        int tracker=0;
        int ptr=0;
        for(int i=len-1;i>0;i--){
            tracker++;
            if(str.charAt(ptr+i)==' '){
                String temp=reverseStr(str.substring(ptr+i).trim());
                str=str.substring(0,ptr)+temp+' '+str.substring(ptr,ptr+i);
                ptr=tracker;
            }
        }
        str=str.substring(0,ptr)+reverseStr(str.substring(ptr));
        PrintHelper.print(str);
        return str;
    }

    public static String reverseAll1(String str) {
        if (str == null || str.trim().length() == 0) {
            return null;
        }

        str = str.trim();
        int len = str.length();
        int ptr=0;
        for(int i=0;i<len;i++){
            if(str.charAt(i-ptr)==' '){
                String temp=reverseStr(str.substring(0,i-ptr));
                str=temp+str.substring(i-ptr);
                ptr=i;
            }

        }
        PrintHelper.print(str);
        return str;

    }


    public static String reverseStr(String str1){
        for(int i=str1.length()-1,j=0;i>=j;i--,j++)
        {
            str1=StringHelper.swapChar(str1,i,j);
        }
        return str1;

    }
    public static void main(String[] a){
        reverseAll("This is reverse words test only");
        reverseAll1("This is reverse words test only");
    }
}
