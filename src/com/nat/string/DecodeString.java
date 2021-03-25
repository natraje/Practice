package com.nat.string;
import java.util.*;
import java.lang.*;
import java.io.*;

public class DecodeString {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc1=new Scanner(System.in);
        String s=sc1.nextLine();
        char[] sc=s.toCharArray();
        int l=s.length();
        for(int i=l-2;i>0;i--){
            if(sc[i]=='z' && (sc[i-1]=='a' || sc[i-1]=='e' || sc[i-1]=='i'||sc[i-1]=='o'||sc[i-1]=='u') &&
                    (sc[i+1]=='a' || sc[i+1]=='e' || sc[i+1]=='i'||sc[i+1]=='o'||sc[i+1]=='u')){
                int j=i;
                while(j<(l-1)){
                    if((j+2)<l){
                        sc[j]=sc[j+2];
                        sc[j+2]='\0';
                    } else{
                        sc[j]='\0';
                    }
                    sc[j+1]='\0';
                    j++;
                }

            }
        }
        System.out.println(String.valueOf(sc));
    }
}
