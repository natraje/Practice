package com.nat.ds.stack;
import java.util.*;
public class SetOfStacks {
    public List<int[]> stacks=new ArrayList<>();
    private int capacity;
    private int size;
    private int[] currStack;
    private int currIdx;

    public SetOfStacks(int capacity){
        this.capacity=capacity;
        int[] stack=new int[capacity];
        stacks.add(stack);
        currStack=stack;
        currIdx=1;
    }

    public void push(int d){
        if(currIdx==capacity){
            int[] stack=new int[capacity];
            stacks.add(stack);
            currStack=stack;
        }
        currStack[currIdx-1]=d;
    }

    public int pop(){
        if(size==0){
            return -1;
        }
        return -1;
    }

}
