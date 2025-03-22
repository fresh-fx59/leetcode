package org.example.leetcode;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1211));
        System.out.println(isPalindrome(121121));
    }

    public static boolean isPalindrome(int x) {
        String xString = String.valueOf(x);

        for (int i = 0, j = xString.length() - 1; j > i; i++, j--) {
            if (xString.charAt(i) != xString.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}