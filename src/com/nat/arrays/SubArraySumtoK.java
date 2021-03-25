package com.nat.arrays;
import com.nat.util.PrintHelper;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class SubArraySumtoK {

    public static void main(String[] a){
        int[] arr={1,3,4};
        int k=2;
        PrintHelper.print(getSubArrayCount(arr,k));
        PrintHelper.print(getSubArrayCount(new int[]{4, 5, 0, -2, -3, 1},5));
        PrintHelper.print(subArrayRemoveDiveideByK(new int[]{3,1,4,2},7));
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);
        list.stream().map(number->number*3).forEach(System.out::println);
        boolean[] memo=new boolean[arr.length];
        PrintHelper.print(canSubArrayToTargetDP(arr,k,memo));
        Map<Integer,List<Integer>> maps=new HashMap<>();
        List<Integer> lt=   howSum(new int[]{7,14},300,maps);
        if(lt!=null){
            PrintHelper.print((lt.toString()));
        }

        List<Integer> lt1=   bestSum(new int[]{7,14},300);
        if(lt!=null){
            PrintHelper.print((lt.toString()));
        }
    }
    //Cansum DP Problem
    public static boolean canSubArrayToTargetDP(int[] arr,int target,boolean[] memo){

        if(target==0) return true;
        if(target<0) return false;
        if(memo[target]) return true;
        for(int i:arr){

            if(canSubArrayToTargetDP(arr,target-i,memo)==true){
                memo[target]=true;
                return true;
            }
        }
        memo[target]=false;
        return false;

    }

    // HowSum Problem
    public static List<Integer> howSum(int[] arr,int targetSum,Map<Integer,List<Integer>> maps){
        if(maps.containsKey(targetSum)) return maps.get(targetSum);
        if(targetSum==0) return new ArrayList<>();
        if(targetSum<0) return null;

        for(int a:arr){
            List<Integer> lt=howSum(arr,targetSum-a,maps);
            if(lt!=null){
                lt.add(a);
                maps.put(targetSum,lt);
                return lt;
            };
        }
        maps.put(targetSum,null);
        return null;
    }
    //Input: 7,[5,3,4,7]
    public static List<Integer> bestSum(int[] arr,int targetSum){
        if(targetSum==0) return new ArrayList<>();
        if(targetSum<0) return null;
        List<Integer> slt=null;
        for(int i:arr){
            int r=targetSum-1;
            List<Integer> lt=bestSum(arr,r);
            if(lt!=null){
                lt.add(i);
                if(slt==null || lt.size()<slt.size())
                    slt=lt;
            }
        }
        return slt;

    }

    public static int getSubArrayCount(int[] arr,int k){
        int sum=0, ans=0;
        Map<Integer,Integer> record=new HashMap<>();
        record.put(0,1);
        for(int i:arr){
            sum+=i;
            ans+=record.get(sum-k)==null?0:record.get(sum-k);
            int val=record.get(sum)==null?0:record.get(sum);
            record.put(sum,++val);
        }
        return ans;
    }

    public static int subArrayDiveideByK(int[] arr, int k){
        int sum=0,ans=0,rem=0;
        Map<Integer,Integer> record=new HashMap<>();
        record.put(0,1);
        for(int i:arr){
            rem=i%k;
            sum+=rem;
            if(rem<0)rem=k-rem;
            ans+=record.get(rem)==null?0:record.get(rem);
            int val=record.get(rem)==null?0:record.get(rem);
            record.put(rem,++val);
        }
        return ans;
    }

    //Find length of smallest subarray that need to be removed so that the remaining array divisible by k
    public static int subArrayRemoveDiveideByK(int[] arr, int k){
        int min=arr.length, sum=0,target=0;
        Map<Integer,Integer> tracker=new HashMap<>();
        tracker.put(0,-1);
        for(int i:arr)
            target=(target+i)%k;
        for(int i=0;i<arr.length;i++){
            sum=(sum+arr[i])%k;
            tracker.put(sum,i);
            Integer j=tracker.get((sum-target+k)%k);
            if(j!=null){
                if((i-j)<min)
                    min=i-j;
            }
        }
        return min!=arr.length? min:-1;
    }
}
