package com.nat.ds.stack;

public class TestStack {
    public static void main(String[] a){
        Istack stack=new Stack();
        int[] arr={3,4,2,5,7,8,1};
        for(int i:arr){
            stack.push(i);
        }

    }
}
