package com.nat.rec;

import com.nat.util.PrintHelper;

public class BSMagicIndex {

    public static void main(String[] s){
        int[] a={-40,-20,-1,1,2,3,4,8,9,12,13};
        BSMagicIndex bs=new BSMagicIndex();
        PrintHelper.print(bs.bsearch(a,0,a.length-1));
    }

    public int bsearch(int[] a, int l, int h){
        if(h<l) return -1;
        int m=(h+l)/2;
        if(a[m]==m) return m;
        if(a[m]>m) return bsearch(a,l,m-1);
        else return bsearch(a,m+1,h);
    }
}
