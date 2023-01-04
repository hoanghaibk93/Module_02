package ss02_array.bai_tap;

import java.util.Scanner;

public class TotalDiagonalOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        double sum = 0;
        System.out.println("Enter a size");
        size = Integer.parseInt(sc.nextLine());
        double[][] array = new double[size][size];
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
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i][i];
        }
        System.out.println("\nTotal of element on diagonal of square is " + sum);
    }
}

