package ss02_array.thuc_hanh;

import java.util.Scanner;

public class CheckMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        double money;

        do {
            System.out.println("Enter a number");
            number = Integer.parseInt(sc.nextLine());
            if (number > 20) {
                System.out.println("number have not exceed 20");
            }
        } while (number > 20);
        double[] moneyArray = new double[number];
        System.out.println("enter assets ");
        for (int i = 0; i < number; i++) {
            moneyArray[i] = Double.parseDouble(sc.nextLine());
        }
        System.out.println("Element of money Array: ");
        for (int i = 0; i < number; i++) {
            System.out.print(moneyArray[i] + "\t");
        }
        double max = moneyArray[0];
        for (int i = 1; i < number; i++) {
            if (moneyArray[i] > max) {
                max = moneyArray[i];
            }
        }
        System.out.println("\nthe biggest asset is " + max);
    }
}
