package com.nat.sorting;

import com.nat.util.PrintHelper;

public class MergeSort {

    public static void main(String[] s){
        int[] a={80,40,20,50,10,80,5,2};
        mergeSort(a,0,a.length-1);
        for(int i:a)
            PrintHelper.print(i);
    }

    public static void mergeSort(int[] a, int l, int h){
        if(l>=h) return;
        int m=(l+h)/2;
        mergeSort(a,l,m);
        mergeSort(a,m+1,h);
        merge(a,l,m,h);

    }
    public static void merge(int[] a, int l,int m,int h){
        int i=l; // pointer for first half
        int j=m+1; //pointer for second half
        int at[]=new int[h-l+1];
        int k=0;
        while(i<=m && j<=h ){
            if(a[i]>=a[j]){
                at[k++]=a[i++];
            } else{
                at[k++]=a[j++];
            }
        }
        while(i<=m){
            at[k++]=a[i++];
        }
        while(j<=h){
            at[k++]=a[j++];
        }

        for(int p=0, q=l;p<at.length;p++,q++){
            a[q]=at[p];
        }
    }

}
