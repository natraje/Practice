package com.nat.string;

import com.nat.util.StringHelper;

import java.util.*;

public class PermutationChecker {

    public  static void main(String[] a){
        calcPerm("geek"," ");
        //printDistinctPermutn("geek","");
    }
    public static void calcPerm(String str, String answer){

        if(str==null || str.trim().length()==0){
            System.out.print(answer);
            return;
        }
        int len=str.length();
        boolean[] charArr=new boolean[26];
        for (int i=0;i<len;i++)
        {
            char c=str.charAt(i);
            int val=c-'a';
            String newStr=str.substring(0,i)+str.substring(i+1);
            if(charArr[val]==false){
                calcPerm(newStr,answer+c);
            }
            charArr[val]=true;
        }

    }

    public static void printPerm(String str, int index,boolean[] charArr,Set<String> values){

        char c=str.charAt(index);
        int cidx=c-'a';
        index=index+1;
        if(index==str.length()){
            return;
        }
       if(!charArr[cidx]){
           printPerm(str,index,charArr,values);
       }
       str= StringHelper.substringAndSwap(str,index,index+1);
       values.add(str);
       charArr[cidx]=true;
       System.out.println(str);
    }

    public static void printDistinctPermutn(String str,String ans)
    {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        boolean alpha[] = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) +
                    str.substring(i + 1);
            if (alpha[ch - 'a'] == false)
                printDistinctPermutn(ros, ans + ch);
            alpha[ch - 'a'] = true;
        }
    }

}
