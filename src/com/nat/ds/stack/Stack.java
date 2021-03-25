package com.nat.ds.stack;

public class Stack implements  Istack{

    public StackNode top;


    public void push(int data){
        StackNode s=new StackNode(data);
        s.next=top;
        top=s;
    }

    @Override
    public int pop() {
        if(top==null){
            return -1;
        }
        int data=(top.data);
        top=top.next;
        return data;
    }

    @Override
    public boolean isEmpty() {
        return top==null;
    }

    @Override
    public int peek() {
        if(top==null){
            return -1;
        }
        return top.data;
    }
    public void printStack(){

    }
}
