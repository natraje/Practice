package com.nat.ds.ll;

import com.nat.util.PrintHelper;
import com.nat.util.RandomGenerator;

import java.util.ArrayList;
import java.util.List;

public class LinkedListTest {

    public static void main(String[] a){
        List<Integer> nums=new ArrayList<Integer>();
        int removeValue=0;
        for(int i=0;i<10;i++){
            int val=RandomGenerator.nextRandomNumber(12,0);
            if(val>50 && val<60)
                removeValue=val;
            nums.add(val);
        }
        int val=nums.get(RandomGenerator.nextRandomNumber(9,0));
        PrintHelper.print("Pivot:"+val);
        nums.add(RandomGenerator.nextRandomNumber(9,0),val);
        LinkedList ll=new LinkedList();
        nums.forEach(value->ll.add(value));
        ll.printLL();
        PrintHelper.print("Remove node value: "+removeValue);

    }
}
