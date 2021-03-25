package com.nat.algo;
import com.nat.util.PrintHelper;

import java.util.*;
public class PrimeNumbersSumtoK {

    public static void main(String[] s){
        PrimeNumbersSumtoK p=new PrimeNumbersSumtoK();
        int n=4;
        List<Integer> l=p.isPrime(n);
        boolean isNotFound=true, isNotSame=true;
        int i=0,j=l.size()-1;
        while(i<=j && isNotFound && isNotSame){
            int f=l.get(i);
            int h=l.get(j);
            if(f+f== n){
                isNotSame =false;
                break;
            }
            if(f+h<n){
                i++;
            } else if(f+h>n){
                j--;
            } else{
                isNotFound =false;
            }
        }
        if(!isNotSame){
            PrintHelper.print(l.get(i));
            PrintHelper.print(l.get(i));
        } else if(!isNotFound){
            PrintHelper.print(l.get(i));
            PrintHelper.print(l.get(j));
        }

    }



    public List<Integer> isPrime(int n){
        int s=n-1;
        boolean[] primes =new boolean[s];
        Arrays.fill(primes,true);
        List<Integer> primeLsit=new ArrayList<>();
        for(int i=2;i*i<=s;i++){
            if(primes[i]){
                int j=i*i;
                while(j<=s){
                    primes[j]=false;
                    j=j+i;
                }
            }
        }
        for(int i=2;i<s;i++){
            if(primes[i]) primeLsit.add(i);
        }

        return primeLsit;
    }
}
