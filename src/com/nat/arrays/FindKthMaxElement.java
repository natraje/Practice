package com.nat.arrays;

import com.nat.util.PrintHelper;
import java.util.*;

public class FindKthMaxElement {

    public static void main(String[] a){
        int[] arr={1,4,10,5,23,55,10,34};
        PrintHelper.print(getKthMax(arr,3));
        PrintHelper.print(getKthMin(arr,3));
    }

    public static int getKthMax(int[] a, int k){
        Queue<Integer> pq=new PriorityQueue<>(k);
        for(int i=0;i<a.length;i++){
            if(i<k)
                pq.add(a[i]);
            else if(pq.peek()<a[i]){
                pq.poll();
                pq.add(a[i]);
            }

        }
        return pq.poll();
    }
    public static int getKthMin(int[] a, int k){
        Queue<Integer> pq=new PriorityQueue<>(k);
        for(int i=0;i<a.length;i++){
            if(i<k)
                pq.add(-a[i]);
            else if(-pq.peek()>a[i]){
                pq.poll();
                pq.add(-a[i]);
            }

        }
        return -pq.poll();
    }
}
