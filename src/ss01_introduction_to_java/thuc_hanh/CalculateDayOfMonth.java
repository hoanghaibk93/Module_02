package ss01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class CalculateDayOfMonth {
    public static void main(String[] args) {
        int month;
        Scanner calcu = new Scanner(System.in);
        System.out.println("Nhap thang: ");
        month = calcu.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + month + " có 31 ngay");
                break;
            case 2:
                System.out.println("Thang " + month + " có 28 hoac 29 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + month + " có 30 ngay");
                break;
            default:
                System.out.println("Ban nhap sai thang");
                break;
        }
    }
}
