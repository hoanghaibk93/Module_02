package ss01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        int a = 1;
//        System.out.println(++a);
////        System.out.println(++a);
////        a = a + 1;
////        System.out.println(a);
//        // System.out.println(9.0/5);
//        int a = 5, b=0;
//
//        if (a == 5) {
//            ++a;
//            b = a++ * 5;
//        }
//        System.out.println(a);
//        System.out.println(b);
//    }
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(number);
        System.out.println("Input name: ");
        String name = sc.nextLine();
        System.out.println(name);
        Demo person1 = new Demo();
        Demo person2 = new Demo();
        System.out.println(person1 == person2);
    }
}
