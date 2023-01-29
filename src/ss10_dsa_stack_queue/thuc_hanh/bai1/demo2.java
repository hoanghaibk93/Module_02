package ss10_dsa_stack_queue.thuc_hanh.bai1;

import java.util.*;

public class demo2 {
    public static void main(String[] args) {
        //Stack list2 = new Stack();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue.peek());
        System.out.println(queue);
        LinkedList<Integer> linkedList = new LinkedList<>();
        List<Integer> abc = new LinkedList<>();
        ArrayList<Integer> cde = new ArrayList<>();
        Stack<Integer> gh = new Stack<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.push(4);
        //linkedList.push(5);
        //linkedList.addFirst(6);
        linkedList.add(1);
//        System.out.println(linkedList);
//        System.out.println("linklist" + linkedList.get(0));
//        System.out.println("abc"+linkedList.getLast());
//        System.out.println(linkedList.getFirst());
//        System.out.println("peek"+linkedList.peek());
//        System.out.println(linkedList.poll());
//        System.out.println(linkedList.poll());
//        System.out.println(linkedList.pollLast());
//        System.out.println(linkedList.pop());
        gh.push(1);
        gh.push(2);
        gh.push(3);
        gh.push(4);
        gh.push(1);
      // System.out.println(linkedList.removeAll(gh));
        System.out.println(linkedList.retainAll(gh));


        System.out.println("Linklist");
        System.out.println(linkedList);
        System.out.println("Stack");
        System.out.println(gh);
        //System.out.println(gh.get(1));
//        System.out.println(gh.peek());
//        System.out.println(gh.pop());
        //System.out.println(gh.remove(2));
        //System.out.println(gh.elements());
       // System.out.println(gh);
       //System.out.println(linkedList.containsAll(gh));
//        System.out.println(gh.contains(1));



    }


}
