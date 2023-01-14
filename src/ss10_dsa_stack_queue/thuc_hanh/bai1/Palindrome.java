package ss10_dsa_stack_queue.thuc_hanh.bai1;


import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String that you want to check: ");
        String stringWord = scanner.nextLine();
        String stringWordNew = stringWord.toLowerCase();
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        String[] arrayChar = stringWordNew.split("");
        for (int i = 0; i < arrayChar.length; i++) {
            queue.offer(arrayChar[i]);
            stack.push(arrayChar[i]);
        }
        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                System.out.println("'" + stringWord + "'" + " is not a Palindrome String");
                break;
            } else if (queue.isEmpty()) {
                System.out.println("'" + stringWord + "'" + " is a Palindrome String");
            }
        }
    }
}

