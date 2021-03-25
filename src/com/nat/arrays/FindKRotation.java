package com.nat.arrays;

import com.nat.util.PrintHelper;

public class FindKRotation {

    public static void main(String[] s){
        int[] a={5,4,1,2,3};
        FindKRotation rot=new FindKRotation();
        PrintHelper.print(rot.findKRotation(a,a.length));
        int[] a1={5,4,3,2,1};
        PrintHelper.print(rot.findKRotation(a1,a1.length));
    }

    public int findKRotation(int arr[], int n) {
        int s=0, e=n-1;
        while(s<=e){
            if(arr[s]<=arr[e])
                return s;
            if(s==e)
                return s;
            int m=s+(e-s)/2;
            int prevM=(n+m-1) % n;
            int nextM=(m+1) % n;

            if(arr[prevM]==arr[m] || arr[nextM]==arr[m])
                return m;
            if(arr[prevM]>arr[m] )
                return m+1;
            if(arr[nextM]>=arr[m])
                return m-1;
            if(arr[s]<=arr[m])
                s=m+1;
            if(arr[e]>=arr[m])
                e=m-1;
        }
        return 0;
    }
}
