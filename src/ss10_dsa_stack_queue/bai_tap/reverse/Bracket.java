package ss10_dsa_stack_queue.bai_tap.reverse;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static boolean Bracket(String expression) {
        Stack<String> stack = new Stack<>();
        String[] expressionArray = expression.split("");
        for (int i = 0; i < expressionArray.length; i++) {
            if (expressionArray[i].equals("(")) {
                stack.push(expressionArray[i]);
            }
            if (expressionArray[i].equals(")")) {
                if (stack.empty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Math expression:");
        String expression = scanner.nextLine();
        if (Bracket(expression)) {
            System.out.println("Well");
        } else {
            System.out.println("Not Well");
        }
    }
}

