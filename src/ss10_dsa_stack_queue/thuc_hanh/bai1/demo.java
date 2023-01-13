package ss10_dsa_stack_queue.thuc_hanh.bai1;


import java.util.LinkedList;
import java.util.Stack;

public class demo {
    public static void main(String[] args) {
        Stack<Integer> demo = new Stack<>();
        demo.push(1);
        demo.push(2);
        demo.push(3);
        demo.push(4);
//        while(!demo.empty()){
//            System.out.print(demo.pop());
//        }
        System.out.println("");
        LinkedList<Integer> demo2 = new LinkedList<>();
        demo2.add(6);
        demo2.add(7);
        demo2.add(8);
        demo2.add(9);
        for (int i = 0; i < demo2.size(); i++) {
            System.out.print(demo2.get(i));
        }

        System.out.println("");
        System.out.println(demo2.getFirst());
        System.out.println(demo.pop());
        //demo.stackOfString();

    }
}
