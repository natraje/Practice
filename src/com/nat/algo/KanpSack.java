package com.nat.algo;

import com.nat.util.PrintHelper;

public class KanpSack {
    public static void main(String[] a){
        int[] w={10,20,30};
        int[] v={60,100,120};
        int k=50;
        KanpSack ks=new KanpSack();
        PrintHelper.print(ks.knapsack(w,v,k,0));

        int ar[]={3,5,2,6,8,11,7,9,15};
        PrintHelper.print(ks.knapsacklimit(w,v,k));
    }

    public int knapsack(int[] w, int[] v, int K, int idx){
        if(idx==v.length) return 0;
        if(K-w[idx]<0) return knapsack(w,v,K,idx+1);
        return Math.max(knapsack(w,v,(K-w[idx]),idx+1)+v[idx],knapsack(w,v,K,idx+1));
    }


    public int knapsacklimit(int[] w, int[] v, int K){
        int[][] TD=new int[w.length][w.length];
        int[][] WD=new int[w.length][w.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<w.length;i++){
            int temp=v[i];
            int wtemp=w[i];
            TD[i][i]=temp;
            WD[i][i]=wtemp;
            if(temp>max)
                max=temp;
            for(int j=i+1;j<w.length;j++){
                temp+=v[j];
                wtemp+=w[j];
                TD[i][j]=temp;
                if(wtemp==K && temp>max)
                    max=temp;
            }

        }
        return max;
    }

    public int countSum(int[] ar, int T,int i,int L){
        if(L==i) return 0;
        if(T-ar[i]<0) return countSum(ar,T,i+1,L);
        return 0;
    }
}
