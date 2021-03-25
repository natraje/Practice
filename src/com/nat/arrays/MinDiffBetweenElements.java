package com.nat.arrays;

import com.nat.util.PrintHelper;

import java.util.*;

public class MinDiffBetweenElements {

    public static void main(String[] s){
        int a[]={1,3,3,9,4,6,5};
        int b[]={3,0,3,0,4};
        int cnt=getDiffCount(a,2);
        PrintHelper.print(cnt);
        PrintHelper.print(getSumCount(a,7));

        //int c[]={23,35,46,36,68,37,23,56,33,1,25};
        int c[]={23,35,23,56,25}; // (23,23),(23,25)(23,25)
        PrintHelper.print(getSumCount1(c,50));

        int d[]={23,12,35,16,5};
        getSumIndexes(d,28);
    }

    public static int getDiffCount(int[] a, int pivot){
        Arrays.sort(a);
        int count=0, start=0, next=0, end=a.length-2;
        boolean isSkip=false;
        while(start<end){
                int d=Math.abs(a[start]-a[start+1]);
                if (d<=pivot){
                    count++;
                    start++;
                }
                start++;
            }
        return count;
    }
    public static int getSumCount(int[] a, int pivot){
        Arrays.sort(a);
        int count=0, start=0, next=0, end=a.length-2;
        boolean isSkip=false;
        while(start<end){
            if(isSkip)
                isSkip=false;
            else{
                int d=Math.abs(a[start]+a[start+1+1]);
                if (d==pivot){
                    count++;
                    isSkip=true;
                }
                start++;
            }

        }
        return count;
    }

    public static int getSumCount1(int[] a, int pivot){
        Arrays.sort(a);
        for(int i:a)
            System.out.print(i+" ");
        System.out.println();
        int start=0,end=a.length-1,count=0;
        while(start<end){
            if((a[start]+a[end]>pivot))
                end--;
            else {
                count+=end-start;
                start++;
            }
        }
        return count;
    }

    public static void getSumIndexes(int[] a, int pivot){
        Map<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<a.length;i++)
            map.put(a[i],i);
        Arrays.sort(a);
        int start=0,end=a.length-1;
        while(start<end){
            //[23,12,35,16,5] -> [5,12,16,23,35]
            if((a[start]+a[end]>pivot)){
                end--;
            } if((a[start]+a[end]<pivot)){
                start++;
            } else {
                PrintHelper.prints(map.get(a[start]));
                PrintHelper.prints(map.get(a[end]));
                PrintHelper.print("");
                start++;
                end--;
            }
        }
    }
}
