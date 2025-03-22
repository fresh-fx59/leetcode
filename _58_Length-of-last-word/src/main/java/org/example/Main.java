package org.example;

/*
https://www.youtube.com/watch?v=e9LBI0oPCGg&list=PLoDervMHdCDJBy_6BEx4eUM2QvuYHFYja&index=7
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("j"));
        System.out.println(lengthOfLastWordV2("j"));
        System.out.println(lengthOfLastWord("hello mother"));
        System.out.println(lengthOfLastWordV2("hello mother"));
        System.out.println(lengthOfLastWord(""));
        System.out.println(lengthOfLastWordV2(""));
        System.out.println(lengthOfLastWord(null));
        System.out.println(lengthOfLastWordV2(null));
    }

    private static int lengthOfLastWord(String incomingString) {
        if (incomingString == null || incomingString.isEmpty())
            return 0;

        int lastElementIndex = incomingString.length() - 1;
        char space = ' ';

        for (int i = lastElementIndex; i >= 0; i--) {
            if (incomingString.charAt(i) == space)
                return lastElementIndex - i;
        }

        return lastElementIndex + 1;
    }

    private static int lengthOfLastWordV2(String incomingString) {
        if (incomingString == null || incomingString.isEmpty())
            return 0;

        String[] words = incomingString.split(" ");
        return words[words.length - 1].length();
    }
}