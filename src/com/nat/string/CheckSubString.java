package com.nat.string;

import com.nat.util.PrintHelper;

public class CheckSubString {
//  in:geeksforgeeks sub:for out:yes
    public static void main(String[] s1){
        String s="geeksforgeeks", sub="for";
        CheckSubString c=new CheckSubString();
        PrintHelper.print(c.getSubIdx(s,sub));
        PrintHelper.print(c.getSubIdxUsingKMP(s,sub));
    }

    public int getSubIdx(String s,String sub){
        int l=s.length(),l1=sub.length(), i=0;
        char c=sub.charAt(0);
        char e='\0';
        if(l1>1)
            e=sub.charAt(l1-1);
        char[] s1=s.toCharArray();
        char[] s2=sub.toCharArray();

        while(i<l){
            if(s1[i]==s2[0]&& (i+l1-1)<l && s1[i+l1-1]==e){
                int j=i+1, p=1;
                while(p<(l1-1)&& s1[j++]==s2[p])
                        p++;
                if(p==(l1-1))
                    return i;
                else
                    i++;

            }else{
                i++;
            }
        }
        return -1;
    }

    public int getSubIdxUsingKMP(String s,String sub){
        int pos=-1, l=s.length(),l1=sub.length(),t=0;
        for(int i=0;i<l;i++){
            if(t==l1)
                break;
            else if(s.charAt(i)==sub.charAt(t)){
                t++;
                if(pos==-1)
                    pos=i;
            } else {
                t=0;
                pos=-1;
            }
        }
        return pos;

    }
}
