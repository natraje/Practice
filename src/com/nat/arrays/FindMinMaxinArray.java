package com.nat.arrays;

import com.nat.util.PrintHelper;
 /***********************************************
  * This class has an algorithm to find a min value and max value with O(n/2) using forward and reverse iterations with
  * Check two indexes at time and store the min of it in a temp  index, then compare the temp min to the actual min value
  * Add a swap min and max logic without the temp variable
  **********************************************/
public class FindMinMaxinArray {

    public static void main(String[] a){
        int[] arr={1,4,10,5,23,55,10,34};
       // findMinMax(arr,false);
        findMinMax(arr,true);
    }
    public static void findMinMax(int[] arr, boolean swapMinMax){
        if(arr==null || arr.length==0){
            return;
        }
        int min = 0,max=0,tmin=0,tmax=0;
        int counter=0;
        for(int i=0,j=arr.length-1;i<=j;i++,j--){

            //Check for min in two locations store it in tmin and compare with min value
            if(arr[i]>arr[j])
                tmin=j;
            else
                tmin=i;
            if(arr[min]>arr[tmin])
                min=tmin;

            if(arr[i]<arr[j])
                tmax=j;
            else
                tmax=i;
            if(arr[tmax]>arr[max])
                max=tmax;
            counter++;
        }
        PrintHelper.print(arr.length);
        PrintHelper.print(counter);
        PrintHelper.print(min);
        PrintHelper.print(arr[min]);
        PrintHelper.print(max);
        PrintHelper.print(arr[max]);
        arr[max]=arr[max]+arr[min];
        arr[min]=arr[max]-arr[min];
        arr[max]=arr[max]-arr[min];
        PrintHelper.print("After swap");
        PrintHelper.print(arr[min]);
        PrintHelper.print(arr[max]);
    }
}
