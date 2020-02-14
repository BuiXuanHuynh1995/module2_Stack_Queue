package StackQueue;

import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Stack<Character>stack=new Stack<>();
        String string ="abba";

        for (int i=0;i<string.length();i++){
            stack.push(string.charAt(i));
        }

        String newString = "";

        while (!stack.isEmpty()) {
            newString = newString + stack.pop();
        }
        if (string.equals(newString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");

    }
}
