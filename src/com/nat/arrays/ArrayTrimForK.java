package com.nat.arrays;

public class ArrayTrimForK {

    public static void main(String[] s){
        int k=60;
        int[] a={30,65,100,55,75,70};
        int maxval=-a[0];
        for(int i=1;i<a.length;i++)
            if(maxval<a[i])
                maxval=a[i];
            int i=cutTree(a,maxval,0,k,-1);
            System.out.println(i);
    }

    public static int cutTree(int a[],int max,int min,int k, int prev){

        int m=(max+min)/2;
        int pivot=0;
        for(int i=0,j=a.length-1;i<j;i++,j--){
            if(m<a[i])
                pivot+=a[i]-m;
            if(m<a[j])
                pivot+=a[i]-m;
        }
        if(prev>=k && prev>=pivot)
            return prev;
        else
            prev=pivot;
        if(pivot>k){
            return cutTree(a,max,m,k,prev);
        } else if(pivot<k){
            return cutTree(a,max,m,k,prev);
        } else{
            return pivot;
        }

        //return pivot;

    }
}
