package com.nat.arrays;
import java.util.*;
import java.lang.*;
import java.io.*;
public class ArrayRearrange {
        public static void main (String[] args) throws java.lang.Exception
        {
                int n=2;
                int a[]= {3,2};
                int b[]={3,2};
                Arrays.sort(b);
                int even=a.length/2;
                int odd=n-even;
                int orgIdx=0;
                int i=even;
                for(orgIdx=0;orgIdx<n;orgIdx+=2){
                    a[orgIdx]=b[i];
                    i--;

                }
                orgIdx=1;
                i=odd-1;
                for(orgIdx=1;orgIdx<n;orgIdx+=2){
                    a[orgIdx]=b[i];
                    i--;
                }

                for(i=0;i<n;i++){
                    System.out.println(a[i]);
                }


        }


}
