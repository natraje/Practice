package com.nat.ds.ll;

import com.nat.util.PrintHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class LLTest2 {

    public static void main(String[] a){
        List<Integer> nums=new ArrayList<Integer>();
        int[] nums1=new int[]{1, 2, 7,};
        for( int i:nums1){
            nums.add(i);
        }
        LinkedList ll=new LinkedList();
        nums.forEach(value->ll.add(value));
        ll.printLL();
        LinkedList ll2=new LinkedList();
        int[] nums2=new int[]{5, 2, 7,};
        List<Integer> numsa2=new ArrayList<Integer>();
        for( int i:nums2){
            numsa2.add(i);
        }
        numsa2.forEach(value->ll2.add(value));
        ll2.printLL();
        ll2.reverse();
        ll2.printLL();
        Node n= joinPartition(ll,ll2);
        LinkedList.printLL(n);


        LLReverse llr=new LLReverse();
        numsa2.forEach(value->llr.add(value));
        PrintHelper.printLL(llr.head);
        llr.reverse(llr.head);
        PrintHelper.printLL(llr.head);
    }


    public static Node joinPartition(LinkedList ll,LinkedList ll2){
        return addLL(ll.first,ll2.first,0);
    }

    public static Node addLL(Node n1, Node n2, int carry){
        if(n1==null && n2==null && carry==0)
            return null;

        Node s=new Node(0);
        if(n1!=null)
            carry=carry+n1.value;
        if(n2!=null)
            carry=carry+n2.value;

        s.value=carry%10;
        if(n1!=null || n2 !=null)
            s.next=addLL(n1!=null?n1.next:null,n2!=null?n2.next:null,carry>=10?1:0);

        return s;
    }
}
