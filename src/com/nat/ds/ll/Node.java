package com.nat.ds.ll;

public class Node {
    public Node next;
    public int value;
    public Node(){}
    public Node(Node next){
        this.next=next;
    }
    public Node(Node node,int value){
        this.next=node;
        this.value=value;
    }
    public Node(int value){
        this.value=value;
    }

}
