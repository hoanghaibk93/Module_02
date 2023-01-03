package ss02_vong_lap.thuc_hanh;

import java.util.Scanner;

public class DrawingShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        byte choice = 2;

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1: draw the rectangle");
            System.out.println("2: draw the triangle");
            System.out.println("3: draw the square");
            System.out.println("0: exit");
            System.out.println("Enter your choice");
            choice = sc.nextByte();
            switch (choice) {
                case 1:
                    System.out.println("*******");
                    System.out.println("*******");
                    System.out.println("*******");
                    break;
                case 2:
                    System.out.println("*********");
                    System.out.println("********");
                    System.out.println("*******");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 3:
                    System.out.println("* * * * * * * *");
                    System.out.println("* * * * * * * *");
                    System.out.println("* * * * * * * *");
                    System.out.println("* * * * * * * *");
                    System.out.println("* * * * * * * *");
                    System.out.println("* * * * * * * *");
                    System.out.println("* * * * * * * *");
                    System.out.println("* * * * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
