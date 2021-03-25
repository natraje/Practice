package com.nat.util;

import com.nat.ds.ll.Node;

/***********************************************
 * This class is simple print only utility class and can be decorate the print logic as needed in future.
 *
 **********************************************/
public class PrintHelper {

    public static void print(String str){
        System.out.println(str);
    }
    public static void print(boolean str){
        System.out.println(str);
    }

    public static void print(int str){
        System.out.println(str);
    }

    public static void prints(int str){
        System.out.print(str);
    }
    public static void prints(String str){
        System.out.print(str);
    }
    public static void prints(char str){
        System.out.print(str);
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
