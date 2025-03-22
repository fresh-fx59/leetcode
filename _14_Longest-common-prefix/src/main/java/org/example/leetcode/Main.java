package org.example.leetcode;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flame"}));
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        for (int charPosition = 0; charPosition < strs[0].length(); charPosition++) {
            char currentChar = strs[0].charAt(charPosition);
            for (int currentString = 1; currentString < strs.length; currentString++) {
                if (strs[currentString].length() <= charPosition ||
                        strs[currentString].charAt(charPosition) != currentChar) {
                    return strs[currentString].substring(0, charPosition);
                }
            }
        }
        return strs[0];
    }
}