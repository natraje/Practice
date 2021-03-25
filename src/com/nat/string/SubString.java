package com.nat.string;

import com.nat.util.PrintHelper;

import java.util.*;

public class SubString {
    //In:asmGeeksasmasmForasmGeeks out: GeeksForGeeks remove:asm

    public static void main(String[] s){
        String str="asmGeeksasmasmForasmGeeks", sub="asm";
        SubString ss=new SubString();
      //  PrintHelper.print(ss.removeSub(str,sub));
     //   PrintHelper.print(ss.removeSub("asmGeeksasmasmForasmGeeksam",sub));
      //  PrintHelper.print(ss.removeSub("kmalgorithmkmiskmkmkmhelpfulkminkmsearching","km"));
        PrintHelper.print(ss.removeSubUsingKMP("asmGeeksasmasmForasmGeeksam",sub));

    }
    public String removeSub(String str, String sub){
        int Ls1=sub.length(),len=str.length();
        char st=sub.charAt(0);
        char end='\0';
        if(sub.length()>1)
            end=sub.charAt(sub.length()-1);

        List<Integer> startIdx=new ArrayList<>();
        int i=0;
        for(;i<len;i++){
            if(str.charAt(i)==st && (i+Ls1-1)<len && str.charAt(i+Ls1-1)==end){
                int j=i+1,s1=1;
                while(s1<(Ls1-1)&& str.charAt(j)==str.charAt(s1)){
                    s1++;
                    j++;
                }
                if(s1==(Ls1-1)){
                    startIdx.add(i);
                    i=j;
                } else{
                    i++;
                }

            }
        }
        char[] sc=str.toCharArray();
        //asmGeeksasmasmForasmGeeks
        int t=1;
        for(i=startIdx.size()-1;i>=0;i--){
            int j=startIdx.get(i)+Ls1,q=startIdx.get(i);
            while(q<len){
                if(q<(len-(t*Ls1)))
                    sc[q++]=sc[j++];
                else
                    sc[q++]='\0';
            }
            t++;
        }
        return String.valueOf(sc);

    }


    public String removeSubUsingKMP(String str, String sub){
        int l=str.length(),l1=sub.length(),t=0,pos=-1;
        List<Integer> idxs=new ArrayList<>();
        for(int i=0;i<l;i++){
            if(t==l1){
                idxs.add(pos);
                pos=-1;
                t=0;
            }
            if(str.charAt(i)==sub.charAt(t)){
                t++;
                if(pos==-1)
                    pos=i;
            }else {
                t=0;
                pos=-1;
            }

        }
        char[] c1=str.toCharArray();
        int r=1;
        //"asmGeeksasmasmForasmGeeks"
        for(int i=idxs.size()-1;i>=0;--i){
            int p= idxs.get(i), st=idxs.get(i)+l1, q=l-(r*l1);
            while(p<l){
                if(p<q)
                    c1[p++]=c1[st++];
                else
                    c1[p++]='\0';
            }
        }
        return String.valueOf(c1);
    }
    public void getZarr(String str, int Z[])
    {
        int n = str.length();
        int k;

        // L Stores start index of window
        // which matches with prefix of str
        int L = 0;

        // R Stores end index of window
        // which matches with prefix of str
        int R = 0;

        // Iterate over the characters of str
        for (int i = 1; i < n; ++i) {

            // If i is greater thn R
            if (i > R) {

                // Update L and R
                L = R = i;

                // If substring match with prefix
                while (R < n && str.charAt(R - L) == str.charAt(R)) {

                    // Update R
                    R++;
                }

                // Update Z[i]
                Z[i] = R - L;

                // Update R
                R--;
            }
            else {

                // Update k
                k = i - L;

                // if Z[k] is less than
                // remaining interval
                if (Z[k] < R - i + 1) {

                    // Update Z[i]
                    Z[i] = Z[k];
                }

                else {

                    // Start from R and check manually
                    L = i;
                    while (R < n && str.charAt(R - L) == str.charAt(R)) {

                        // Update R
                        R++;
                    }

                    // Update Z[i]
                    Z[i] = R - L;

                    // Update R
                    R--;
                }
            }
        }
    }

    // Function to remove all the occurrences
// of word from str
    public String removeSub1(String str, String word)
    {
        // Create concatenated string "P$T"
        String concat = word + "$" + str;
        int l = concat.length();

        // Store Z array of concat
        int Z[]=new int[l];

        getZarr(concat, Z);

        // Stores string, str by removing all
        // the occurrences of word from str
        String res="";

        // Stores length of word
        int pSize = word.length();

        // Traverse the array, Z[]
        for (int i = 0; i < l; ++i) {

            // if Z[i + pSize + 1] equal to
            // length of word
            if (i + pSize < l - 1 && Z[i + pSize + 1] == pSize) {

                // Update i
                i += pSize - 1;
            }
            else if (i < str.length()) {
                res += str.charAt(i);
            }
        }
        return res;
    }
}
