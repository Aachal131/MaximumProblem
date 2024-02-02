package com.pratic;

import java.util.Scanner;

public class MaximumProblem {
    public static String findMax(String a, String b, String c) {
        String max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        String max1 = findMax("apple", "orange", "banana");
        System.out.println("Test Case 1 - Max: " + max1);
        String max2 = findMax("cat", "elephant", "dog");
        System.out.println("Test Case 2 - Max: " + max2);
        String max3 = findMax("blue", "red", "green");
        System.out.println("Test Case 3 - Max: " + max3);
    }
}