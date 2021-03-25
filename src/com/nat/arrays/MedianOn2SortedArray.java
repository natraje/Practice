package com.nat.arrays;

import com.nat.util.PrintHelper;

public class MedianOn2SortedArray {
    public static void main(String[] s){
        int a[]={1,3,8,9,15}, b[]={7,11,18,19,21,25};
        MedianOn2SortedArray obj=new MedianOn2SortedArray();
        float f=0;
        if(a.length<b.length)
            f=obj.findMedian(a,b);
        else
            f=obj.findMedian(b,a);
        PrintHelper.print(String.valueOf(f));
        int c[]={23,26,31,39}, d[]={3,5,7,9,11,16};
        f=obj.findMedian(c,d);
        PrintHelper.print(String.valueOf(f));
    }

    public float findMedian(int[] a, int[] b){
        int tlen=(a.length+b.length);
        int i=0, j=a.length;
        if(j%2==1){
            j=j-1;
        }
        boolean isEven=(tlen%2==0);
        float res=0;
        //a[]={1,3,8,9,15}, b[]={7,11,18,19,21,25}  int c[]={23,26,31,39}, d[]={3,5,7,9,11,16};
        while(i<=j){
            int m=(i+j)/2;
            int n=(tlen+1)/2 -m;
            int al=(m==0)?Integer.MIN_VALUE:a[m-1];
            int ar=(m==a.length)?Integer.MAX_VALUE:a[m];
            int bl=(n==0)?Integer.MIN_VALUE:b[n-1];
            int br=(n==b.length)?Integer.MAX_VALUE:b[n];
            if(al<=br && bl<=ar){
                if(isEven){
                    res=(float)(Math.max(al,bl)+Math.min(ar,br))/2;
                } else {
                    res=Math.max(al,bl);
                }
                break;
            } else if(al>br){
                j=m-1;
            } else if(bl>ar){
                i=m+1;
            }
        }


        return res;
    }
}
