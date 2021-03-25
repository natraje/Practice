package com.nat.ds.ll;

public class LLReverse {

   public Node head;


    public void add(int val){
        Node n=new Node(val);
        if(head==null) head=n;
        else {
            Node t=head;
            head=n;
            n.next=t;
        }
    }

    public void reverse(Node first){
        //->1->2->3->null
        Node curr=first;
        Node prev=null;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }


}
