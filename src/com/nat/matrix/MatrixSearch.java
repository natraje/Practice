package com.nat.matrix;

public class MatrixSearch {

    public static void main(String[] a){
        int[][] arr= {{2,4,5,9},{3,8,11,13},{5,10,20,40},{25,26,28,55}};
        int k=25;
        int n=4;
        int row=0;
        int col=n-1;
        boolean isFound=false;
        while(!isFound && row>=0 && row<n && col>=0 && col<n){
            if(arr[row][col]==k){
                isFound=true;
            } else if (arr[row][col]<k){
                row++;
            } else{
                col--;
            }
        }
        if(isFound)
            System.out.println(row+" "+col);
        else
            System.out.println("Not found");

    }
}
