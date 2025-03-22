import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        int[] arr8 = {1,2};
        int[] arr6 = {1,1,1,2,2,3};
        int[] arr7 = {0,0,1,1,1,1,2,3,3};
        int[] arr5 = {1,1,1,2,2,3};
        int[] arr4 = {1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 5, 5, 5, 5};
        int[] arr3 = {1, 1, 1, 2, 2};
        int[] arr2 = {1, 1, 1, 2, 2, 3, 4, 5, 5, 5};
        int[] firstElements = {1, 1, 2, 2, 3};
        int expectedCount = 5;

        int actualCount = removeDuplicates(arr);

        System.out.println(actualCount);
        System.out.println(Arrays.toString(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        int result = 1;

        if (length > 2 && nums[length - 1] == nums[length - 2])
            result++;

        if (length > 2 && nums[length - 1] == nums[0])
            return 2;

        for (int i = 0; i < length;) {
            int shift = 0;

            int startJ = i + 1;

            // edge case when it is almost the end of arr
            if (startJ >= length) {
                break;
            }

            // determine the shift
            for (int j = startJ; j < length;) {
                if (nums[i] == nums[j]) {
                    j++;
                    shift++;
                    System.out.println(
                            "current shift = " + shift);
                    if (shift < 3)
                        result++;
                } else {
                    i++;
                    System.out.println("i = j = " + i);
                    if (shift == 0)
                        result++;
                    break;
                }

            }

            System.out.println("shift[i = " + i + "] = " + shift);

            // apply shift or go to next element
            if (shift == 0) {
                System.out.println("shift = 0");
            } else if (shift == 1) {
                i++;
            } else if (shift == 2) {
                shift(nums, i);
            } else {
                if ((shift + i) == length - 1)
                    break;
                for (int shifter = 1; shifter < shift; shifter++) {
                    shift(nums, i);
                }
            }
        }

        return result;
    }

    public static void shift(int[] arr, int currentPosition) {
        int length = arr.length;

        int subI = currentPosition;
        if (currentPosition > 0) {
            for (int k = currentPosition - 1; k < length; k++) {
                if (subI <= length - 1) {
                    arr[k] = arr[subI];
                    subI = subI + 1;
                }
            }
        }
    }
}
