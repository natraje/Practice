package com.nat.matrix;

import com.nat.util.PrintHelper;

public class MatrixProductMax {

    public static void main(String[] s){
        int[][] a={{1,2,3},{4,5,6},{9,8,7}};
        int[][] a1={{1,9,-1,100},{1,-1,-100,-1},{-3,0,0,-1},{4,1,1,100}};
        MatrixProductMax mp=new MatrixProductMax();
        //PrintHelper.print(mp.maxProduct(a));
        PrintHelper.print(mp.maxProduct(a1));
    }

    public int maxProduct(int a[][]){
        int p[][]=new int[a.length][a[0].length];
        int product=1;
        for(int i=0,j=0;i<a.length;i++){
            product*=a[i][j];
            a[i][j]=product;
        }
        product=1;
        for(int i=0,j=0;i<a.length;i++){
            product*=a[j][i];
            a[j][i]=product;
        }
        // 1 2 3
        // 4 5 6
        // 9 8 7
        product=1;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++){
            //product=a[i][i];
            for(int j=1;j<a[0].length;j++){
                if(a[i][j]>0)
                    product=Math.max(a[i][j-1],a[i-1][j]);
                else
                    product=Math.min(a[i][j-1],a[i-1][j]);
                product*=a[i][j];
                a[i][j]=product;
                if(product>max)
                    max=product;
            }
        }
        return max;
    }
}


