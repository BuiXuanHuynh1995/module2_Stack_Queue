package StackQueue;

import java.util.Stack;

public class CheckBracket {
    public static boolean isParenthesisMatch(String string) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (string.charAt(i) == '{')
                return false;
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String string = "s * (s – a) * (s – b) * (s – c)";
        System.out.println(isParenthesisMatch(string));

        String string1 ="(– b + (b^2 – 4*a*c)^(0.5/ (2*a)";
        System.out.println(isParenthesisMatch(string1));
    }
}
