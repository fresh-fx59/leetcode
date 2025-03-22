package org.example;

/*
https://www.youtube.com/watch?v=aPYHVUyePTc&list=PLoDervMHdCDJBy_6BEx4eUM2QvuYHFYja&index=6
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(searchInsertPosition(new int[]{1, 3, 5, 6}, 1));
        System.out.println(searchInsertPosition(new int[]{1, 3, 5, 6}, 5));
        System.out.println(searchInsertPosition(new int[]{1, 3, 5, 6}, 2));
        System.out.println(searchInsertPosition(new int[]{1, 3, 5, 6}, 6));
        System.out.println(searchInsertPosition(new int[]{1, 3, 5, 6}, 7));
        System.out.println(searchInsertPosition(new int[]{1, 3, 5, 6}, 0));
    }

    public static int searchInsertPosition(int[] nums, int target) {
        return searchInsertPositionOLogN(nums, target);
    }

    private static int searchInsertPositionOLogN(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (nums[0] > target) {
            return 0;
        } else if (nums[nums.length - 1] < target) {
            return nums.length;
        }

        return low;
    }

    private static int searchInsertPositionON(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            throw new IllegalArgumentException("No elements in array");

        if (nums.length >= 2) {
            for (int i = 0, j = 1; j < nums.length; i++, j++) {
                if (i == 0 && target < nums[i]) {
                    return 0;
                } else if (target > nums[i] && target < nums[j]) {
                    return j;
                } else if (target == nums[i]) {
                    return i;
                } else if (target == nums[j]) {
                    return j;
                }
            }
        } else if (nums[0] == target) {
            return 0;
        } else if (nums[0] < target) {
            return 1;
        } else {
            return 0;
        }

        return nums.length;
    }
}