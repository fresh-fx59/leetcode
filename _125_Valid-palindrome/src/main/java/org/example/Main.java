package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Hello world!"));
        System.out.println(isPalindrome("Hello olleh"));
        System.out.println(isPalindrome("Hellolleh"));
    }

    private static boolean isPalindrome(String s) {
//        String alphanumericsOnly = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");// slower
        String alphanumericsOnly = removeNonAlphaNumericAndLowerCase(s);
        int rightElementPosition = alphanumericsOnly.length() - 1,
                leftElementPosition = 0;

        for (; rightElementPosition >
        leftElementPosition; rightElementPosition--, leftElementPosition++) {
            if (alphanumericsOnly.charAt(leftElementPosition) != alphanumericsOnly.charAt(rightElementPosition))
                return false;
        }

        return true;
    }

    private static String removeNonAlphaNumericAndLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (Character.isLetterOrDigit(currentChar))
                sb.append(Character.toLowerCase(currentChar));
        }
        return sb.toString();
    }
}