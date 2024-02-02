package com.pratic;

import java.util.Scanner;

public class MaximumProblem {
    public static Integer findMax(Integer a, Integer b, Integer c) {
        Integer max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }
    public static Float findMax(Float a, Float b, Float c) {
        Float max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }

    public static void main (String[] args){
        Integer maxInt1 = findMax(10, 5, 7);
        System.out.println("Test Case 1 - Max: " + maxInt1);
        Integer maxInt2 = findMax(3, 8, 4);
        System.out.println("Test Case 2 - Max: " + maxInt2);
        Integer maxInt3 = findMax(2, 6, 9);
        System.out.println("Test Case 3 - Max: " + maxInt3);
        Float maxFloat1 = findMax(10.5f, 5.2f, 7.8f);
        System.out.println("Test Case 1 - Max: " + maxFloat1);
        Float maxFloat2 = findMax(3.7f, 8.1f, 4.3f);
        System.out.println("Test Case 2 - Max: " + maxFloat2);
        Float maxFloat3 = findMax(2.2f, 6.6f, 9.9f);
        System.out.println("Test Case 3 - Max: " + maxFloat3);
    }
}
