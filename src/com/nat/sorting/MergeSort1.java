package com.nat.sorting;

import com.nat.util.PrintHelper;

public class MergeSort1 {

    public static void main(String[] s){
        int[] a={80,40,20,50,10,80,5,2};
        int d=0;
        d=mergeSort(a,0,a.length-1);
        for(int i:a)
            PrintHelper.print(i);

        PrintHelper.print("Inversion count is "+d);
    }

   public static int mergeSort(int[] a, int l, int h){
        int d=0,p=0,q=0;
       if(l<h) {
           int m=l+(h-l)/2;
           d+=mergeSort(a,l,m);
           d+=mergeSort(a,m+1,h);
           d+=merge(a,l,m,h);
       }
       return d;
   }

   public static int merge(int a[],int l, int m, int h){
       int i=l, j=m+1,k=0, d=0;
       int[] at=new int[h-l+1];
       while(i<=m && j<=h){
           if(a[j]>=a[i]){
               at[k++]=a[i++];

           } else{
               at[k++]=a[j++];
               d+=m-i+1;

           }
       }
       while(i<=m){
           at[k++]=a[i++];
       }
       while(j<=h){
           at[k++]=a[j++];
       }
       int p=l,q=0;
       while(q<at.length){
           a[p++]=at[q++];
       }
       return d;
   }
}
