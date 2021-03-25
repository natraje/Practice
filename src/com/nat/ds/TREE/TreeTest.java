package com.nat.ds.TREE;

import com.nat.util.PrintHelper;

import java.util.Arrays;

public class TreeTest {

    public static void main(String[] s){
        int[] a={5,3,8,2,4,7,9};
        Tree t=new Tree();
       for(int i:a)t.insertNode(i);
       boolean b=t.isBalancedBinaryTree(t.root);
       PrintHelper.print(b);
       PrintHelper.print(t.isFind(t.root,3));
        PrintHelper.print(t.isFind(t.root,5));
    }
}
