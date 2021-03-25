package com.nat.dp;

import com.nat.util.PrintHelper;
import java.util.*;

public class String_canConstruct {

    public static void main(String[] a){
        String_canConstruct con=new String_canConstruct();

        PrintHelper.print(con.canConstruct("abcdef",new String[]{"ab","abc","def","cd","abcd"},new HashMap<String, Boolean>()));
        PrintHelper.print(con.countConstuct("abcdef",new String[]{"ab","abc","de","cd","abcd"},new HashMap<String, Integer>()));
    }
    //"abcdef" ["ab","abc","def","cd",""abcd"]
    public boolean canConstruct(String target,String arr[], Map<String,Boolean> memo){
        if(memo.containsKey(target)) return true;
        if(target.length()==0) return true;

        for(String s:arr){
            if(s.length()<=target.length() && target.startsWith(s)){
                String suffix=target.substring(s.length());
                if(canConstruct(suffix,arr,memo))
                    memo.put(target,true);
                    return true;
            }
        }
        memo.put(target,false);
        return false;
    }

    public int countConstuct(String target,String arr[],Map<String,Integer> memo){
        int count=0;
        if(memo.containsKey(target)) return memo.get(target);
        if(target.length()==0) return 1;
        for(String s:arr){
            if(s.length()<=target.length() && target.startsWith(s)){
                String suffix=target.substring(s.length());
                count+=countConstuct(suffix,arr,memo);
            }
        }
        memo.put(target,count);
        return count;
    }
}
