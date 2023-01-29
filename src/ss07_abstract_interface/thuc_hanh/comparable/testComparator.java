package ss07_abstract_interface.thuc_hanh.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class testComparator {
    public static void main(String[] args) {
//        List<Circle> list = new ArrayList<>();
//        list.add(new Circle("d",false,2));
//        list.add(new Circle("a",true,5));
//        list.add(new Circle("c",false,3));
//        list.add(new Circle("b",true,4));
//        for (Circle element : list) {
//            System.out.println(element + "\t");
//        }
//        System.out.println("After sort with radius");
//        Collections.sort(list,new comparator());
//        for (Circle element : list) {
//            System.out.println(element + "\t");
//        }
//        System.out.println("After sort with color");
//        Collections.sort(list);
//        for (Circle element : list) {
//            System.out.println(element + "\t");
//        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.trimToSize();
        arrayList.add(4);
        System.out.println(arrayList.size());

        System.out.println(arrayList.size());
        System.out.println(arrayList.indexOf(1));
    }
}
