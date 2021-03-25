package com.nat.sorting;

import com.nat.util.PrintHelper;

public class MergeSort2 {

    public static void main(String[] s){
        int arr[]={ 11, 12, 58, 1, 78, 40, 76 };
        MergeSort2 ms=new MergeSort2();
        PrintHelper.prints(ms.mergesort(arr,0,arr.length-1));
    }

    public int mergesort(int[] arr,int l, int h){
        int count=0;
        if(l<h) {
            int m=l+(h-l)/2;
            count +=mergesort(arr,l,m);
            count +=mergesort(arr,m+1,h);
            count +=merge(arr,l,m,h);
        }
        return count;

    }

    public int merge(int[] arr,int l, int m, int h){
        int i=l, j=m+1, d=0, k=0;

        int at[] =new int[h-l+1];
        while(i<=m && j<=h){
            if(arr[i]>=arr[j]){
                at[k++]=arr[j++];
            } else {
                at[k++]=arr[i++];
                d+=m-i+1;
            }

        }
        while(i<=m)
            at[k++]=arr[i++];
        while(j<=h)
            at[k++]=arr[j++];

        int p=0,q=l;
        while(p<at.length){
            arr[l++]=at[p++];
        }
        return d;
    }
}
