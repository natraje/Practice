package com.nat.bits;

public class BitOperations {
        public static void main(String[] args)
        {
            //Initial values
            int a = 5;
            int b = 7;

            // bitwise and
            // 0101 & 0111=0101 = 5
            System.out.println("a&b = " + (a & b));

            // bitwise or
            // 0101 | 0111=0111 = 7
            System.out.println("a|b = " + (a | b));

            // bitwise xor
            // 0101 ^ 0111=0010 = 2
            System.out.println("a^b = " + (a ^ b));

            // bitwise and
            // ~0101=1010
            // will give 2's complement of 1010 = -6
            System.out.println("~a = " + ~a);

            // can also be combined with
            // assignment operator to provide shorthand
            // assignment
            // a=a&b
            a &= b;
            System.out.println("a= " + a);
            for (int i=0;i<2;i++)
                System.out.println(i+" = " + ~i);
            System.out.println("~a = " + ~0);
            // 10000100 -> 00001001
            System.out.println("~a = " + (11 & (~0<<2)));

            System.out.println("&= " + (-3 &-5));


        }

}
