package com.nat.matrix;

public class MaxMatrixSum {

    public static void main(String[] s){
        int[][] a={{8,8,1,1},{-2,-1,-100,-1},{-3,0,0,-1},{4,1,1,100}};
        int[][] a1={{1,9,-1,100},{1-1,-100,-1},{-3,0,0,-1},{4,1,1,100}};
        calcualteMax(a,4,4);
    }

    public static int calcualteMax(int a[][],int r, int c){
        int b[][]=new int[r][c];
        int max=-1;
        for(int i=0;i<r;i++){
            b[i][0]=a[i][0];
        }
        int row=0;
        int col=0;
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(b[i-1][j]<(b[i-1][j-1]+a[i-1][j]))
                    b[i-1][j]=b[i-1][j-1]+a[i-1][j];
                if(b[i][j]==0 || b[i][j]<(b[i-1][j-1]+a[i][j])){
                    b[i][j]=(i==(r-1) && j-1==0)?b[i][j-1]+a[i][j]:b[i-1][j-1]+a[i][j];
                }

                if(b[i-1][j]==0 || b[i-1][j]<(b[i][j-1]+a[i-1][j]))
                    b[i-1][j]=b[i][j-1]+a[i-1][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
       return max;
    }
}
