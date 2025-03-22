package org.example;

import java.util.Arrays;

/*
https://www.youtube.com/watch?v=r56lnGJkHdw&list=PLoDervMHdCDJBy_6BEx4eUM2QvuYHFYja&index=9
 */
public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{1,2,5,6};
        int n = 4;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int nums1Pointer = m - 1,
             nums2Pointer = n - 1,
             lastElementPointer = m + n - 1;
             lastElementPointer >= 0;
             lastElementPointer--
        ) {
            int nums1Element = (nums1Pointer >= 0) ? nums1[nums1Pointer] : Integer.MIN_VALUE;
            int nums2Element = (nums2Pointer >= 0) ? nums2[nums2Pointer] : Integer.MIN_VALUE;
            if (nums2Element > nums1Element) {
                nums1[lastElementPointer] = nums2Element;
                nums2Pointer--;
            } else {
                nums1[lastElementPointer] = nums1Element;
                nums1Pointer--;
            }
        }
    }
}