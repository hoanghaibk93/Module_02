package ss10_dsa_stack_queue.bai_tap.reverse;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a length of number Array:");
        int lengthArray = Integer.parseInt(scanner.nextLine());
        int[] arrayNumber = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            System.out.println("Enter elements " + (i + 1) + " of Array");
            arrayNumber[i] = Integer.parseInt((scanner.nextLine()));
        }
        System.out.println("Enter a String: ");
        String word = scanner.nextLine();

        Stack<Integer> stackNumber = new Stack<>();
        System.out.println("Before reverse:");
        System.out.println(Arrays.toString(arrayNumber));
        System.out.println("\nAfter reverse");
        for (int i = 0; i < arrayNumber.length; i++) {
            stackNumber.push(arrayNumber[i]);
        }
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = stackNumber.pop();
        }
        System.out.println(Arrays.toString(arrayNumber));

        Stack<String> stackString = new Stack<>();
        System.out.println("\nBefore reverse:");
        System.out.println(word);
        String[] arrayChar = word.split("");
        for (int i = 0; i < arrayChar.length; i++) {
            stackString.push(arrayChar[i]);
        }
        for (int i = 0; i < arrayChar.length; i++) {
            arrayChar[i] = stackString.pop();
        }
        System.out.println("\nAfter reverse:");
        System.out.println(String.join("", arrayChar));
    }
}
