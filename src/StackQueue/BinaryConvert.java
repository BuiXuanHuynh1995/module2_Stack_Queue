package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class BinaryConvert {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scanner.nextInt();

        while (number>0){
            int remainder = number%2;
            stack.push(remainder);
            number=number/2;
        }
        while (!stack.isEmpty()){
            System.out.printf("%2d",stack.pop());
        }
    }
}
