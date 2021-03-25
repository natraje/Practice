package com.nat.string;

import com.nat.util.PrintHelper;

public class PalindromeCheck {

    public static void main(String[] s){
        String s1="A man, a plan, a canal: Panama";
        String s2="race a car";
        int[] a=getCount(s1);
        PrintHelper.print(isPalindrome(a));
        PrintHelper.print(isPalindrome(getCount(s2)));
    }

    public static boolean isPalindrome(int[] counts){
        int i=0, j=counts.length-1;
        boolean isOddFound=false;
        while(i<j){
            if(counts[i]%2!=0 || counts[j]%2!=0){
                if(isOddFound){
                    return false;
                }
                isOddFound=true;
            }
            i++;
            j--;

        }
        return true;
    }

    public static int[] getCount(String s){
        int[] counts=new int[128];
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i);
            if((c>=97 && c<123) || c==32)
                counts[s.charAt(i)]++;
        }
        return counts;
    }
}
