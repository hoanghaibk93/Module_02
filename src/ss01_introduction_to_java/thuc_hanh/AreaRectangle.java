package ss01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        float a;
        float b;
        Scanner scannerA = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scannerA.nextFloat();

        System.out.println("Enter b: ");
        b = scannerA.nextFloat();

        float area = a * b;
        System.out.println("dien tich :" + area);
    }
}
