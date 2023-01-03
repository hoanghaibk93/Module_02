package ss01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nam bat ky");
        year = sc.nextInt();
        if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {
            System.out.println(year + " la nam nhuan");
        } else {
            System.out.println(year + " khong phai la nam nhuan");
        }
    }
}
