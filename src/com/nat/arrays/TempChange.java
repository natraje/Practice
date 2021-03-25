package com.nat.arrays;

public class TempChange {

    public static void main(String[] s){
        int[] a={73,74,75,71,69,72,76,73};
        TempChange t=new TempChange();
        t.getDays(a);
    }

    public int[] getDays(int[] a){
        int[] r=new int[a.length];
        int l=a.length;
       for(int i=a.length-2;i>=0;i--){
           int j=i+1;
           while(j<l && a[j]<a[i]){
               j++;
           }
           if(j<l)
               r[i]=j-i;
           else
               r[i]=0;
       }
       return r;
    }
}
