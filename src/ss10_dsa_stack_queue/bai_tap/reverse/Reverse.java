package ss10_dsa_stack_queue.bai_tap.reverse;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Array number");
        Stack<Integer> stackNumber = new Stack<>();
        int[] arrayNumber = {1, 2, 3, 4, 5, 6};
        System.out.println("Before reverse:");
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.print(arrayNumber[i] + "\t");
        }
        System.out.println("\nAfter reverse");
        for (int i = 0; i < arrayNumber.length; i++) {
            stackNumber.push(arrayNumber[i]);
        }
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = stackNumber.pop();
        }
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.print(arrayNumber[i] + "\t");
        }

        Stack<String> stackString = new Stack<>();
        System.out.println("\nBefore reverse:");
        String word = "hoanghai";
        System.out.println(word);
        String[] arrayChar = word.split("");
        for (int i = 0; i < arrayChar.length; i++) {
            stackString.push(arrayChar[i]);
        }
        for (int i = 0; i < arrayChar.length; i++) {
            arrayChar[i] = stackString.pop();
        }
        System.out.println("\nAfter reverse");
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.print(arrayChar[i]);
        }
    }
}
