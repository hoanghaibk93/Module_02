package ss10_dsa_stack_queue.bai_tap.reverse;

import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        int number = 111;
        Stack<Integer> stack = new Stack<>();
        while (number != 0){
            int a = number % 2;
            stack.push(a);
            number = number / 2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
