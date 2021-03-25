package com.nat.arrays;

import com.nat.util.PrintHelper;

public class MaxDiffValue {

    public static void main(String[] s) {
        int a[] = {6, 6, 2, 3, 1, 4, 1, 5, 6, 2, 8, 7, 4, 2, 1, 3, 4, 5, 9, 6};
        int b[] = {1, 2, 3, 1};
        PrintHelper.print(maxValue(b,b.length));
    }

    static int maxValue(int[] a, int N) {
        // code here

        int max=0, t=0,j=1;
        for(int i=0;i<N-1;i++){
            int s=Math.abs(a[i]-a[j])+Math.abs(i-j);
            if(max<s){
                max=s;
            } else{
                int k=j;
                while(k<N && (Math.abs(a[i]-a[k])+Math.abs(i-k))>max){
                    max=Math.abs(a[i]-a[j])+Math.abs(i-j);
                    k++;
                }
            }
            j++;
        }
        return max;
    }
}
