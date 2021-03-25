package com.nat.arrays;

import com.nat.util.PrintHelper;

public class ArrayInversionUsingMerge {


    public static void main (String[] args) throws java.lang.Exception
    {
        int a[]= {8,4,2,3,6, 1};
        ArrayInversionUsingMerge c=new ArrayInversionUsingMerge();
        PrintHelper.print(c.mergesort(a,0,a.length-1));
    }
    public int mergesort(int[] a, int l, int h){
        int d=0;
        if(l<h){
            int m=l+(h-l)/2;
            d+=mergesort(a,l,m);
            d+=mergesort(a,m+1,h);
            d+=merge(a,l,m,h);
        }
        return d;
    }
    public int merge(int[] a, int l, int m, int h){
        int i=l,j=m+1, k=0, d=0;
        int[] t=new int[h-l+1];
        while(i<=m && j<=h){
            if(a[i]<=a[j]){
                t[k++]=a[i++];
            } else{
                d+=m-i+1;
                t[k++]=a[j++];
            }
        }

        while(i<=m)
            t[k++]=a[i++];
        while(j<=h)
            t[k++]=a[j++];

        int p=l;
        for(i=0;i<t.length;i++){
            a[p++]=t[i];
        }
        return d;
    }
}
