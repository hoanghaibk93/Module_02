package ss02_array.bai_tap;

import java.util.Scanner;

public class SumColumnOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeN, sizeM, column;
        double sum = 0;
        System.out.println("Enter a sizeN");
        sizeN = Integer.parseInt(sc.nextLine());
        System.out.println("Enter a sizeM");
        sizeM = Integer.parseInt(sc.nextLine());
        double[][] array = new double[sizeN][sizeM];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter element of array (index :) " + "[" + i + "]" + "[" + j + "]");
                array[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
        System.out.println("");
        System.out.println("Element two-dimensional array");
        for (int i = 0; i < array.length; i++) {
            System.out.println("");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }
        System.out.println("\nyou can choice column that you want: ");
        column = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i][column];
        }
        System.out.println("Sum of element of column " + column + " is " + sum);
    }
}
// Option 2:
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (j == column) {
//                    sum = sum + array[i][j];
//                }
//            }
//        }
//        System.out.println("Sum of element of column " + column + " is " + sum);

