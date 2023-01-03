package ss02_vong_lap.bai_tap;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 5;
        while (choice != 4) {
            System.out.println("\n");
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (the corner is square at 4 different angles: top-left, top-right, bottom-left, bottom-right");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        System.out.println("");
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 2:
                    System.out.println("The corner is top-left");
                    for (int i = 0; i < 7; i++) {
                        System.out.println("");
                        for (int j = 0; j < 7 - i; j++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println("\nthe corner is top-right");
                    for (int i = 0; i < 7; i++) {
                        System.out.println("");
                        for (int j = 0; j <= i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < 7 - i; j++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println("\nthe corner is bottom-left");
                    for (int i = 0; i < 7; i++) {
                        System.out.println("");
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println("\nthe corner is bottom-right");
                    for (int i = 0; i < 7; i++) {
                        System.out.println("");
                        for (int j = 0; j <= 7 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 7; i++) {
                        System.out.println("");
                        for (int j = 0; j < 7 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice");
                    break;
            }
        }
    }
}
