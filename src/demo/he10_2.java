package demo;

import java.util.Scanner;
import java.util.Stack;

public class he10_2 {
    public static void muoito(int number, int he) {
        if (he == 2) {
            Stack<Integer> stack = new Stack<>();
            while (number > 0) {
                stack.push(number % 2);
                number = number / 2;
            }
            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
        } else if (he == 10) {
            String[] a = String.valueOf(number).split("");

            int b = 1;
            int c = 0;
            int i = 0;
//            if (Integer.parseInt(a[0]) == 0) {
//                for (i = 0; i < a.length; i++) {
//                    b = b * 2 + Integer.parseInt(a[i]);
//                }
//                System.out.println(b);
//            } else {
//                for (i = 0; i < a.length; i++) {
//                    c = c * 2 + Integer.parseInt(a[i]);
//                }
//                System.out.println(c);
//            }
            int d = a.length - 1;
            for (int j = 0; j < a.length; j++) {
                c = (int) (c + Integer.parseInt(a[j])* Math.pow(2,d));
                d--;
            }
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        he10_2.muoito(number, 10);
    }
}

