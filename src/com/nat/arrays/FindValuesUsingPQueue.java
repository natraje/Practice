package com.nat.arrays;

import com.nat.util.PrintHelper;

import java.util.*;

public class FindValuesUsingPQueue {

    public static void main(String[] s){
        int[] a={15, 21, 33, 54,20,71,22,-1,6,12,11,34,45,67,90};  // 1,3 -> 4
        int sum=extractValues(a,5);
        PrintHelper.print(sum);
    }

    public static int extractValues(int[] a,int k){
        int sum=0;
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<a.length;i++){
            if(i<k){
                q.add(a[i]);
            } else{
                if(a[i]<q.peek()){
                    q.poll();
                    q.add(a[i]);
                }
            }
        }
        for(int i:q){
            sum+=i;
        }
        return sum;
    }
}
