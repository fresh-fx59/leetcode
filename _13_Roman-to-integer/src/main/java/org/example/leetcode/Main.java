package org.example.leetcode;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(convertRoman("II"));
        System.out.println(convertRoman("IV"));
        System.out.println(convertRoman("V"));
        System.out.println(convertRoman("LXV"));
        System.out.println(convertRoman("LXIV"));
        System.out.println(convertRoman("LVXI"));
    }

    public static int convertRoman(String roman) {
        Map<Character, Integer> romanInt = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        
        int romanLength = roman.length();
        int result = 0;
        
        for (int i = 0, j = 1; j < romanLength; i++, j++) {
            if (romanInt.get(roman.charAt(i)) >= romanInt.get(roman.charAt(j))) {
                result += romanInt.get(roman.charAt(i));
            } else {
                result -= romanInt.get(roman.charAt(i));
            }
        }

        return result + romanInt.get(roman.charAt(romanLength - 1));
    }
}