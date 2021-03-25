package com.nat.rec;

import com.nat.util.PrintHelper;

import java.util.Scanner;
import java.util.*;

public class RecurssionTest {
/*
* How recursion works
* n=5
* entering:5
* entering:4
* entering:3
* entering:2
* entering:1
* return 1
* return 3
* return 6
* return 10
* return 15
*
* Finally return 15 to caller
 */
    public static int sum(int n){
        if(n<=0)
            return 0;
        return n+sum(n-1);
    }

    public static int fact(int n){
        if(n<=0)
            return 1;
        return n*fact(n-1);
    }

    public static void anagram(String s,String temp,Set<String> anagrams){
        int l=s.length();
        if(l==0){
            PrintHelper.prints(temp);
            //anagrams.add(temp.trim().split(" "));
        }
        boolean[] a=new boolean[128];
        for(int i=0;i<l;i++){
            char c=s.charAt(i);
            if(!a[c]){
                String r=s.substring(0,i)+s.substring(i+1);
                anagram(r,temp+c,anagrams);
                a[c]=true;
            }

        }
    }

    public static int fib(int n, int[] cache){
        if(n<=0)
            return 0;
        else if(n==1)
            return 1;
        else if(cache[n]>0)
            return cache[n];

        cache[n]= fib(n-1,cache)+fib(n-2,cache);
        //PrintHelper.print(cache[n]);
        return cache[n];

    }
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        String str= s.next();
        int myInt=Integer.parseInt(str);
        s.close();
        PrintHelper.print(sum(myInt));
        PrintHelper.print(fact(myInt));
        Set<String> anagrams=new HashSet<>();
        anagram("cata"," ",anagrams);
        for(String j:anagrams){
            PrintHelper.print(j);
        }
        int cache[] =new int[myInt+1];
        PrintHelper.print(fib(myInt,cache));
    }

}
