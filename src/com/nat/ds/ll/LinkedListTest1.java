package com.nat.ds.ll;

import com.nat.util.PrintHelper;
import com.nat.util.RandomGenerator;

import java.util.ArrayList;
import java.util.List;

public class LinkedListTest1 {

    public static void main(String[] a){
        List<Integer> nums=new ArrayList<Integer>();
        int[] nums1=new int[]{1, 10, 5, 10, 14,12, 3, 5, 8,16};
        for( int i:nums1){
            nums.add(i);
        }
        LinkedList ll=new LinkedList();
        nums.forEach(value->ll.add(value));
        ll.printLL();
        int removeValue=14;
        PrintHelper.print("Remove node value: "+removeValue);
        Node node=ll.find(removeValue);
        PrintHelper.print("Found node value: "+node.value);
        ll.printLL();
        ll.removeByNode(node);
        PrintHelper.print("After Remove: ");
        ll.printLL();
        Node n=ll.partition(5);
        ll.printLL(n);

        LinkedList l1=new LinkedList();
        l1.add(5);
        l1.add(8);
        l1.add(3);
        l1.printLL();
        LinkedList l2=new LinkedList();

        l2.add(8);
        l2.add(3);
        l2.add(5);
        l2.printLL();
        Node sum=LinkedList.addList(l1.first,l2.first,0);
        ll.printLL(sum);
    }
}
