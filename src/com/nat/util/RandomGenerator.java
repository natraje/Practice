package com.nat.util;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomGenerator {
    Set<Integer>randoms=new HashSet<Integer>();
    private static final Random r =new Random();
    public static int nextRandomNumber(int upper, int lower){
        return r.nextInt(upper-lower)+lower;
    }
}
