package org.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSums(arr, 9)));
        int[] arr2 = {2,4,11,7};
        System.out.println(Arrays.toString(twoSums(arr2, 9)));
    }

    public static int[] twoSums(int[] nums, int target) {
        Map<Integer, Integer> elementAndPosition = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (elementAndPosition.containsKey(result)) {
                return new int[]{elementAndPosition.get(result), i};
            } else {
                elementAndPosition.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No sums found");
    }
}