package org.example;

/*
https://www.youtube.com/watch?v=CNi5lD19Rcs&list=PLoDervMHdCDJBy_6BEx4eUM2QvuYHFYja&index=12
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    private static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}