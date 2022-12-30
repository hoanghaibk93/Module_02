package ss01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class CalculateOne {
    public static void main(String[] args) {
        System.out.println("Ham bac nhat 'a * x + b = c");
        double a, b, c, x;
        Scanner conga = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = conga.nextDouble();

        System.out.println("Nhap b: ");
        b = conga.nextDouble();

        System.out.println("Nhap c: ");
        c = conga.nextDouble();
        if (a != 0) {
            x = -(c - b) / a;
            System.out.println("phuong trinh co 1 nghiem x:= " + x);
        } else if (b == c) {
            System.out.println("phuong trinh vo so nghiem");
        } else {
            System.out.println("phong trinh vo nghiem");
        }

    }
}
