package com.nat.ds.ll;

import java.awt.dnd.DnDConstants;

public class DoubliyLinkedList {

    public DNode first,last;

    public void addNode(int key, int val){
        DNode n1=new DNode(key,val);
        if(first==null){
            first=n1;
            last=first;
        } else{
            first.prev=n1;
            n1.next=first;
            first=n1;
        }
    }

    public void print(){
        DNode curr=first;
        StringBuilder strBldr=new StringBuilder();
        String s="->";
        while(curr!=null){
            strBldr.append(s);
            strBldr.append(curr.val);
            s="<=>";
        }
        System.out.println(strBldr.toString());
    }
}
