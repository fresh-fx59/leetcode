package org.example;

import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(isParenthesesCorrect("[](){}"));
        System.out.println(isParenthesesCorrect("[]()){}"));
        System.out.println(isParenthesesCorrect("[](){}}"));
        System.out.println(isParenthesesCorrect("[{](){}"));
        System.out.println(isParenthesesCorrect("[]"));
    }

    private static boolean isParenthesesCorrect(String parentheses) {
        Stack<Character> stackOfChars = new Stack<>();
        Set<Character> openParentheses = Set.of('(', '[', '{');

        for (int i = 0; i < parentheses.length(); i++) {
            char currentChar = parentheses.charAt(i);
            if (stackOfChars.empty() && openParentheses.contains(currentChar)) {
                stackOfChars.push(currentChar);
            } else if (stackNotEmptyAndContainsChar(stackOfChars, currentChar)) {
                stackOfChars.pop();
            } else {
                return false;
            }
        }

        return true;
    }

    private static boolean stackNotEmptyAndContainsChar(Stack<Character> stack, char currentChar) {
        if (stack.empty())
            return false;

        Map<Character, Character> openClosedBracketMatch = Map.of(
                '(', ')',
                '[', ']',
                '{', '}'
        );
        char stackBracket = stack.peek();
        return openClosedBracketMatch.get(stackBracket) == currentChar;
    }
}