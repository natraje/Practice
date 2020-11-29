package com.nat.string;

public class PalindromePermutation {

    public static boolean isPalindromePerm(String words){
        if(words==null || words.trim().length()==0)
            return true;
        words=words.trim().toLowerCase();
        int len=words.length();
        int[] alphaTracker=new int[26];
        int alphaCounter=0;
        int repeatTracker=0;
        for(int i=0;i<len;i++){
            char c=words.charAt(i);
            if(c>=65 && c<=90){
                int idx=c-'a';
                alphaTracker[idx]++;
                alphaCounter++;
            }
        }
        boolean isEven=false;
        if(alphaCounter%2==0){
            isEven=true;
        }
        boolean singleEntry=false;
        for( int i=0;i<alphaTracker.length;i++){
            if(alphaTracker[i]>0){

            }
        }

        return false;
    }
}
