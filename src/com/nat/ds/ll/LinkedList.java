package com.nat.ds.ll;

import com.nat.util.PrintHelper;

public class LinkedList {

    public Node first;

    public void add(int value){
        if(first==null){
            first=new Node(value);
        } else {
            Node temp=first;
            first=new Node(value);
            first.next=temp;
        }
    }

    public void add(Node node){
        if(first==null){
            first=node;
        } else {
            Node temp=first;
            first=node;
            first.next=temp;
        }
    }

    public Node find(int val){
        Node curr=first;
        while(curr!=null){
            if(curr.value==val){
                return curr;
            }
            curr=curr.next;
        }
        return null;
    }

    public boolean removeByNode(Node node){
        if(node==null)
            return false;
        Node next=node.next;
        node.value=next.value;
        node.next=next.next;
        return true;
    }
    public Node removeNode(int val){
        return remove(new Node(val));
    }

    public Node remove(Node node){
        return null;
    }

    public Node reverse(){
        Node curr=new Node(0);
        Node prev=null;
        while(first!=null){
            curr=new Node(first.value);
            curr.next=prev;
            prev=curr;
            first=first.next;
        }
        return prev;
    }
    public Node partition(int val){
        //Node beforeStart
        Node bs=null;
        Node before=null;
        Node as=null;
        Node after=null;
        Node curr=null;

            curr=first;
            while(curr!=null){
                Node next =curr.next;
               // curr.next=null;
                Node n=new Node(curr.value);
                if(curr.value<val){
                    if(before==null){
                        bs=n;
                        before=bs;}
                    else{
                        before.next=n;
                        before=n;}
                } else{
                    if(after==null){
                        as=n;
                        after=n;}
                    else{
                        after.next=n;
                        after=n;
                    }
                }
                curr=curr.next;
            }
            if(before==null)
                return after;

        before.next=as;
        return bs;
    }

    public static Node addList(Node l1,Node l2, int excess){
        if(excess==0 && l1==null && l2==null)
            return null;
        Node n=new Node();
        int sum=excess;
        if(l1!=null)
            sum=sum+l1.value;
        if(l2!=null)
            sum=sum+l2.value;

       n.value=sum%10;
       excess=sum >= 10 ? 1 : 0;
       if(excess>0|| (l1!=null && l1.next!=null) || (l2!=null && l2.next!=null)) {

           Node n1 = addList(l1==null || l1.next== null ? null : l1.next, l2==null||l2.next == null ? null : l2.next,excess );
           n.next=n1;
       }

        return n;

    }
    public void partitionOld(int val){
        Node rightSide=null;
        Node pivotNodes=null;
        Node pivotNodeFirst=null;
        Node tempNode=null;
        Node nextnode=null;
        Node curr=first;
        Node prev=null;
       // "Start->16->8->5->3->12->10->5->10->1->NULL"
        while(curr!=null){
            if(curr.value>=val) {
                tempNode = curr;
                nextnode = curr.next;


              //  Node next=curr.next;
             //   curr.value=next.value;
             //   curr.next=next.next;
                if (nextnode != null) {
                    curr.value = nextnode.value;
                    curr.next = nextnode.next;
                    if(prev!=null)
                        prev.next=curr;
                }
                tempNode.next = null;
                if (tempNode.value > val){
                    if (rightSide == null) {
                        rightSide = tempNode;
                    } else {
                        tempNode.next = rightSide;
                        rightSide = tempNode;
                    }
                } else{
                    if (pivotNodes == null) {
                        pivotNodeFirst=tempNode;
                        pivotNodes = tempNode;
                    } else {
                        pivotNodes.next = null;
                        pivotNodes = tempNode;
                    }
                }
            } else{
                if(prev==null)
                    prev=curr;
                else{
                    Node prevTemp=prev;
                    prev=curr;
                    prev.next=prevTemp;
                }

                curr=curr.next;
            }
        }
        if(rightSide==null){
            rightSide=pivotNodes;

        } else{
            if(rightSide==null){
                rightSide.next=pivotNodes;
            }else{
                tempNode=rightSide.next;
                rightSide.next=pivotNodes;
                pivotNodeFirst.next=tempNode;
            }
        }
        curr.next=rightSide;
        first=curr;
    }

    public void printLL(){
        StringBuilder stringBuilder=new StringBuilder();
        Node curr=first;
        String s="Start->";
        while(curr!=null){
            stringBuilder.append(s);
            stringBuilder.append(curr.value);
            s="->";
            curr=curr.next;
        }
        stringBuilder.append("->NULL");
        PrintHelper.print(stringBuilder.toString());
    }

    public static void printLL(Node curr){
        StringBuilder stringBuilder=new StringBuilder();
        String s="Start->";
        while(curr!=null){
            stringBuilder.append(s);
            stringBuilder.append(curr.value);
            s="->";
            curr=curr.next;
        }
        stringBuilder.append("->NULL");
        PrintHelper.print(stringBuilder.toString());
    }
}
