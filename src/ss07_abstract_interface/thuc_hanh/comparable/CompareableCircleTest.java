package ss07_abstract_interface.thuc_hanh.comparable;

import java.util.Arrays;

public class CompareableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] abc = new ComparableCircle[3];
        abc[0] = new ComparableCircle(3.6);
        abc[1] = new ComparableCircle();
        abc[2] = new ComparableCircle(3.5,"blue",false);
        System.out.println("truoc khi Sap xep");
        for (int i = 0; i < abc.length; i++) {
            System.out.println(abc[i]);
        }
        Arrays.sort(abc);
        System.out.println("sau khi sap xep");
        for (int i = 0; i < abc.length; i++) {
            System.out.println(abc[i]);

        }
    }
}
