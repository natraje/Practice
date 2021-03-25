package com.nat.string;

import com.nat.util.PrintHelper;

public class ReverseSubString {

    public static void main(String[] a){
        String s="123abc123def123ggg";
        int k=2;
        //skip 2 chars
        PrintHelper.print(reverseSubStr(s,k,2));

    }

    public static String reverseSubStr(String s, int k, int skiplength){
        int l=s.length();
        char[] c=s.toCharArray();
        int nk=l/3;
        int sl=skiplength*k;
        int count=0;
        int noSkips=0;
        while(count<nk){
            int lb=(count+noSkips)*k;
            int ub=lb+k;
            while(lb<ub){
                char t=c[lb];
                c[lb]=c[ub];
                c[ub]=t;
                lb++;
                ub--;
            }
            count++;
            noSkips++;
        }
        return String.valueOf(c);
    }
}
