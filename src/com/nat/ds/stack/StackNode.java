package com.nat.ds.stack;

public class StackNode {
    public int data;
    public StackNode next;
    public StackNode(){}
    public StackNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public StackNode getNext() {
        return next;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }
}
