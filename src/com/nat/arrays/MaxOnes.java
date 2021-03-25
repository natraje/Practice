package com.nat.arrays;

import com.nat.util.PrintHelper;

public class MaxOnes {
    public static void main(String[] s){
        MaxOnes m=new MaxOnes();
        int a[]={0,1,1,1,1,0,0,1,1,0,1,0,1,1,0,0,0,0,0,1,0,1,1,0,0,0,1,1,1,1,0,0,0,1,1,1,0,1,0,1,1,1,1,0,1,0,0,1,0,1,0,1,0,0,1,0,0,0,1,1,1,0,1,0,1,0,1,1,1,0,1,0,1,0,1,0,0,1,0,1,0,0,0,0};
        PrintHelper.print(m.findZeroes(a,a.length,60));
        int a1[]={1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1};
        PrintHelper.print(m.findZeroes(a1,a1.length,2));
    }
    int findZeroes(int arr[], int n, int m) {
        // code here
        int prevsum=0,prevones=0,currOnes=0,curr=0,zeros=m,zc=0;
        //{1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1}
        for(int i=0;i<n;i++)if(arr[i]==0) zc++;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                if(zeros==0){
                    if(prevsum<curr){prevsum=curr;curr=0; }
                    zeros=m-1;
                    curr=currOnes+1;
                } else{
                    zeros--;
                    curr++;
                    //currOnes=0;
                }
                prevones=currOnes;
                currOnes=0;
            } else{
                curr++;
                currOnes++;
            }
        }

        return (prevsum>curr)? prevsum:curr;
    }
}
