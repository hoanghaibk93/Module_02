package ss09_dsa_list.thuc_hanh.bai2;

import ss04_oop_class_object.bai_tap.A;

import java.util.*;

public class DemoArraylist {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("con ga");
//        list.add("con cho");
//        list.add("con vit");
//        list.add("con lon");
//        list.add(1, "con buom");
//        list.add(3, "con heo");
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("123");
//        arrayList.add("456");
//        arrayList.add("789");
//        arrayList.add("abc");
//        arrayList.add("def");
//        System.out.println(arrayList);
//        System.out.println(list.indexOf("con heo"));
//        System.out.println(list.size());
//        System.out.println(list);
//        //list.addAll(arrayList);
//        boolean a = list.addAll(1, arrayList);
//        arrayList.set(0, "789");
//
//        arrayList.add(2, "789");
//
//        int index = arrayList.lastIndexOf("789");
//        System.out.println(index);
//        System.out.println(arrayList.indexOf("789"));
//        list.remove("123");
//        System.out.println(list.remove(0));
//        list.removeAll(arrayList);
//        ArrayList<String> arrayList1 = new ArrayList<>();
//        arrayList1 = (ArrayList<String>) arrayList.clone();
//        arrayList1.remove(0);
//        boolean abd = list.contains("con buom5");
//        System.out.println(abd);

        //arrayList.clear();
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i));
//        }
//        for (String i : arrayList){
//            System.out.print(i);
//        }
        //ArrayList<String> arrayList2 = (ArrayList<String>) arrayList.subList(0,1); loi
//        List<String> arraylist3 = arrayList.subList(1, 3);
//
//        System.out.println(list);
//        System.out.println(arrayList);
//        System.out.println(arrayList1);
//        System.out.println(arraylist3);
//        Object[] array = arraylist3.toArray();
//        System.out.println(array.length);
//        String[] array3 = {"123","345","789"};
//        List<String> abcd = Arrays.asList(array3);
//        //ArrayList<String> abcd =(ArrayList<String>)Arrays.asList(array3); loi
//        System.out.println("ok" + abcd);
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.add(4);
        stack.push(5);
        //System.out.println(stack.pop());
        //System.out.println(stack.search(3));
        for (int i : stack){
            System.out.print(i);
        }
        System.out.println(stack);
        while (!stack.empty()){
            System.out.print(stack.pop());
        }

        queue.add(1);
        queue.add(2);
        queue.add(3);
        for (int i : queue){
            System.out.print(i);
        }
        while (!queue.isEmpty()){
            System.out.print(queue.poll() +"\t");
        }
        //System.out.println(queue.poll());

        System.out.println(queue);
        System.out.println("arraylist");
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);

        List<Integer> linklist = new LinkedList<>();
        linklist.add(1);
        linklist.add(2);
        linklist.add(3);
        System.out.println(linklist);
        long a = 1;
        int b = (int) a;



        Set<String> setA = new HashSet<>();
        setA.add("element 1");
        setA.add("element 2");
        setA.add("element 3");
        System.out.println(setA);
        //Collections.addAll()
    }
}
